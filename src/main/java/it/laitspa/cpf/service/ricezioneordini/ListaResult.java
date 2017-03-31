
package it.laitspa.cpf.service.ricezioneordini;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ricezioneordini.service.cpf.laitspa.it}baseResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaOrdini" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaResult", propOrder = {
    "listaOrdini"
})
public class ListaResult
    extends BaseResult
{

    @XmlElement(nillable = true)
    protected List<Integer> listaOrdini;

    /**
     * Gets the value of the listaOrdini property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaOrdini property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaOrdini().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getListaOrdini() {
        if (listaOrdini == null) {
            listaOrdini = new ArrayList<Integer>();
        }
        return this.listaOrdini;
    }

}
