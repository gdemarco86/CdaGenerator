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
public class Persona implements Serializable {

    public enum Sesso { M, F}
    
    private static final long serialVersionUID = 1L;
    private String idPersona;
    private String tipoIdPaziente;
    private Date dataNascita;
    private String CodiceFiscale;
    private String Nome;
    private String Cognome;
    private String CittaResidenza;
    private String IndirizzoResidenza;
    private String ProvinciaResidenza;
    private String CAPResidenza;
    
    private String CittaNascita;
    private String IndirizzoNascita;
    private String ProvinciaNascita;
    private String CAPNascita;
    
    private Sesso Sesso;
    private String id;
    private String NumeroTesseraSanitaria;

    public Persona() {
    }

    public Persona(String id) {
        this.id = id;
    }

    

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ricetta)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.getId() == null && other.id != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integrasist.Entities.Paziente[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the idPaziente
     */
    public String getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPaziente to set
     */
    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the tipoIdPaziente
     */
    public String getTipoIdPaziente() {
        return tipoIdPaziente;
    }

    /**
     * @param tipoIdPaziente the tipoIdPaziente to set
     */
    public void setTipoIdPaziente(String tipoIdPaziente) {
        this.tipoIdPaziente = tipoIdPaziente;
    }

    /**
     * @return the dataNascita
     */
    public Date getDataNascita() {
        return dataNascita;
    }

    /**
     * @param dataNascita the dataNascita to set
     */
    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    /**
     * @return the CodiceFiscale
     */
    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    /**
     * @param CodiceFiscale the CodiceFiscale to set
     */
    public void setCodiceFiscale(String CodiceFiscale) {
        this.CodiceFiscale = CodiceFiscale;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Cognome
     */
    public String getCognome() {
        return Cognome;
    }

    /**
     * @param Cognome the Cognome to set
     */
    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    /**
     * @return the CittaResidenza
     */
    public String getCittaResidenza() {
        return CittaResidenza;
    }

    /**
     * @param CittaResidenza the CittaResidenza to set
     */
    public void setCittaResidenza(String CittaResidenza) {
        this.CittaResidenza = CittaResidenza;
    }

    /**
     * @return the IndirizzoResidenza
     */
    public String getIndirizzoResidenza() {
        return IndirizzoResidenza;
    }

    /**
     * @param IndirizzoResidenza the IndirizzoResidenza to set
     */
    public void setIndirizzoResidenza(String IndirizzoResidenza) {
        this.IndirizzoResidenza = IndirizzoResidenza;
    }

    /**
     * @return the Sesso
     */
    public Sesso getSesso() {
        return Sesso;
    }

    /**
     * @param Sesso the Sesso to set
     */
    public void setSesso(Sesso Sesso) {
        this.Sesso = Sesso;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the NumeroTesseraSanitaria
     */
    public String getNumeroTesseraSanitaria() {
        return NumeroTesseraSanitaria;
    }

    /**
     * @param NumeroTesseraSanitaria the NumeroTesseraSanitaria to set
     */
    public void setNumeroTesseraSanitaria(String NumeroTesseraSanitaria) {
        this.NumeroTesseraSanitaria = NumeroTesseraSanitaria;
    }

    /**
     * @return the ProvinciaResidenza
     */
    public String getProvinciaResidenza() {
        return ProvinciaResidenza;
    }

    /**
     * @param ProvinciaResidenza the ProvinciaResidenza to set
     */
    public void setProvinciaResidenza(String ProvinciaResidenza) {
        this.ProvinciaResidenza = ProvinciaResidenza;
    }

    /**
     * @return the CAPResidenza
     */
    public String getCAPResidenza() {
        return CAPResidenza;
    }

    /**
     * @param CAPResidenza the CAPResidenza to set
     */
    public void setCAPResidenza(String CAPResidenza) {
        this.CAPResidenza = CAPResidenza;
    }

    /**
     * @return the CittaNascita
     */
    public String getCittaNascita() {
        return CittaNascita;
    }

    /**
     * @param CittaNascita the CittaNascita to set
     */
    public void setCittaNascita(String CittaNascita) {
        this.CittaNascita = CittaNascita;
    }

    /**
     * @return the IndirizzoNascita
     */
    public String getIndirizzoNascita() {
        return IndirizzoNascita;
    }

    /**
     * @param IndirizzoNascita the IndirizzoNascita to set
     */
    public void setIndirizzoNascita(String IndirizzoNascita) {
        this.IndirizzoNascita = IndirizzoNascita;
    }

    /**
     * @return the ProvinciaNascita
     */
    public String getProvinciaNascita() {
        return ProvinciaNascita;
    }

    /**
     * @param ProvinciaNascita the ProvinciaNascita to set
     */
    public void setProvinciaNascita(String ProvinciaNascita) {
        this.ProvinciaNascita = ProvinciaNascita;
    }

    /**
     * @return the CAPNascita
     */
    public String getCAPNascita() {
        return CAPNascita;
    }

    /**
     * @param CAPNascita the CAPNascita to set
     */
    public void setCAPNascita(String CAPNascita) {
        this.CAPNascita = CAPNascita;
    }
}
