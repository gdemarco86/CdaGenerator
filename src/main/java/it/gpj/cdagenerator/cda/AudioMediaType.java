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
 * <p>Classe Java per AudioMediaType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioMediaType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="audio/basic"/&gt;
 *     &lt;enumeration value="audio/k32adpcm"/&gt;
 *     &lt;enumeration value="audio/mpeg"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudioMediaType")
@XmlEnum
public enum AudioMediaType {

    @XmlEnumValue("audio/basic")
    AUDIO_BASIC("audio/basic"),
    @XmlEnumValue("audio/k32adpcm")
    AUDIO_K_32_ADPCM("audio/k32adpcm"),
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg");
    private final String value;

    AudioMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioMediaType fromValue(String v) {
        for (AudioMediaType c: AudioMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
