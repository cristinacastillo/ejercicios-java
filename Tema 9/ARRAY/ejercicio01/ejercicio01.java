/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio01 {
    
    public static void main(String[] args) {
        
        
        Gato[] gatito = new Gato[4];
    
        Scanner s = new Scanner(System.in);
        
        int edad = 0;
        String raza = " ";
        String nombre = " ";
        
        
        for (int i = 0; i < 4; i++) {
            
            /*crear nuevo gato*/
            
            
            System.out.println("Introduce los datos del gato " + (i + 1));
            
            
            System.out.println("Raza: ");
            raza = s.nextLine();
            
            System.out.println("Nombre: ");
            nombre = s.nextLine();
            
            System.out.println("Edad:");
            edad = Integer.parseInt(s.nextLine());
            
            gatito[i] = new Gato(raza,nombre,edad);
            
        }
    
        for (int i = 0; i < 4; i++) {
            
            System.out.println(gatito[i]);
            
        }
        
        
        
        
        
        
        
    }  
}
