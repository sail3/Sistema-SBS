/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.testTO;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sail3
 */
@Entity
@Table(name = "padre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PadreTO.findAll", query = "SELECT p FROM PadreTO p"),
    @NamedQuery(name = "PadreTO.findByChrPadrdni", query = "SELECT p FROM PadreTO p WHERE p.chrPadrdni = :chrPadrdni"),
    @NamedQuery(name = "PadreTO.findByVchPadrnombre", query = "SELECT p FROM PadreTO p WHERE p.vchPadrnombre = :vchPadrnombre"),
    @NamedQuery(name = "PadreTO.findByVchPadrmaterno", query = "SELECT p FROM PadreTO p WHERE p.vchPadrmaterno = :vchPadrmaterno"),
    @NamedQuery(name = "PadreTO.findByVchPadrpaterno", query = "SELECT p FROM PadreTO p WHERE p.vchPadrpaterno = :vchPadrpaterno")})
public class PadreTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_padrdni")
    private String chrPadrdni;
    @Basic(optional = false)
    @Column(name = "vch_padrnombre")
    private String vchPadrnombre;
    @Basic(optional = false)
    @Column(name = "vch_padrmaterno")
    private String vchPadrmaterno;
    @Basic(optional = false)
    @Column(name = "vch_padrpaterno")
    private String vchPadrpaterno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chrPadrdni")
    private Collection<PacienteTO> pacienteTOCollection;

    public PadreTO() {
    }

    public PadreTO(String chrPadrdni) {
        this.chrPadrdni = chrPadrdni;
    }

    public PadreTO(String chrPadrdni, String vchPadrnombre, String vchPadrmaterno, String vchPadrpaterno) {
        this.chrPadrdni = chrPadrdni;
        this.vchPadrnombre = vchPadrnombre;
        this.vchPadrmaterno = vchPadrmaterno;
        this.vchPadrpaterno = vchPadrpaterno;
    }

    public String getChrPadrdni() {
        return chrPadrdni;
    }

    public void setChrPadrdni(String chrPadrdni) {
        this.chrPadrdni = chrPadrdni;
    }

    public String getVchPadrnombre() {
        return vchPadrnombre;
    }

    public void setVchPadrnombre(String vchPadrnombre) {
        this.vchPadrnombre = vchPadrnombre;
    }

    public String getVchPadrmaterno() {
        return vchPadrmaterno;
    }

    public void setVchPadrmaterno(String vchPadrmaterno) {
        this.vchPadrmaterno = vchPadrmaterno;
    }

    public String getVchPadrpaterno() {
        return vchPadrpaterno;
    }

    public void setVchPadrpaterno(String vchPadrpaterno) {
        this.vchPadrpaterno = vchPadrpaterno;
    }

    @XmlTransient
    public Collection<PacienteTO> getPacienteTOCollection() {
        return pacienteTOCollection;
    }

    public void setPacienteTOCollection(Collection<PacienteTO> pacienteTOCollection) {
        this.pacienteTOCollection = pacienteTOCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chrPadrdni != null ? chrPadrdni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PadreTO)) {
            return false;
        }
        PadreTO other = (PadreTO) object;
        if ((this.chrPadrdni == null && other.chrPadrdni != null) || (this.chrPadrdni != null && !this.chrPadrdni.equals(other.chrPadrdni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.PadreTO[ chrPadrdni=" + chrPadrdni + " ]";
    }
    
}
