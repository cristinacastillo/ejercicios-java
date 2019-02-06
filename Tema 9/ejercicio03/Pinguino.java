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
public class Pinguino extends Ave {
    
    private String volar;

    public Pinguino(String volar, int alas, int patas, String sexo, String nombre) {
        super(alas, patas, sexo, nombre);
        this.volar = volar;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    @Override
    
    void hacerRuido (){
        
        System.out.println("Gru gru");
    }
    
}
