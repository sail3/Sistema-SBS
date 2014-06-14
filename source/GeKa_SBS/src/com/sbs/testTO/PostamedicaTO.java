/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.testTO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sail3
 */
@Entity
@Table(name = "postamedica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostamedicaTO.findAll", query = "SELECT p FROM PostamedicaTO p"),
    @NamedQuery(name = "PostamedicaTO.findByChrPomecodigo", query = "SELECT p FROM PostamedicaTO p WHERE p.chrPomecodigo = :chrPomecodigo"),
    @NamedQuery(name = "PostamedicaTO.findByVchNombre", query = "SELECT p FROM PostamedicaTO p WHERE p.vchNombre = :vchNombre")})
public class PostamedicaTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_pomecodigo")
    private String chrPomecodigo;
    @Basic(optional = false)
    @Column(name = "vch_nombre")
    private String vchNombre;
    @JoinColumn(name = "chr_distcodigo", referencedColumnName = "chr_distcodigo")
    @ManyToOne(optional = false)
    private DistritoTO chrDistcodigo;

    public PostamedicaTO() {
    }

    public PostamedicaTO(String chrPomecodigo) {
        this.chrPomecodigo = chrPomecodigo;
    }

    public PostamedicaTO(String chrPomecodigo, String vchNombre) {
        this.chrPomecodigo = chrPomecodigo;
        this.vchNombre = vchNombre;
    }

    public String getChrPomecodigo() {
        return chrPomecodigo;
    }

    public void setChrPomecodigo(String chrPomecodigo) {
        this.chrPomecodigo = chrPomecodigo;
    }

    public String getVchNombre() {
        return vchNombre;
    }

    public void setVchNombre(String vchNombre) {
        this.vchNombre = vchNombre;
    }

    public DistritoTO getChrDistcodigo() {
        return chrDistcodigo;
    }

    public void setChrDistcodigo(DistritoTO chrDistcodigo) {
        this.chrDistcodigo = chrDistcodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chrPomecodigo != null ? chrPomecodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostamedicaTO)) {
            return false;
        }
        PostamedicaTO other = (PostamedicaTO) object;
        if ((this.chrPomecodigo == null && other.chrPomecodigo != null) || (this.chrPomecodigo != null && !this.chrPomecodigo.equals(other.chrPomecodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.PostamedicaTO[ chrPomecodigo=" + chrPomecodigo + " ]";
    }
    
}
