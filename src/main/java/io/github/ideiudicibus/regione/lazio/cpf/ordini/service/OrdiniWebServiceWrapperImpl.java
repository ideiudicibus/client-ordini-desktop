package io.github.ideiudicibus.regione.lazio.cpf.ordini.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.logging.Logger;

import javax.xml.bind.DatatypeConverter;
import javax.xml.ws.BindingProvider;

import org.json.JSONObject;

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
	private static String NO_TOKEN_RETURNED = "NO_TOKEN_RETURNED";
	private static String EMPTY_ORDER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><HORDINMessage xmlns=\"http://www.ordine.xsd.laitspa.it\"><MessageHeader></MessageHeader><Document>EMPTY_DOCUMENT</Document></HORDINMessage>";

	private String password;
	private String username;
	private static final Logger LOGGER = Logger.getLogger(OrdiniWebServiceWrapperImpl.class.getName());

	public OrdiniWebServiceWrapperImpl(String username, String password) {
		this.password = password;
		this.username = username;

	}

	private String getSecurityToken() throws OrdiniServiceException {
		String token = NO_TOKEN_RETURNED;
		try {
			SecurityService securityService = new SecurityService();
			Security security = securityService.getSecuritySoap11Binding();

			((BindingProvider) security).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
					securityServiceEndpointURL);

			token = security.getToken(this.username, this.password);
		} catch (Exception e) {

			LOGGER.severe(e.getMessage());

		}
		if (token.equals(NO_TOKEN_RETURNED)) {
			String message = "cannot retrieve a security token from ordini service";
			LOGGER.severe(message);

		}

		return token;

	}

	@Override
	public String getOrdineDocument(String idOrdine) {

		JSONObject payload = new JSONObject();
		payload.put("wsUrlEndpoint",ricezioneOrdiniEndpointURL);
		
		LOGGER.info(idOrdine + " document from " + ricezioneOrdiniEndpointURL);
		String xml = EMPTY_ORDER;
		RicezioneOrdiniService ricezioneOrdiniService = new RicezioneOrdiniService();
		RicezioneOrdini ricezioneOrdini = ricezioneOrdiniService.getRicezioneOrdiniPort();
		// rebind the endpoint
		((BindingProvider) ricezioneOrdini).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				ricezioneOrdiniEndpointURL);
		ListaResult lista;
		try {

			lista = ricezioneOrdini.ricercaOrdini(this.getSecurityToken(), idOrdine, null, null, null, null, null);
			// if(lista!=null && lista.getListaOrdini()!=null &&
			// lista.getListaOrdini().size()>0) {
			payload.put("wsReturnCode", lista.getReturnCode());
			payload.put("wsErrorNotes",
					lista.getErrorNotes() != null ? lista.getErrorNotes().getBytes().toString() : "");

			Integer codiceOrdine = lista.getListaOrdini().get(0);
			PrelevaResult pr = ricezioneOrdini.prelevaOrdine(this.getSecurityToken(), codiceOrdine);
			xml = new String(DatatypeConverter.parseBase64Binary(pr.getB64Xml()));
			// }

			payload.put("xmlDocument", xml);
			payload.put("jsonDocument", org.json.XML.toJSONObject(xml));
			
			// TODO inject into JsonDocument detailed informations

		} catch (Exception e) {

			JSONObject exception = new JSONObject();
			exception.put("className", e.getClass().getName());
			exception.put("message", e.getMessage());
			exception.put("cause", e.getCause());
			StackTraceElement[] stelems = e.getStackTrace();
			for (StackTraceElement stelem : Arrays.asList(stelems)) {
				exception.append("stackTrace", stelem);
			}

			payload.put("exception", exception);
			
			payload.put("xmlDocument", xml);
			payload.put("jsonDocument", org.json.XML.toJSONObject(xml));

			LOGGER.severe("payload is \n" + payload.toString(2) + "\n");

			return payload.toString();
		}
		return payload.toString();

	}

}
