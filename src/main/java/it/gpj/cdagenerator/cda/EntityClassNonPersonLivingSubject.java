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
 * <p>Classe Java per EntityClassNonPersonLivingSubject.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassNonPersonLivingSubject"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="NLIV"/&gt;
 *     &lt;enumeration value="ANM"/&gt;
 *     &lt;enumeration value="MIC"/&gt;
 *     &lt;enumeration value="PLNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityClassNonPersonLivingSubject")
@XmlEnum
public enum EntityClassNonPersonLivingSubject {

    NLIV,
    ANM,
    MIC,
    PLNT;

    public String value() {
        return name();
    }

    public static EntityClassNonPersonLivingSubject fromValue(String v) {
        return valueOf(v);
    }

}
