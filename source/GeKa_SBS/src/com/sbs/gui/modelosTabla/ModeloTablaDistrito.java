/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.gui.modelosTabla;

import com.sbs.core.to.DistritoTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sail3
 */
public class ModeloTablaDistrito extends AbstractTableModel{
    private ArrayList<DistritoTO> lista;
    private int tamano = 0;

    public ModeloTablaDistrito(ArrayList<DistritoTO> lista) {
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
        }
        return nombre;
    }
    
    
    
    @Override
    public int getRowCount() {
        return this.tamano;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DistritoTO distrito = lista.get(rowIndex);
        Object obj = null;
        switch (columnIndex) {
            case 0:
                obj = distrito.getCodigo();
                break;
            case 1:
                obj = distrito.getNombre();
                break;
        }
        return obj;
    }
    
}
