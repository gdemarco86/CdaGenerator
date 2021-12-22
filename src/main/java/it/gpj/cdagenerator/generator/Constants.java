/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.gpj.cdagenerator.generator;

import integrasist.middleware.xml.cda.ActClassSupply;
import integrasist.middleware.xml.cda.XActClassDocumentEntryAct;
import integrasist.middleware.xml.cda.XActMoodDocumentObservation;
import integrasist.middleware.xml.cda.XActRelationshipEntry;
import integrasist.middleware.xml.cda.XActRelationshipEntryRelationship;
import integrasist.middleware.xml.cda.XDocumentActMood;
import integrasist.middleware.xml.cda.XDocumentEncounterMood;
import integrasist.middleware.xml.cda.XDocumentSubstanceMood;

/**
 *
 * @author Giovanni
 */
public class Constants {
    
    public static String CD_schemaLocation = "urn:hl7-org:v3";
    
    public static class TypeId{
        public static String root = "2.16.840.1.113883.1.3";
        public static String extension = "POCD_MT000040";
    }
    
    public static class TemplateId{
        public static String root = "2.16.840.1.113883.2.9.10.2.1";
        public static class Extensions {
            public static String PrescrizioneFarmaceutica = "ITPRF_PRESC_FARMA-001";
            public static String PrescrizioneSpecialistica = "ITPRF _PRESC_SPEC-001";
            public static String PrescrizioneRicovero = "ITPRF_PRESC_RICO-001";
        }
    }
    
    public static class Id{
        //public static String root = "2.16.840.1.113883.2.9.10.2.1";
        public static class AssigningAuthorityName {
            public static String RegionePuglia = "Regione Puglia";
            public static String MEF = "MEF";
        }
    }
    
    public static class Code{
        public static String code = "57833-6";
        public static String codeSystem = "2.16.840.1.113883.6.1";
        public static String codeSystemName = "LOINC";
        public static String codeSystemVersion = "2.19";
        public static class DisplayName {
            public static String PrescrizioneFarmaceutica = "PRESCRIZIONE FARMACEUTICA";
            public static String PrescrizioneSpecialistica = "PRESCRIZIONE SPECIALISTICA";
            public static String PrescrizioneRicovero = "PRESCRIZIONE RICOVERO";
            public static String ErogazionePrescrizioneFarmaceutica = "EROGAZIONE PRESCRIZIONE FARMACEUTICA";
            public static String ErogazionePrescrizioneSpecialistica = "EROGAZIONE PRESCRIZIONE SPECIALISTICA";
        }
        
        public static class TranslationTipoDoc {
            public static String code = "3400";
            public static String codeSystem = "2.16.840.1.113883.2.9.6.1.25";
            public static String codeSystemName = "TCDADOC_TYPECODE";
            public static String codeSystemVersion = "1";
            public static String displayName = "Prescrizione";
            
            public static class Value {
                public static class ValueCode {
                    // GIOVANNI-NB1: mia assunzione!
                    public static String PrescrizioneFarmaceutica = "3400-1";
                    public static String PrescrizioneSpecialistica = "3400-2";
                    public static String PrescrizioneRicovero = "3400-3";
                }
                public static String codeSystem = "2.16.840.1.113883.2.9.6.1.25";
                public static String codeSystemName = "ITCDADOC_TYPECODE";
                public static String codeSystemVersion = "1";
                public static class DisplayName {
                    public static String PrescrizioneFarmaceutica = "PRESCRIZIONE FARMACEUTICA";
                    public static String PrescrizioneSpecialistica = "PRESCRIZIONE SPECIALISTICA";
                    public static String PrescrizioneRicovero = "PRESCRIZIONE RICOVERO";
                }
            }
        }
        
        public static class TranslationTipoPrescr {
            public static class TipoPrescCode {
                public static String SSN = "SSN";
                public static String SASN = "SASN";
            }
            public static String codeSystem = ".16.840.1.113883.2.9.6.1.45";
            // Nel PDF pag.11 usa invece "Classe Ricetta", nell'esempio fornito invece c'è questo
            public static String codeSystemName = "TCDADOC_TYPECODE";
            public static class DisplayName {
                public static String SSN = "RICETTA SSN";
                public static String SASN = "RICETTA SASN";
            }

            public static class Value {
                public static class ValueCode {
                    // GIOVANNI-NB1: mia assunzione!
                    public static String IT = "IT";
                    public static String NA = "NA";
                    public static String ND = "ND";
                    public static String NE = "NE";
                    public static String NX = "NX";
                    public static String ST = "ST";
                    public static String UE = "UE";
                    public static String EE = "EE";
                }
                public static String codeSystem = "2.16.840.1.113883.2.9.6.1.47";
                public static String codeSystemName = "Tipo ricetta";
            }
        }
    }
    
    public static class ConfidentialityCode {
        public static class Code {
            public static String Normal = "N";
            public static String VeryRestricted = "V";
        }
        public static String codeSystem = "2.16.840.1.113883.5.25";
        public static String codeSystemName = "Confidentiality";
    }
    
    public static class LanguageCode {
        // NB-GIOVANNI Nel PDF dice ita-ITA, nell'esempio it-IT ???
        public static String code = "it-IT";
    }
    
    public static class SetId {
        public static class IUP {
            public static String root = "2.16.840.1.113883.2.9.4.3.6";
            public static String assigningAuthorityName = "Regione Puglia";
        }
        public static class NRE {
            public static String root = "2.16.840.1.113883.2.9.2.4.3.20";
            public static String assigningAuthorityName = "MEF";
        }
        public static class CodAutenticazione {
            public static String root = "2.16.840.1.113883.2.9.2.4.3.20";
            public static String assigningAuthorityName = "MEF";
        }
    }
    
    public static class RecordTarget {
        public static class PatientRole {
            public static class IdCodFiscale {
                public static String assigningAuthorityName = "MEF";
                public static String root = "2.16.840.1.113883.2.9.4.3.2";
            }
            public static class IdStranieroTEAM {
                /*E' il tipo di <id>, della tessera TEAM, utilizzato all'interno del <patientRole> per identificare il cittadino straniero coperto da forme di assistenza sanitaria operate da enti ed organizzazioni estere. L'elemento <id> di questo tipo è OBBLIGATORIO in caso di prescrizione/erogazione intestata ad un cittadino straniero assistito da enti esteri. Deve indicare oltre*/
                public static String assigningAuthorityName = "SSN-MIN SALUTE-5001";
                public static String root = "2.16.840.1.113883.2.9.4.3.1";
                // Extension [sigla della nazione].[nr tessera]
            }
            public static class IdStraniero {
                /*E' il tipo di <id>, identificativo personale dell'assistito, utilizzato all'interno del <patientRole> per identificare il cittadino straniero coperto da forme di assistenza sanitaria operate da enti ed organizzazioni estere. L'elemento <id> di questo tipo è OBBLIGATORIO in caso di prescrizione/erogazione intestata ad un cittadino straniero assistito da enti esteri. Deve indicare oltre al codice di identificazione personale anche il paese che l'ha rilasciata. Nell'esempio riportato di seguito si mostra un suo tipico utilizzo.*/
                public static String root = "2.16.840.1.113883.2.9.4.3.3";
                // Denominazione completa dell'istituzione competente. GIOVANNI: forse non è costante allora?
                public static String assigningAuthorityName = "SSN-MIN SALUTE-5001";
                // Extension [sigla della nazione].[identificativo personale]
            }
            public static class IdSTP {
                /*Questo tipo di identificativo è utilizzato per l'elemento <id> interno al <patientRole> e serve unicamente per i cittadini stranieri temporaneamente presenti in Italia. Il codice è assegnato dalla ASL/AO. Nel seguito viene mostrato un esempio del suo tipico utilizzo.*/
                public static String root = "2.16.840.1.113883.2.9.2.160.4.1";
                // assigningAuthorityName: [Nome della regione]
                // Extension STP+[CODICE IDENTIFICATIVO]
            }
            public static class IdTesseraSanitaria {
                /*E' il tipo di <id> utilizzato all'interno del <patientRole> per identificare il numero tessera assistenza SASN
                    L'elemento <id> di questo tipo è FACOLTATIVO e può essere associato a quello che riporta il codice fiscale. Nell'esempio riportato di seguito si
                    mostra un suo tipico utilizzo.*/
                public static String root = "2.16.840.1.113883.2.9.4.1.20";
                public static String assigningAuthorityName = "Ministero della Salute";
                // Extension Numero Tessera Sanitaria
            }
        }
    }
    
    public static class Author {
        public static class AssignedAuthor {
            public static class IdCodiceFiscaleMedico {
                public static String assigningAuthorityName = "MEF";
                public static String root = "2.16.840.1.113883.2.9.4.3.2";
            }
            public static class IdCodiceRegionaleMedico {
                public static String assigningAuthorityName = "REGIONE PUGLIA";
                public static String root = "2.16.840.1.113883.2.9.2.160.4.2";
            }
        }
    }
    
    public static class Custodian {
        public static class AssignedCustodian {
            public static class RepresentedCustodianOrganization {
                public static class Id {
                    // DA PDF 2.16.840.1.113883.2.9.2.160.4.2 oppure 2.16.840.1.113883.2.9.2.160.4.11
                    // GIOVANNI: secondo me il primo è se la ricetta è emsesa da ASL
                    // la seconda se da AO (Azienda ospedialiera)
                    public static String rootASL = "2.16.840.1.113883.2.9.2.160.4.2";
                    public static String rootAO = "2.16.840.1.113883.2.9.2.160.4.11";
                }
            }
        }
    }
    
    public static class LegalAuthenticator {
        public static class SignatureCodes {
            public static String S = "S";
            public static String N = "N";
        }
        public static class AssignedEntity {
            public static class IdCodiceFiscaleMedico {
                public static String assigningAuthorityName = "MEF";
                public static String root = "2.16.840.1.113883.2.9.4.3.2";
            }
        }
    }
    
    public static class Participant {
        public static String typeCode="IND";
        public static class AssociatedEntity {
            public static String classCode="GUAR";
            public static class ScopingOrganization {
                public static class IdAslResidenza {
                    public static String root = "2.16.840.1.113883.2.9.4.1.1";
                    public static String assigningAuthorityName = "SSN-MIN SALUTE-500001";
                }
            }
        }
    }
    
    public static class ComponentOf {
        public static class EncompassingEncounter {
            public static class Code {
                public static class Codes {
                    public static String Ambulatoriale = "AMB";
                    public static String Domiciliare = "HH";
                }
                public static String codeSystem = "2.16.840.1.113883.5.4";
            }
        }
    }
    
    public static class StructuredBody {
        public static class ComponentEsenzioni {
            public static class Section {
                public static String ID = "ESENZIONI";
                public static class Code {
                    public static String codeSystem = "2.16.840.1.113883.2.9.10.2.1.1";
                    public static String code = "ESENZIONI-001";
                    public static String codeSystemName = "ITCDA_SECTION_TYPE";
                    public static String codeSystemVersion = "1";
                    public static String displayName = "Esenzioni";
                }
                public static class Text {
                    public static class Content {
                        public static String idEsenzioneNazionale = "esenNaz";
                        public static String idEsenzioneRegionale = "esenReg";
                        public static String idEsenzioneRicetta = "esenRic";
                    }
                }
                
                public static class Entry {
                    public static class Act {
                        public static XDocumentActMood moodCode = XDocumentActMood.EVN;
                        public static XActClassDocumentEntryAct classCode = XActClassDocumentEntryAct.ACT;
                        public static class Code {
                            public static String codeSystem = "2.16.840.1.113883.2.9.2.160.6.22";
                            public static String codeSystemName = "Codifica Esenzioni";
                            public static String codeSystemVersion = "2001";
                        }
                    }
                }
            }
        }
        
        public static class ComponentPrestazioni {
            public static class Section {
                public static String ID = "PRESCRIZIONI";
                public static class Code {
                    public static String codeSystem = "2.16.840.1.113883.6.1";
                    public static String code = "57832-8";
                    public static String codeSystemName = "LOINC";
                    public static String codeSystemVersion = "2.19";
                    public static String displayName = "Prestazioni";
                }
                
                public static class Text {
                    public static class ListPrestazioni {
                        public static String ID = "RQO";
                        public static String caption = "Prestazioni richieste:";
                    }
                    public static class ListProblemi {
                        public static String ID = "DIAG";
                        public static String caption = "Problemi:";
                    }
                }
                
                public static class Entry {
                    public static XActRelationshipEntry typeCode = XActRelationshipEntry.COMP;
                    
                    public static class Observation {
                        public static String classCode = "OBS";
                        public static XActMoodDocumentObservation moodCode = XActMoodDocumentObservation.PRMS;
                        public static class CodeRegionale {
                            public static String codeSystem = "2.16.840.1.113883.2.9.2.160.6.11";
                            public static String codeSystemName = "Catalogo Prestazioni della regione Puglia";
                            public static String codeSystemVersion = "-";
                            public static class Qualifier {
                                public static class Value {
                                    public static String codeSystem = "2.16.840.1.113883.2.9.2.160.6.12";
                                    public static String codeSystemName = "Catalogo Prestazioni della regione Puglia";
                            
                                }
                            }
                        }
                        public static class CodeNazionale {
                            public static String codeSystem = "2.16.840.1.113883.2.9.6.1.11";
                            public static String codeSystemName = "Catalogo Prestazioni Italia";
                            public static String codeSystemVersion = "-";  
                        }
                        public static class EntryRelationshipQta {
                            public static XActRelationshipEntryRelationship typeCode = XActRelationshipEntryRelationship.COMP;
                            public static class Supply {
                                public static XDocumentSubstanceMood moodCode = XDocumentSubstanceMood.RQO; 
                                public static ActClassSupply classCode = ActClassSupply.SPLY;
                                public static class Quantity {
                                    public static String unit = "1";
                                }
                            }
                        }
                        public static class EntryRelationshipTipoAccesso {
                            public static XActRelationshipEntryRelationship typeCode = XActRelationshipEntryRelationship.SAS;
                            public static class Encounter {
                                public static XDocumentEncounterMood moodCodePrimoAccesso = XDocumentEncounterMood.APT; 
                                public static XDocumentEncounterMood moodCodeAccessoSuccessivo = XDocumentEncounterMood.EVN; 
                                public static String classCode = "ENC";
                                public static class Code {
                                    public static String code = "19974";
                                    public static String codeSystem = "2.16.840.1.113883.5.4";
                                    public static String codeSystemName = "ActEncounterCode";
                                }
                            }
                        }
                        public static class EntryRelationshipNote {
                            public static XActRelationshipEntryRelationship typeCode = XActRelationshipEntryRelationship.SUBJ;
                            public static class ACT {
                                public static XDocumentActMood moodCode = XDocumentActMood.EVN; 
                                public static XActClassDocumentEntryAct classCode = XActClassDocumentEntryAct.ACT;
                                public static class Code {
                                    public static String code = "48767-8";
                                    public static String codeSystem = "2.16.840.1.113883.6.1";
                                    public static String codeSystemName = "LOINC";
                                    public static String codeSystemVersion = "2.19";
                                }
                            }
                        }
                    }
                }
            }
        }
        
        public static class ComponentPriorita {
            public static String typeCode = "COMP";
            public static boolean contextConductionInd = true;
            public static class Section {
                public static String ID = "PRIORITA";
                public static class Code {
                    public static class Codes {
                        public static String U = "U";
                        public static String B = "B";
                        public static String D = "D";
                        public static String P = "P";
                    }
                    public static String codeSystem = "2.16.840.1.113883.2.9.99";
                    public static String codeSystemName = "Priorita' della prescrizione";
                    public static String codeSystemVersion = "1";
                }
            }
        }
        
    }
    
    public static class AdministrativeGenderCode{
        public static class Code{
            public static String M = "M";
            public static String F = "F";
        }
        public static String codeSystem = "2.16.840.1.113883.5.1";
    }
    
    public static class ElementNames {
        public static String StreetAddressLine = "streetAddressLine";
        public static String PostalCode = "postalCode";
        public static String Given = "given";
        public static String Family = "family";
        public static String Content = "content";
        public static String List = "list";
    }
    
}
