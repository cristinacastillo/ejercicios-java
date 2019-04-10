/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio02 {
    
    public static void main(String[] args) {
        
        Gato[] gatito = new Gato[4];
         
        
        gatito[0] = new Gato ("siames", "garfield" ,8);
        
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println(gatito[i]);
            
        }
    }
    
}
