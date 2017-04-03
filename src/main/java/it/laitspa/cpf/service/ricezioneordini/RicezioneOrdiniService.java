package it.laitspa.cpf.service.ricezioneordini;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-04-03T13:12:40.607+02:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "RicezioneOrdiniService", 
                  wsdlLocation = "https://www.laitspa.it/cpf/services/RicezioneOrdini?wsdl",
                  targetNamespace = "http://ricezioneordini.service.cpf.laitspa.it") 
public class RicezioneOrdiniService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ricezioneordini.service.cpf.laitspa.it", "RicezioneOrdiniService");
    public final static QName RicezioneOrdiniPort = new QName("http://ricezioneordini.service.cpf.laitspa.it", "RicezioneOrdiniPort");
    static {
        URL url = null;
        try {
            url = new URL("https://www.laitspa.it/cpf/services/RicezioneOrdini?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RicezioneOrdiniService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://www.laitspa.it/cpf/services/RicezioneOrdini?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RicezioneOrdiniService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RicezioneOrdiniService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RicezioneOrdiniService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public RicezioneOrdiniService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RicezioneOrdiniService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RicezioneOrdiniService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RicezioneOrdini
     */
    @WebEndpoint(name = "RicezioneOrdiniPort")
    public RicezioneOrdini getRicezioneOrdiniPort() {
        return super.getPort(RicezioneOrdiniPort, RicezioneOrdini.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RicezioneOrdini
     */
    @WebEndpoint(name = "RicezioneOrdiniPort")
    public RicezioneOrdini getRicezioneOrdiniPort(WebServiceFeature... features) {
        return super.getPort(RicezioneOrdiniPort, RicezioneOrdini.class, features);
    }

}
