/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ejercicio03;

/**
 *
 * @author crcs
 */
public class ejercicio03 {
    
    public static void main(String[] args) {
    
        Gato misifu = new Gato("siames", 8, 4, "macho", "gatito") ;
        
        misifu.hacerRuido();
        
        Perro estrella = new Perro ("corto",9, 4, "hembra", "estrella");
        
        estrella.hacerRuido();
    }
    
    
}
