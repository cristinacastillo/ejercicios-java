/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzo;

import java.util.Scanner;

/**
 *
 * @author Cirstina Castillo Obregón
 */
public class cco01 {

    public static void main(String[] args) {

        int op;

        Scanner s = new Scanner(System.in);

        int tamano;

        System.out.println("Introduce el tamaño del vector: ");
        tamano = s.nextInt();

        int[] vector = new int[tamano];
        int[] veces = new int[10];

        System.out.println("1. Rellernar con números aleatorios min[100-200] max[201-301] \n"
                + "2. Entrada manual\n");

        op = s.nextInt();

        switch (op) {

            case 1:

                //rellenar array
                rellenarAleatorio(vector);

                break;

            case 2:

                System.out.println("Introduce " + tamano + " números: ");

                //recoger datos
                for (int i = 0; i < vector.length; i++) {

                    vector[i] = s.nextInt();
                }

                break;

        }

        System.out.println("Vector original:");

        mostrarArray(vector);

        System.out.println("\n");

        for (int i = 0; i < vector.length; i++) {

            int copia = vector[i];

            veces = AlmacenarVeces(veces, copia);

            //Mostrar array "Veces"
            System.out.println(vector[i]);
            MostrarNumeros(veces, vector);
            formatear(veces);
            System.out.println("");

        }

    }

    //muestra array
    public static void mostrarArray(int x[]) {

        for (int i = 0; i < x.length; i++) {

            System.out.print(x[i] + " ");
        }
    }

    //rellenar el vector con numeros aleatroios que sea un min[100-200] y max[201-301]
    public static int[] rellenarAleatorio(int[] x) {

        int min = (int) (Math.random() * (200 - 100)) + 100;
        int max = (int) (Math.random() * (301 - 201)) + 201;

        //System.out.println(min+ " "+ max);
        for (int i = 0; i < x.length; i++) {

            x[i] = (int) (Math.random() * (max - min)) + min;

        }

        return x;
    }

    //Pasamos el array para almacenar y el numero, devolvera el array relleno con el 
    //numero de veces que aparece cada numero. Esta función usa el indice del array
    //para saber en que numero tiene que añadir un +1 para el número que ha sido listado.
    public static int[] AlmacenarVeces(int[] x, int copia) {

        //Mientras que el número no sea 0
        while (copia > 0) {

            //Añadimos un 1 en el indice del número en la última posición listada.
            x[copia % 10] += 1;

            //Quitamos el ultimo número procesado.
            copia = copia / 10;
        }

        //Devolvemos el array relleno.
        return x;
    }

    public static void MostrarNumeros(int[] x, int[] vector) {

        //Recorremos el array del réves, para así ser descendente
        for (int i = x.length - 1; i >= 0; i--) {

            //Mostramos el indice + el número de veces que ha aparecido el número
            if (x[i] != 0) {
                System.out.println("El número " + i + " ha salido " + x[i] + " veces.");
            }
        }
    }

    public static int[] formatear(int[] x) {

        for (int i = 0; i < x.length; i++) {

            x[i] = 0;
        }

        return x;
    }

}
