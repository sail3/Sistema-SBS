/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs;

import com.sbs.core.dao.DistritoDAO;
import com.sbs.core.to.DistritoTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sail3
 */
public class gekaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DistritoDAO cons = new DistritoDAO();
            DistritoTO distrito = cons.getDistrito("DIS0000001");
            System.out.println(distrito.getCodigo());
            System.out.println(distrito.getNombre());
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(gekaMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(gekaMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
