package it.gpj.cdagenerator.generator;

import integrasist.entities.*;
import integrasist.middleware.xml.cda.*;
import it.gpj.cdagenerator.generator.Constants.*;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

/**
 *
 * @author Giovanni
 */
public class CdaGenerator {
    public static POCDMT000040ClinicalDocument generateCDA(Ricetta ricetta) {
        POCDMT000040ClinicalDocument clinicalDocument = new POCDMT000040ClinicalDocument();
        
        Persona paziente = ricetta.getPaziente();
        Persona medico = ricetta.getMedico();
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <realmCode>">
        // ELEMENTO <realmCode>
        // <realmCode code="IT"/>
        CS csCode = new CS(); csCode.setCode("IT");
        List<CS> realm = new ArrayList<>(); realm.add(csCode);
        clinicalDocument.<CS>setRealmCode(realm);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <typeId>">
        // ELEMENTO <typeId>        
        // <typeId extension="POCD_MT000040" root="2.16.840.1.113883.1.3"/>
        POCDMT000040InfrastructureRootTypeId typeId = new POCDMT000040InfrastructureRootTypeId();
        typeId.setExtension(TypeId.extension); typeId.setRoot(TypeId.root);
        clinicalDocument.setTypeId(typeId);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <templateId>">
        // ELEMENTO <templateId>
        // <templateId extension="ITPRF_PRESC_FARMA-001" root="2.16.840.1.113883.2.9.10.2.1"/>
        II iiTemplateId = new II(); iiTemplateId.setRoot(TemplateId.root);
        /* 
        GIOVANNI-NB1: qui andrebbe messo un valore diverso a seconda del tipo di ricetta
        (ora non mi sembra che nell'entità ricetta sia specificata la tipololgia
        e mi sembra di aver capito che devono essere gestite solo le prescrizioni di 
        visite specialistiche)*/
        iiTemplateId.setExtension(TemplateId.Extensions.PrescrizioneSpecialistica);
        List<II> templateId = new ArrayList<>(); templateId.add(iiTemplateId);
        clinicalDocument.setTemplateId(templateId);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <id>">
        // ELEMENTO <id>
        // <id assigningAuthorityName="MEF" extension="" root="2.16.840.1.113883.2.9.4.3.8"/>
        II iiId = new II(); iiId.setRoot(ricetta.getCodAsl());
        // qui ci va l'identificativo ricetta (NRE o IUP) che assumo sia in questo campo dell'entità
        iiId.setExtension(ricetta.getIdRicetta());
        // qui ci va Nome ASL/AO di competenza; sarà sempre "regione puglia"? O in alcuni casi
        // può essere MEF?
        iiId.setAssigningAuthorityName(Id.AssigningAuthorityName.RegionePuglia);
        clinicalDocument.setId(iiId);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <code>">
        // ELEMENTO <code>
        // <code code="29305-0" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC" codeSystemVersion="2.19" displayName="PRESCRIZIONE FARMACEUTICA">
        CE code = new CE(); 
        // ATTENZIONE: nel PDF dice che ci sono solo certi valori ammissibili, nell'esempio
        // xml fornito ne viene usato uno non citato... ???
        code.setCode(Code.code);
        code.setCodeSystem(Code.codeSystem); code.setCodeSystemName(Code.codeSystemName);
        code.setCodeSystemVersion(Code.codeSystemVersion);
        // vedi commento GIOVANNI-NB1
        code.setDisplayName(Code.DisplayName.PrescrizioneSpecialistica);
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTI TRANSLATIONS">
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <code> -> <translation> TIPO DOC">
        CD translationCode = new CD(); translationCode.setCode(Code.TranslationTipoDoc.code);
        translationCode.setCodeSystem(Code.TranslationTipoDoc.codeSystem);
        translationCode.setCodeSystemName(Code.TranslationTipoDoc.codeSystemName);
        translationCode.setCodeSystemVersion(Code.TranslationTipoDoc.codeSystemVersion);
        translationCode.setDisplayName(Code.TranslationTipoDoc.displayName);
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTI <code> -> <translation> -> <qualifier> -> <value>">
        // ELEMENTI <code> -> <translation> -> <qualifier> -> <value>
        CR tcQualifier = new CR();
        CD tcQulifierValue = new CD();
        // Valori ammissibili = {"3400-1" "3400-2" "3400-3" }, immagino si riferiscano
        // sempre alle tre tipologie farmaceutica, specialistica, ricovero
        tcQulifierValue.setCode(Code.TranslationTipoDoc.Value.ValueCode.PrescrizioneSpecialistica);
        tcQulifierValue.setCodeSystem(Code.TranslationTipoDoc.Value.codeSystem);
        tcQulifierValue.setCodeSystemName(Code.TranslationTipoDoc.Value.codeSystemName);
        tcQulifierValue.setCodeSystemVersion(Code.TranslationTipoDoc.Value.codeSystemVersion);
        // vedi commento GIOVANNI-NB1
        tcQulifierValue.setDisplayName(Code.TranslationTipoDoc.Value.DisplayName.PrescrizioneSpecialistica);
        tcQualifier.setValue(tcQulifierValue);
        translationCode.setQualifier(Collections.singletonList(tcQualifier));
        // </editor-fold>
        
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <code> -> <translation> TIPO PRESCR">
        CD translationPrescr = new CD(); 
        /* GIOVANNI-NB2: qui va indicato se si tratta di ricetta SSN o SASN, 
            capire se c'è modo di vederlo dall'entità della ricetta
        */
        translationPrescr.setCode(Code.TranslationTipoPrescr.TipoPrescCode.SSN);
        translationPrescr.setDisplayName(Code.TranslationTipoPrescr.DisplayName.SSN);
        translationPrescr.setCodeSystem(Code.TranslationTipoPrescr.codeSystem);
        translationPrescr.setCodeSystemName(Code.TranslationTipoPrescr.codeSystemName);
        
        /* GIOVANNI-NB3: qui potrebbe andare un altro elemento facoltativo <qualifier> per indicare
        il tipo di ricetta (suggerita, ricovero, altro). Capire se è una cosa che può servire.
        Dall'entità non mi pare ci sia questa informazione.
        -- Pag. 12 del PDF
        */
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTI <code> -> <translation> -> <qualifier> -> <value>">
        // ELEMENTI <code> -> <translation> -> <qualifier> -> <value>
        CR tpQualifier = new CR();
        CD tpQulifierValue = new CD();
        // GIOVANNI-NB4: Valori ammissibili = {"IT" "NA" "ND" "NE" "NX" "ST" "UE" "EE" }
        // Non so se e come si può reperire dalla ricetta
        // -- Pag. 14 del PDF
        tpQulifierValue.setCode(Code.TranslationTipoPrescr.Value.ValueCode.IT);
        tpQulifierValue.setCodeSystem(Code.TranslationTipoPrescr.Value.codeSystem);
        tpQulifierValue.setCodeSystemName(Code.TranslationTipoPrescr.Value.codeSystemName);
        tpQualifier.setValue(tpQulifierValue);
        translationPrescr.setQualifier(Collections.singletonList(tpQualifier));
        // </editor-fold>
        
        // </editor-fold>
        
        List<CD> translations = new ArrayList<>(); 
        translations.add(translationCode);
        translations.add(translationPrescr);
        code.setTranslation(translations);
        
        clinicalDocument.setCode(code);
        // </editor-fold>
        
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <effectiveTime>">
        TS effectiveTime = new TS(); 
        effectiveTime.setValue(Utilities.formatDateForCDA(ricetta.getDataRicetta()));
        clinicalDocument.setEffectiveTime(effectiveTime);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <confidentialityCode>">
        CE confidentiality = new CE(); 
        /* Valori ammissibili = {"N" "V"}, a seconda che la ricetta abbia maggior tutela
            dell'anonimato o meno. Immagino che il valore sull'entità sppure di tipo BigInt
            funzioni come un booleano... da verificare!
        */
        confidentiality.setCode(ricetta.getMaggiortutela() == BigInteger.ZERO 
            ? ConfidentialityCode.Code.Normal : ConfidentialityCode.Code.VeryRestricted);
        confidentiality.setCodeSystem(ConfidentialityCode.codeSystem);
        confidentiality.setCodeSystemName(ConfidentialityCode.codeSystemName);
        clinicalDocument.setConfidentialityCode(confidentiality);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <languageCode>">
        CS languageCode = new CS();
        languageCode.setCode(LanguageCode.code);
        clinicalDocument.setLanguageCode(languageCode);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <setId>">
        II setId = new II();
        /* NB-GIOVANNI5: vedere Pag.19 PDF. A quanto ho capito qui va indicato
            o lo IUP (che viene restituito quando non è stato possibile avere un NRE),
            o l'NRE o il codice autenticazione. Non so bene che differenza ci sia tra questi
            ultimi due e come capire questo dall'entità.
        */
        /*if (ricetta.getNRE() != null){
            setId.setRoot(SetId.NRE.root);
            setId.setAssigningAuthorityName(SetId.NRE.assigningAuthorityName);
            setId.setExtension(ricetta.getNRE());
        }
        else */if (ricetta.getCodAutenticazione() != null){
            setId.setRoot(SetId.CodAutenticazione.root);
            setId.setAssigningAuthorityName(SetId.CodAutenticazione.assigningAuthorityName);
            setId.setExtension(ricetta.getCodAutenticazione());
        } else {
            setId.setRoot(SetId.IUP.root);
            setId.setAssigningAuthorityName(SetId.IUP.assigningAuthorityName);
            // Non so dove vada preso...
            setId.setExtension(ricetta.getIdRicetta());
        }
        clinicalDocument.setSetId(setId);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <versionNumber>">
        INT versionNumber = new INT();
        //versionNumber.setValue(BigInteger.valueOf(ricetta.getIdProgRich()));
        versionNumber.setValue(ricetta.getProgressivo());
        clinicalDocument.setVersionNumber(versionNumber);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget>">
        POCDMT000040RecordTarget recordTarget = new POCDMT000040RecordTarget();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole>">
        POCDMT000040PatientRole patientRole = new POCDMT000040PatientRole();
        List<II> patientRoleIds = new ArrayList<>();
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <id> per CF">
        II idCodFiscale = new II();
        idCodFiscale.setAssigningAuthorityName(RecordTarget.PatientRole.IdCodFiscale.assigningAuthorityName);
        idCodFiscale.setRoot(RecordTarget.PatientRole.IdCodFiscale.root);
        // Capire come recuperare codice fiscale paziente
        idCodFiscale.setExtension(paziente.getCodiceFiscale());
        patientRoleIds.add(idCodFiscale);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <id> per Tessera Sanitaria">
        II idTesseraSanitaria = new II();
        idTesseraSanitaria.setAssigningAuthorityName(RecordTarget.PatientRole.IdTesseraSanitaria.assigningAuthorityName);
        idTesseraSanitaria.setRoot(RecordTarget.PatientRole.IdTesseraSanitaria.root);
        // Capire come recuperare codice fiscale paziente
        idTesseraSanitaria.setExtension(paziente.getNumeroTesseraSanitaria());
        patientRoleIds.add(idTesseraSanitaria);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="NOTE SU ELEMENTI ID">
        /*
        L'elemento <patientRole> DEVE contenere da uno a tre elementi <id>. 
        I diversi tipi di elemento <id> interni al <patientRole> non sono mutuamente 
        esclusivi e sono strutturati in modo diverso a seconda che si riferiscano a: 
        a) Soggetti assicurati da istituzioni estere: 
        b) Stranieri Temporaneamente Presenti (STP): 
        c) Cittadini italiani o stranieri residenti (iscritti SSN): 
        L'elemento <id> che riporta il codice della tessera sanitaria, e il numero 
        della tessera sasn, sono gli unici che possono essere facoltativamente presente 
        anche insieme all'ID principale della sezione.
        */
        /* NB-GIOVANNI6: qui a quanto ho capito andrà almeno un altro elemento ID che varia
        a seconda della tipologia di paziente... vedere Pagine PDF da 24 a 27
        */
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <addr>">
        AD address = new AD();
        List<Serializable> addressContent = new ArrayList();
        // Country
        AdxpCountry country = new AdxpCountry();
        
        country.setContent(Collections.singletonList(paziente.getProvinciaResidenza()));
        addressContent.add(Utilities.asSerializable(country, EntityClassPlace.COUNTRY.name().toLowerCase(), address));
        // City
        AdxpCity city = new AdxpCity();
        city.setContent(Collections.singletonList(paziente.getCittaResidenza()));
        addressContent.add(Utilities.asSerializable(city, EntityClassPlace.CITY.name().toLowerCase(), address));
        // CAP
        AdxpPostalCode cap = new AdxpPostalCode();
        cap.setContent(Collections.singletonList(paziente.getCAPResidenza()));
        addressContent.add(Utilities.asSerializable(cap, ElementNames.PostalCode, address));
        // Indirizzo
        AdxpStreetAddressLine indirizzo = new AdxpStreetAddressLine();
        indirizzo.setContent(Collections.singletonList(paziente.getIndirizzoResidenza()));
        addressContent.add(Utilities.asSerializable(indirizzo, ElementNames.StreetAddressLine, address));
        address.setContent(addressContent);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <patient>">
        POCDMT000040Patient patient = new POCDMT000040Patient();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <patient> -> <name>">
        PN patientName = null;
        if (paziente.getNome() != null || paziente.getCognome() != null) {
            patientName = new PN();
            List<Serializable> patientNameContent = new ArrayList<>();
            // Nome
            if (paziente.getCognome() != null){
                EnGiven patientNameGiven = new EnGiven(); patientNameGiven.setContent(Collections.singletonList(paziente.getNome()));
                patientNameContent.add(Utilities.asSerializable(patientNameGiven, ElementNames.Given, patientName));
            }
            // Cognome
            if (paziente.getNome() != null){
                EnGiven patientNameFamily = new EnGiven(); patientNameFamily.setContent(Collections.singletonList(paziente.getCognome()));
                patientNameContent.add(Utilities.asSerializable(patientNameFamily, ElementNames.Family, patientName));
            }
            patientName.setContent(patientNameContent);
        }
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <patient> -> <administrativeGenderCode>">
        CE patientGenderCode = null;
            if (paziente.getSesso() != null){
            patientGenderCode = new CE();
            patientGenderCode.setCode(paziente.getSesso() == Persona.Sesso.M ? AdministrativeGenderCode.Code.M 
                    : AdministrativeGenderCode.Code.F);
            patientGenderCode.setDisplayName(patientGenderCode.getCode());
            patientGenderCode.setCodeSystem(AdministrativeGenderCode.codeSystem);
        }
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <patient> -> <birthTime>">
        TS patientBirthTime = null;
        if (paziente.getDataNascita() != null){
            patientBirthTime = new TS();
            patientBirthTime.setValue(Utilities.formatDateForCDA(paziente.getDataNascita(), false));
        }
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <recordTarget> -> <patientRole> -> <patient> -> <birthPlace>">
        POCDMT000040Birthplace patientBirthPlace = null;
        if (paziente.getCittaNascita()!= null || paziente.getProvinciaNascita() != null || paziente.getCAPNascita() != null){
            AD patientBirthPlaceAddress = new AD();
            List<Serializable> patientBirthPlaceContent = new ArrayList();
            if (paziente.getProvinciaNascita()!= null){
                AdxpCountry birthCountry = new AdxpCountry();
                birthCountry.setContent(Collections.singletonList(paziente.getProvinciaNascita()));
                patientBirthPlaceContent.add(Utilities.asSerializable(birthCountry, EntityClassPlace.COUNTRY.name().toLowerCase(), patientBirthPlaceAddress));
            }
            if (paziente.getCittaNascita()!= null){
                AdxpCity birthCity = new AdxpCity();
                birthCity.setContent(Collections.singletonList(paziente.getCittaNascita()));
                patientBirthPlaceContent.add(Utilities.asSerializable(birthCity, EntityClassPlace.CITY.name().toLowerCase(), patientBirthPlaceAddress));
            }
            if (paziente.getCAPNascita()!= null){
                AdxpPostalCode birthPostalCode = new AdxpPostalCode();
                birthPostalCode.setContent(Collections.singletonList(paziente.getCAPNascita()));
                patientBirthPlaceContent.add(Utilities.asSerializable(birthPostalCode, ElementNames.PostalCode, patientBirthPlaceAddress));
            }
            
            patientBirthPlace = new POCDMT000040Birthplace();
            POCDMT000040Place place = new POCDMT000040Place();
            
            patientBirthPlaceAddress.setContent(patientBirthPlaceContent);
            place.setAddr(patientBirthPlaceAddress);
            patientBirthPlace.setPlace(place);
            
        }
        
        // </editor-fold>
        
        if (patientName != null)
            patient.setName(Collections.singletonList(patientName));
        if (patientGenderCode != null)
            patient.setAdministrativeGenderCode(patientGenderCode);
        if (patientBirthTime != null)
            patient.setBirthTime(patientBirthTime);
        if (patientBirthPlace != null)
            patient.setBirthplace(patientBirthPlace);
        // </editor-fold>
        
        patientRole.setId(patientRoleIds);
        patientRole.setAddr(Collections.singletonList(address));
        patientRole.setPatient(patient);
        recordTarget.setPatientRole(patientRole);
        // </editor-fold>
        clinicalDocument.setRecordTarget(Collections.singletonList(recordTarget));
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <author>">
        POCDMT000040Author author =  new POCDMT000040Author();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <author> -> <time>">
        TS authorTime = new TS(); 
        authorTime.setValue(Utilities.formatDateForCDA(ricetta.getDataInsert()));
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <author> -> <assignedAuthor>">
        POCDMT000040AssignedAuthor assignedAuthor = new POCDMT000040AssignedAuthor();        
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <author> -> <assignedAuthor> -> <id>">
        List<II> assignedAuthorIds = new ArrayList();
        // elemento <id> per il CF del medico
        II idCFMedico = new II();
        idCFMedico.setRoot(Author.AssignedAuthor.IdCodiceFiscaleMedico.root);
        idCFMedico.setAssigningAuthorityName(Author.AssignedAuthor.IdCodiceFiscaleMedico.assigningAuthorityName);
        idCFMedico.setExtension(ricetta.getIdMedico());
        assignedAuthorIds.add(idCFMedico);
        
        // elemento <id> per il Codice Regionale del medico
        II idCRMedico = new II();
        idCRMedico.setRoot(Author.AssignedAuthor.IdCodiceRegionaleMedico.root);
        idCRMedico.setAssigningAuthorityName(Author.AssignedAuthor.IdCodiceRegionaleMedico.assigningAuthorityName);
        idCRMedico.setExtension(ricetta.getCodMed());
        assignedAuthorIds.add(idCRMedico);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <author> -> <assignedAuthor> -> <assignedPerson>">
        POCDMT000040Person assignedPersonMedico = new POCDMT000040Person();
        
        PN authorName = null;
        if (medico != null && (medico.getNome() != null || medico.getCognome() != null)) {
            authorName = new PN();
            List<Serializable> authorNameContent = new ArrayList<>();
            // Nome
            if (medico.getCognome() != null){
                EnGiven authorNameGiven = new EnGiven(); authorNameGiven.setContent(Collections.singletonList(medico.getNome()));
                authorNameContent.add(Utilities.asSerializable(authorNameGiven, ElementNames.Given, authorName));
            }
            // Cognome
            if (medico.getNome() != null){
                EnGiven authorNameFamily = new EnGiven(); authorNameFamily.setContent(Collections.singletonList(medico.getCognome()));
                authorNameContent.add(Utilities.asSerializable(authorNameFamily, ElementNames.Family, authorName));
            }
            authorName.setContent(authorNameContent);
        }
        
        assignedPersonMedico.setName(Collections.singletonList(authorName));
        
        // </editor-fold>
        
        assignedAuthor.setId(assignedAuthorIds);
        assignedAuthor.setAssignedPerson(assignedPersonMedico);
        // </editor-fold>
        
        author.setTime(authorTime);
        author.setAssignedAuthor(assignedAuthor);
        clinicalDocument.setAuthor(Collections.singletonList(author));
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <custodian>">
        POCDMT000040Custodian custodian = new POCDMT000040Custodian();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <custodian> -> <assignedCustodian>">
        POCDMT000040AssignedCustodian assignedCustodian = new POCDMT000040AssignedCustodian();
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <custodian> -> <assignedCustodian> -> <representedCustodianOrganization>">
        POCDMT000040CustodianOrganization custodianOrganization = new POCDMT000040CustodianOrganization();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <custodian> -> <assignedCustodian> -> <representedCustodianOrganization> -> <id>">
        II custodianId = new II();
        
        custodianId.setRoot(Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id.rootAO);
        custodianId.setExtension(ricetta.getCodAsl());
        custodianOrganization.setId(Collections.singletonList(custodianId));
        // </editor-fold>
        assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);
        // </editor-fold>
        custodian.setAssignedCustodian(assignedCustodian);
        // </editor-fold>
        clinicalDocument.setCustodian(custodian);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <legalAuthenticator>">
        POCDMT000040LegalAuthenticator legalAuthenticator = new POCDMT000040LegalAuthenticator();
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <legalAuthenticator> -> <time>">
        // DEVE contenere un tag <time> OBBLIGATORIO con l'indicazione dell'ora di produzione del documento (la valorizzazione viene effettuata come nel caso dell'attributo <effectiveTime>)
        legalAuthenticator.setTime(effectiveTime);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <legalAuthenticator> -> <signatureCode>">
        CS signatureCode = new CS();
        // NB-GIOVANNI7: Qui quando la ricetta avrà probabilmente un nuovo campo per capire se è
        // firmata o meno si può mettere N quando ancora è da firmare e S dopo che viene firmata
        signatureCode.setCode(LegalAuthenticator.SignatureCodes.S);
        legalAuthenticator.setSignatureCode(signatureCode);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <legalAuthenticator> -> <assignedEntity>">
        // AssignedEntity destinato ad accogliere l'<id> del prescrittore
        POCDMT000040AssignedEntity assignedEntity = new POCDMT000040AssignedEntity();
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <legalAuthenticator> -> <assignedEntity> -> <id>">
        // Qui va il CF del firmatario, che sarà immagino sempre il medico
        assignedEntity.setId(Collections.singletonList(idCFMedico));
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <legalAuthenticator> -> <assignedEntity> -> <assignedPerson>">
        // Rimetto lo stesso Person usato per l'auhor, ossia il medico dato che è lui il firmatario
        assignedEntity.setAssignedPerson(assignedPersonMedico);
        // </editor-fold>
        
        legalAuthenticator.setAssignedEntity(assignedEntity);
        // </editor-fold>
        
        clinicalDocument.setLegalAuthenticator(legalAuthenticator);
        
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <participant>">
        POCDMT000040Participant1 participant = new POCDMT000040Participant1();
        participant.setTypeCode(Collections.singletonList(Participant.typeCode));
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <participant> -> <associatedEntity>">
        POCDMT000040AssociatedEntity participantAssociatedEntity = new POCDMT000040AssociatedEntity();
        participantAssociatedEntity.setClassCode(Collections.singletonList(Participant.AssociatedEntity.classCode));
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <participant> -> <associatedEntity> -> <scopingOrganization>">
        POCDMT000040Organization participantOrganization = new POCDMT000040Organization();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <participant> -> <associatedEntity> -> <scopingOrganization> -> <id>">
        
        II aslResidenzaId = new II();
        aslResidenzaId.setRoot(Participant.AssociatedEntity.ScopingOrganization.IdAslResidenza.root);
        aslResidenzaId.setAssigningAuthorityName(Participant.AssociatedEntity.ScopingOrganization.IdAslResidenza.assigningAuthorityName);
        // NB-GIOVANNI8: qui andrebbe il codice ASL di residenza dell'assistito!
        aslResidenzaId.setExtension(ricetta.getCodAsl());
        aslResidenzaId.setDisplayable(true);
        participantOrganization.setId(Collections.singletonList(aslResidenzaId));
        // </editor-fold>
        
        participantAssociatedEntity.setScopingOrganization(participantOrganization);
        // </editor-fold>
        participant.setAssociatedEntity(participantAssociatedEntity);
        // </editor-fold>
        clinicalDocument.setParticipant(Collections.singletonList(participant));
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <componentOf>">
        POCDMT000040Component1 componentOf = new POCDMT000040Component1();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <componentOf> -> <encompassingEncounter>">
        POCDMT000040EncompassingEncounter encompassingEncounter = new POCDMT000040EncompassingEncounter();
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <componentOf> -> <encompassingEncounter> -> <code>">
        CE encompassingEncounterCode = new CE();
        encompassingEncounterCode.setCode(ComponentOf.EncompassingEncounter.Code.Codes.Ambulatoriale);
        encompassingEncounterCode.setCodeSystem(ComponentOf.EncompassingEncounter.Code.codeSystem);
        encompassingEncounter.setCode(encompassingEncounterCode);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <componentOf> -> <encompassingEncounter> -> <effectiveTime>">
        IVLTS encompassingEncounterEffectiveTime = new IVLTS();
        encompassingEncounterEffectiveTime.setValue(Utilities.formatDateForCDA(ricetta.getDataRicetta()));
        encompassingEncounter.setEffectiveTime(encompassingEncounterEffectiveTime);
        
        // </editor-fold>
        componentOf.setEncompassingEncounter(encompassingEncounter);
        // </editor-fold>
        clinicalDocument.setComponentOf(componentOf);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component>">
        POCDMT000040Component2 component = new POCDMT000040Component2();
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody>">
        POCDMT000040StructuredBody structuredBody = new POCDMT000040StructuredBody();
        
        List<POCDMT000040Component3> sbComponents = new ArrayList();
        /* NB-GIOVANNI10: Qui di seguito una sezione component per indicare le esenzioni. Da quanto ho capito nel
        tag <text> va un testo in cui vengono specificate in modo testuale le esenzioni previste
        (usando un tag <content> per metterci dentro eventuali codici esenzione identificandoli
        con un id).
        Sotto vanno messi vari tag <entry> dove si riprendono gli id messi nei tag content del text
        e per ognuno viene associato il codice esenzione (che prima compariva solo come testo).
        Io qui guardando l'entità ricetta ipotizzo ci possano essere fino a 3 tipi di esenzione:
        nazionale, regionale e della ricetta (di quest'ultimo sono molto incerto).
        */
        if (ricetta.getCodEsenNazionali() != null || ricetta.getCodEsenRegionale() != null || ricetta.getCodEsenRic() != null){
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)>">
            POCDMT000040Component3 componentEsenzioni = new POCDMT000040Component3();

            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)> -> <section>">
            POCDMT000040Section sectionEsenzioni = new POCDMT000040Section();
            sectionEsenzioni.setID(StructuredBody.ComponentEsenzioni.Section.ID);

            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)> -> <section> -> <code>">
            CE codeEsenzioni = new CE();
            codeEsenzioni.setCodeSystem(StructuredBody.ComponentEsenzioni.Section.Code.codeSystem);
            codeEsenzioni.setCode(StructuredBody.ComponentEsenzioni.Section.Code.code);
            codeEsenzioni.setCodeSystemName(StructuredBody.ComponentEsenzioni.Section.Code.codeSystemName);
            codeEsenzioni.setCodeSystemVersion(StructuredBody.ComponentEsenzioni.Section.Code.codeSystemVersion);
            codeEsenzioni.setDisplayName(StructuredBody.ComponentEsenzioni.Section.Code.displayName);
            sectionEsenzioni.setCode(codeEsenzioni);
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)> -> <section> -> <text>">
            StrucDocText esenzioniText = new StrucDocText();
            List<Serializable> esenzioniTextContent = new ArrayList();

            esenzioniTextContent.add("Esente per:");
            if (ricetta.getCodEsenNazionali() != null){
                StrucDocContent cntEsenzioneNaz = new StrucDocContent();
                cntEsenzioneNaz.setID(StructuredBody.ComponentEsenzioni.Section.Text.Content.idEsenzioneNazionale);
                cntEsenzioneNaz.setContent(Collections.singletonList(ricetta.getCodEsenNazionali()));
                esenzioniTextContent.add(Utilities.asSerializable(cntEsenzioneNaz, ElementNames.Content, esenzioniText) );
            }
            if (ricetta.getCodEsenRegionale()!= null){
                StrucDocContent cntEsenzioneReg = new StrucDocContent();
                cntEsenzioneReg.setID(StructuredBody.ComponentEsenzioni.Section.Text.Content.idEsenzioneRegionale);
                cntEsenzioneReg.setContent(Collections.singletonList(ricetta.getCodEsenRegionale()));
                esenzioniTextContent.add(Utilities.asSerializable(cntEsenzioneReg, ElementNames.Content, esenzioniText) );
            }
            if (ricetta.getCodEsenRic()!= null){
                StrucDocContent cntEsenzioneRic = new StrucDocContent();
                cntEsenzioneRic.setID(StructuredBody.ComponentEsenzioni.Section.Text.Content.idEsenzioneRicetta);
                cntEsenzioneRic.setContent(Collections.singletonList(ricetta.getCodEsenRic()));
                esenzioniTextContent.add(Utilities.asSerializable(cntEsenzioneRic, ElementNames.Content, esenzioniText) );
            }

            esenzioniText.setContent(esenzioniTextContent);

            sectionEsenzioni.setText(esenzioniText);
            // </editor-fold>

            List<POCDMT000040Entry> entriesEsenzioni = new ArrayList();
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)> -> <section> -> <entry>">
            if (ricetta.getCodEsenNazionali() != null){
                POCDMT000040Entry entryEsenzioneNazionale = createEntryEsenzione(ricetta.getCodEsenNazionali(), 
                                StructuredBody.ComponentEsenzioni.Section.Text.Content.idEsenzioneNazionale);
                entriesEsenzioni.add(entryEsenzioneNazionale);
            }
            if (ricetta.getCodEsenRegionale()!= null){
                POCDMT000040Entry entryEsenzioneNazionale = createEntryEsenzione(ricetta.getCodEsenRegionale(), 
                                StructuredBody.ComponentEsenzioni.Section.Text.Content.idEsenzioneRegionale);
                entriesEsenzioni.add(entryEsenzioneNazionale);
            }
            if (ricetta.getCodEsenRic()!= null){
                POCDMT000040Entry entryEsenzioneNazionale = createEntryEsenzione(ricetta.getCodEsenRic(), 
                                StructuredBody.ComponentEsenzioni.Section.Text.Content.idEsenzioneRicetta);
                entriesEsenzioni.add(entryEsenzioneNazionale);
            }

            sectionEsenzioni.setEntry(entriesEsenzioni);
            // </editor-fold>

            componentEsenzioni.setSection(sectionEsenzioni);

            // </editor-fold>

            sbComponents.add(componentEsenzioni);
            // </editor-fold>
        } 
        
        if (ricetta.getPrestazioniRicettaList().size() > 0){
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <component(prestazioni)>">
            POCDMT000040Component3 componentPrestazioni = new POCDMT000040Component3();

            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section>">
            POCDMT000040Section sectionPrestazioni = new POCDMT000040Section();
            sectionPrestazioni.setID(StructuredBody.ComponentPrestazioni.Section.ID);
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <code>">
            CE codePrestazioni = new CE();
            codePrestazioni.setCodeSystem(StructuredBody.ComponentPrestazioni.Section.Code.codeSystem);
            codePrestazioni.setCode(StructuredBody.ComponentPrestazioni.Section.Code.code);
            codePrestazioni.setCodeSystemName(StructuredBody.ComponentPrestazioni.Section.Code.codeSystemName);
            codePrestazioni.setCodeSystemVersion(StructuredBody.ComponentPrestazioni.Section.Code.codeSystemVersion);
            codePrestazioni.setDisplayName(StructuredBody.ComponentPrestazioni.Section.Code.displayName);
            sectionPrestazioni.setCode(codePrestazioni);
            // </editor-fold>
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text>">
            StrucDocText prestazioniText = new StrucDocText();
            List<Serializable> prestazioniTextContent = new ArrayList();
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text> -> <list(prestazioni)>">
            StrucDocList listPrestazioni = new StrucDocList();
            listPrestazioni.setID(StructuredBody.ComponentPrestazioni.Section.Text.ListPrestazioni.ID);
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text> -> <list(prestazioni)> -> <caption>">
            StrucDocCaption listPrestazioniCaption = new StrucDocCaption();
            listPrestazioniCaption.setContent(Collections.singletonList(StructuredBody.ComponentPrestazioni.Section.Text.ListPrestazioni.caption));
            listPrestazioni.setCaption(listPrestazioniCaption);
            // </editor-fold>
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text> -> <list(prestazioni)> -> <item>">
            // Pag. 187 del PDF TODO
            List<StrucDocItem> prestazioniListItems = new ArrayList();
            for (PrestazioniRicetta prestazione : getSortedPrestazioni(ricetta)){
                StrucDocItem item = new StrucDocItem();
                item.setID(prestazione.getProgressivo().toString());
                
                StrucDocContent itemContent = new StrucDocContent();
                itemContent.setID(getPrestazioneContentId(prestazione));
                itemContent.setContent(Collections.singletonList(prestazione.getNomeprest()));
                //item.setContent(addressContent);
                item.setContent(Collections.singletonList(Utilities.asSerializable(itemContent, ElementNames.Content, item)));
                
                prestazioniListItems.add(item);
            }
            listPrestazioni.setItem(prestazioniListItems);
            // </editor-fold>
            
            
            prestazioniTextContent.add(Utilities.asSerializable(listPrestazioni, ElementNames.List, prestazioniText));
            // </editor-fold>
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text> -> <list(problemi)>">
            StrucDocList listProblemi = new StrucDocList();
            listProblemi.setID(StructuredBody.ComponentPrestazioni.Section.Text.ListProblemi.ID);
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text> -> <list(prestazioni)> -> <caption>">
            StrucDocCaption listProblemiCaption = new StrucDocCaption();
            listProblemiCaption.setContent(Collections.singletonList(StructuredBody.ComponentPrestazioni.Section.Text.ListProblemi.caption));
            listProblemi.setCaption(listProblemiCaption);
            // </editor-fold>
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text> -> <list(prestazioni)> -> <item>">
            /* NB-GIOVANNI11: Pag. 187 del PDF TODO
            Qui ci andrebbe la lista dei problemi diagnostici presenti nella ricetta, ed è obbligatoria!
            Dall'entità attuale non so come poterla recuperare, per ora ci rimetto di nuovo le prestazioni
            (giusto per no lasciare vuota la sezione) ma TODO: capire come recuperare questi problemi diagnostici.
            */
            List<StrucDocItem> problemiListItems = new ArrayList();
            for (PrestazioniRicetta prestazione : getSortedPrestazioni(ricetta)){
                StrucDocItem item = new StrucDocItem();
                item.setID(prestazione.getProgressivo().toString());
                
                StrucDocContent itemContent = new StrucDocContent();
                itemContent.setID(getProblemaContentId(prestazione));
                itemContent.setContent(Collections.singletonList(prestazione.getNomeprest()));
                item.setContent(Collections.singletonList(Utilities.asSerializable(itemContent, ElementNames.Content, item)));
                
                problemiListItems.add(item);
            }
            listProblemi.setItem(problemiListItems);
            // </editor-fold>
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <text> -> <list(prestazioni)> -> <entry>">
            
            
            
            // </editor-fold>
            
            
            prestazioniTextContent.add(Utilities.asSerializable(listProblemi, ElementNames.List, prestazioniText));
            // </editor-fold>
            
            
            prestazioniText.setContent(prestazioniTextContent);

            sectionPrestazioni.setText(prestazioniText);
            // </editor-fold>
            
            List<POCDMT000040Entry> entriesPrestazioni = new ArrayList();
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <prestazioni> -> <structuredBody> -> <compnent(esenzioni)> -> <section> -> <entry>">
            for (PrestazioniRicetta prestazione : getSortedPrestazioni(ricetta)){
                POCDMT000040Entry entryPrestazione = createEntryPrestazione(prestazione);
                entriesPrestazioni.add(entryPrestazione);
            }

            sectionPrestazioni.setEntry(entriesPrestazioni);
            // </editor-fold>

            
            componentPrestazioni.setSection(sectionPrestazioni);
            // </editor-fold>
            
            sbComponents.add(componentPrestazioni);
            // </editor-fold>
        }
        
        // TODO: riprendere da qui. pag.216 -> comonent per indicarele priorità
        if (ricetta.getPriorita() != null){
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(priorita)>">
            POCDMT000040Component3 componentPriorita = new POCDMT000040Component3();
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(priorita)> -> <section>">
            POCDMT000040Section sectionPriorita = new POCDMT000040Section();
            sectionPriorita.setID(StructuredBody.ComponentPriorita.Section.ID);
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(priorita)> -> <section> -> <entry>">
            POCDMT000040Entry entryPriorita = new POCDMT000040Entry();
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(priorita)> -> <section> -> <entry> -> <procedure>">
            
            POCDMT000040Procedure procedurePriorita = new POCDMT000040Procedure();
            /* NB-GIOVANNI18: Pag. 219 dice che moodCode e classCode sono required 
            ma non specifica come popolarli! Inoltre classCode sembra non esistere proprio
            sulla classe della procedure.
            */
            //procedurePriorita.setMoodCode(XDocumentProcedureMood.APT); // ?? cosa mettere qui ??
            
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(priorita)> -> <section> -> <entry> -> <procedure> -> <code>">
            CE prioritaCode = new CE();
            prioritaCode.setCodeSystem(StructuredBody.ComponentPriorita.Section.Code.codeSystem);
            prioritaCode.setCodeSystemName(StructuredBody.ComponentPriorita.Section.Code.codeSystemName);
            prioritaCode.setCodeSystemVersion(StructuredBody.ComponentPriorita.Section.Code.codeSystemVersion);
            prioritaCode.setCode(ricetta.getPriorita());
            
            procedurePriorita.setPriorityCode(prioritaCode);
            // </editor-fold>
            
            entryPriorita.setProcedure(procedurePriorita);

            // </editor-fold>
            
            sectionPriorita.setEntry(Collections.singletonList(entryPriorita));

            // </editor-fold>
            
            componentPriorita.setSection(sectionPriorita);
            // </editor-fold>
            
            sbComponents.add(componentPriorita);
            // </editor-fold>
        }
        
        structuredBody.setComponent(sbComponents);
        
        component.setStructuredBody(structuredBody);
        // </editor-fold>
        
        clinicalDocument.setComponent(component);
        // </editor-fold>
        
        return clinicalDocument;
    }
    
    private static POCDMT000040Entry createEntryEsenzione(String codiceEsenzione, String idEsenzione){
        POCDMT000040Entry entryEsenzione = new POCDMT000040Entry();

        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)> -> <section> -> <entry> -> <act>">
        POCDMT000040Act actEsenzione = new POCDMT000040Act();
        actEsenzione.setMoodCode(StructuredBody.ComponentEsenzioni.Section.Entry.Act.moodCode);
        actEsenzione.setClassCode(StructuredBody.ComponentEsenzioni.Section.Entry.Act.classCode);
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)> -> <section> -> <entry>-> <act> -> <code>">
        CD codeEsenzione = new CD();
        codeEsenzione.setCode(codiceEsenzione);
        codeEsenzione.setCodeSystem(StructuredBody.ComponentEsenzioni.Section.Entry.Act.Code.codeSystem);
        codeEsenzione.setCodeSystemName(StructuredBody.ComponentEsenzioni.Section.Entry.Act.Code.codeSystemName);
        codeEsenzione.setCodeSystemVersion(StructuredBody.ComponentEsenzioni.Section.Entry.Act.Code.codeSystemVersion);

        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(esenzioni)> -> <section> -> <entry>-> <act> -> <code> -> <text>">
        ED codeEsenzioneText = new ED();
        TEL codeEsenzioneTextReference = new TEL();
        codeEsenzioneTextReference.setValue(idEsenzione);
        codeEsenzioneText.setReference(codeEsenzioneTextReference);
        codeEsenzione.setOriginalText(codeEsenzioneText);
        // </editor-fold>

        actEsenzione.setCode(codeEsenzione);
        // </editor-fold>

        entryEsenzione.setAct(actEsenzione);
        
        return entryEsenzione;
    }
    
    private static POCDMT000040Entry createEntryPrestazione(PrestazioniRicetta prestazione){
        POCDMT000040Entry entryPrestazione = new POCDMT000040Entry();
        entryPrestazione.setTypeCode(StructuredBody.ComponentPrestazioni.Section.Entry.typeCode);
        
        POCDMT000040Observation observation = new POCDMT000040Observation();
        observation.setClassCode(Collections.singletonList(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.classCode));
        observation.setMoodCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.moodCode);
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <entry> -> <observation> -> <code(regionale)>">
        if (prestazione.getCodReg() != null){
            CD codeRegionale = new CD();
            codeRegionale.setCode(prestazione.getCodReg());
            codeRegionale.setCodeSystem(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeRegionale.codeSystem);
            codeRegionale.setCodeSystemName(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeRegionale.codeSystemName);
            codeRegionale.setCodeSystemVersion(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeRegionale.codeSystemVersion);
            
            ED originalText = new ED();
            TEL reference = new TEL();
            reference.setValue(getPrestazioneContentId(prestazione));
            originalText.setReference(reference);
            codeRegionale.setOriginalText(originalText);
            
            CR qualifier = new CR();
            CD qualifierValue = new CD();
            qualifierValue.setCode(prestazione.getCodReg());
            qualifierValue.setCodeSystem(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeRegionale.Qualifier.Value.codeSystem);
            qualifierValue.setCodeSystemName(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeRegionale.Qualifier.Value.codeSystemName);
            qualifier.setValue(qualifierValue);
            codeRegionale.setQualifier(Collections.singletonList(qualifier));
            
            observation.setCode(codeRegionale);
        }
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <entry> -> <observation> -> <code(nazionale)>">
        if (prestazione.getCodNaz() != null){
            if (prestazione.getCodReg() == null){
                CD codeNazionale = new CD();
                codeNazionale.setCode(prestazione.getCodReg());
                codeNazionale.setCodeSystem(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeNazionale.codeSystem);
                codeNazionale.setCodeSystemName(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeNazionale.codeSystemName);
                codeNazionale.setCodeSystemVersion(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.CodeNazionale.codeSystemVersion);
                
                ED originalText = new ED();
                TEL reference = new TEL();
                reference.setValue(getPrestazioneContentId(prestazione));
                originalText.setReference(reference);
                codeNazionale.setOriginalText(originalText);
                
                observation.setCode(codeNazionale);
            }
            /* NB-GIOVANNI12: Nel PDF pag.202 dice che se si vuole specificare sia codice regionale
            che nazionale bisogna mettere qui un oggetto <translation>... che però non è previsto
            nelle classi e manco negli standard (nella definizione del observation a pag. 195 non lo
            riporta infatti)... non saprei come fare!
            */
        }
        // </editor-fold>
        
        List<POCDMT000040EntryRelationship> entryReplationships = new ArrayList();
        // Sezione per indicare le quantità
        // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <entry> -> <observation> -> <entryRelationship(quantita)>">
        POCDMT000040EntryRelationship entryReplationshipsQta = new POCDMT000040EntryRelationship();
        entryReplationshipsQta.setTypeCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipQta.typeCode);
        
        // Supply
        POCDMT000040Supply entryReplationshipsQtaSupply = new POCDMT000040Supply();
        entryReplationshipsQtaSupply.setMoodCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipQta.Supply.moodCode);
        entryReplationshipsQtaSupply.setClassCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipQta.Supply.classCode);
        
        
        // Supply -> IndependentInd
        BL entryReplationshipsQtaSupplyInd = new BL();
        entryReplationshipsQtaSupplyInd.setValue(Boolean.FALSE);
        entryReplationshipsQtaSupply.setIndependentInd(entryReplationshipsQtaSupplyInd);
        
        // Supply -> Quantity
        PQ entryReplationshipsQtaSupplyQta = new PQ();
        entryReplationshipsQtaSupplyQta.setUnit(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipQta.Supply.Quantity.unit);
        entryReplationshipsQtaSupplyQta.setValue(prestazione.getQtaprescritta().toString());
        entryReplationshipsQtaSupply.setQuantity(entryReplationshipsQtaSupplyQta);
        
        entryReplationshipsQta.setSupply(entryReplationshipsQtaSupply);
        entryReplationships.add(entryReplationshipsQta);
        // </editor-fold>
        
        // NB-GIOVANNI13: qui potrebbe andare un'altra <entryRelationship> (opzionale) per indicare il problema diagnostico.
        // Dato che attualmente è un'informazione che non mi sembra ci sia, la salto
        
        // Sezione per indicare le quantità
        if (prestazione.getTipoAccesso() != null){
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <entry> -> <observation> -> <entryRelationship(tipo accesso)>">
            POCDMT000040EntryRelationship entryReplationshipsTipoAccesso = new POCDMT000040EntryRelationship();
            entryReplationshipsTipoAccesso.setTypeCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipTipoAccesso.typeCode);

            // oggetto encounter
            POCDMT000040Encounter entryTipoAccessoEnounter = new POCDMT000040Encounter();
            
            // NB-GIOVANNI14: Qui va messo un codice diverso a seconda che sia primo accesso o successivo... 
            // come lo capisco??
            if (prestazione.getTipoAccesso().toLowerCase().equals("primo accesso"))
                entryTipoAccessoEnounter.setMoodCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipTipoAccesso.Encounter.moodCodePrimoAccesso);
            else
                entryTipoAccessoEnounter.setMoodCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipTipoAccesso.Encounter.moodCodeAccessoSuccessivo);
            entryTipoAccessoEnounter.setClassCode(Collections.singletonList(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipTipoAccesso.Encounter.classCode));
            
            // oggetto encounter -> code
            CD entryTipoAccessoEnounterCode = new CD();
            entryTipoAccessoEnounterCode.setCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipTipoAccesso.Encounter.Code.code);
            entryTipoAccessoEnounterCode.setCodeSystem(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipTipoAccesso.Encounter.Code.codeSystem);
            entryTipoAccessoEnounterCode.setCodeSystemName(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipTipoAccesso.Encounter.Code.codeSystemName);
            entryTipoAccessoEnounter.setCode(entryTipoAccessoEnounterCode);
            
            entryReplationshipsTipoAccesso.setEncounter(entryTipoAccessoEnounter);
            
            entryReplationships.add(entryReplationshipsTipoAccesso);
            // </editor-fold>
        }
        
        if (prestazione.getNota() != null){
            // Sezione per le note
            // <editor-fold defaultstate="collapsed" desc="ELEMENTO <component> -> <structuredBody> -> <compnent(prestazioni)> -> <section> -> <entry> -> <observation> -> <entryRelationship(note)>">
            POCDMT000040EntryRelationship entryReplationshipsNote = new POCDMT000040EntryRelationship();
            entryReplationshipsNote.setTypeCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipNote.typeCode);
            entryReplationshipsNote.setInversionInd(Boolean.TRUE);
            
            // Elemento act
            POCDMT000040Act entryReplationshipsNoteAct = new POCDMT000040Act();
            entryReplationshipsNoteAct.setMoodCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipNote.ACT.moodCode);
            entryReplationshipsNoteAct.setClassCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipNote.ACT.classCode);
            
            // Elemento act -> code
            CE entryReplationshipsNoteActCode = new CE();
            entryReplationshipsNoteActCode.setCode(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipNote.ACT.Code.code);
            entryReplationshipsNoteActCode.setCodeSystem(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipNote.ACT.Code.codeSystem);
            entryReplationshipsNoteActCode.setCodeSystemName(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipNote.ACT.Code.codeSystemName);
            entryReplationshipsNoteActCode.setCodeSystemVersion(StructuredBody.ComponentPrestazioni.Section.Entry.Observation.EntryRelationshipNote.ACT.Code.codeSystemVersion);
            entryReplationshipsNoteAct.setCode(entryReplationshipsNoteActCode);
            
            // Elemento act -> text
            ED entryReplationshipsNoteActText = new ED();
            entryReplationshipsNoteActText.setContent(Collections.singletonList(prestazione.getNota()));
            entryReplationshipsNoteAct.setText(entryReplationshipsNoteActText);
            
            entryReplationshipsNote.setAct(entryReplationshipsNoteAct);
            
            entryReplationships.add(entryReplationshipsNote);
            // </editor-fold>
        }
        
        observation.setEntryRelationship(entryReplationships);
        entryPrestazione.setObservation(observation);
        
        return entryPrestazione;
    }
    
    private static String getPrestazioneContentId(PrestazioniRicetta prestazione){
        return "pst" + prestazione.getProgressivo().toString();
    }
    private static String getProblemaContentId(PrestazioniRicetta prestazione){
        return "pbl" + prestazione.getProgressivo().toString();
    }
    
    private static List<PrestazioniRicetta> getSortedPrestazioni(Ricetta ricetta){
        return ricetta.getPrestazioniRicettaList().stream().sorted((o1, o2) -> {
            BigInteger o1Prog = o1.getProgressivo();
            BigInteger o2Prog = o2.getProgressivo();
            return  o1Prog.compareTo(o2Prog);
        }).collect(Collectors.toList());
    }
    
    public static String createXMLToString(POCDMT000040ClinicalDocument clinicalDocument, String filePath) throws JAXBException, IOException{
        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] {clinicalDocument.getClass()}, null);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(clinicalDocument, stringWriter);
        
        String xmlString = stringWriter.toString();
        
        if (filePath != null){
//            File file = new File(filePath);
//            if (!file.exists())
//                file.createNewFile();
            Files.write(Paths.get(filePath), xmlString.getBytes());
        }
        
        return xmlString;
    }
    
    public static Marshaller Test(POCDMT000040ClinicalDocument clinicalDocument) throws JAXBException{
        JAXBContext jaxbContext = null;
        Marshaller jaxbMarshaller = null;


        //jaxbContext = JAXBContext.newInstance(Company.class);

        // EclipseLink MOXy needs jaxb.properties at the same package with Company.class or Staff.class
        // Alternative, I prefer define this via eclipse JAXBContextFactory manually.
        jaxbContext = JAXBContext.newInstance(new Class[] {clinicalDocument.getClass()}, null);

                //JAXBContextFactory.DEFAULT
                //.createJAXBContext(new Class[] {POCDMT000040ClinicalDocument.class}, null);
                //.createContext(new Class[] {POCDMT000040ClinicalDocument.class}, null);

        jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //jaxbMarshaller.marshal(createCompanyObject(), new File("C:\\test\\company.xml"));

        //jaxbMarshaller.marshal(clinicalDocument, System.out);


        // XML Unmarshalling
        /*File file = new File("C:\\test\\company.xml");
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Company o = (Company) jaxbUnmarshaller.unmarshal(file);
        System.out.println(o);*/

        return jaxbMarshaller;
    }
}
