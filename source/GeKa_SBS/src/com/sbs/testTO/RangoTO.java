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
@Table(name = "rango")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RangoTO.findAll", query = "SELECT r FROM RangoTO r"),
    @NamedQuery(name = "RangoTO.findByChrRangcodigo", query = "SELECT r FROM RangoTO r WHERE r.chrRangcodigo = :chrRangcodigo"),
    @NamedQuery(name = "RangoTO.findByVchRangnombre", query = "SELECT r FROM RangoTO r WHERE r.vchRangnombre = :vchRangnombre"),
    @NamedQuery(name = "RangoTO.findByVchRangdescripcion", query = "SELECT r FROM RangoTO r WHERE r.vchRangdescripcion = :vchRangdescripcion")})
public class RangoTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_rangcodigo")
    private String chrRangcodigo;
    @Basic(optional = false)
    @Column(name = "vch_rangnombre")
    private String vchRangnombre;
    @Basic(optional = false)
    @Column(name = "vch_rangdescripcion")
    private String vchRangdescripcion;
    @OneToMany(mappedBy = "chrRangcodigo")
    private Collection<VacunaTO> vacunaTOCollection;

    public RangoTO() {
    }

    public RangoTO(String chrRangcodigo) {
        this.chrRangcodigo = chrRangcodigo;
    }

    public RangoTO(String chrRangcodigo, String vchRangnombre, String vchRangdescripcion) {
        this.chrRangcodigo = chrRangcodigo;
        this.vchRangnombre = vchRangnombre;
        this.vchRangdescripcion = vchRangdescripcion;
    }

    public String getChrRangcodigo() {
        return chrRangcodigo;
    }

    public void setChrRangcodigo(String chrRangcodigo) {
        this.chrRangcodigo = chrRangcodigo;
    }

    public String getVchRangnombre() {
        return vchRangnombre;
    }

    public void setVchRangnombre(String vchRangnombre) {
        this.vchRangnombre = vchRangnombre;
    }

    public String getVchRangdescripcion() {
        return vchRangdescripcion;
    }

    public void setVchRangdescripcion(String vchRangdescripcion) {
        this.vchRangdescripcion = vchRangdescripcion;
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
        hash += (chrRangcodigo != null ? chrRangcodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangoTO)) {
            return false;
        }
        RangoTO other = (RangoTO) object;
        if ((this.chrRangcodigo == null && other.chrRangcodigo != null) || (this.chrRangcodigo != null && !this.chrRangcodigo.equals(other.chrRangcodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.RangoTO[ chrRangcodigo=" + chrRangcodigo + " ]";
    }
    
}
