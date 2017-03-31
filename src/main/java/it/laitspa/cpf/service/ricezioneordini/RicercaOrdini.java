
package it.laitspa.cpf.service.ricezioneordini;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ricercaOrdini complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricercaOrdini"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentIdVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceAzienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataDocumentoDa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataDocumentoA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataImmissioneDa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataImmissioneA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricercaOrdini", propOrder = {
    "token",
    "documentIdVersion",
    "codiceAzienda",
    "dataDocumentoDa",
    "dataDocumentoA",
    "dataImmissioneDa",
    "dataImmissioneA"
})
public class RicercaOrdini {

    protected String token;
    protected String documentIdVersion;
    protected String codiceAzienda;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumentoDa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumentoA;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataImmissioneDa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataImmissioneA;

    /**
     * Recupera il valore della proprietà token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Imposta il valore della proprietà token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Recupera il valore della proprietà documentIdVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIdVersion() {
        return documentIdVersion;
    }

    /**
     * Imposta il valore della proprietà documentIdVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIdVersion(String value) {
        this.documentIdVersion = value;
    }

    /**
     * Recupera il valore della proprietà codiceAzienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAzienda() {
        return codiceAzienda;
    }

    /**
     * Imposta il valore della proprietà codiceAzienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAzienda(String value) {
        this.codiceAzienda = value;
    }

    /**
     * Recupera il valore della proprietà dataDocumentoDa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocumentoDa() {
        return dataDocumentoDa;
    }

    /**
     * Imposta il valore della proprietà dataDocumentoDa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocumentoDa(XMLGregorianCalendar value) {
        this.dataDocumentoDa = value;
    }

    /**
     * Recupera il valore della proprietà dataDocumentoA.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocumentoA() {
        return dataDocumentoA;
    }

    /**
     * Imposta il valore della proprietà dataDocumentoA.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocumentoA(XMLGregorianCalendar value) {
        this.dataDocumentoA = value;
    }

    /**
     * Recupera il valore della proprietà dataImmissioneDa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataImmissioneDa() {
        return dataImmissioneDa;
    }

    /**
     * Imposta il valore della proprietà dataImmissioneDa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataImmissioneDa(XMLGregorianCalendar value) {
        this.dataImmissioneDa = value;
    }

    /**
     * Recupera il valore della proprietà dataImmissioneA.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataImmissioneA() {
        return dataImmissioneA;
    }

    /**
     * Imposta il valore della proprietà dataImmissioneA.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataImmissioneA(XMLGregorianCalendar value) {
        this.dataImmissioneA = value;
    }

}
