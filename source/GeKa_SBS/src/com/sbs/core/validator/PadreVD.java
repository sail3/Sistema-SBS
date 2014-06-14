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
public class PadreVD {
    public static boolean validarNombre(String cadena) {
        String patron = "(a-z){8}";
        return Pattern.compile(patron).matcher(patron).matches();                
    }
    public static boolean validarDni(String cadena) {
        String patron = "[0-9]{8}";
        return Pattern.compile(patron).matcher(cadena).matches();
    }
}
