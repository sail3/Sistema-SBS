/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.dao;

import com.sbs.db.AccesoDB;
import com.sbs.core.to.DistritoTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sail3
 */
public class DistritoDAO {
   
    public boolean insertarDistrito(DistritoTO distrito) throws ClassNotFoundException, SQLException {
        String sql = "insert into Distrito (chr_distcodigo, vchr_distnombre) values (?, ?)";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, distrito.getCodigo());
        ps.setString(2, distrito.getNombre());
        return ps.execute();
    }
    
    public boolean modificarDistrito(DistritoTO distrito) throws ClassNotFoundException, SQLException {
        String sql = "update Distrito set vch_distnombre = ?  where chr_distcodigo = ?";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(2, distrito.getCodigo());
        ps.setString(1, distrito.getNombre());
        return ps.execute();
    }
    
    public boolean eliminarDistrito(DistritoTO distrito) throws ClassNotFoundException, SQLException{
        String sql = "delete from Distrito where chr_distCodigo = ?";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, distrito.getCodigo());
        return ps.execute();
    }
    
    public DistritoTO getDistrito(String codigo) throws ClassNotFoundException, SQLException {
        String sql = "select * from Distrito where chr_distcodigo = '" + codigo + "'";
        ResultSet cdr = AccesoDB.getConeccion().createStatement().executeQuery(sql);
        DistritoTO distrito = null;
        while (cdr.next()) {
            distrito = new DistritoTO();
            distrito.setCodigo(codigo);
            distrito.setNombre(cdr.getString("vch_distNombre"));
        }
        return distrito;
    }
    
    public ArrayList<DistritoTO> listarDistritos() throws ClassNotFoundException, SQLException{
        String sql = "select * from Distrito";
        ResultSet cdr = AccesoDB.getConeccion().createStatement().executeQuery(sql);
        ArrayList<DistritoTO> lista = new ArrayList<DistritoTO>();
        DistritoTO distrito = null;
        while (cdr.next()) {
            distrito = new DistritoTO();
            distrito.setCodigo(cdr.getString("chr_distcodigo"));
            distrito.setNombre(cdr.getString("vch_distNombre"));
            lista.add(distrito);
        }
        return lista;
    }
    
    
}
