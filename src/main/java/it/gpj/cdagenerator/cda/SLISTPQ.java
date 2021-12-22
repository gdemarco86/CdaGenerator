//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SLIST_PQ complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SLIST_PQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}ANY"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="origin" type="{urn:hl7-org:v3}PQ"/&gt;
 *         &lt;element name="scale" type="{urn:hl7-org:v3}PQ"/&gt;
 *         &lt;element name="digits" type="{urn:hl7-org:v3}list_int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLIST_PQ", propOrder = {
    "origin",
    "scale",
    "digits"
})
public class SLISTPQ
    extends ANY
{

    @XmlElement(required = true)
    protected PQ origin;
    @XmlElement(required = true)
    protected PQ scale;
    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> digits;

    /**
     * Recupera il valore della proprietà origin.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getOrigin() {
        return origin;
    }

    /**
     * Imposta il valore della proprietà origin.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setOrigin(PQ value) {
        this.origin = value;
    }

    /**
     * Recupera il valore della proprietà scale.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getScale() {
        return scale;
    }

    /**
     * Imposta il valore della proprietà scale.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setScale(PQ value) {
        this.scale = value;
    }

    /**
     * Gets the value of the digits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getDigits() {
        if (digits == null) {
            digits = new ArrayList<BigInteger>();
        }
        return this.digits;
    }

}
