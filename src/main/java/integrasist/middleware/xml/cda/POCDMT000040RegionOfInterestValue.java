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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per POCD_MT000040.RegionOfInterest.value complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.RegionOfInterest.value">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}INT">
 *       &lt;attribute name="unsorted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.RegionOfInterest.value")
public class POCDMT000040RegionOfInterestValue
    extends INT
{

    @XmlAttribute(name = "unsorted")
    protected Boolean unsorted;

    /**
     * Recupera il valore della proprietà unsorted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnsorted() {
        if (unsorted == null) {
            return false;
        } else {
            return unsorted;
        }
    }

    /**
     * Imposta il valore della proprietà unsorted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsorted(Boolean value) {
        this.unsorted = value;
    }

}
