
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
public class digitos {

    public static void main(String[] args) {

        long num1;
        long num2;

        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, introduzca el primer número entero positivo:");
        num1 = Long.parseLong(s.nextLine());

        System.out.println("Por favor, introduzca el primer segundo entero positivo:");
        num2 = Long.parseLong(s.nextLine());

        /*long volteado = 0;*/
        long numero2 = num2;

        /*while (numero2 > 0) {

            volteado = (volteado * 10) + (numero2 % 10);

            numero2 /= 10;

        }
        
        System.out.println(volteado);*/
        int dig2 = 0;
        int dig1 = 0;
        int repite = 0;

        /* System.out.println(dig);*/
        while (numero2 > 0) {

            long numero1 = num1;

            dig2 = (int) (numero2 % 10);

            while (numero1 > 0) {

                dig1 = (int) (numero1 % 10);

                if (dig1 == dig2) {

                    repite += 1;
                }
                numero1 = numero1 / 10;
            }

            numero2 = numero2 / 10;
        }
        
        System.out.println("Hay " + repite + " numeros que se repiten en el primer numero");
    }

}
