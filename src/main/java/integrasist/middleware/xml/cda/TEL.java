//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.11 alle 01:48:33 AM CET 
//


package integrasist.middleware.xml.cda;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A telephone number (voice or fax), e-mail address, or
 *             other locator for a resource (information or service)
 *             mediated by telecommunication equipment. The address
 *             is specified as a Universal Resource Locator (URL)
 *             qualified by time specification and use codes that help
 *             in deciding which address to use for a given time and
 *             purpose.
 *          
 * 
 * <p>Classe Java per TEL complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TEL">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}URL">
 *       &lt;sequence>
 *         &lt;element name="useablePeriod" type="{urn:hl7-org:v3}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{urn:hl7-org:v3}set_TelecommunicationAddressUse" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEL", propOrder = {
    "useablePeriod"
})
public class TEL
    extends URL implements Cloneable
{

    protected List<SXCMTS> useablePeriod;
    @XmlAttribute(name = "use")
    protected List<String> use;

    
    public TEL copia()
    {
        TEL nuovo = null;
        try {
            nuovo = (TEL) this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(TEL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nuovo;
    }
    
    
    
    /**
     * Gets the value of the useablePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useablePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseablePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SXCMTS }
     * 
     * 
     */
    public List<SXCMTS> getUseablePeriod() {
        if (useablePeriod == null) {
            useablePeriod = new ArrayList<SXCMTS>();
        }
        return this.useablePeriod;
    }

    /**
     * Gets the value of the use property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the use property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUse() {
        if (use == null) {
            use = new ArrayList<String>();
        }
        return this.use;
    }

}
