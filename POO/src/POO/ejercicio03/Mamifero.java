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
public abstract class Mamifero extends Animal {
    
    private int lactancia;

    public Mamifero(int lactancia, int patas, String sexo, String nombre) {
        super(patas, sexo, nombre);
        this.lactancia = lactancia;
    }

    public int getLactancia() {
        return lactancia;
    }

    public void setLactancia(int lactancia) {
        this.lactancia = lactancia;
    }
    
    void hacerRuido (){
        
        System.out.println("");
    }
    
}
