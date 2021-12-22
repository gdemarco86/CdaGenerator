/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrasist.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import integrasist.entities.Persona;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ced
 */
public class Ricetta implements Serializable {

    /**
     * @return the medico
     */
    public Persona getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Persona medico) {
        this.medico = medico;
    }

    private BigDecimal ticket;
    private BigDecimal quotaFissa;
    private String codAutenticazione;
    private String diagnosi;
    private String nroTicketDifferita;

    private static final long serialVersionUID = 1L;
    private String idPaziente;
    private String idRicetta;
    private String tipoIdPaziente;
    private Date dataNascita;
    private String codAsl;
    private String codEsenRic;
    private String priorita;
    private String descPriorita;
    private String idMedico;
    private String codMed;
    private String regioneMed;
    private Date dataRicetta;
    private Long idCup;
    private Long idProgRich;
    private Long idAccesso;
    private String idCodErrore;
    private String descrErrore;
    private Date dataInsert;
    private Date dataUpdate;
    private Short inElaborazione;
    private String nota;
    private String quesito;
    private BigInteger progressivo;
    private BigInteger idStatoRd;
    private String idQuesitoIcd9;
    private String statoRicettaSist;
    private BigInteger oscurato;
    private BigInteger salvainfascicolo;
    private BigInteger maggiortutela;
    private String codEsenNazionali;
    private String garanziaTempiMax;
    private String codEsenRegionale;
    private String descrizioneEsenRic;
    private BigInteger progressivoPrenotazione;
    private String id;
//    private Stati idstato;
    private List<PrestazioniRicetta> prestazioniRicettaList;
    private Persona paziente;
    private Persona medico;

    public Ricetta() {
    }

    public Ricetta(String id) {
        this.id = id;
    }

    public Ricetta(String id, String idRicetta, Date dataInsert, BigInteger oscurato, BigInteger salvainfascicolo, BigInteger maggiortutela) {
        this.id = id;
        this.idRicetta = idRicetta;
        this.dataInsert = dataInsert;
        this.oscurato = oscurato;
        this.salvainfascicolo = salvainfascicolo;
        this.maggiortutela = maggiortutela;
    }

    public String getIdPaziente() {
        return idPaziente;
    }

    public void setIdPaziente(String idPaziente) {
        this.idPaziente = idPaziente;
    }
    
    public Persona getPaziente() {
        return paziente;
    }

    public void setPaziente(Persona paziente) {
        this.paziente = paziente;
    }

    public String getIdRicetta() {
        return idRicetta;
    }

    public void setIdRicetta(String idRicetta) {
        this.idRicetta = idRicetta;
    }

    public String getTipoIdPaziente() {
        return tipoIdPaziente;
    }

    public void setTipoIdPaziente(String tipoIdPaziente) {
        this.tipoIdPaziente = tipoIdPaziente;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getCodAsl() {
        return codAsl;
    }

    public void setCodAsl(String codAsl) {
        this.codAsl = codAsl;
    }

    public String getCodEsenRic() {
        return codEsenRic;
    }

    public void setCodEsenRic(String codEsenRic) {
        this.codEsenRic = codEsenRic;
    }

    public String getPriorita() {
        return priorita;
    }

    public void setPriorita(String priorita) {
        this.priorita = priorita;
    }

    public String getDescPriorita() {
        return descPriorita;
    }

    public void setDescPriorita(String descPriorita) {
        this.descPriorita = descPriorita;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getCodMed() {
        return codMed;
    }

    public void setCodMed(String codMed) {
        this.codMed = codMed;
    }

    public String getRegioneMed() {
        return regioneMed;
    }

    public void setRegioneMed(String regioneMed) {
        this.regioneMed = regioneMed;
    }

    public Date getDataRicetta() {
        return dataRicetta;
    }

    public void setDataRicetta(Date dataRicetta) {
        this.dataRicetta = dataRicetta;
    }

    public Long getIdCup() {
        return idCup;
    }

    public void setIdCup(Long idCup) {
        this.idCup = idCup;
    }

    public Long getIdProgRich() {
        return idProgRich;
    }

    public void setIdProgRich(Long idProgRich) {
        this.idProgRich = idProgRich;
    }

    public Long getIdAccesso() {
        return idAccesso;
    }

    public void setIdAccesso(Long idAccesso) {
        this.idAccesso = idAccesso;
    }

    public String getIdCodErrore() {
        return idCodErrore;
    }

    public void setIdCodErrore(String idCodErrore) {
        this.idCodErrore = idCodErrore;
    }

    public String getDescrErrore() {
        return descrErrore;
    }

    public void setDescrErrore(String descrErrore) {
        this.descrErrore = descrErrore;
    }

    public Date getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(Date dataInsert) {
        this.dataInsert = dataInsert;
    }

    public Date getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(Date dataUpdate) {
        this.dataUpdate = dataUpdate;
    }

    public Short getInElaborazione() {
        return inElaborazione;
    }

    public void setInElaborazione(Short inElaborazione) {
        this.inElaborazione = inElaborazione;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getQuesito() {
        return quesito;
    }

    public void setQuesito(String quesito) {
        this.quesito = quesito;
    }

    public BigInteger getProgressivo() {
        return progressivo;
    }

    public void setProgressivo(BigInteger progressivo) {
        this.progressivo = progressivo;
    }

    public BigInteger getIdStatoRd() {
        return idStatoRd;
    }

    public void setIdStatoRd(BigInteger idStatoRd) {
        this.idStatoRd = idStatoRd;
    }

    public String getIdQuesitoIcd9() {
        return idQuesitoIcd9;
    }

    public void setIdQuesitoIcd9(String idQuesitoIcd9) {
        this.idQuesitoIcd9 = idQuesitoIcd9;
    }

    public String getStatoRicettaSist() {
        return statoRicettaSist;
    }

    public void setStatoRicettaSist(String statoRicettaSist) {
        this.statoRicettaSist = statoRicettaSist;
    }

    public BigInteger getOscurato() {
        return oscurato;
    }

    public void setOscurato(BigInteger oscurato) {
        this.oscurato = oscurato;
    }

    public BigInteger getSalvainfascicolo() {
        return salvainfascicolo;
    }

    public void setSalvainfascicolo(BigInteger salvainfascicolo) {
        this.salvainfascicolo = salvainfascicolo;
    }

    public BigInteger getMaggiortutela() {
        return maggiortutela;
    }

    public void setMaggiortutela(BigInteger maggiortutela) {
        this.maggiortutela = maggiortutela;
    }

    public BigDecimal getQuotaFissa() {
        return quotaFissa;
    }

    public void setQuotaFissa(BigDecimal quotaFissa) {
        this.quotaFissa = quotaFissa;
    }

    public String getCodEsenNazionali() {
        return codEsenNazionali;
    }

    public void setCodEsenNazionali(String codEsenNazionali) {
        this.codEsenNazionali = codEsenNazionali;
    }

    public String getGaranziaTempiMax() {
        return garanziaTempiMax;
    }

    public void setGaranziaTempiMax(String garanziaTempiMax) {
        this.garanziaTempiMax = garanziaTempiMax;
    }

    public String getCodEsenRegionale() {
        return codEsenRegionale;
    }

    public void setCodEsenRegionale(String codEsenRegionale) {
        this.codEsenRegionale = codEsenRegionale;
    }

    public String getDescrizioneEsenRic() {
        return descrizioneEsenRic;
    }

    public void setDescrizioneEsenRic(String descrizioneEsenRic) {
        this.descrizioneEsenRic = descrizioneEsenRic;
    }

    public BigInteger getProgressivoPrenotazione() {
        return progressivoPrenotazione;
    }

    public void setProgressivoPrenotazione(BigInteger progressivoPrenotazione) {
        this.progressivoPrenotazione = progressivoPrenotazione;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public Stati getIdstato() {
//        return idstato;
//    }
//
//    public void setIdstato(Stati idstato) {
//        this.idstato = idstato;
//    }

    @XmlTransient
    public List<PrestazioniRicetta> getPrestazioniRicettaList() {
        return prestazioniRicettaList;
    }

    public void setPrestazioniRicettaList(List<PrestazioniRicetta> prestazioniRicettaList) {
        this.prestazioniRicettaList = prestazioniRicettaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ricetta)) {
            return false;
        }
        Ricetta other = (Ricetta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integrasist.Entities.Ricetta[ id=" + id + " ]";
    }

    public String getNroTicketDifferita() {
        return nroTicketDifferita;
    }

    public void setNroTicketDifferita(String nroTicketDifferita) {
        this.nroTicketDifferita = nroTicketDifferita;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    public BigDecimal getTicket() {
        return ticket;
    }

    public void setTicket(BigDecimal ticket) {
        this.ticket = ticket;
    }
    
    public String getCodAutenticazione() {
        return codAutenticazione;
    }

    public void setCodAutenticazione(String codAutenticazione) {
        this.codAutenticazione = codAutenticazione;
    }

}
