/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio02 {

    public static void main(String[] args) {

        int num = 0;

        Scanner s = new Scanner(System.in);

        Coche croqueta = new Coche(250, 255, "Nissan", "croqueta");

        Bicicleta rayo = new Bicicleta(2, 250, "albondiga", "Continental");

        do {

            System.out.println("VEHÍCULOS\n"
                    + "=========\n"
                    + "1. Anda con la bicicleta\n"
                    + "2. Haz el caballito con la bicicleta\n"
                    + "3. Anda con el coche\n"
                    + "4. Quema rueda con el coche\n"
                    + "5. Ver kilometraje de la bicicleta\n"
                    + "6. Ver kilometraje del coche\n"
                    + "7. Ver kilometraje total\n"
                    + "8. Salir\n"
                    + "Elige una opción (1-8):");
            num = s.nextInt();
            switch (num) {
                case 1:
                    rayo.andaBici();
                    break;
                case 2:
                    rayo.caballlitoBici();
                    break;
                case 3:
                    croqueta.andaCoche();
                    break;
                case 4:
                    croqueta.quemaRuedaCoche();
                    break;
                case 5:
                    System.out.println(rayo.getKmRecorridos());
                    break;
                case 6:
                    System.out.println(croqueta.getKmRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.getKmTotales());
                    break;
                default:
                    break;
            }
    
       
        } while (num != 8);

    }

}
