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
public class PacienteVD {
    public static boolean validarTexto(String cadena) {
        String patron = "[a-zA-Z]{1,40}";
        return Pattern.compile(cadena).matcher(cadena).matches();              
    }
}
