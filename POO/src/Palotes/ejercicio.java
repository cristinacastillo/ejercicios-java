/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palotes;

import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio {

    public static void main(String[] args) {

        int num;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Introduce un número entero positivo: ");
            num = Integer.parseInt(s.nextLine());
        } while (num < 1);
        System.out.print(num + " = ");
        
// Cuenta los números y calcula el reves
        int aux = num;
        int numDig = 0;
        int numReves = 0;
        while (aux > 0) {
            numReves = ((numReves * 10) + (aux % 10));
            aux /= 10;
            numDig++;
        }
        int cifra = 0;
        
// Separa las cifras y escribe los palitos
        for (int i = 0; i < numDig; i++) {
            cifra = numReves % 10;
            numReves /= 10;
            for (int j = 0; j < cifra; j++) {
                System.out.print("|");
            }
            if (i < numDig - 1) {
                System.out.print("-");
            }
        }

    }

}
