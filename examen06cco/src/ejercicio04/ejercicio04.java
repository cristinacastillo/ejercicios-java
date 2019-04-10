/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author : Cristina Castillo Obregón
 */
package ejercicio04;

/**
 *
 * @author crcs
 */
public class ejercicio04 {
    
    public static void main(String[] args) {
        
        Ramos clavel = new Ramos (12, "origen", 15);
        
        clavel.consultaPrecio();
        
        clavel.fijarPrecio(16);
        
        clavel.consultaPrecio();
        
        Perfumes uno = new Perfumes ("dulce","2019" ,15, "origen", 36);
        
        uno.saberAroma();
        
        clavel.consultarRamo();
        
    }
    
}
