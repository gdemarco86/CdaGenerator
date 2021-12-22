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
 * 
 *             Note: because this type is defined as an extension of SXCM_T,
 *             all of the attributes and elements accepted for T are also
 *             accepted by this definition.  However, they are NOT allowed
 *             by the normative description of this type.  Unfortunately,
 *             we cannot write a general purpose schematron contraints to
 *             provide that extra validation, thus applications must be
 *             aware that instance (fragments) that pass validation with
 *             this might might still not be legal.
 *          
 * 
 * <p>Classe Java per PIVL_PPD_TS complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PIVL_PPD_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_PPD_TS"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase" type="{urn:hl7-org:v3}IVL_PPD_TS" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{urn:hl7-org:v3}PPD_PQ" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alignment" type="{urn:hl7-org:v3}CalendarCycle" /&gt;
 *       &lt;attribute name="institutionSpecified" type="{urn:hl7-org:v3}bl" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVL_PPD_TS", propOrder = {
    "phase",
    "period"
})
public class PIVLPPDTS
    extends SXCMPPDTS
{

    protected IVLPPDTS phase;
    protected PPDPQ period;
    @XmlAttribute(name = "alignment")
    protected List<String> alignment;
    @XmlAttribute(name = "institutionSpecified")
    protected Boolean institutionSpecified;

    /**
     * Recupera il valore della proprietà phase.
     * 
     * @return
     *     possible object is
     *     {@link IVLPPDTS }
     *     
     */
    public IVLPPDTS getPhase() {
        return phase;
    }

    /**
     * Imposta il valore della proprietà phase.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPPDTS }
     *     
     */
    public void setPhase(IVLPPDTS value) {
        this.phase = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link PPDPQ }
     *     
     */
    public PPDPQ getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link PPDPQ }
     *     
     */
    public void setPeriod(PPDPQ value) {
        this.period = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlignment() {
        if (alignment == null) {
            alignment = new ArrayList<String>();
        }
        return this.alignment;
    }

    /**
     * Recupera il valore della proprietà institutionSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstitutionSpecified() {
        if (institutionSpecified == null) {
            return false;
        } else {
            return institutionSpecified;
        }
    }

    /**
     * Imposta il valore della proprietà institutionSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstitutionSpecified(Boolean value) {
        this.institutionSpecified = value;
    }

}