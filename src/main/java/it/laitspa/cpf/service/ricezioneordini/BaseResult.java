
package it.laitspa.cpf.service.ricezioneordini;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per baseResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="baseResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseResult", propOrder = {
    "errorNotes",
    "returnCode"
})
@XmlSeeAlso({
    ListaResult.class,
    PrelevaResult.class,
    ConfermaResult.class
})
public class BaseResult {

    protected String errorNotes;
    protected int returnCode;

    /**
     * Recupera il valore della proprietà errorNotes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorNotes() {
        return errorNotes;
    }

    /**
     * Imposta il valore della proprietà errorNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorNotes(String value) {
        this.errorNotes = value;
    }

    /**
     * Recupera il valore della proprietà returnCode.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Imposta il valore della proprietà returnCode.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

}
