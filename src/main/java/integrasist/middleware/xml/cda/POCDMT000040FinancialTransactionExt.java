//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.11 alle 01:48:33 AM CET 
//


package integrasist.middleware.xml.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per POCD_MT000040.FinancialTransaction_ext complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.FinancialTransaction_ext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}TS"/>
 *         &lt;element name="amt" type="{urn:hl7-org:v3}MO"/>
 *       &lt;/sequence>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassSupply" fixed="XACT" />
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}x_DocumentSubstanceMood" fixed="EVN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.FinancialTransaction_ext", propOrder = {
    "code",
    "effectiveTime",
    "amt"
})
public class POCDMT000040FinancialTransactionExt {

    @XmlElement(required = true)
    protected CD code;
    @XmlElement(required = true)
    protected TS effectiveTime;
    @XmlElement(required = true)
    protected MO amt;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassSupply classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected XDocumentSubstanceMood moodCode;

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
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
     * Recupera il valore della proprietà amt.
     * 
     * @return
     *     possible object is
     *     {@link MO }
     *     
     */
    public MO getAmt() {
        return amt;
    }

    /**
     * Imposta il valore della proprietà amt.
     * 
     * @param value
     *     allowed object is
     *     {@link MO }
     *     
     */
    public void setAmt(MO value) {
        this.amt = value;
    }

    /**
     * Recupera il valore della proprietà classCode.
     * 
     * @return
     *     possible object is
     *     {@link ActClassSupply }
     *     
     */
    public ActClassSupply getClassCode() {
        if (classCode == null) {
            return ActClassSupply.XACT;
        } else {
            return classCode;
        }
    }

    /**
     * Imposta il valore della proprietà classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassSupply }
     *     
     */
    public void setClassCode(ActClassSupply value) {
        this.classCode = value;
    }

    /**
     * Recupera il valore della proprietà moodCode.
     * 
     * @return
     *     possible object is
     *     {@link XDocumentSubstanceMood }
     *     
     */
    public XDocumentSubstanceMood getMoodCode() {
        if (moodCode == null) {
            return XDocumentSubstanceMood.EVN;
        } else {
            return moodCode;
        }
    }

    /**
     * Imposta il valore della proprietà moodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link XDocumentSubstanceMood }
     *     
     */
    public void setMoodCode(XDocumentSubstanceMood value) {
        this.moodCode = value;
    }

}
