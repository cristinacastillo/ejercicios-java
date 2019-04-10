
import java.util.ArrayList;
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
public class filtraSin7 {

    public static void main(String[] args) {

        ArrayList<Integer> usuario = new ArrayList<Integer>();
        ArrayList<Integer> sin7 = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int num = 0;

        do {

            num = s.nextInt();
            if (num != -1) {
                usuario.add(num);

            }

        } while (num != -1);

        for (Integer e : usuario) {

            System.out.print(" " + e);

        }

        for (int i = 0; i < usuario.size(); i++) {

            boolean siete = false;

            int copia = usuario.get(i);

            while (copia > 0 && !siete) {

                if (copia % 10 == 7) {

                    siete = true;
                }

                copia = copia / 10;

            }

            if (!siete) {

                sin7.add(usuario.get(i));
            }
        }
        
        
        System.out.println("\nSin 7");
        
        for (Integer a : sin7) {
            
            System.out.print(" " + a);
            
        }
        System.out.println("");

    }
}
