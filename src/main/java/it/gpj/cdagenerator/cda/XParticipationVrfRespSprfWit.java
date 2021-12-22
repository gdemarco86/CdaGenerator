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
 * <p>Classe Java per x_ParticipationVrfRespSprfWit.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationVrfRespSprfWit"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *     &lt;enumeration value="RESP"/&gt;
 *     &lt;enumeration value="SPRF"/&gt;
 *     &lt;enumeration value="WIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationVrfRespSprfWit")
@XmlEnum
public enum XParticipationVrfRespSprfWit {

    VRF,
    RESP,
    SPRF,
    WIT;

    public String value() {
        return name();
    }

    public static XParticipationVrfRespSprfWit fromValue(String v) {
        return valueOf(v);
    }

}
