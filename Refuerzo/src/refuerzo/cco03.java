/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzo;

import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class cco03 {

    public static void main(String[] args) {

        int num, copia, unidades, num2;
        int resultado = 0;
        boolean finalizado = false;
        

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número para saber si es divisible entre 17 \n");
        num = s.nextInt();

        copia = num;

        do {

            unidades = copia % 10;

            num2 = copia / 10;

            if ((unidades * 5) < num2) {
                resultado = num2 - (unidades * 5);

                //System.out.println(resultado);

                copia = resultado;
                
            } else {

                finalizado = true;
            }

        } while (!finalizado);

        mensaje(resultado,num);
        
    }
    

   
    public static void mensaje(int resultado, int num){
        
        String mensaje = " no es divisible";
        
        switch (resultado) {

            case 0:
                mensaje = " es divisible";
                break;

            case 17:
                mensaje = " es divisible";
                break;

            case 34:
                mensaje = " es divisible";
                break;

            case 51:
                mensaje = " es divisible";
                break;

            case 68:
                mensaje = " es divisible";
                break;

            case 85:
                mensaje = " es divisible";
                break;
                
            
        }

        System.out.println("El número " + num + mensaje + " por 17");

        if (resultado < 17 && num<17) {

            System.out.println("No es divisible por 17");

        }
        
        
    }
}
