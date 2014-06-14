/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.testTO;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaTO.findAll", query = "SELECT c FROM CategoriaTO c"),
    @NamedQuery(name = "CategoriaTO.findByChrCatecodigo", query = "SELECT c FROM CategoriaTO c WHERE c.chrCatecodigo = :chrCatecodigo"),
    @NamedQuery(name = "CategoriaTO.findByVchCatenombre", query = "SELECT c FROM CategoriaTO c WHERE c.vchCatenombre = :vchCatenombre"),
    @NamedQuery(name = "CategoriaTO.findByVchCatedescripcion", query = "SELECT c FROM CategoriaTO c WHERE c.vchCatedescripcion = :vchCatedescripcion")})
public class CategoriaTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_catecodigo")
    private String chrCatecodigo;
    @Basic(optional = false)
    @Column(name = "vch_catenombre")
    private String vchCatenombre;
    @Basic(optional = false)
    @Column(name = "vch_catedescripcion")
    private String vchCatedescripcion;
    @OneToMany(mappedBy = "chrCatecodigo")
    private Collection<VacunaTO> vacunaTOCollection;

    public CategoriaTO() {
    }

    public CategoriaTO(String chrCatecodigo) {
        this.chrCatecodigo = chrCatecodigo;
    }

    public CategoriaTO(String chrCatecodigo, String vchCatenombre, String vchCatedescripcion) {
        this.chrCatecodigo = chrCatecodigo;
        this.vchCatenombre = vchCatenombre;
        this.vchCatedescripcion = vchCatedescripcion;
    }

    public String getChrCatecodigo() {
        return chrCatecodigo;
    }

    public void setChrCatecodigo(String chrCatecodigo) {
        this.chrCatecodigo = chrCatecodigo;
    }

    public String getVchCatenombre() {
        return vchCatenombre;
    }

    public void setVchCatenombre(String vchCatenombre) {
        this.vchCatenombre = vchCatenombre;
    }

    public String getVchCatedescripcion() {
        return vchCatedescripcion;
    }

    public void setVchCatedescripcion(String vchCatedescripcion) {
        this.vchCatedescripcion = vchCatedescripcion;
    }

    @XmlTransient
    public Collection<VacunaTO> getVacunaTOCollection() {
        return vacunaTOCollection;
    }

    public void setVacunaTOCollection(Collection<VacunaTO> vacunaTOCollection) {
        this.vacunaTOCollection = vacunaTOCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chrCatecodigo != null ? chrCatecodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaTO)) {
            return false;
        }
        CategoriaTO other = (CategoriaTO) object;
        if ((this.chrCatecodigo == null && other.chrCatecodigo != null) || (this.chrCatecodigo != null && !this.chrCatecodigo.equals(other.chrCatecodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.CategoriaTO[ chrCatecodigo=" + chrCatecodigo + " ]";
    }
    
}
