/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crcs
 */
public class RotaArray {

    public static void main(String[] args) {

        int[] x = new int[5];

        for (int i = 0; i < 5; i++) {

            x[i] = i + 1;
        }

        for (int i = 0; i < 5; i++) {

            System.out.print(" " + x[i]);
        }

        System.out.println("");

        //derecha
        int aux = x[x.length - 1];

        for (int i = x.length - 2; i >= 0; i--) {

            x[i + 1] = x[i];

        }
        x[0] = aux;

        for (int i = 0; i < 5; i++) {

            System.out.print(" " + x[i]);
        }

        //izquierda
        aux = x[0];

        for (int j = 1; j < x.length; j++) {

            x[j - 1] = x[j];

        }

        x[x.length - 1] = aux;
        
        
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {

            System.out.print(" " + x[i]);
        }
        
    }
}
