
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
public class RecorridoArrayBi {

    public static void main(String[] args) {

        int[][] vector = new int[5][5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                vector[i][j] = (int) (Math.random() * 100);
            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(" " + vector[i][j]);

            }
        }

        System.out.println(" ");

        int[] vector2 = new int[100];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                vector2[vector[i][j]] += 1;

            }
        }

        for (int i = 0; i < vector2.length; i++) {

            if (vector2[i] > 0 && vector2[i] < 2) {

                System.out.println("El numero " + i + "aparece " + vector2[i] + " vez");

            } else if (vector2[i] >= 2) {

                System.out.println("El numero " + i + " aparece " + vector2[i] + " veces");

            }
        }
    }
}
