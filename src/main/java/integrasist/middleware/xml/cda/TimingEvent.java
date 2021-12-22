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
 * <p>Classe Java per TimingEvent.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TimingEvent">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="ACD"/>
 *     &lt;enumeration value="ACM"/>
 *     &lt;enumeration value="ACV"/>
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="ICD"/>
 *     &lt;enumeration value="ICM"/>
 *     &lt;enumeration value="ICV"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PCD"/>
 *     &lt;enumeration value="PCM"/>
 *     &lt;enumeration value="PCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimingEvent")
@XmlEnum
public enum TimingEvent {

    AC,
    ACD,
    ACM,
    ACV,
    HS,
    IC,
    ICD,
    ICM,
    ICV,
    PC,
    PCD,
    PCM,
    PCV;

    public String value() {
        return name();
    }

    public static TimingEvent fromValue(String v) {
        return valueOf(v);
    }

}
