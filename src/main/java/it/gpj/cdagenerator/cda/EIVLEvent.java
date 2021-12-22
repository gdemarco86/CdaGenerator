//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A code for a common (periodical) activity of daily
 *                         living based on which the event related periodic
 *                         interval is specified.
 *                      
 * 
 * <p>Classe Java per EIVL.event complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EIVL.event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:hl7-org:v3}CE"&gt;
 *       &lt;attribute name="code" type="{urn:hl7-org:v3}TimingEvent" /&gt;
 *       &lt;attribute name="codeSystem" type="{urn:hl7-org:v3}uid" fixed="2.16.840.1.113883.5.139" /&gt;
 *       &lt;attribute name="codeSystemName" type="{urn:hl7-org:v3}st" fixed="TimingEvent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIVL.event")
public class EIVLEvent
    extends CE
{


}
