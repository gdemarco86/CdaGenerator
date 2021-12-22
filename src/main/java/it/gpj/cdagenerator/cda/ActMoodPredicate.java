//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ActMoodPredicate.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodPredicate"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EVN.CRT"/&gt;
 *     &lt;enumeration value="GOL"/&gt;
 *     &lt;enumeration value="OPT"/&gt;
 *     &lt;enumeration value="PERM"/&gt;
 *     &lt;enumeration value="PERMRQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMoodPredicate")
@XmlEnum
public enum ActMoodPredicate {

    @XmlEnumValue("EVN.CRT")
    EVN_CRT("EVN.CRT"),
    GOL("GOL"),
    OPT("OPT"),
    PERM("PERM"),
    PERMRQ("PERMRQ");
    private final String value;

    ActMoodPredicate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActMoodPredicate fromValue(String v) {
        for (ActMoodPredicate c: ActMoodPredicate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
