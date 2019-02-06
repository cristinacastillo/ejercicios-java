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
public class Perro extends Mamifero {
    
    private String pelaje;

    public Perro(String pelaje, int lactancia, int patas, String sexo, String nombre) {
        super(lactancia, patas, sexo, nombre);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    
    @Override
    
    void hacerRuido (){
        
        System.out.println("Gua guau");
    }
    
    
}
