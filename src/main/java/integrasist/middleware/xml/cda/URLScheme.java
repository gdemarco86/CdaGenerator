//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.11.11 alle 01:48:33 AM CET 
//


package integrasist.middleware.xml.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per URLScheme.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="URLScheme">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="ftp"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="mailto"/>
 *     &lt;enumeration value="mllp"/>
 *     &lt;enumeration value="modem"/>
 *     &lt;enumeration value="nfs"/>
 *     &lt;enumeration value="tel"/>
 *     &lt;enumeration value="telnet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "URLScheme")
@XmlEnum
public enum URLScheme {

    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("ftp")
    FTP("ftp"),
    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("mailto")
    MAILTO("mailto"),
    @XmlEnumValue("mllp")
    MLLP("mllp"),
    @XmlEnumValue("modem")
    MODEM("modem"),
    @XmlEnumValue("nfs")
    NFS("nfs"),
    @XmlEnumValue("tel")
    TEL("tel"),
    @XmlEnumValue("telnet")
    TELNET("telnet");
    private final String value;

    URLScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static URLScheme fromValue(String v) {
        for (URLScheme c: URLScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
