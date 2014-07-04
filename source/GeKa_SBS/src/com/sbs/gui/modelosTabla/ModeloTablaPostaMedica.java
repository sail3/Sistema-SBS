/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.gui.modelosTabla;

import com.sbs.core.to.PostaMedicaTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sail3
 */
public class ModeloTablaPostaMedica extends AbstractTableModel{
    private ArrayList<PostaMedicaTO> lista;
    private int tamano = 0;

    public ModeloTablaPostaMedica(ArrayList<PostaMedicaTO> lista) {
        this.lista = lista;
        tamano = lista.size();
    }

    
    @Override
    public String getColumnName(int column) {
        String nombre = "";
        switch (column) {
            case 0:
                nombre = "CODIGO";
                break;
            case 1:
                nombre = "NOMBRE";
                break;
            case 2:
                nombre = "DISTRITO";
                break;
            default:
                throw new AssertionError();
        }
        return nombre;
    }
    @Override
    public int getRowCount() {
        return tamano;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj = null;
        PostaMedicaTO posta = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                obj = posta.getCodigo();
                break;
            case 1:
                obj = posta.getNombre();
                break;
            case 2:
                obj = posta.getDistrito().toString();
                break;
        }
        return obj;
    }
    
}
