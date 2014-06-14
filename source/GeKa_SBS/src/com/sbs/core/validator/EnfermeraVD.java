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
public class EnfermeraVD {
    public static boolean validarCodigo(String codigo){
        String patron = "[a-z]{1}[0-9]{14}";
        return Pattern.compile(patron).matcher(codigo).matches();            
    }
    
    
    
}
