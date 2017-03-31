package io.github.ideiudicibus.regione.lazio.cpf.ordini.service;

import javax.xml.bind.DatatypeConverter;
import javax.xml.ws.BindingProvider;

import it.laitspa.cpf.service.ricezioneordini.ListaResult;
import it.laitspa.cpf.service.ricezioneordini.PrelevaResult;
import it.laitspa.cpf.service.ricezioneordini.RicezioneOrdini;
import it.laitspa.cpf.service.ricezioneordini.RicezioneOrdiniService;
import it.laitspa.cpf.service.security.Security;
import it.laitspa.cpf.service.security.SecurityService;

/**
 * 
 * @author ignazio de iudicibus i.deiudicibus@gmail.com
 *
 */
public class OrdiniWebServiceWrapperImpl implements OrdiniService {

    private static String securityServiceEndpointURL = "https://www.laitspa.it/cpf/services/Security?wsdl";
    private static String ricezioneOrdiniEndpointURL = "https://www.laitspa.it/cpf/services/RicezioneOrdini?wsdl";
    private static String noTokenFound="NO_TOKEN_FOUND";
    private String password;
    private String username;

    
    public OrdiniWebServiceWrapperImpl(String username,String password){
	this.password=password;
	this.username=username;
	
    }
   
   
    private String getSecurityToken() throws OrdiniServiceException   {
	String token="noTokenFound";
	try{
	SecurityService securityService = new SecurityService();
	Security security = securityService.getSecuritySoap11Binding();

	((BindingProvider) security).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,securityServiceEndpointURL);

	token = security.getToken(this.username,this.password);
	}
	catch(Exception e){
	    OrdiniServiceException ordiniServiceException=new OrdiniServiceException(e.getMessage());
	    ordiniServiceException.fillInStackTrace();
	    
	    throw ordiniServiceException;
	}
	if (token.equals(noTokenFound)){
	    String message="cannot retrieve a security token from ordini service";
	    throw new OrdiniServiceException(message);
	}
	return token;

    }

    @Override
    public String getOrdineDocument(String idOrdine) throws OrdiniServiceException {
	
	RicezioneOrdiniService ricezioneOrdiniService =new RicezioneOrdiniService();
	RicezioneOrdini ricezioneOrdini=ricezioneOrdiniService.getRicezioneOrdiniPort();
	//rebind the endpoint 
        ((BindingProvider)ricezioneOrdini).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ricezioneOrdiniEndpointURL);   
	ListaResult lista=ricezioneOrdini.ricercaOrdini(this.getSecurityToken(), idOrdine, null, null, null, null, null);
	Integer codiceOrdine=lista.getListaOrdini().get(0);
	PrelevaResult pr=ricezioneOrdini.prelevaOrdine(this.getSecurityToken(),codiceOrdine );
	String xml=new String(DatatypeConverter.parseBase64Binary(pr.getB64Xml()));
	
	return xml;
      
    }

}
