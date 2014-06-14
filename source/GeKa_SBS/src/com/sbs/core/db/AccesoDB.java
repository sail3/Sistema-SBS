/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sail3
 */
public class AccesoDB {
    private static String url = "jdbc:mysql://localhost/geka_r";
    private static String user = "root";
    private static String pass = "";
    private static Connection cnx = null;
    
    public static Connection getConeccion() throws ClassNotFoundException, SQLException {
        if (cnx == null) {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user, pass);
        }
        return cnx;
    }
}
