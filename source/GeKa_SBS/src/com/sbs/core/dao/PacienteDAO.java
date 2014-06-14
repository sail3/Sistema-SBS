/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.dao;

import com.sbs.core.db.AccesoDB;
import com.sbs.core.to.PacienteTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sail3
 */
public class PacienteDAO {
    public boolean insertarPaciente(PacienteTO paciente) throws ClassNotFoundException, SQLException {
        String sql = "insert into paciente values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = AccesoDB.getConeccion().prepareStatement(sql);
        ps.setString(1, paciente.getCodigo());
        ps.setString(2, paciente.getDni());
        ps.setString(3, paciente.getNombre());
        ps.setString(4, paciente.getPaterno());
        ps.setString(5, paciente.getMaterno());
        ps.setInt(6, paciente.getEdad());
        ps.setDate(7, paciente.getFechaNacimiento());
        ps.setString(8, paciente.getDireccion());
        ps.setString(9, paciente.getDistrito().getCodigo());
        ps.setString(10, paciente.getPadre().getDni());
        return ps.execute();
    }
}
