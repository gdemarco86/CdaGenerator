/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.gpj.cdagenerator.test;

import integrasist.entities.Ricetta;
import integrasist.entities.Persona;
import integrasist.entities.PrestazioniRicetta;
import integrasist.middleware.xml.cda.POCDMT000040ClinicalDocument;
import it.gpj.cdagenerator.generator.CdaGenerator;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Giovanni
 */
public class MainTester {
    
    private static int NUM_PRESTAZIONI = 3;
    
    public static void main(String[] args) throws JAXBException, IOException{
        
        generaCdaTest();
        //leggiCdaTest();
        
        
    }
    
    private static void leggiCdaTest() throws JAXBException{
        // XML Unmarshalling
        JAXBContext jaxbContext = null;
        jaxbContext = JAXBContext.newInstance(new Class[] {POCDMT000040ClinicalDocument.class}, null);
        File file = new File("Esempi\\prescr. del solo codice ministeriale\\setRegistraPrescrizione.xml");
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        POCDMT000040ClinicalDocument cd = (POCDMT000040ClinicalDocument)((JAXBElement)jaxbUnmarshaller.unmarshal(file)).getValue();
        //POCDMT000040ClinicalDocument cd = (POCDMT000040ClinicalDocument) jaxbUnmarshaller.unmarshal(file);
        //System.out.println(cd);
    }
    
    private static void generaCdaTest() throws JAXBException, IOException{
        Ricetta ricetta = creaRicettaTest();
        POCDMT000040ClinicalDocument cd = CdaGenerator.generateCDA(ricetta);
        System.out.println(CdaGenerator.createXMLToString(cd, "Test.xml"));
    }
    
    private static Ricetta creaRicettaTest(){
        Random random = new Random();
        Persona paziente = creaPazienteTest();
        Persona medico = creaMedicoTest();
        
        // Creazione ricetta di test
        Ricetta ricetta = new Ricetta();
        // Codice della asl
        ricetta.setCodAsl("2.16.840.1.113883.2.9.4.3.8");
        // Assumo che qui ci sarà l'NRE o lo IUP
        ricetta.setIdRicetta("123456");
        ricetta.setProgressivo(BigInteger.ONE);
        ricetta.setIdProgRich(1l);
        ricetta.setDataRicetta(new Date(System.currentTimeMillis()));
        ricetta.setMaggiortutela(random.nextInt(2) == 0 ? BigInteger.ZERO : BigInteger.ONE);
        ricetta.setCodAutenticazione("220120141546512580000008561737");
        ricetta.setDataUpdate(new Date(System.currentTimeMillis()));
        
        ricetta.setCodAsl("160114");
        
        ricetta.setIdMedico("MDCBLL81H10D851Q");
        // Codice regionale del medico?
        ricetta.setCodMed("146628");
       
        ricetta.setCodEsenNazionali("B02.211");
        ricetta.setCodEsenRegionale("R01.411");
       
        ricetta.setIdPaziente(paziente.getIdPersona());
        ricetta.setPaziente(paziente);
        ricetta.setIdMedico(medico.getIdPersona());
        ricetta.setMedico(medico);
        
        ricetta.setPriorita("P");
        
        List<PrestazioniRicetta> prestazioniRicettaList = new ArrayList(); 
//        for (int i = 1; i <= NUM_PRESTAZIONI; i++) {
//            short qta = (short) (random.nextInt(5) + 1);
//            prestazioniRicettaList.add(creaPrestazioneTest(ricetta, i, qta));
//        }
        for (int i = NUM_PRESTAZIONI; i > 0; i--) {
            short qta = (short) (random.nextInt(5) + 1);
            prestazioniRicettaList.add(creaPrestazioneTest(ricetta, i, qta));
        }
        ricetta.setPrestazioniRicettaList(prestazioniRicettaList);
        
        return ricetta;
    }
    
    private static Persona creaPazienteTest(){
        Persona paziente = new Persona("PNCPLL86H24D851Q");
        paziente.setIdPersona("PNCPLL86H24D851Q");
        paziente.setCodiceFiscale("PNCPLL86H24D851Q");
        paziente.setNome("Pinco");
        paziente.setCognome("Pallino");
        
        paziente.setCittaResidenza("Minerbio");
        paziente.setProvinciaResidenza("BO");
        paziente.setCAPResidenza("40061");
        paziente.setIndirizzoResidenza("Via bella, 5");
        
        paziente.setCittaNascita("Tricase");
        paziente.setProvinciaNascita("LE");
        paziente.setCAPNascita("73039");
        
        paziente.setDataNascita((new GregorianCalendar(1986,5,24)).getTime());
        
        paziente.setNumeroTesseraSanitaria("1234567890");
        return paziente;
    }
    
    private static Persona creaMedicoTest(){
        Persona paziente = new Persona("MDCBLL81H10D851Q");
        paziente.setIdPersona("MDCBLL81H10D851Q");
        paziente.setCodiceFiscale("MDCBLL81H10D851Q");
        paziente.setNome("Medico");
        paziente.setCognome("Bello");
        
        paziente.setCittaResidenza("Tricase");
        paziente.setProvinciaResidenza("LE");
        paziente.setCAPResidenza("73039");
        paziente.setIndirizzoResidenza("Via Ravenna, 5");
        
        paziente.setCittaNascita("Gagliano Del Capo");
        paziente.setProvinciaNascita("LE");
        paziente.setCAPNascita("73034");
        
        paziente.setDataNascita((new GregorianCalendar(1981,5,10)).getTime());
        return paziente;
    }
    
    private static PrestazioniRicetta creaPrestazioneTest(Ricetta ricetta, int progressivo, short qta){
        PrestazioniRicetta prestazione = new PrestazioniRicetta();
        prestazione.setCodNaz("CN00"+progressivo);
        prestazione.setCodReg("CR00"+progressivo);
        prestazione.setNomeprest("Prestazione Test "+progressivo);
        if (progressivo % 2 == 0)
            prestazione.setNota("Nota test della prestazione "+progressivo);
        prestazione.setProgressivo(BigInteger.valueOf(progressivo));
        prestazione.setQta(BigInteger.valueOf(qta));
        prestazione.setQtaprescritta(qta);
        prestazione.setQtaMax(qta);
        prestazione.setRicettaid(ricetta);
        if (progressivo % 2 == 0)
            prestazione.setTipoAccesso("primo accesso");
        else
            prestazione.setTipoAccesso("accesso successivo");
        return prestazione;
    }
}
