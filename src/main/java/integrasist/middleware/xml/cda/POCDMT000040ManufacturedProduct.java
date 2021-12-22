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
 * <p>Classe Java per POCD_MT000040.ManufacturedProduct complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.ManufacturedProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="manufacturedLabeledDrug" type="{urn:hl7-org:v3}POCD_MT000040.LabeledDrug"/>
 *           &lt;element name="manufacturedMaterial" type="{urn:hl7-org:v3}POCD_MT000040.Material"/>
 *         &lt;/choice>
 *         &lt;element name="manufacturerOrganization" type="{urn:hl7-org:v3}POCD_MT000040.Organization" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassManufacturedProduct" fixed="MANU" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.ManufacturedProduct", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "manufacturedLabeledDrug",
    "manufacturedMaterial",
    "manufacturerOrganization"
})
public class POCDMT000040ManufacturedProduct {

    protected List<CS> realmCode;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected POCDMT000040LabeledDrug manufacturedLabeledDrug;
    protected POCDMT000040Material manufacturedMaterial;
    protected POCDMT000040Organization manufacturerOrganization;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode")
    protected RoleClassManufacturedProduct classCode;

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
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
     * Recupera il valore della proprietà manufacturedLabeledDrug.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040LabeledDrug }
     *     
     */
    public POCDMT000040LabeledDrug getManufacturedLabeledDrug() {
        return manufacturedLabeledDrug;
    }

    /**
     * Imposta il valore della proprietà manufacturedLabeledDrug.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040LabeledDrug }
     *     
     */
    public void setManufacturedLabeledDrug(POCDMT000040LabeledDrug value) {
        this.manufacturedLabeledDrug = value;
    }

    /**
     * Recupera il valore della proprietà manufacturedMaterial.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Material }
     *     
     */
    public POCDMT000040Material getManufacturedMaterial() {
        return manufacturedMaterial;
    }

    /**
     * Imposta il valore della proprietà manufacturedMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Material }
     *     
     */
    public void setManufacturedMaterial(POCDMT000040Material value) {
        this.manufacturedMaterial = value;
    }

    /**
     * Recupera il valore della proprietà manufacturerOrganization.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Organization }
     *     
     */
    public POCDMT000040Organization getManufacturerOrganization() {
        return manufacturerOrganization;
    }

    /**
     * Imposta il valore della proprietà manufacturerOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Organization }
     *     
     */
    public void setManufacturerOrganization(POCDMT000040Organization value) {
        this.manufacturerOrganization = value;
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
     *     {@link RoleClassManufacturedProduct }
     *     
     */
    public RoleClassManufacturedProduct getClassCode() {
        if (classCode == null) {
            return RoleClassManufacturedProduct.MANU;
        } else {
            return classCode;
        }
    }

    /**
     * Imposta il valore della proprietà classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassManufacturedProduct }
     *     
     */
    public void setClassCode(RoleClassManufacturedProduct value) {
        this.classCode = value;
    }

}
