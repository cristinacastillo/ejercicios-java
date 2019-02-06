/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author crcs
 */
public class Bicicleta extends Vehiculo{
    
    private int ruedas;

    public Bicicleta(int ruedas, int kmRecorridos, String marca, String modelo) {
        super(kmRecorridos, marca, modelo);
        this.ruedas = ruedas;
        kmTotales += kmRecorridos;
    }
    
    public void andaBici(){
        
        System.out.println("La bici está andado ");
    }
    
    public void caballlitoBici(){
        
        System.out.println("La bici está haciendo el caballito ");
    }
}
