/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrasist.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ced
 */
public class PrestazioniRicetta implements Serializable {

//    @Column(name = "N_RIGA")
//    private BigInteger nRiga;
//    @Column(name = "DESCR_TESTO_LIBERO_NOTE")
//    private String descrTestoLiberoNote;

    private static final long serialVersionUID = 1L;
    protected PrestazioniRicettaPK prestazioniRicettaPK;
    private String codReg;
    private String codNaz;
    private String codRegAlfa;
    private BigInteger qta;
    private BigInteger progressivo;
    private BigDecimal prezzoUnit;
    private String daErogare;
    private String nota;
    private String tipoAccesso;
    private String branca;
    private Short prestazioneCiclica;
    private Short sedute;
    private Short qtaMax;
    private String nomeprest;
    private Short qtaprescritta;
    private String prenotata;
    private Ricetta ricettaid;
//    private Stati idstato;

    public PrestazioniRicetta() {
    }

    public PrestazioniRicetta(PrestazioniRicettaPK prestazioniRicettaPK) {
        this.prestazioniRicettaPK = prestazioniRicettaPK;
    }

    public PrestazioniRicetta(PrestazioniRicettaPK prestazioniRicettaPK, String codReg, String codNaz, BigInteger qta, BigInteger progressivo, String daErogare) {
        this.prestazioniRicettaPK = prestazioniRicettaPK;
        this.codReg = codReg;
        this.codNaz = codNaz;
        this.qta = qta;
        this.progressivo = progressivo;
        this.daErogare = daErogare;
    }

    public PrestazioniRicetta(String idRicetta, BigInteger nRiga, String idPaziente) {
        this.prestazioniRicettaPK = new PrestazioniRicettaPK(idRicetta, nRiga, idPaziente);
    }

    public PrestazioniRicettaPK getPrestazioniRicettaPK() {
        return prestazioniRicettaPK;
    }

    public void setPrestazioniRicettaPK(PrestazioniRicettaPK prestazioniRicettaPK) {
        this.prestazioniRicettaPK = prestazioniRicettaPK;
    }

    public String getCodReg() {
        return codReg;
    }

    public void setCodReg(String codReg) {
        this.codReg = codReg;
    }

    public String getCodNaz() {
        return codNaz;
    }

    public void setCodNaz(String codNaz) {
        this.codNaz = codNaz;
    }

    public String getCodRegAlfa() {
        return codRegAlfa;
    }

    public void setCodRegAlfa(String codRegAlfa) {
        this.codRegAlfa = codRegAlfa;
    }

    public BigInteger getQta() {
        return qta;
    }

    public void setQta(BigInteger qta) {
        this.qta = qta;
    }

    public BigInteger getProgressivo() {
        return progressivo;
    }

    public void setProgressivo(BigInteger progressivo) {
        this.progressivo = progressivo;
    }

    public BigDecimal getPrezzoUnit() {
        return prezzoUnit;
    }

    public void setPrezzoUnit(BigDecimal prezzoUnit) {
        this.prezzoUnit = prezzoUnit;
    }

    public String getDaErogare() {
        return daErogare;
    }

    public void setDaErogare(String daErogare) {
        this.daErogare = daErogare;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getTipoAccesso() {
        return tipoAccesso;
    }

    public void setTipoAccesso(String tipoAccesso) {
        this.tipoAccesso = tipoAccesso;
    }

    public String getBranca() {
        return branca;
    }

    public void setBranca(String branca) {
        this.branca = branca;
    }

    public Short getPrestazioneCiclica() {
        return prestazioneCiclica;
    }

    public void setPrestazioneCiclica(Short prestazioneCiclica) {
        this.prestazioneCiclica = prestazioneCiclica;
    }

    public Short getSedute() {
        return sedute;
    }

    public void setSedute(Short sedute) {
        this.sedute = sedute;
    }

    public Short getQtaMax() {
        return qtaMax;
    }

    public void setQtaMax(Short qtaMax) {
        this.qtaMax = qtaMax;
    }

    public String getNomeprest() {
        return nomeprest;
    }

    public void setNomeprest(String nomeprest) {
        this.nomeprest = nomeprest;
    }

    public Short getQtaprescritta() {
        return qtaprescritta;
    }

    public void setQtaprescritta(Short qtaprescritta) {
        this.qtaprescritta = qtaprescritta;
    }

    public String getPrenotata() {
        return prenotata;
    }

    public void setPrenotata(String prenotata) {
        this.prenotata = prenotata;
    }

    public Ricetta getRicettaid() {
        return ricettaid;
    }

    public void setRicettaid(Ricetta ricettaid) {
        this.ricettaid = ricettaid;
    }

//    public Stati getIdstato() {
//        return idstato;
//    }
//
//    public void setIdstato(Stati idstato) {
//        this.idstato = idstato;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prestazioniRicettaPK != null ? prestazioniRicettaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestazioniRicetta)) {
            return false;
        }
        PrestazioniRicetta other = (PrestazioniRicetta) object;
        if ((this.prestazioniRicettaPK == null && other.prestazioniRicettaPK != null) || (this.prestazioniRicettaPK != null && !this.prestazioniRicettaPK.equals(other.prestazioniRicettaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integrasist.Entities.PrestazioniRicetta[ prestazioniRicettaPK=" + prestazioniRicettaPK + " ]";
    }

//    public BigInteger getNRiga() {
//        return nRiga;
//    }
//
//    public void setNRiga(BigInteger nRiga) {
//        this.nRiga = nRiga;
//    }

   
    
}
