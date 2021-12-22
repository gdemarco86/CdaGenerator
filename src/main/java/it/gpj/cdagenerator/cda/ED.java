//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
//import com.sun.xml.bind.annotation.OverrideAnnotationOf;


/**
 * 
 *             Data that is primarily intended for human interpretation
 *             or for further machine processing is outside the scope of
 *             HL7. This includes unformatted or formatted written language,
 *             multimedia data, or structured information as defined by a
 *             different standard (e.g., XML-signatures.)  Instead of the
 *             data itself, an ED may contain 
 *             only a reference (see TEL.) Note
 *             that the ST data type is a
 *             specialization of the ED data type
 *             when the ED media type is text/plain.
 *          
 * 
 * <p>Classe Java per ED complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ED"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}BIN"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{urn:hl7-org:v3}TEL" minOccurs="0"/&gt;
 *         &lt;element name="thumbnail" type="{urn:hl7-org:v3}thumbnail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mediaType" type="{urn:hl7-org:v3}cs" default="text/plain" /&gt;
 *       &lt;attribute name="language" type="{urn:hl7-org:v3}cs" /&gt;
 *       &lt;attribute name="compression" type="{urn:hl7-org:v3}CompressionAlgorithm" /&gt;
 *       &lt;attribute name="integrityCheck" type="{urn:hl7-org:v3}bin" /&gt;
 *       &lt;attribute name="integrityCheckAlgorithm" type="{urn:hl7-org:v3}IntegrityCheckAlgorithm" default="SHA-1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED")
@XmlSeeAlso({
    Thumbnail.class,
    ST.class
})
public class ED
    extends BIN
{

    @XmlElementRefs({
        @XmlElementRef(name = "reference", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "thumbnail", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    @OverrideAnnotationOf
    protected List<Serializable> contentOverrideForED;
    @XmlAttribute(name = "mediaType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaType;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "compression")
    protected CompressionAlgorithm compression;
    @XmlAttribute(name = "integrityCheck")
    protected byte[] integrityCheck;
    @XmlAttribute(name = "integrityCheckAlgorithm")
    protected IntegrityCheckAlgorithm integrityCheckAlgorithm;

    /**
     * Recupera il valore della proprietà mediaType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        if (mediaType == null) {
            return "text/plain";
        } else {
            return mediaType;
        }
    }

    /**
     * Imposta il valore della proprietà mediaType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Recupera il valore della proprietà compression.
     * 
     * @return
     *     possible object is
     *     {@link CompressionAlgorithm }
     *     
     */
    public CompressionAlgorithm getCompression() {
        return compression;
    }

    /**
     * Imposta il valore della proprietà compression.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionAlgorithm }
     *     
     */
    public void setCompression(CompressionAlgorithm value) {
        this.compression = value;
    }

    /**
     * Recupera il valore della proprietà integrityCheck.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIntegrityCheck() {
        return integrityCheck;
    }

    /**
     * Imposta il valore della proprietà integrityCheck.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIntegrityCheck(byte[] value) {
        this.integrityCheck = value;
    }

    /**
     * Recupera il valore della proprietà integrityCheckAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link IntegrityCheckAlgorithm }
     *     
     */
    public IntegrityCheckAlgorithm getIntegrityCheckAlgorithm() {
        if (integrityCheckAlgorithm == null) {
            return IntegrityCheckAlgorithm.SHA_1;
        } else {
            return integrityCheckAlgorithm;
        }
    }

    /**
     * Imposta il valore della proprietà integrityCheckAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrityCheckAlgorithm }
     *     
     */
    public void setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        this.integrityCheckAlgorithm = value;
    }

}
