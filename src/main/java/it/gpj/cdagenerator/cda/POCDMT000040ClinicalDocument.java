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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per POCD_MT000040.ClinicalDocument complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.ClinicalDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/&gt;
 *         &lt;element name="title" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}TS"/&gt;
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}CE"/&gt;
 *         &lt;element name="languageCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="setId" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="versionNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="copyTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/&gt;
 *         &lt;element name="recordTarget" type="{urn:hl7-org:v3}POCD_MT000040.RecordTarget" maxOccurs="unbounded"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}POCD_MT000040.Author" maxOccurs="unbounded"/&gt;
 *         &lt;element name="dataEnterer" type="{urn:hl7-org:v3}POCD_MT000040.DataEnterer" minOccurs="0"/&gt;
 *         &lt;element name="informant" type="{urn:hl7-org:v3}POCD_MT000040.Informant12" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custodian" type="{urn:hl7-org:v3}POCD_MT000040.Custodian"/&gt;
 *         &lt;element name="informationRecipient" type="{urn:hl7-org:v3}POCD_MT000040.InformationRecipient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="legalAuthenticator" type="{urn:hl7-org:v3}POCD_MT000040.LegalAuthenticator" minOccurs="0"/&gt;
 *         &lt;element name="authenticator" type="{urn:hl7-org:v3}POCD_MT000040.Authenticator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="participant" type="{urn:hl7-org:v3}POCD_MT000040.Participant1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inFulfillmentOf" type="{urn:hl7-org:v3}POCD_MT000040.InFulfillmentOf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="documentationOf" type="{urn:hl7-org:v3}POCD_MT000040.DocumentationOf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedDocument" type="{urn:hl7-org:v3}POCD_MT000040.RelatedDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authorization" type="{urn:hl7-org:v3}POCD_MT000040.Authorization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="componentOf" type="{urn:hl7-org:v3}POCD_MT000040.Component1" minOccurs="0"/&gt;
 *         &lt;element name="component" type="{urn:hl7-org:v3}POCD_MT000040.Component2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClinicalDocument" fixed="DOCCLIN" /&gt;
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" fixed="EVN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "POCD_MT000040.ClinicalDocument", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "title",
    "effectiveTime",
    "confidentialityCode",
    "languageCode",
    "setId",
    "versionNumber",
    "copyTime",
    "recordTarget",
    "author",
    "dataEnterer",
    "informant",
    "custodian",
    "informationRecipient",
    "legalAuthenticator",
    "authenticator",
    "participant",
    "inFulfillmentOf",
    "documentationOf",
    "relatedDocument",
    "authorization",
    "componentOf",
    "component"
})
public class POCDMT000040ClinicalDocument {

    protected List<CS> realmCode;
    @XmlElement(required = true)
    protected POCDMT000040InfrastructureRootTypeId typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CE code;
    protected ST title;
    @XmlElement(required = true)
    protected TS effectiveTime;
    @XmlElement(required = true)
    protected CE confidentialityCode;
    protected CS languageCode;
    protected II setId;
    protected INT versionNumber;
    protected TS copyTime;
    @XmlElement(required = true)
    protected List<POCDMT000040RecordTarget> recordTarget;
    @XmlElement(required = true)
    protected List<POCDMT000040Author> author;
    protected POCDMT000040DataEnterer dataEnterer;
    protected List<POCDMT000040Informant12> informant;
    @XmlElement(required = true)
    protected POCDMT000040Custodian custodian;
    protected List<POCDMT000040InformationRecipient> informationRecipient;
    protected POCDMT000040LegalAuthenticator legalAuthenticator;
    protected List<POCDMT000040Authenticator> authenticator;
    protected List<POCDMT000040Participant1> participant;
    protected List<POCDMT000040InFulfillmentOf> inFulfillmentOf;
    protected List<POCDMT000040DocumentationOf> documentationOf;
    protected List<POCDMT000040RelatedDocument> relatedDocument;
    protected List<POCDMT000040Authorization> authorization;
    protected POCDMT000040Component1 componentOf;
    @XmlElement(required = true)
    protected POCDMT000040Component2 component;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode")
    protected ActClinicalDocument classCode;
    @XmlAttribute(name = "moodCode")
    protected List<String> moodCode;

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
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Recupera il valore della proprietà title.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getTitle() {
        return title;
    }

    /**
     * Imposta il valore della proprietà title.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setTitle(ST value) {
        this.title = value;
    }

    /**
     * Recupera il valore della proprietà effectiveTime.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Imposta il valore della proprietà effectiveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setEffectiveTime(TS value) {
        this.effectiveTime = value;
    }

    /**
     * Recupera il valore della proprietà confidentialityCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * Imposta il valore della proprietà confidentialityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setConfidentialityCode(CE value) {
        this.confidentialityCode = value;
    }

    /**
     * Recupera il valore della proprietà languageCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getLanguageCode() {
        return languageCode;
    }

    /**
     * Imposta il valore della proprietà languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setLanguageCode(CS value) {
        this.languageCode = value;
    }

    /**
     * Recupera il valore della proprietà setId.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getSetId() {
        return setId;
    }

    /**
     * Imposta il valore della proprietà setId.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setSetId(II value) {
        this.setId = value;
    }

    /**
     * Recupera il valore della proprietà versionNumber.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getVersionNumber() {
        return versionNumber;
    }

    /**
     * Imposta il valore della proprietà versionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setVersionNumber(INT value) {
        this.versionNumber = value;
    }

    /**
     * Recupera il valore della proprietà copyTime.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getCopyTime() {
        return copyTime;
    }

    /**
     * Imposta il valore della proprietà copyTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setCopyTime(TS value) {
        this.copyTime = value;
    }

    /**
     * Gets the value of the recordTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040RecordTarget }
     * 
     * 
     */
    public List<POCDMT000040RecordTarget> getRecordTarget() {
        if (recordTarget == null) {
            recordTarget = new ArrayList<POCDMT000040RecordTarget>();
        }
        return this.recordTarget;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Author }
     * 
     * 
     */
    public List<POCDMT000040Author> getAuthor() {
        if (author == null) {
            author = new ArrayList<POCDMT000040Author>();
        }
        return this.author;
    }

    /**
     * Recupera il valore della proprietà dataEnterer.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040DataEnterer }
     *     
     */
    public POCDMT000040DataEnterer getDataEnterer() {
        return dataEnterer;
    }

    /**
     * Imposta il valore della proprietà dataEnterer.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040DataEnterer }
     *     
     */
    public void setDataEnterer(POCDMT000040DataEnterer value) {
        this.dataEnterer = value;
    }

    /**
     * Gets the value of the informant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Informant12 }
     * 
     * 
     */
    public List<POCDMT000040Informant12> getInformant() {
        if (informant == null) {
            informant = new ArrayList<POCDMT000040Informant12>();
        }
        return this.informant;
    }

    /**
     * Recupera il valore della proprietà custodian.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Custodian }
     *     
     */
    public POCDMT000040Custodian getCustodian() {
        return custodian;
    }

    /**
     * Imposta il valore della proprietà custodian.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Custodian }
     *     
     */
    public void setCustodian(POCDMT000040Custodian value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the informationRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040InformationRecipient }
     * 
     * 
     */
    public List<POCDMT000040InformationRecipient> getInformationRecipient() {
        if (informationRecipient == null) {
            informationRecipient = new ArrayList<POCDMT000040InformationRecipient>();
        }
        return this.informationRecipient;
    }

    /**
     * Recupera il valore della proprietà legalAuthenticator.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040LegalAuthenticator }
     *     
     */
    public POCDMT000040LegalAuthenticator getLegalAuthenticator() {
        return legalAuthenticator;
    }

    /**
     * Imposta il valore della proprietà legalAuthenticator.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040LegalAuthenticator }
     *     
     */
    public void setLegalAuthenticator(POCDMT000040LegalAuthenticator value) {
        this.legalAuthenticator = value;
    }

    /**
     * Gets the value of the authenticator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Authenticator }
     * 
     * 
     */
    public List<POCDMT000040Authenticator> getAuthenticator() {
        if (authenticator == null) {
            authenticator = new ArrayList<POCDMT000040Authenticator>();
        }
        return this.authenticator;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Participant1 }
     * 
     * 
     */
    public List<POCDMT000040Participant1> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<POCDMT000040Participant1>();
        }
        return this.participant;
    }

    /**
     * Gets the value of the inFulfillmentOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inFulfillmentOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInFulfillmentOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040InFulfillmentOf }
     * 
     * 
     */
    public List<POCDMT000040InFulfillmentOf> getInFulfillmentOf() {
        if (inFulfillmentOf == null) {
            inFulfillmentOf = new ArrayList<POCDMT000040InFulfillmentOf>();
        }
        return this.inFulfillmentOf;
    }

    /**
     * Gets the value of the documentationOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentationOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentationOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040DocumentationOf }
     * 
     * 
     */
    public List<POCDMT000040DocumentationOf> getDocumentationOf() {
        if (documentationOf == null) {
            documentationOf = new ArrayList<POCDMT000040DocumentationOf>();
        }
        return this.documentationOf;
    }

    /**
     * Gets the value of the relatedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040RelatedDocument }
     * 
     * 
     */
    public List<POCDMT000040RelatedDocument> getRelatedDocument() {
        if (relatedDocument == null) {
            relatedDocument = new ArrayList<POCDMT000040RelatedDocument>();
        }
        return this.relatedDocument;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Authorization }
     * 
     * 
     */
    public List<POCDMT000040Authorization> getAuthorization() {
        if (authorization == null) {
            authorization = new ArrayList<POCDMT000040Authorization>();
        }
        return this.authorization;
    }

    /**
     * Recupera il valore della proprietà componentOf.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Component1 }
     *     
     */
    public POCDMT000040Component1 getComponentOf() {
        return componentOf;
    }

    /**
     * Imposta il valore della proprietà componentOf.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Component1 }
     *     
     */
    public void setComponentOf(POCDMT000040Component1 value) {
        this.componentOf = value;
    }

    /**
     * Recupera il valore della proprietà component.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Component2 }
     *     
     */
    public POCDMT000040Component2 getComponent() {
        return component;
    }

    /**
     * Imposta il valore della proprietà component.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Component2 }
     *     
     */
    public void setComponent(POCDMT000040Component2 value) {
        this.component = value;
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
     * Recupera il valore della proprietà classCode.
     * 
     * @return
     *     possible object is
     *     {@link ActClinicalDocument }
     *     
     */
    public ActClinicalDocument getClassCode() {
        if (classCode == null) {
            return ActClinicalDocument.DOCCLIN;
        } else {
            return classCode;
        }
    }

    /**
     * Imposta il valore della proprietà classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClinicalDocument }
     *     
     */
    public void setClassCode(ActClinicalDocument value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMoodCode() {
        if (moodCode == null) {
            moodCode = new ArrayList<String>();
        }
        return this.moodCode;
    }

}
