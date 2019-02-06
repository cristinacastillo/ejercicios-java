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
public class Gato extends Mamifero{
    
    private String raza;

    public Gato(String raza, int lactancia, int patas, String sexo, String nombre) {
        super(lactancia, patas, sexo, nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    @Override
    
    void hacerRuido (){
        
        System.out.println("Miauuuuu");
    }
    
    
    

}
