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
 *                      A thumbnail is an abbreviated rendition of the full
 *                      data. A thumbnail requires significantly fewer
 *                      resources than the full data, while still maintaining
 *                      some distinctive similarity with the full data. A
 *                      thumbnail is typically used with by-reference
 *                      encapsulated data. It allows a user to select data
 *                      more efficiently before actually downloading through
 *                      the reference.
 *                   
 * 
 * <p>Classe Java per thumbnail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="thumbnail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:hl7-org:v3}ED"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{urn:hl7-org:v3}TEL" minOccurs="0"/&gt;
 *         &lt;element name="thumbnail" type="{urn:hl7-org:v3}thumbnail" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thumbnail")
public class Thumbnail
    extends ED
{


}
