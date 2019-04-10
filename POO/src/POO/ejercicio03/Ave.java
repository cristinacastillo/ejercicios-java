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
public abstract class Ave extends Animal {
    
    private int alas;

    public Ave(int alas, int patas, String sexo, String nombre) {
        super(patas, sexo, nombre);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    
    void hacerRuido (){
        
        System.out.println("");
    }
    
    
    
}
