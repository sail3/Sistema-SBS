/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.dao;


import com.sbs.core.db.AccesoDB;
import com.sbs.core.to.PadreTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sail3
 */
public class PadreDAO {
    public boolean insertarPadre(PadreTO padre) throws ClassNotFoundException, SQLException {
        String sql = "insert into padre values (?,?,?,?)";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, padre.getDni());
        ps.setString(2, padre.getNombre());
        ps.setString(3, padre.getPaterno());
        ps.setString(4, padre.getMaterno());
        return ps.execute();
    }
    public PadreTO buscarPadre(PadreTO padre ) throws SQLException, ClassNotFoundException {
        String sql = "select * from padre where chr_padrdni = ?";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, padre.getDni());
        ResultSet rs = ps.executeQuery();
        PadreTO pad = null;
        while (rs.next()) {
            pad = new PadreTO();
            pad.setDni(rs.getString("chr_padrdni"));
            pad.setDni(rs.getString("vch_padrnombre"));
            pad.setPaterno(rs.getString("vch_padrpaterno"));
            pad.setMaterno(rs.getString("vch_padrmaterno"));
        }
        return pad;
    }
}
