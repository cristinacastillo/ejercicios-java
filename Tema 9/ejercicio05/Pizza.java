/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

/**
 *
 * @author crcs
 */
public class Pizza {
    
    private String tamaño;
    private String tipo;
    private String estado;
    private static int totalesPizzas;
    private static int pedidasPizzas;

    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.pedidasPizzas++;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getTotalesPizzas() {
        return totalesPizzas;
    }

    public static void setTotalesPizzas(int totalesPizzas) {
        Pizza.totalesPizzas = totalesPizzas;
    }

    public static int getPedidasPizzas() {
        return pedidasPizzas;
    }

    public static void setPedidasPizzas(int pedidasPizzas) {
        Pizza.pedidasPizzas = pedidasPizzas;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tama\u00f1o=" + tamaño + ", tipo=" + tipo + ", estado=" + estado + '}';
    }

    public void sirve(){
        
        if(this.estado.equals("pedida")){
            
            this.estado = "servida";
            Pizza.totalesPizzas++;
            
        }else{
            
            System.out.println("Ya esta servida");
        }
    }
    
    
    
    
    
}
