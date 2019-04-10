/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ejercicio01;

/**
 *
 * @author crcs
 */
public class Caballo {
    
    /*ATRIBUTOS*/
    private String color;
    private int edad;
    private String nombre;
    
    /*CONSTRUCTOR*/

    public Caballo(String color, int edad, String nombre) {
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Caballo(String nombre) {
        this.nombre = nombre;
        this.edad = 10;
        this.color = "blanco";
    }
    
    /*METODOS*/

    /*metodos get (obtener)*/
    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    /*metodos set (asignar)*/
    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Caballo{" + "color=" + color + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
    
}
