/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLO_EXAMEN.ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio01 {

    public static void main(String[] args) {

        Scanner s;
        s = new Scanner(System.in);

        ArrayList<Club> clubes = new ArrayList();

        int num = 0;
        String nombre;
        String nomClub;
        String DNI;
        int posicion;
        int edad;

        Jugador aux;

        do {
            System.out.println("CLUBES\n"
                    + "=========\n"
                    + "1. Listado nombres de clubes\n"
                    + "2. Crear club\n"
                    + "3. Crear jugador para un club\n"
                    + "4. Modificar edad de jugador\n"
                    + "5. Listar jugador de un club\n"
                    + "6. Listado detalado de un club\n"
                    + "7. Establecer presidente\n"
                    + "8. Traspasar jugador de club\n"
                    + "9. Modificar edad de presidente\n"
                    + "10.Salir\n"
                    + "Elige una opción (1-9):");

            num = Integer.parseInt(s.nextLine());

            switch (num) {

                case 1:
                    /*a la izq el tipo de objeto que va a recorrer*/
                    for (Club e : clubes) {

                        System.out.println(e);

                    }

                    break;

                case 2:

                    System.out.println("Nombre del club ");
                    nomClub = s.nextLine();

                    /*Añdir al arraylist de clubes un nuevo Club con e nombre indicado*/
                    clubes.add(new Club(nomClub));

                    break;

                case 3:

                    System.out.println("Nombre del club ");
                    nomClub = s.nextLine();

                    System.out.println("Posicion jugador ");
                    posicion = Integer.parseInt(s.nextLine());

                    System.out.println("Nombre del jugador ");
                    nombre = s.nextLine();

                    System.out.println("DNI jugador ");
                    DNI = s.nextLine();

                    /*Almacenar un jugador de forma auxiliar*/
                    aux = new Jugador(posicion, nombre, DNI);

                    for (Club e : clubes) {
                        /*buscar un club que tenga el nombre introducuido*/
                        if (e.getNombre().equals(nomClub)) {

                            /*añadir el jugador a ese club*/
                            e.añadirJugador(aux);
                        }
                    }

                    break;

                case 4:

                    System.out.println("Nombre del club ");
                    nomClub = s.nextLine();

                    System.out.println("DNI jugador ");
                    DNI = s.nextLine();

                    System.out.println("Edad jugador ");
                    edad = Integer.parseInt(s.nextLine());

                    for (Club e : clubes) {
                        /*buscar un club que tenga el nombre introducuido*/
                        if (e.getNombre().equals(nomClub)) {
                            
                            e.mirarJugador(DNI);
                            

                        }
                    }

                    break;

                case 5:

                    System.out.println("Nombre del club ");
                    nomClub = s.nextLine();

                    System.out.println("DNI jugador ");
                    DNI = s.nextLine();

                    break;

                case 6:

                    System.out.println("Nombre del club ");
                    nomClub = s.nextLine();

                    break;

                case 7:

                    break;

                case 8:

                    System.out.println("Nombre del club ");
                    nomClub = s.nextLine();

                    System.out.println("DNI jugador ");
                    DNI = s.nextLine();

                    break;

                case 9:

                    System.out.println("Nombre del club ");
                    nomClub = s.nextLine();

                    break;

            }

        } while (num != 10);
    }

}
