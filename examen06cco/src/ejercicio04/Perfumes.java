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
public class Perfumes extends Regalos{
    
    private String aroma;
    private String añoCreacion;

    public Perfumes(String aroma, String añoCreacion, int codigo, String denominacion, int precio) {
        super(codigo, denominacion, precio);
        this.aroma = aroma;
        this.añoCreacion = añoCreacion;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(String añoCreacion) {
        this.añoCreacion = añoCreacion;
    }
    
    void saberAroma(){
        
        System.out.println("Este perfume tiene aroma " + this.aroma);
    }

    @Override
    public String toString() {
        return "Perfumes{" + "aroma=" + aroma + ", a\u00f1oCreacion=" + añoCreacion + '}';
    }
    
    
    
    
    
}
