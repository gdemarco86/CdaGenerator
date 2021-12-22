//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An identifier that uniquely identifies a thing or object.
 *             Examples are object identifier for HL7 RIM objects,
 *             medical record number, order id, service catalog item id,
 *             Vehicle Identification Number (VIN), etc. Instance
 *             identifiers are defined based on ISO object identifiers.
 *          
 * 
 * <p>Classe Java per II complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="II"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}ANY"&gt;
 *       &lt;attribute name="root" type="{urn:hl7-org:v3}uid" /&gt;
 *       &lt;attribute name="extension" type="{urn:hl7-org:v3}st" /&gt;
 *       &lt;attribute name="assigningAuthorityName" type="{urn:hl7-org:v3}st" /&gt;
 *       &lt;attribute name="displayable" type="{urn:hl7-org:v3}bl" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "II")
@XmlSeeAlso({
    POCDMT000040InfrastructureRootTypeId.class
})
public class II
    extends ANY
{

    @XmlAttribute(name = "root")
    protected String root;
    @XmlAttribute(name = "extension")
    protected String extension;
    @XmlAttribute(name = "assigningAuthorityName")
    protected String assigningAuthorityName;
    @XmlAttribute(name = "displayable")
    protected Boolean displayable;

    /**
     * Recupera il valore della proprietà root.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoot() {
        return root;
    }

    /**
     * Imposta il valore della proprietà root.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoot(String value) {
        this.root = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della proprietà assigningAuthorityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthorityName() {
        return assigningAuthorityName;
    }

    /**
     * Imposta il valore della proprietà assigningAuthorityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthorityName(String value) {
        this.assigningAuthorityName = value;
    }

    /**
     * Recupera il valore della proprietà displayable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayable() {
        return displayable;
    }

    /**
     * Imposta il valore della proprietà displayable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayable(Boolean value) {
        this.displayable = value;
    }

}
