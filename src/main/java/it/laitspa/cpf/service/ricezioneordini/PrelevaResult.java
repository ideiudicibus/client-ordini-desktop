
package it.laitspa.cpf.service.ricezioneordini;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per prelevaResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="prelevaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ricezioneordini.service.cpf.laitspa.it}baseResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="b64pdf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="b64xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prelevaResult", propOrder = {
    "b64Pdf",
    "b64Xml"
})
public class PrelevaResult
    extends BaseResult
{

    @XmlElement(name = "b64pdf")
    protected String b64Pdf;
    @XmlElement(name = "b64xml")
    protected String b64Xml;

    /**
     * Recupera il valore della proprietà b64Pdf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB64Pdf() {
        return b64Pdf;
    }

    /**
     * Imposta il valore della proprietà b64Pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB64Pdf(String value) {
        this.b64Pdf = value;
    }

    /**
     * Recupera il valore della proprietà b64Xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB64Xml() {
        return b64Xml;
    }

    /**
     * Imposta il valore della proprietà b64Xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB64Xml(String value) {
        this.b64Xml = value;
    }

}
