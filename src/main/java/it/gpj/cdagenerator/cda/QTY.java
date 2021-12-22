//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.20 alle 01:00:17 PM CET 
//


package it.gpj.cdagenerator.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The quantity data type is an abstract generalization
 *             for all data types (1) whose value set has an order
 *             relation (less-or-equal) and (2) where difference is
 *             defined in all of the data type's totally ordered value
 *             subsets.  The quantity type abstraction is needed in
 *             defining certain other types, such as the interval and
 *             the probability distribution.
 *          
 * 
 * <p>Classe Java per QTY complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QTY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}ANY"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTY")
@XmlSeeAlso({
    RTOQTYQTY.class,
    REAL.class,
    MO.class,
    PQ.class,
    RTOPQPQ.class,
    RTOMOPQ.class,
    TS.class,
    INT.class
})
public abstract class QTY
    extends ANY
{


}
