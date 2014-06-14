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
@Table(name = "vacuna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VacunaTO.findAll", query = "SELECT v FROM VacunaTO v"),
    @NamedQuery(name = "VacunaTO.findByChrVacucodigo", query = "SELECT v FROM VacunaTO v WHERE v.chrVacucodigo = :chrVacucodigo"),
    @NamedQuery(name = "VacunaTO.findByVchVacunombre", query = "SELECT v FROM VacunaTO v WHERE v.vchVacunombre = :vchVacunombre")})
public class VacunaTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_vacucodigo")
    private String chrVacucodigo;
    @Basic(optional = false)
    @Column(name = "vch_vacunombre")
    private String vchVacunombre;
    @JoinColumn(name = "chr_catecodigo", referencedColumnName = "chr_catecodigo")
    @ManyToOne
    private CategoriaTO chrCatecodigo;
    @JoinColumn(name = "chr_rangcodigo", referencedColumnName = "chr_rangcodigo")
    @ManyToOne
    private RangoTO chrRangcodigo;

    public VacunaTO() {
    }

    public VacunaTO(String chrVacucodigo) {
        this.chrVacucodigo = chrVacucodigo;
    }

    public VacunaTO(String chrVacucodigo, String vchVacunombre) {
        this.chrVacucodigo = chrVacucodigo;
        this.vchVacunombre = vchVacunombre;
    }

    public String getChrVacucodigo() {
        return chrVacucodigo;
    }

    public void setChrVacucodigo(String chrVacucodigo) {
        this.chrVacucodigo = chrVacucodigo;
    }

    public String getVchVacunombre() {
        return vchVacunombre;
    }

    public void setVchVacunombre(String vchVacunombre) {
        this.vchVacunombre = vchVacunombre;
    }

    public CategoriaTO getChrCatecodigo() {
        return chrCatecodigo;
    }

    public void setChrCatecodigo(CategoriaTO chrCatecodigo) {
        this.chrCatecodigo = chrCatecodigo;
    }

    public RangoTO getChrRangcodigo() {
        return chrRangcodigo;
    }

    public void setChrRangcodigo(RangoTO chrRangcodigo) {
        this.chrRangcodigo = chrRangcodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chrVacucodigo != null ? chrVacucodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VacunaTO)) {
            return false;
        }
        VacunaTO other = (VacunaTO) object;
        if ((this.chrVacucodigo == null && other.chrVacucodigo != null) || (this.chrVacucodigo != null && !this.chrVacucodigo.equals(other.chrVacucodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.VacunaTO[ chrVacucodigo=" + chrVacucodigo + " ]";
    }
    
}
