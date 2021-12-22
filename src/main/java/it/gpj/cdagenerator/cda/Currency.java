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
 * <p>Classe Java per Currency.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Currency"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FIM"/&gt;
 *     &lt;enumeration value="FRF"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="NLG"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="RUR"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Currency")
@XmlEnum
public enum Currency {

    ARS,
    AUD,
    BRL,
    CAD,
    CHF,
    CLF,
    CNY,
    DEM,
    ESP,
    EUR,
    FIM,
    FRF,
    GBP,
    ILS,
    INR,
    JPY,
    KRW,
    MXN,
    NLG,
    NZD,
    PHP,
    RUR,
    THB,
    TRL,
    TWD,
    USD,
    ZAR;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
