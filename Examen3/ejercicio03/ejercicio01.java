/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author : Cristina Castillo Obregón
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio01 {

    public static void main(String[] args) {

        ArrayList<Persona> cola = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        int num = 0;
        String nombre;
        String DNI;

        do {
            System.out.println("COLA\n"
                    + "=========\n"
                    + "1. Añadir persona\n"
                    + "2. Atender cola\n"
                    + "3. Lista nombres\n"
                    + "4. Salir\n"
                    + "Elige una opción (1-4):");

            num = Integer.parseInt(s.nextLine());

            switch (num) {

                case 1:
                    System.out.println("Nombre ");
                    nombre = s.nextLine();

                    System.out.println("DNI ");
                    DNI = s.nextLine();
                    
                    //comprobar(DNI, nombre, cola);

                    cola.add(new Persona(nombre, DNI));

                    
                    break;

                case 2:

                    if (cola.isEmpty()) {
                        System.out.println("No hay nadie en la cola");
                    } else {
                        cola.remove(0);
                    }

                    break;
                case 3:

                    System.out.println(cola);

                    /*AMBAS OPCIONES VALIDAS
                    for(Persona e: cola){
                        
                        System.out.println("e");
                    }*/
                    break;
            }

        } while (num != 4);

    }

}
