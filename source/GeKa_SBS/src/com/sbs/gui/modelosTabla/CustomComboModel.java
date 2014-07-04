/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.gui.modelosTabla;

import com.sbs.core.to.DistritoTO;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Sail3
 */
public class CustomComboModel extends DefaultComboBoxModel{
    ArrayList<DistritoTO> lista = new ArrayList<DistritoTO>();

    public CustomComboModel() {
    }

    public CustomComboModel(ArrayList<DistritoTO> lista) {
        this.lista = lista;
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            this.addElement((DistritoTO) it.next());
        }
    }
    
    @Override
    public int getIndexOf(Object anObject) {
        return this.lista.indexOf((DistritoTO)anObject);
    }

    @Override
    public Object getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public Object getSelectedItem() {
        return super.getSelectedItem(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
