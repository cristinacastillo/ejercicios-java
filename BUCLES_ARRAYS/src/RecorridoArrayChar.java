
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author crcs
 */
public class RecorridoArrayChar {

    public static void main(String[] args) {

        String[] x = new String[5];
        String[] x2 = new String[5];
        int[] x3 = new int[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("introduce palabra" + (i + 1));
            x[i] = s.nextLine();

        }

        int contador = 0;

        //recorre el array que contiene todas las palabras y fija una
        for (int i = 0; i < x.length; i++) {

            //en cada vuelta del primer array se inicializan los dos valores
            boolean existe = false;
            int posicion = 0;

            //recorre el segundo array para ver si la palabra extraida ya esta almacenada en el
            for (int j = 0; j < x2.length && !existe; j++) {

                //si existe almacena la posicion del segundo array y pone el boolean a true
                if (x[i].equals(x2[j])) {

                    posicion = j;
                    existe = true;

                }

            }
            //la palabra ya existe en el segundo array y almacena en el tercero, en la misma posicion un numero mas
            if (existe) {

                x3[posicion] += 1;

            //si la palabra no se encuentra en el segundo array la almacena en la posicion del contador que seria el maximo de palabras distintas almacenadas en x2
            } else {

                x2[contador] = x[i];
                x3[contador] += 1;
                contador++;
            }

        }

        System.out.println("");
      /*  for (int i = 0; i < x.length; i++) {

            System.out.print(" " + x[i]);

        }

        System.out.println("");
        for (int i = 0; i < x2.length; i++) {

            System.out.print(" " + x2[i]);

        }
        System.out.println("");
        for (int i = 0; i < x3.length; i++) {

            System.out.print(" " + x3[i]);

        }*/
        
        for (int i = 0; i < contador; i++) {
            
            System.out.println("La palabra " + x2[i] + " aparece " + x3[i] + " veces" );
            
        }

    }
}
