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
 * <p>Classe Java per x_ActClassDocumentEntryAct.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassDocumentEntryAct"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="ACCM"/&gt;
 *     &lt;enumeration value="CONS"/&gt;
 *     &lt;enumeration value="CTTEVENT"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="INFRM"/&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="SPCTRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassDocumentEntryAct")
@XmlEnum
public enum XActClassDocumentEntryAct {

    ACT,
    ACCM,
    CONS,
    CTTEVENT,
    INC,
    INFRM,
    PCPR,
    REG,
    SPCTRT;

    public String value() {
        return name();
    }

    public static XActClassDocumentEntryAct fromValue(String v) {
        return valueOf(v);
    }

}
