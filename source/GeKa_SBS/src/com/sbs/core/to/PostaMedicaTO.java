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
public class PostaMedicaTO {
    private String codigo;
    private String nombre;
    private DistritoTO distrito;

    public PostaMedicaTO() {
    }

    public PostaMedicaTO(String codigo, String nombre, DistritoTO distrito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.distrito = distrito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DistritoTO getDistrito() {
        return distrito;
    }

    public void setDistrito(DistritoTO distrito) {
        this.distrito = distrito;
    }
    
}

