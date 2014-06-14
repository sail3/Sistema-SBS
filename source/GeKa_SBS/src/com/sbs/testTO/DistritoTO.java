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
@Table(name = "distrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistritoTO.findAll", query = "SELECT d FROM DistritoTO d"),
    @NamedQuery(name = "DistritoTO.findByChrDistcodigo", query = "SELECT d FROM DistritoTO d WHERE d.chrDistcodigo = :chrDistcodigo"),
    @NamedQuery(name = "DistritoTO.findByVchDistnombre", query = "SELECT d FROM DistritoTO d WHERE d.vchDistnombre = :vchDistnombre")})
public class DistritoTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_distcodigo")
    private String chrDistcodigo;
    @Basic(optional = false)
    @Column(name = "vch_distnombre")
    private String vchDistnombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chrDistcodigo")
    private Collection<PacienteTO> pacienteTOCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chrDistcodigo")
    private Collection<PostamedicaTO> postamedicaTOCollection;

    public DistritoTO() {
    }

    public DistritoTO(String chrDistcodigo) {
        this.chrDistcodigo = chrDistcodigo;
    }

    public DistritoTO(String chrDistcodigo, String vchDistnombre) {
        this.chrDistcodigo = chrDistcodigo;
        this.vchDistnombre = vchDistnombre;
    }

    public String getChrDistcodigo() {
        return chrDistcodigo;
    }

    public void setChrDistcodigo(String chrDistcodigo) {
        this.chrDistcodigo = chrDistcodigo;
    }

    public String getVchDistnombre() {
        return vchDistnombre;
    }

    public void setVchDistnombre(String vchDistnombre) {
        this.vchDistnombre = vchDistnombre;
    }

    @XmlTransient
    public Collection<PacienteTO> getPacienteTOCollection() {
        return pacienteTOCollection;
    }

    public void setPacienteTOCollection(Collection<PacienteTO> pacienteTOCollection) {
        this.pacienteTOCollection = pacienteTOCollection;
    }

    @XmlTransient
    public Collection<PostamedicaTO> getPostamedicaTOCollection() {
        return postamedicaTOCollection;
    }

    public void setPostamedicaTOCollection(Collection<PostamedicaTO> postamedicaTOCollection) {
        this.postamedicaTOCollection = postamedicaTOCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chrDistcodigo != null ? chrDistcodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistritoTO)) {
            return false;
        }
        DistritoTO other = (DistritoTO) object;
        if ((this.chrDistcodigo == null && other.chrDistcodigo != null) || (this.chrDistcodigo != null && !this.chrDistcodigo.equals(other.chrDistcodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.DistritoTO[ chrDistcodigo=" + chrDistcodigo + " ]";
    }
    
}
