/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzo;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Cristina Castillo Obregón
 */
public class cco04 {

    public static void main(String[] args) {

        int num, tamano, posiciones;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el tamaño del vector: ");
        tamano = s.nextInt();

        int[] vector = new int[tamano];

        System.out.println("1. Rellernar con números aleatorios [201-301]\n"
                + "2. Entrada manual\n");

        num = s.nextInt();

        switch (num) {

            case 1:

                //rellenar array
                System.out.println("Vector original:");

                //rellenar array y mostrar
                mostrarArray(rellenaAleatorio(vector));

                break;

            case 2:

                System.out.println("Introduce " + tamano + " números: ");

                //recoger datos
                for (int i = 0; i < vector.length; i++) {

                    vector[i] = s.nextInt();
                }

                System.out.println("Vector original:");

                mostrarArray(vector);

                break;

        }

        System.out.println("\nPosiciones a desplazar a la izquierda: \n");
        posiciones = s.nextInt();

        System.out.println("Vector rotado a la izquierda " + (posiciones) + " veces \n");

        mostrarArray(rotaDchaArrayInt(vector, posiciones, tamano));

    }

    //muestra array
    public static void mostrarArray(int x[]) {

        for (int i = 0; i < x.length; i++) {

            System.out.print(x[i] + " ");
        }
    }

    //Según las posiciones que se quiera desplazar a la izquierda, emplea un algoritmo para saber cuantas habría que desplazarlo a la derecha
    public static int[] rotaDchaArrayInt(int x[], int posiciones, int tamano) {

        int algoritmo = (tamano - posiciones);

        for (int i = 0; i < algoritmo; i++) {

            int aux = x[x.length - 1];

            for (int j = x.length - 2; j >= 0; j--) {

                x[j + 1] = x[j];

            }
            x[0] = aux;
        }

        return x;

    }

    public static int[] rellenaAleatorio(int[] x) {

        for (int i = 0; i < x.length; i++) {

            x[i] = (int) (Math.random() * (301 - 201)) + 201;

        }

        return x;
    }

}
