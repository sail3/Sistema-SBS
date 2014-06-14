/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.dao;

import com.sbs.core.db.AccesoDB;
import com.sbs.core.to.EnfermeraTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sail3
 */
public class EnfermeraDAO {
    public boolean insertarEnfermera(EnfermeraTO enfermera) throws ClassNotFoundException, SQLException {
        String sql = "select vch_enfenombre from Enfermera where chr_enfecodigo = ?";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, enfermera.getCodigo());
        return ps.execute();
    }
    public boolean eliminarEnfermera(EnfermeraTO enfermera) throws ClassNotFoundException, SQLException {
        String sql = "delete from enfermera where chr_enfecodigo = ?";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, enfermera.getCodigo());
        return ps.execute();
    }
    public boolean mosificarEnfermera(EnfermeraTO enfermera) throws ClassNotFoundException, SQLException {
        String sql = "update ";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, enfermera.getNombre());
        ps.setString(2, enfermera.getDireccion());
        ps.setString(3, enfermera.getCodigo());
        return ps.execute();
    }
    public ArrayList<EnfermeraTO> listarEnfermeras() throws ClassNotFoundException, SQLException {
        ArrayList<EnfermeraTO> lista = new ArrayList<EnfermeraTO>();
        String sql = "select * from enfermeras";
        ResultSet rs = AccesoDB.getConeccion().createStatement().executeQuery(sql);
        EnfermeraTO enfermera = null;
        while (rs.next()) {
            enfermera = new EnfermeraTO();
            enfermera.setCodigo(rs.getString("chr_enfecodigo"));
            enfermera.setNombre(rs.getString("vch_enfenombre"));
            enfermera.setDireccion(rs.getString("vch_enfedireccion"));
            enfermera.setTelefono(rs.getInt("int_enfetelefono"));
            lista.add(enfermera);
        }
        return lista;
    }
    public EnfermeraTO consultarPorCodigo(EnfermeraTO enfe) throws ClassNotFoundException, SQLException {
        String sql = "select * from enfermera where chr_enfecodigo = ?";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, enfe.getCodigo());
        ResultSet rs = ps.executeQuery();
        EnfermeraTO enfermera = null;
        while (rs.next()) {
            enfermera = new EnfermeraTO();
            enfermera.setCodigo(rs.getString("chr_enfecodigo"));
            enfermera.setNombre(rs.getString("vch_enfenombre"));
            enfermera.setDireccion(rs.getString("vch_enfedireccion"));
            enfermera.setTelefono(rs.getInt("int_enfetelefono"));
        }
        return enfermera;
    }
    
}
