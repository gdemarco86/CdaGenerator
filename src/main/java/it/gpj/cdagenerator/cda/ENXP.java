//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A character string token representing a part of a name.
 *             May have a type code signifying the role of the part in
 *             the whole entity name, and a qualifier code for more detail
 *             about the name part type. Typical name parts for person
 *             names are given names, and family names, titles, etc.
 *          
 * 
 * <p>Classe Java per ENXP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ENXP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}ST"&gt;
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}EntityNamePartType" /&gt;
 *       &lt;attribute name="qualifier" type="{urn:hl7-org:v3}set_EntityNamePartQualifier" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENXP")
@XmlSeeAlso({
    EnDelimiter.class,
    EnFamily.class,
    EnGiven.class,
    EnPrefix.class,
    EnSuffix.class
})
public class ENXP
    extends ST
{

    @XmlAttribute(name = "partType")
    protected String partType;
    @XmlAttribute(name = "qualifier")
    protected List<String> qualifier;

    /**
     * Recupera il valore della proprietà partType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartType() {
        return partType;
    }

    /**
     * Imposta il valore della proprietà partType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartType(String value) {
        this.partType = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<String>();
        }
        return this.qualifier;
    }

}
