/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzo;

import java.util.Scanner;

/**
 *
 * @author Cristina Castillo Obregón
 */
public class cco02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int suma = 0;
        int valores = 0;
        int media;

        //recoger datos
        System.out.println("Introduce el numero de filas de la matriz: ");
        int filas = s.nextInt();

        System.out.println("Introduce el numero de columnas de la matriz: ");
        int columnas = s.nextInt();

        System.out.println("Introduce el mínimo valor: ");
        int min = s.nextInt();

        System.out.println("Introduce el máximo valor: ");
        int max = s.nextInt();

        int[][] matriz = new int[filas][columnas];

        int[][] matriz2 = new int[filas][columnas];

        //generar matriz
        generaArrayBiInt(matriz, filas, columnas, max, min);

        //A. Mostrar matriz
        System.out.println("\n A.");
        mostrarArrayBi(matriz, filas, columnas);

        //B. Max y min por filas
        System.out.println("\n B.");

        for (int i = 0; i < filas; i++) {

            System.out.println("Maximo de la fila " + i + ": " + maximoFilaArrayBi(matriz, columnas, i));

        }

        System.out.println("\n");

        for (int i = 0; i < filas; i++) {

            System.out.println("Mínimo de la fila " + i + ": " + minimoFilaArrayBi(matriz, columnas, i));

        }

        //C. Max y min por columnas
        System.out.println("\n C.");

        for (int i = 0; i < columnas; i++) {

            System.out.println("Maximo de la columna " + i + ": " + maximoColArrayBi(matriz, filas, i));

        }

        System.out.println("\n");

        for (int i = 0; i < columnas; i++) {

            System.out.println("Mínimo de la columna " + i + ": " + minimoColArrayBi(matriz, filas, i));

        }

        //D. Max y min de matriz
        System.out.println("\n D.");

        System.out.println("El máximo en la matriz es: " + maximoArrayBi(matriz, filas, columnas));
        System.out.println("El mínimo en la matriz es: " + minimoArrayBi(matriz, filas, columnas));

        //E.
        System.out.println("\n D.");

        

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                valores++;

                suma = suma + matriz[i][j];
            }

        }
        media = suma / valores;
        System.out.println("Suma: " + suma + " valores: " + valores + " media: " + media);

        matrizMenosMedia(matriz, matriz2, filas, columnas, media);

        mostrarArrayBi(matriz2, filas, columnas);

    }

    public static int[][] mostrarArrayBi(int x[][], int f, int c) {

        for (int i = 0; i < f; i++) {

            for (int j = 0; j < c; j++) {

                System.out.print(x[i][j] + "  ");
            }
            System.out.println("");
        }

        return x;

    }

    public static int[][] generaArrayBiInt(int[][] x, int f, int c, int max, int min) {

        int range = (max - min) + 1;

        for (int i = 0; i < f; i++) {

            for (int j = 0; j < c; j++) {

                x[i][j] = (int) (Math.random() * range) + min;

            }
        }

        return x;

    }

    public static int maximoFilaArrayBi(int x[][], int columnas, int i) {

        int numMaxFil = x[i][0];

        for (int j = 0; j < columnas; j++) {

            if (numMaxFil < x[i][j]) {

                numMaxFil = x[i][j];
            }

        }

        return numMaxFil;
    }

    public static int minimoFilaArrayBi(int x[][], int columnas, int i) {

        int numMinFil = x[i][0];

        for (int j = 0; j < columnas; j++) {

            if (numMinFil > x[i][j]) {

                numMinFil = x[i][j];
            }

        }

        return numMinFil;
    }

    public static int maximoColArrayBi(int x[][], int filas, int i) {

        int numMaxCol = x[0][i];

        for (int j = 0; j < filas; j++) {

            if (numMaxCol < x[j][i]) {

                numMaxCol = x[j][i];
            }

        }

        return numMaxCol;
    }

    public static int minimoColArrayBi(int x[][], int filas, int i) {

        int numMinCol = x[0][i];

        for (int j = 0; j < filas; j++) {

            if (numMinCol > x[j][i]) {

                numMinCol = x[j][i];
            }

        }

        return numMinCol;
    }

    public static int maximoArrayBi(int x[][], int filas, int columnas) {

        int numMax = x[0][0];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (numMax < x[i][j]) {

                    numMax = x[i][j];
                }
            }

        }

        return numMax;
    }

    public static int minimoArrayBi(int x[][], int filas, int columnas) {

        int numMin = x[0][0];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (numMin > x[i][j]) {

                    numMin = x[i][j];
                }
            }

        }

        return numMin;
    }

    public static int[][] matrizMenosMedia(int[][] x, int[][] x2, int filas, int columnas, int media) {

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                x2[i][j] = x[i][j] - media;
            }

        }

        return x2;
    }
}
