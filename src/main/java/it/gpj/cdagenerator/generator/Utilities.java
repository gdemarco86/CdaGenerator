/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.gpj.cdagenerator.generator;

import integrasist.middleware.xml.cda.POCDMT000040ClinicalDocument;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 *
 * @author Giovanni
 */
public class Utilities {
    public static String formatDateForCDA(Date date){
        return formatDateForCDA(date, true);
    }
    public static String formatDateForCDA(Date date, boolean withTime){
        return withTime ? formatDateForCDA(date, "YYYYMMddhhmmss") 
                : formatDateForCDA(date, "YYYYMMdd");
    }
    public static String formatDateForCDA(Date date, String format){
        if (date == null)
            return "";
        Instant instant = date.toInstant();
        LocalDateTime ldt = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(format);
        return ldt.format(fmt);
    }
    
    public static JAXBElement asSerializable(Object obj, String name, Object parent){
        return new JAXBElement(
                new QName(POCDMT000040ClinicalDocument.XSI_SCHEMA_LOCATION, name, ""),
                obj.getClass(), parent.getClass(), obj);
    }
}
