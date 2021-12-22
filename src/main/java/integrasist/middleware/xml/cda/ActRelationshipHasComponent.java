//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.11 alle 01:48:33 AM CET 
//


package integrasist.middleware.xml.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ActRelationshipHasComponent.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipHasComponent">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COMP"/>
 *     &lt;enumeration value="ARR"/>
 *     &lt;enumeration value="CTRLV"/>
 *     &lt;enumeration value="DEP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipHasComponent")
@XmlEnum
public enum ActRelationshipHasComponent {

    COMP,
    ARR,
    CTRLV,
    DEP;

    public String value() {
        return name();
    }

    public static ActRelationshipHasComponent fromValue(String v) {
        return valueOf(v);
    }

}
