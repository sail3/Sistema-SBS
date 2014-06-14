/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.testTO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sail3
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteTO.findAll", query = "SELECT p FROM PacienteTO p"),
    @NamedQuery(name = "PacienteTO.findByChrPacicodigo", query = "SELECT p FROM PacienteTO p WHERE p.chrPacicodigo = :chrPacicodigo"),
    @NamedQuery(name = "PacienteTO.findByChrPacidni", query = "SELECT p FROM PacienteTO p WHERE p.chrPacidni = :chrPacidni"),
    @NamedQuery(name = "PacienteTO.findByVchPacinombre", query = "SELECT p FROM PacienteTO p WHERE p.vchPacinombre = :vchPacinombre"),
    @NamedQuery(name = "PacienteTO.findByVchPacipaterno", query = "SELECT p FROM PacienteTO p WHERE p.vchPacipaterno = :vchPacipaterno"),
    @NamedQuery(name = "PacienteTO.findByVchPacimaterno", query = "SELECT p FROM PacienteTO p WHERE p.vchPacimaterno = :vchPacimaterno"),
    @NamedQuery(name = "PacienteTO.findBySmiPaciedad", query = "SELECT p FROM PacienteTO p WHERE p.smiPaciedad = :smiPaciedad"),
    @NamedQuery(name = "PacienteTO.findByDatPacinacimiento", query = "SELECT p FROM PacienteTO p WHERE p.datPacinacimiento = :datPacinacimiento"),
    @NamedQuery(name = "PacienteTO.findByVchPacidireccion", query = "SELECT p FROM PacienteTO p WHERE p.vchPacidireccion = :vchPacidireccion")})
public class PacienteTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "chr_pacicodigo")
    private String chrPacicodigo;
    @Basic(optional = false)
    @Column(name = "chr_pacidni")
    private String chrPacidni;
    @Basic(optional = false)
    @Column(name = "vch_pacinombre")
    private String vchPacinombre;
    @Basic(optional = false)
    @Column(name = "vch_pacipaterno")
    private String vchPacipaterno;
    @Basic(optional = false)
    @Column(name = "vch_pacimaterno")
    private String vchPacimaterno;
    @Basic(optional = false)
    @Column(name = "smi_paciedad")
    private short smiPaciedad;
    @Basic(optional = false)
    @Column(name = "dat_pacinacimiento")
    @Temporal(TemporalType.DATE)
    private Date datPacinacimiento;
    @Basic(optional = false)
    @Column(name = "vch_pacidireccion")
    private String vchPacidireccion;
    @JoinColumn(name = "chr_padrdni", referencedColumnName = "chr_padrdni")
    @ManyToOne(optional = false)
    private PadreTO chrPadrdni;
    @JoinColumn(name = "chr_distcodigo", referencedColumnName = "chr_distcodigo")
    @ManyToOne(optional = false)
    private DistritoTO chrDistcodigo;

    public PacienteTO() {
    }

    public PacienteTO(String chrPacicodigo) {
        this.chrPacicodigo = chrPacicodigo;
    }

    public PacienteTO(String chrPacicodigo, String chrPacidni, String vchPacinombre, String vchPacipaterno, String vchPacimaterno, short smiPaciedad, Date datPacinacimiento, String vchPacidireccion) {
        this.chrPacicodigo = chrPacicodigo;
        this.chrPacidni = chrPacidni;
        this.vchPacinombre = vchPacinombre;
        this.vchPacipaterno = vchPacipaterno;
        this.vchPacimaterno = vchPacimaterno;
        this.smiPaciedad = smiPaciedad;
        this.datPacinacimiento = datPacinacimiento;
        this.vchPacidireccion = vchPacidireccion;
    }

    public String getChrPacicodigo() {
        return chrPacicodigo;
    }

    public void setChrPacicodigo(String chrPacicodigo) {
        this.chrPacicodigo = chrPacicodigo;
    }

    public String getChrPacidni() {
        return chrPacidni;
    }

    public void setChrPacidni(String chrPacidni) {
        this.chrPacidni = chrPacidni;
    }

    public String getVchPacinombre() {
        return vchPacinombre;
    }

    public void setVchPacinombre(String vchPacinombre) {
        this.vchPacinombre = vchPacinombre;
    }

    public String getVchPacipaterno() {
        return vchPacipaterno;
    }

    public void setVchPacipaterno(String vchPacipaterno) {
        this.vchPacipaterno = vchPacipaterno;
    }

    public String getVchPacimaterno() {
        return vchPacimaterno;
    }

    public void setVchPacimaterno(String vchPacimaterno) {
        this.vchPacimaterno = vchPacimaterno;
    }

    public short getSmiPaciedad() {
        return smiPaciedad;
    }

    public void setSmiPaciedad(short smiPaciedad) {
        this.smiPaciedad = smiPaciedad;
    }

    public Date getDatPacinacimiento() {
        return datPacinacimiento;
    }

    public void setDatPacinacimiento(Date datPacinacimiento) {
        this.datPacinacimiento = datPacinacimiento;
    }

    public String getVchPacidireccion() {
        return vchPacidireccion;
    }

    public void setVchPacidireccion(String vchPacidireccion) {
        this.vchPacidireccion = vchPacidireccion;
    }

    public PadreTO getChrPadrdni() {
        return chrPadrdni;
    }

    public void setChrPadrdni(PadreTO chrPadrdni) {
        this.chrPadrdni = chrPadrdni;
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
        hash += (chrPacicodigo != null ? chrPacicodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteTO)) {
            return false;
        }
        PacienteTO other = (PacienteTO) object;
        if ((this.chrPacicodigo == null && other.chrPacicodigo != null) || (this.chrPacicodigo != null && !this.chrPacicodigo.equals(other.chrPacicodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sbs.testTO.PacienteTO[ chrPacicodigo=" + chrPacicodigo + " ]";
    }
    
}
