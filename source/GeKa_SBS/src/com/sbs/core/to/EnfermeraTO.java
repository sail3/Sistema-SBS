/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.to;

/**
 *
 * @author Sail3
 */
public class EnfermeraTO {
    private String codigo;
    private String nombre;
    private String direccion;
    private int telefono;

    public EnfermeraTO() {
    }

    public EnfermeraTO(String codigo) {
        this.codigo = codigo;
    }

    public EnfermeraTO(String codigo, String nombre, String direccion, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
}
