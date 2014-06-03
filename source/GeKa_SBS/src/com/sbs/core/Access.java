/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core;

import com.sbs.core.dao.DistritoDAO;
import com.sbs.core.to.DistritoTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sail3
 */
public class Access {
    public static void insertarDistrito(DistritoTO distrito) throws ClassNotFoundException, SQLException {
        new DistritoDAO().insertarDistrito(distrito);
    }
    public static ArrayList<DistritoTO> listarDistritos() throws ClassNotFoundException, SQLException{
        return new DistritoDAO().listarDistritos();
    }
    public static void modificarDistrito(DistritoTO distrito) throws ClassNotFoundException, SQLException {
        new DistritoDAO().modificarDistrito(distrito);
    }
    public static void eliminarDistrito(DistritoTO distrito) throws ClassNotFoundException, SQLException {
        new DistritoDAO().eliminarDistrito(distrito);
    }
}
