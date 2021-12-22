//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Binary data is a raw block of bits. Binary data is a
 *             protected type that MUST not be used outside the data
 *             type specification.
 *          
 * 
 * <p>Classe Java per BIN complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}ANY"&gt;
 *       &lt;attribute name="representation" type="{urn:hl7-org:v3}BinaryDataEncoding" default="TXT" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIN", propOrder = {
    "content"
})
@XmlSeeAlso({
    ED.class
})
public abstract class BIN
    extends ANY
{

    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "representation")
    protected BinaryDataEncoding representation;

    /**
     * 
     *             Binary data is a raw block of bits. Binary data is a
     *             protected type that MUST not be used outside the data
     *             type specification.
     *          Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Recupera il valore della proprietà representation.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public BinaryDataEncoding getRepresentation() {
        if (representation == null) {
            return BinaryDataEncoding.TXT;
        } else {
            return representation;
        }
    }

    /**
     * Imposta il valore della proprietà representation.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public void setRepresentation(BinaryDataEncoding value) {
        this.representation = value;
    }

}
