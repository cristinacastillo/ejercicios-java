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
public class Lagarto extends Mamifero {
    
    private int huevos;

    public Lagarto(int huevos, int lactancia, int patas, String sexo, String nombre) {
        super(lactancia, patas, sexo, nombre);
        this.huevos = huevos;
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }
    
    @Override
    
    void hacerRuido (){
        
        System.out.println("bsbsbsbsbs");
    }
    
    
    
}
