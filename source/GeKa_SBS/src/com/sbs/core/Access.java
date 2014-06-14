/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core;

import com.sbs.core.dao.DistritoDAO;
import com.sbs.core.dao.EnfermeraDAO;
import com.sbs.core.dao.PacienteDAO;
import com.sbs.core.dao.PadreDAO;
import com.sbs.core.to.DistritoTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sail3
 */
public class Access {
    
    private static Access acc;
    static {
        acc = new Access();
    }

    public static Access getInstance() {
        return acc;
    }
    
    public DistritoDAO getDistritoDAO() {
        return new DistritoDAO();
    }
    
    public EnfermeraDAO getEnfermeraDAO() {
        return new EnfermeraDAO();
    }
    
    public PacienteDAO getPacienteDAO() {
        return new PacienteDAO();
    }
    
    public PadreDAO getPadreDAO() {
        return new PadreDAO();
    }
}
