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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sail3
 */
@Entity
@Table(name = "enfermera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EnfermeraTO.findAll", query = "SELECT e FROM EnfermeraTO e"),
    @NamedQuery(name = "EnfermeraTO.findByChrEnfecodigo", query = "SELECT e FROM EnfermeraTO e WHERE e.chrEnfecodigo = :chrEnfecodigo"),
    @NamedQuery(name = "EnfermeraTO.findByVchEnfenombre", query = "SELECT e FROM EnfermeraTO e WHERE e.vchEnfenombre = :vchEnfenombre"),
    @NamedQuery(name = "EnfermeraTO.findByVchEnfedireccion", query = "SELECT e FROM EnfermeraTO e WHERE e.vchEnfedireccion = :vchEnfedireccion"),
    @NamedQuery(name = "EnfermeraTO.findByChrenfeTelefono", query = "SELECT e FROM EnfermeraTO e WHERE e.chrenfeTelefono = :chrenfeTelefono")})
public class EnfermeraTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_enfecodigo")
    private String chrEnfecodigo;
    @Basic(optional = false)
    @Column(name = "vch_enfenombre")
    private String vchEnfenombre;
    @Basic(optional = false)
    @Column(name = "vch_enfedireccion")
    private String vchEnfedireccion;
    @Basic(optional = false)
    @Column(name = "chr_enfeTelefono")
    private String chrenfeTelefono;

    public EnfermeraTO() {
    }

    public EnfermeraTO(String chrEnfecodigo) {
        this.chrEnfecodigo = chrEnfecodigo;
    }

    public EnfermeraTO(String chrEnfecodigo, String vchEnfenombre, String vchEnfedireccion, String chrenfeTelefono) {
        this.chrEnfecodigo = chrEnfecodigo;
        this.vchEnfenombre = vchEnfenombre;
        this.vchEnfedireccion = vchEnfedireccion;
        this.chrenfeTelefono = chrenfeTelefono;
    }

    public String getChrEnfecodigo() {
        return chrEnfecodigo;
    }

    public void setChrEnfecodigo(String chrEnfecodigo) {
        this.chrEnfecodigo = chrEnfecodigo;
    }

    public String getVchEnfenombre() {
        return vchEnfenombre;
    }

    public void setVchEnfenombre(String vchEnfenombre) {
        this.vchEnfenombre = vchEnfenombre;
    }

    public String getVchEnfedireccion() {
        return vchEnfedireccion;
    }

    public void setVchEnfedireccion(String vchEnfedireccion) {
        this.vchEnfedireccion = vchEnfedireccion;
    }

    public String getChrenfeTelefono() {
        return chrenfeTelefono;
    }

    public void setChrenfeTelefono(String chrenfeTelefono) {
        this.chrenfeTelefono = chrenfeTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chrEnfecodigo != null ? chrEnfecodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnfermeraTO)) {
            return false;
        }
        EnfermeraTO other = (EnfermeraTO) object;
        if ((this.chrEnfecodigo == null && other.chrEnfecodigo != null) || (this.chrEnfecodigo != null && !this.chrEnfecodigo.equals(other.chrEnfecodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.EnfermeraTO[ chrEnfecodigo=" + chrEnfecodigo + " ]";
    }
    
}
