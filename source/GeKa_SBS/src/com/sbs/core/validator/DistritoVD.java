/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sbs.core.validator;

import java.util.regex.Pattern;

/**
 *
 * @author Sail3
 */
public class DistritoVD {
    public boolean validarCodigo(String cadena) {
        String patron = "[A-Z]{1}[a-9]{9}";
        return Pattern.compile(patron).matcher(cadena).matches();
    }
}
