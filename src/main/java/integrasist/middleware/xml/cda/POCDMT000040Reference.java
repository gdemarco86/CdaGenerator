//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.11 alle 01:48:33 AM CET 
//


package integrasist.middleware.xml.cda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per POCD_MT000040.Reference complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="seperatableInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="externalAct" type="{urn:hl7-org:v3}POCD_MT000040.ExternalAct"/>
 *           &lt;element name="externalObservation" type="{urn:hl7-org:v3}POCD_MT000040.ExternalObservation"/>
 *           &lt;element name="externalProcedure" type="{urn:hl7-org:v3}POCD_MT000040.ExternalProcedure"/>
 *           &lt;element name="externalDocument" type="{urn:hl7-org:v3}POCD_MT000040.ExternalDocument"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}x_ActRelationshipExternalReference" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Reference", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "seperatableInd",
    "externalAct",
    "externalObservation",
    "externalProcedure",
    "externalDocument"
})
public class POCDMT000040Reference {

    protected List<CS> realmCode;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    protected List<II> templateId;
    protected BL seperatableInd;
    protected POCDMT000040ExternalAct externalAct;
    protected POCDMT000040ExternalObservation externalObservation;
    protected POCDMT000040ExternalProcedure externalProcedure;
    protected POCDMT000040ExternalDocument externalDocument;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected XActRelationshipExternalReference typeCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Recupera il valore della proprietà typeId.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040InfrastructureRootTypeId }
     *     
     */
    public POCDMT000040InfrastructureRootTypeId getTypeId() {
        return typeId;
    }

    /**
     * Imposta il valore della proprietà typeId.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040InfrastructureRootTypeId }
     *     
     */
    public void setTypeId(POCDMT000040InfrastructureRootTypeId value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Recupera il valore della proprietà seperatableInd.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getSeperatableInd() {
        return seperatableInd;
    }

    /**
     * Imposta il valore della proprietà seperatableInd.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setSeperatableInd(BL value) {
        this.seperatableInd = value;
    }

    /**
     * Recupera il valore della proprietà externalAct.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalAct }
     *     
     */
    public POCDMT000040ExternalAct getExternalAct() {
        return externalAct;
    }

    /**
     * Imposta il valore della proprietà externalAct.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalAct }
     *     
     */
    public void setExternalAct(POCDMT000040ExternalAct value) {
        this.externalAct = value;
    }

    /**
     * Recupera il valore della proprietà externalObservation.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalObservation }
     *     
     */
    public POCDMT000040ExternalObservation getExternalObservation() {
        return externalObservation;
    }

    /**
     * Imposta il valore della proprietà externalObservation.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalObservation }
     *     
     */
    public void setExternalObservation(POCDMT000040ExternalObservation value) {
        this.externalObservation = value;
    }

    /**
     * Recupera il valore della proprietà externalProcedure.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalProcedure }
     *     
     */
    public POCDMT000040ExternalProcedure getExternalProcedure() {
        return externalProcedure;
    }

    /**
     * Imposta il valore della proprietà externalProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalProcedure }
     *     
     */
    public void setExternalProcedure(POCDMT000040ExternalProcedure value) {
        this.externalProcedure = value;
    }

    /**
     * Recupera il valore della proprietà externalDocument.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalDocument }
     *     
     */
    public POCDMT000040ExternalDocument getExternalDocument() {
        return externalDocument;
    }

    /**
     * Imposta il valore della proprietà externalDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalDocument }
     *     
     */
    public void setExternalDocument(POCDMT000040ExternalDocument value) {
        this.externalDocument = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Recupera il valore della proprietà typeCode.
     * 
     * @return
     *     possible object is
     *     {@link XActRelationshipExternalReference }
     *     
     */
    public XActRelationshipExternalReference getTypeCode() {
        return typeCode;
    }

    /**
     * Imposta il valore della proprietà typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link XActRelationshipExternalReference }
     *     
     */
    public void setTypeCode(XActRelationshipExternalReference value) {
        this.typeCode = value;
    }

}
