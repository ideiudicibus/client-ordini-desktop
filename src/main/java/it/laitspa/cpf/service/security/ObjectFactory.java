
package it.laitspa.cpf.service.security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.laitspa.cpf.service.security package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetToken_QNAME = new QName("http://security.service.cpf.laitspa.it", "getToken");
    private final static QName _GetTokenResponse_QNAME = new QName("http://security.service.cpf.laitspa.it", "getTokenResponse");
    private final static QName _RegisterHealthCheck_QNAME = new QName("http://security.service.cpf.laitspa.it", "registerHealthCheck");
    private final static QName _RegisterHealthCheckResponse_QNAME = new QName("http://security.service.cpf.laitspa.it", "registerHealthCheckResponse");
    private final static QName _RegisterSize_QNAME = new QName("http://security.service.cpf.laitspa.it", "registerSize");
    private final static QName _RegisterSizeResponse_QNAME = new QName("http://security.service.cpf.laitspa.it", "registerSizeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.laitspa.cpf.service.security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetToken }
     * 
     */
    public GetToken createGetToken() {
        return new GetToken();
    }

    /**
     * Create an instance of {@link GetTokenResponse }
     * 
     */
    public GetTokenResponse createGetTokenResponse() {
        return new GetTokenResponse();
    }

    /**
     * Create an instance of {@link RegisterHealthCheck }
     * 
     */
    public RegisterHealthCheck createRegisterHealthCheck() {
        return new RegisterHealthCheck();
    }

    /**
     * Create an instance of {@link RegisterHealthCheckResponse }
     * 
     */
    public RegisterHealthCheckResponse createRegisterHealthCheckResponse() {
        return new RegisterHealthCheckResponse();
    }

    /**
     * Create an instance of {@link RegisterSize }
     * 
     */
    public RegisterSize createRegisterSize() {
        return new RegisterSize();
    }

    /**
     * Create an instance of {@link RegisterSizeResponse }
     * 
     */
    public RegisterSizeResponse createRegisterSizeResponse() {
        return new RegisterSizeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.service.cpf.laitspa.it", name = "getToken")
    public JAXBElement<GetToken> createGetToken(GetToken value) {
        return new JAXBElement<GetToken>(_GetToken_QNAME, GetToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.service.cpf.laitspa.it", name = "getTokenResponse")
    public JAXBElement<GetTokenResponse> createGetTokenResponse(GetTokenResponse value) {
        return new JAXBElement<GetTokenResponse>(_GetTokenResponse_QNAME, GetTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterHealthCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.service.cpf.laitspa.it", name = "registerHealthCheck")
    public JAXBElement<RegisterHealthCheck> createRegisterHealthCheck(RegisterHealthCheck value) {
        return new JAXBElement<RegisterHealthCheck>(_RegisterHealthCheck_QNAME, RegisterHealthCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterHealthCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.service.cpf.laitspa.it", name = "registerHealthCheckResponse")
    public JAXBElement<RegisterHealthCheckResponse> createRegisterHealthCheckResponse(RegisterHealthCheckResponse value) {
        return new JAXBElement<RegisterHealthCheckResponse>(_RegisterHealthCheckResponse_QNAME, RegisterHealthCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.service.cpf.laitspa.it", name = "registerSize")
    public JAXBElement<RegisterSize> createRegisterSize(RegisterSize value) {
        return new JAXBElement<RegisterSize>(_RegisterSize_QNAME, RegisterSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.service.cpf.laitspa.it", name = "registerSizeResponse")
    public JAXBElement<RegisterSizeResponse> createRegisterSizeResponse(RegisterSizeResponse value) {
        return new JAXBElement<RegisterSizeResponse>(_RegisterSizeResponse_QNAME, RegisterSizeResponse.class, null, value);
    }

}
