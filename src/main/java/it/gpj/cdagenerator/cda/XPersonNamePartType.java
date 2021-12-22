//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per x_PersonNamePartType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PersonNamePartType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="FAM"/&gt;
 *     &lt;enumeration value="GIV"/&gt;
 *     &lt;enumeration value="PFX"/&gt;
 *     &lt;enumeration value="SFX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_PersonNamePartType")
@XmlEnum
public enum XPersonNamePartType {

    DEL,
    FAM,
    GIV,
    PFX,
    SFX;

    public String value() {
        return name();
    }

    public static XPersonNamePartType fromValue(String v) {
        return valueOf(v);
    }

}
