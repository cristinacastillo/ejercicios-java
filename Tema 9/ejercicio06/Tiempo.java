/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

/**
 *
 * @author crcs
 */
public class Tiempo {
    
    private int hora;
    private int min;
    private int seg;

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora * 3600;
        this.min = min * 60;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    
    public void Suma(){
        
        
        
    }
    
    
    
}

    