/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.to;

/**
 *
 * @author sail3
 */
public class PadreTO {
    private String dni;
    private String nombre;
    private String materno;
    private String paterno;

    public PadreTO() {
    }

    public PadreTO(String dni) {
        this.dni = dni;
    }

    public PadreTO(String dni, String nombre, String materno, String paterno) {
        this.dni = dni;
        this.nombre = nombre;
        this.materno = materno;
        this.paterno = paterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    
}


