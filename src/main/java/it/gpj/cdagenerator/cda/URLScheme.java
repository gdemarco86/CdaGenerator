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
 * <p>Classe Java per URLScheme.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="URLScheme"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="file"/&gt;
 *     &lt;enumeration value="ftp"/&gt;
 *     &lt;enumeration value="http"/&gt;
 *     &lt;enumeration value="mailto"/&gt;
 *     &lt;enumeration value="mllp"/&gt;
 *     &lt;enumeration value="modem"/&gt;
 *     &lt;enumeration value="nfs"/&gt;
 *     &lt;enumeration value="tel"/&gt;
 *     &lt;enumeration value="telnet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
