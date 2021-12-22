/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrasist.entities;

import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author ced
 */
public class PrestazioniRicettaPK implements Serializable {

    private String idRicetta;
    private BigInteger nRiga;
    private String idPaziente;

    public PrestazioniRicettaPK() {
    }

    public PrestazioniRicettaPK(String idRicetta, BigInteger nRiga, String idPaziente) {
        this.idRicetta = idRicetta;
        this.nRiga = nRiga;
        this.idPaziente = idPaziente;
    }

    public String getIdRicetta() {
        return idRicetta;
    }

    public void setIdRicetta(String idRicetta) {
        this.idRicetta = idRicetta;
    }

    public BigInteger getNRiga() {
        return nRiga;
    }

    public void setNRiga(BigInteger nRiga) {
        this.nRiga = nRiga;
    }

    public String getIdPaziente() {
        return idPaziente;
    }

    public void setIdPaziente(String idPaziente) {
        this.idPaziente = idPaziente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRicetta != null ? idRicetta.hashCode() : 0);
        hash += (nRiga != null ? nRiga.hashCode() : 0);
        hash += (idPaziente != null ? idPaziente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestazioniRicettaPK)) {
            return false;
        }
        PrestazioniRicettaPK other = (PrestazioniRicettaPK) object;
        if ((this.idRicetta == null && other.idRicetta != null) || (this.idRicetta != null && !this.idRicetta.equals(other.idRicetta))) {
            return false;
        }
        if ((this.nRiga == null && other.nRiga != null) || (this.nRiga != null && !this.nRiga.equals(other.nRiga))) {
            return false;
        }
        if ((this.idPaziente == null && other.idPaziente != null) || (this.idPaziente != null && !this.idPaziente.equals(other.idPaziente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integrasist.Entities.PrestazioniRicettaPK[ idRicetta=" + idRicetta + ", nRiga=" + nRiga + ", idPaziente=" + idPaziente + " ]";
    }
    
}
