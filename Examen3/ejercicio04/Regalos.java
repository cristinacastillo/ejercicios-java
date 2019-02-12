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
public abstract class Regalos {
    
    private int codigo;
    private String denominacion;
    private int precio;

    public Regalos(int codigo, String denominacion, int precio) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

     void consultaPrecio(){
        
         System.out.println(getPrecio()); 
    }
    
    void fijarPrecio(int preciousuario){
        
        this.precio = preciousuario;
    }
    
    @Override
    public String toString() {
        return "Regalos{" + "codigo=" + codigo + ", denominacion=" + denominacion + ", precio=" + precio + '}';
    }


    
    
    
}
