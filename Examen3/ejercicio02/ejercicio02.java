/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * author : Cristina Castillo

 */
package ejercicio02;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio02 {
    
    public static void comprobar( HashMap<String, String> coleccion, String palabra,  int op, Scanner s ){
        
        String frase ;
        
        if (coleccion.containsKey(palabra) == true) {

                        System.out.println(coleccion.get(palabra));


                    } else {

                        System.out.println("Esta palabra no tiene ninguna frase ¿quieres añadirla? 1.si 2.no");

                        op = Integer.parseInt(s.nextLine());

                        if (op == 1) {

                            System.out.println("Frase: ");
                            frase = s.nextLine();

                            coleccion.put(palabra, frase);
                        }
                    }
    }


    public static void main(String[] args) {

        HashMap<String, String> coleccion = new HashMap<String, String>();

        int num;
        int op = 0;
        String palabra;
        String frase;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("COLECCION\n"
                    + "=========\n"
                    + "1. Mostrar la frase correspondiente a una palabra\n"
                    + "2. Borrar una palabra y su correspondiente frase\n"
                    + "3. Mostrar por pantalla todo el diccionario\n"
                    + "4. Salir\n"
                    + "Elige una opción (1-4):");

            num = Integer.parseInt(s.nextLine());

            switch (num) {

                case 1:
                    System.out.println("Palabra: ");
                    palabra = s.nextLine();
                    
                    comprobar(coleccion, palabra, op, s);

                    break;

                case 2:

                    System.out.println("Palabra: ");
                    palabra = s.nextLine();

                    coleccion.remove(palabra);

                    break;

                case 3:

                    System.out.println(coleccion.entrySet());
                    break;
            }

        } while (num != 4);

    }

}
