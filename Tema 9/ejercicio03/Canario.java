/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author crcs
 */
public class Canario extends Ave {
    
    private int plumas;

    public Canario(int plumas, int alas, int patas, String sexo, String nombre) {
        super(alas, patas, sexo, nombre);
        this.plumas = plumas;
    }

    public int getPlumas() {
        return plumas;
    }

    public void setPlumas(int plumas) {
        this.plumas = plumas;
    }
    
    @Override
    
    void hacerRuido (){
        
        System.out.println("Pio pio");
    }
    
    
    
}
