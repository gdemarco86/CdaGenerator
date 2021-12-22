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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per POCD_MT000040.EntryRelationship complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.EntryRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sequenceNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="seperatableInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="act" type="{urn:hl7-org:v3}POCD_MT000040.Act"/&gt;
 *           &lt;element name="encounter" type="{urn:hl7-org:v3}POCD_MT000040.Encounter"/&gt;
 *           &lt;element name="observation" type="{urn:hl7-org:v3}POCD_MT000040.Observation"/&gt;
 *           &lt;element name="observationMedia" type="{urn:hl7-org:v3}POCD_MT000040.ObservationMedia"/&gt;
 *           &lt;element name="organizer" type="{urn:hl7-org:v3}POCD_MT000040.Organizer"/&gt;
 *           &lt;element name="procedure" type="{urn:hl7-org:v3}POCD_MT000040.Procedure"/&gt;
 *           &lt;element name="regionOfInterest" type="{urn:hl7-org:v3}POCD_MT000040.RegionOfInterest"/&gt;
 *           &lt;element name="substanceAdministration" type="{urn:hl7-org:v3}POCD_MT000040.SubstanceAdministration"/&gt;
 *           &lt;element name="supply" type="{urn:hl7-org:v3}POCD_MT000040.Supply"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}x_ActRelationshipEntryRelationship" /&gt;
 *       &lt;attribute name="inversionInd" type="{urn:hl7-org:v3}bl" /&gt;
 *       &lt;attribute name="contextConductionInd" type="{urn:hl7-org:v3}bl" default="true" /&gt;
 *       &lt;attribute name="negationInd" type="{urn:hl7-org:v3}bl" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.EntryRelationship", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "sequenceNumber",
    "seperatableInd",
    "act",
    "encounter",
    "observation",
    "observationMedia",
    "organizer",
    "procedure",
    "regionOfInterest",
    "substanceAdministration",
    "supply"
})
public class POCDMT000040EntryRelationship {

    protected List<CS> realmCode;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    protected List<II> templateId;
    protected INT sequenceNumber;
    protected BL seperatableInd;
    protected POCDMT000040Act act;
    protected POCDMT000040Encounter encounter;
    protected POCDMT000040Observation observation;
    protected POCDMT000040ObservationMedia observationMedia;
    protected POCDMT000040Organizer organizer;
    protected POCDMT000040Procedure procedure;
    protected POCDMT000040RegionOfInterest regionOfInterest;
    protected POCDMT000040SubstanceAdministration substanceAdministration;
    protected POCDMT000040Supply supply;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected XActRelationshipEntryRelationship typeCode;
    @XmlAttribute(name = "inversionInd")
    protected Boolean inversionInd;
    @XmlAttribute(name = "contextConductionInd")
    protected Boolean contextConductionInd;
    @XmlAttribute(name = "negationInd")
    protected Boolean negationInd;

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
     * Recupera il valore della proprietà sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Imposta il valore della proprietà sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setSequenceNumber(INT value) {
        this.sequenceNumber = value;
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
     * Recupera il valore della proprietà act.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Act }
     *     
     */
    public POCDMT000040Act getAct() {
        return act;
    }

    /**
     * Imposta il valore della proprietà act.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Act }
     *     
     */
    public void setAct(POCDMT000040Act value) {
        this.act = value;
    }

    /**
     * Recupera il valore della proprietà encounter.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Encounter }
     *     
     */
    public POCDMT000040Encounter getEncounter() {
        return encounter;
    }

    /**
     * Imposta il valore della proprietà encounter.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Encounter }
     *     
     */
    public void setEncounter(POCDMT000040Encounter value) {
        this.encounter = value;
    }

    /**
     * Recupera il valore della proprietà observation.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Observation }
     *     
     */
    public POCDMT000040Observation getObservation() {
        return observation;
    }

    /**
     * Imposta il valore della proprietà observation.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Observation }
     *     
     */
    public void setObservation(POCDMT000040Observation value) {
        this.observation = value;
    }

    /**
     * Recupera il valore della proprietà observationMedia.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ObservationMedia }
     *     
     */
    public POCDMT000040ObservationMedia getObservationMedia() {
        return observationMedia;
    }

    /**
     * Imposta il valore della proprietà observationMedia.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ObservationMedia }
     *     
     */
    public void setObservationMedia(POCDMT000040ObservationMedia value) {
        this.observationMedia = value;
    }

    /**
     * Recupera il valore della proprietà organizer.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Organizer }
     *     
     */
    public POCDMT000040Organizer getOrganizer() {
        return organizer;
    }

    /**
     * Imposta il valore della proprietà organizer.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Organizer }
     *     
     */
    public void setOrganizer(POCDMT000040Organizer value) {
        this.organizer = value;
    }

    /**
     * Recupera il valore della proprietà procedure.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Procedure }
     *     
     */
    public POCDMT000040Procedure getProcedure() {
        return procedure;
    }

    /**
     * Imposta il valore della proprietà procedure.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Procedure }
     *     
     */
    public void setProcedure(POCDMT000040Procedure value) {
        this.procedure = value;
    }

    /**
     * Recupera il valore della proprietà regionOfInterest.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040RegionOfInterest }
     *     
     */
    public POCDMT000040RegionOfInterest getRegionOfInterest() {
        return regionOfInterest;
    }

    /**
     * Imposta il valore della proprietà regionOfInterest.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040RegionOfInterest }
     *     
     */
    public void setRegionOfInterest(POCDMT000040RegionOfInterest value) {
        this.regionOfInterest = value;
    }

    /**
     * Recupera il valore della proprietà substanceAdministration.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040SubstanceAdministration }
     *     
     */
    public POCDMT000040SubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    /**
     * Imposta il valore della proprietà substanceAdministration.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040SubstanceAdministration }
     *     
     */
    public void setSubstanceAdministration(POCDMT000040SubstanceAdministration value) {
        this.substanceAdministration = value;
    }

    /**
     * Recupera il valore della proprietà supply.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Supply }
     *     
     */
    public POCDMT000040Supply getSupply() {
        return supply;
    }

    /**
     * Imposta il valore della proprietà supply.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Supply }
     *     
     */
    public void setSupply(POCDMT000040Supply value) {
        this.supply = value;
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
     *     {@link XActRelationshipEntryRelationship }
     *     
     */
    public XActRelationshipEntryRelationship getTypeCode() {
        return typeCode;
    }

    /**
     * Imposta il valore della proprietà typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link XActRelationshipEntryRelationship }
     *     
     */
    public void setTypeCode(XActRelationshipEntryRelationship value) {
        this.typeCode = value;
    }

    /**
     * Recupera il valore della proprietà inversionInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInversionInd() {
        return inversionInd;
    }

    /**
     * Imposta il valore della proprietà inversionInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInversionInd(Boolean value) {
        this.inversionInd = value;
    }

    /**
     * Recupera il valore della proprietà contextConductionInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContextConductionInd() {
        if (contextConductionInd == null) {
            return true;
        } else {
            return contextConductionInd;
        }
    }

    /**
     * Imposta il valore della proprietà contextConductionInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContextConductionInd(Boolean value) {
        this.contextConductionInd = value;
    }

    /**
     * Recupera il valore della proprietà negationInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegationInd() {
        return negationInd;
    }

    /**
     * Imposta il valore della proprietà negationInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegationInd(Boolean value) {
        this.negationInd = value;
    }

}
