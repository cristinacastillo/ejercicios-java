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
public class Coche extends Vehiculo{
    
    private int cv;

    public Coche(int cv, int kmRecorridos, String marca, String modelo) {
        super(kmRecorridos, marca, modelo);
        this.cv = cv;
        kmTotales += kmRecorridos;
    }

    public void andaCoche(){
        
        System.out.println("El coche está andado ");
    }
    
    public void quemaRuedaCoche(){
        
        System.out.println("Brrrrrrrrrs ");
    }
    
    
}
