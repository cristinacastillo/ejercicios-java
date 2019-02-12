/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author crcs
 */
public class Ramos extends Regalos{
    
    private int numFlores;
    private String tipoFlor;

    public Ramos(int numFlores, String tipoFlor, int codigo, String denominacion, int precio) {
        super(codigo, denominacion, precio);
        this.numFlores = numFlores;
        this.tipoFlor = tipoFlor;
    }

    public Ramos(int numFlores, int codigo, String denominacion, int precio) {
        super(codigo, denominacion, precio);
        this.numFlores = numFlores;
        this.tipoFlor = "rosa";
    }

    public Ramos(String tipoFlor, int codigo, String denominacion, int precio) {
        super(codigo, denominacion, precio);
        this.tipoFlor = tipoFlor;
        this.numFlores = 6;
    }

    public Ramos(int codigo, String denominacion, int precio) {
        super(codigo, denominacion, precio);
        this.tipoFlor = "rosa";
        this.numFlores = 6;
    }

    public int getNumFlores() {
        return numFlores;
    }

    public void setNumFlores(int numFlores) {
        this.numFlores = numFlores;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    void consultarRamo(){
        
        System.out.println("Este ramo tiene " + this.numFlores + " flores y son de tipo " + this.tipoFlor);
    }
   
    @Override
    public String toString() {
        return "Ramos{" + "numFlores=" + numFlores + ", tipoFlor=" + tipoFlor + '}';
    }
    
    
    
    

    
    
}
