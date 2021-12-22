//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.11 alle 01:48:33 AM CET 
//


package integrasist.middleware.xml.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The BooleanNonNull type is used where a Boolean cannot
 *             have a null value. A Boolean value can be either
 *             true or false.
 *          
 * 
 * <p>Classe Java per ANYNonNull complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ANYNonNull">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}ANY">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANYNonNull")
@XmlSeeAlso({
    BN.class
})
public class ANYNonNull
    extends ANY
{


}
