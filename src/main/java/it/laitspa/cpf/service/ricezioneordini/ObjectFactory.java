
package it.laitspa.cpf.service.ricezioneordini;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.laitspa.cpf.service.ricezioneordini package. 
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

    private final static QName _ConfermaOrdine_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "confermaOrdine");
    private final static QName _ConfermaOrdineResponse_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "confermaOrdineResponse");
    private final static QName _ListaOrdiniDaPrelevare_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "listaOrdiniDaPrelevare");
    private final static QName _ListaOrdiniDaPrelevareResponse_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "listaOrdiniDaPrelevareResponse");
    private final static QName _PrelevaOrdine_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "prelevaOrdine");
    private final static QName _PrelevaOrdineResponse_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "prelevaOrdineResponse");
    private final static QName _RicercaOrdini_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "ricercaOrdini");
    private final static QName _RicercaOrdiniResponse_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "ricercaOrdiniResponse");
    private final static QName _RifiutaOrdine_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "rifiutaOrdine");
    private final static QName _RifiutaOrdineResponse_QNAME = new QName("http://ricezioneordini.service.cpf.laitspa.it", "rifiutaOrdineResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.laitspa.cpf.service.ricezioneordini
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfermaOrdine }
     * 
     */
    public ConfermaOrdine createConfermaOrdine() {
        return new ConfermaOrdine();
    }

    /**
     * Create an instance of {@link ConfermaOrdineResponse }
     * 
     */
    public ConfermaOrdineResponse createConfermaOrdineResponse() {
        return new ConfermaOrdineResponse();
    }

    /**
     * Create an instance of {@link ListaOrdiniDaPrelevare }
     * 
     */
    public ListaOrdiniDaPrelevare createListaOrdiniDaPrelevare() {
        return new ListaOrdiniDaPrelevare();
    }

    /**
     * Create an instance of {@link ListaOrdiniDaPrelevareResponse }
     * 
     */
    public ListaOrdiniDaPrelevareResponse createListaOrdiniDaPrelevareResponse() {
        return new ListaOrdiniDaPrelevareResponse();
    }

    /**
     * Create an instance of {@link PrelevaOrdine }
     * 
     */
    public PrelevaOrdine createPrelevaOrdine() {
        return new PrelevaOrdine();
    }

    /**
     * Create an instance of {@link PrelevaOrdineResponse }
     * 
     */
    public PrelevaOrdineResponse createPrelevaOrdineResponse() {
        return new PrelevaOrdineResponse();
    }

    /**
     * Create an instance of {@link RicercaOrdini }
     * 
     */
    public RicercaOrdini createRicercaOrdini() {
        return new RicercaOrdini();
    }

    /**
     * Create an instance of {@link RicercaOrdiniResponse }
     * 
     */
    public RicercaOrdiniResponse createRicercaOrdiniResponse() {
        return new RicercaOrdiniResponse();
    }

    /**
     * Create an instance of {@link RifiutaOrdine }
     * 
     */
    public RifiutaOrdine createRifiutaOrdine() {
        return new RifiutaOrdine();
    }

    /**
     * Create an instance of {@link RifiutaOrdineResponse }
     * 
     */
    public RifiutaOrdineResponse createRifiutaOrdineResponse() {
        return new RifiutaOrdineResponse();
    }

    /**
     * Create an instance of {@link ListaResult }
     * 
     */
    public ListaResult createListaResult() {
        return new ListaResult();
    }

    /**
     * Create an instance of {@link BaseResult }
     * 
     */
    public BaseResult createBaseResult() {
        return new BaseResult();
    }

    /**
     * Create an instance of {@link PrelevaResult }
     * 
     */
    public PrelevaResult createPrelevaResult() {
        return new PrelevaResult();
    }

    /**
     * Create an instance of {@link ConfermaResult }
     * 
     */
    public ConfermaResult createConfermaResult() {
        return new ConfermaResult();
    }

    /**
     * Create an instance of {@link RifiutoResult }
     * 
     */
    public RifiutoResult createRifiutoResult() {
        return new RifiutoResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfermaOrdine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "confermaOrdine")
    public JAXBElement<ConfermaOrdine> createConfermaOrdine(ConfermaOrdine value) {
        return new JAXBElement<ConfermaOrdine>(_ConfermaOrdine_QNAME, ConfermaOrdine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfermaOrdineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "confermaOrdineResponse")
    public JAXBElement<ConfermaOrdineResponse> createConfermaOrdineResponse(ConfermaOrdineResponse value) {
        return new JAXBElement<ConfermaOrdineResponse>(_ConfermaOrdineResponse_QNAME, ConfermaOrdineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaOrdiniDaPrelevare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "listaOrdiniDaPrelevare")
    public JAXBElement<ListaOrdiniDaPrelevare> createListaOrdiniDaPrelevare(ListaOrdiniDaPrelevare value) {
        return new JAXBElement<ListaOrdiniDaPrelevare>(_ListaOrdiniDaPrelevare_QNAME, ListaOrdiniDaPrelevare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaOrdiniDaPrelevareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "listaOrdiniDaPrelevareResponse")
    public JAXBElement<ListaOrdiniDaPrelevareResponse> createListaOrdiniDaPrelevareResponse(ListaOrdiniDaPrelevareResponse value) {
        return new JAXBElement<ListaOrdiniDaPrelevareResponse>(_ListaOrdiniDaPrelevareResponse_QNAME, ListaOrdiniDaPrelevareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrelevaOrdine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "prelevaOrdine")
    public JAXBElement<PrelevaOrdine> createPrelevaOrdine(PrelevaOrdine value) {
        return new JAXBElement<PrelevaOrdine>(_PrelevaOrdine_QNAME, PrelevaOrdine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrelevaOrdineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "prelevaOrdineResponse")
    public JAXBElement<PrelevaOrdineResponse> createPrelevaOrdineResponse(PrelevaOrdineResponse value) {
        return new JAXBElement<PrelevaOrdineResponse>(_PrelevaOrdineResponse_QNAME, PrelevaOrdineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaOrdini }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "ricercaOrdini")
    public JAXBElement<RicercaOrdini> createRicercaOrdini(RicercaOrdini value) {
        return new JAXBElement<RicercaOrdini>(_RicercaOrdini_QNAME, RicercaOrdini.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaOrdiniResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "ricercaOrdiniResponse")
    public JAXBElement<RicercaOrdiniResponse> createRicercaOrdiniResponse(RicercaOrdiniResponse value) {
        return new JAXBElement<RicercaOrdiniResponse>(_RicercaOrdiniResponse_QNAME, RicercaOrdiniResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RifiutaOrdine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "rifiutaOrdine")
    public JAXBElement<RifiutaOrdine> createRifiutaOrdine(RifiutaOrdine value) {
        return new JAXBElement<RifiutaOrdine>(_RifiutaOrdine_QNAME, RifiutaOrdine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RifiutaOrdineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ricezioneordini.service.cpf.laitspa.it", name = "rifiutaOrdineResponse")
    public JAXBElement<RifiutaOrdineResponse> createRifiutaOrdineResponse(RifiutaOrdineResponse value) {
        return new JAXBElement<RifiutaOrdineResponse>(_RifiutaOrdineResponse_QNAME, RifiutaOrdineResponse.class, null, value);
    }

}
