package it.laitspa.cpf.service.security;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-04-03T13:16:47.661+02:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://security.service.cpf.laitspa.it", name = "Security")
@XmlSeeAlso({ObjectFactory.class})
public interface Security {

    @WebMethod(action = "urn:registerSize")
    @RequestWrapper(localName = "registerSize", targetNamespace = "http://security.service.cpf.laitspa.it", className = "it.laitspa.cpf.service.security.RegisterSize")
    @ResponseWrapper(localName = "registerSizeResponse", targetNamespace = "http://security.service.cpf.laitspa.it", className = "it.laitspa.cpf.service.security.RegisterSizeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int registerSize();

    @WebMethod(action = "urn:registerHealthCheck")
    @RequestWrapper(localName = "registerHealthCheck", targetNamespace = "http://security.service.cpf.laitspa.it", className = "it.laitspa.cpf.service.security.RegisterHealthCheck")
    @ResponseWrapper(localName = "registerHealthCheckResponse", targetNamespace = "http://security.service.cpf.laitspa.it", className = "it.laitspa.cpf.service.security.RegisterHealthCheckResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean registerHealthCheck();

    @WebMethod(action = "urn:getToken")
    @RequestWrapper(localName = "getToken", targetNamespace = "http://security.service.cpf.laitspa.it", className = "it.laitspa.cpf.service.security.GetToken")
    @ResponseWrapper(localName = "getTokenResponse", targetNamespace = "http://security.service.cpf.laitspa.it", className = "it.laitspa.cpf.service.security.GetTokenResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getToken(
        @WebParam(name = "username", targetNamespace = "http://security.service.cpf.laitspa.it")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "http://security.service.cpf.laitspa.it")
        java.lang.String password
    );
}
