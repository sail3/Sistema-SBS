/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.to;

import java.sql.Date;

/**
 *
 * @author sail3
 */
public class PacienteTO {
    private String codigo;
    private String dni;
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private Date fechaNacimiento;
    private String direccion;
    private DistritoTO distrito;
    private PadreTO padre;

    public PacienteTO() {
    }

    public PacienteTO(String codigo, String dni, String nombre, String paterno, String materno, int edad, Date fechaNacimiento, String direccion, DistritoTO distrito, PadreTO padre) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.distrito = distrito;
        this.padre = padre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DistritoTO getDistrito() {
        return distrito;
    }

    public void setDistrito(DistritoTO distrito) {
        this.distrito = distrito;
    }

    public PadreTO getPadre() {
        return padre;
    }

    public void setPadre(PadreTO padre) {
        this.padre = padre;
    }
    
}
