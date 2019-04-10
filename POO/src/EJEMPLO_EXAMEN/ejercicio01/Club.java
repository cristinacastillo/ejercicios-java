/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLO_EXAMEN.ejercicio01;

import java.util.ArrayList;

/**
 *
 * @author crcs
 */
public class Club {

    private String nombre;

    private ArrayList<Jugador> plantilla = new ArrayList<>();

    private Persona presidente;

    public Club(String nombre) {
        this.nombre = nombre;
        this.presidente = presidente;
    }

    public Persona getPresidente() {
        return presidente;
    }

    public void setPresidente(Persona presidente) {
        this.presidente = presidente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    void añadirJugador(Jugador jugadorx) {

        boolean almacenar = true;

        for (Jugador e : plantilla) {

            if (e.getDNI().equals(jugadorx.getDNI())) {

                almacenar = false;
                break;

            }

            if (almacenar) {

                plantilla.add(jugadorx);

            } else {

                System.out.println("Este jugador ya existe. ");
            }

        }

    }

    void mirarJugador(String DNI) {

        for (Jugador e : plantilla) {

            if (e.getDNI() == DNI) {

                System.out.println(e);
            }

        }
    }

    void extraerJugador(String DNI) {

        for (Jugador e : plantilla) {

            if (e.getDNI() == DNI) {

                plantilla.remove(e);
                System.out.println("El jugador ha sido eliminado de la plantilla");
            }

        }
    }

    void traspasarJugador(Club club, String DNI) {

        for (Jugador e : plantilla) {

            if (e.getDNI() == DNI) {

                club.añadirJugador(e);
                this.plantilla.remove(e);

            }

        }

    }

    @Override
    public String toString() {
        return "Club{"  + "nombre = " + nombre/* 
                        + ", plantilla = " + plantilla 
                        + ", presidente = " + presidente*/ + '}';
    }

}
