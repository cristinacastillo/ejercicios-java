/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLO_EXAMEN.ejercicio01;

/**
 *
 * @author crcs
 */
public class Jugador extends Persona {

    private int posicion;
    private double valorFichaje;

    public Jugador(int posicion, String nombre, String DNI) {
        super(nombre, DNI);
        this.posicion = posicion;
        this.valorFichaje = 0;
    }

    public Jugador(int posicion, double valorFichaje, String nombre, String DNI) {
        super(nombre, DNI);
        this.posicion = posicion;
        this.valorFichaje = valorFichaje;
    }

    @Override
    public String toString() {
        return "Jugador{" + " posicion = " + posicion + ", valorFichaje = " + valorFichaje + '}';
    }

}
