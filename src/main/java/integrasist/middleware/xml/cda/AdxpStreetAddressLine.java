//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.11 alle 01:48:33 AM CET 
//
package integrasist.middleware.xml.cda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java per adxp.streetAddressLine complex type.
 *
 * <p>
 * Il seguente frammento di schema specifica il contenuto previsto contenuto in
 * questa classe.
 *
 * <pre>
 * &lt;complexType name="adxp.streetAddressLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}ADXP">
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}AddressPartType" fixed="SAL" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adxp.streetAddressLine")
public class AdxpStreetAddressLine
        extends ADXP {

    public List<Serializable> getContent() {
        return super.content;
    }

    public void setContent(List<Serializable> content) {
        super.content = content;
    }
}
