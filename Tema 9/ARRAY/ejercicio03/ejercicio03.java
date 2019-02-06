/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio03 {

    public static void main(String[] args) {

        
        Scanner s;
        s = new Scanner(System.in);

        Disco discos[] = new Disco[10];
        
        int num = 0;

        for (int i = 0; i < 10; i++) {

            discos[i] = new Disco();

        }

        do {
            System.out.println("DISCOS\n"
                    + "=========\n"
                    + "1. Crear disco\n"
                    + "2. Borrar disco\n"
                    + "3. Ver disco\n"
                    + "4. Ver coleccion de discos\n"
                    + "5. Salir\n"
                    + "Elige una opción (1-5):");
            
            num = Integer.parseInt(s.nextLine());
            
            switch (num) {

                case 1:

                    System.out.println("Introduce numero de disco que quieres crear");
                    int op = Integer.parseInt(s.nextLine());

                    /*System.out.println(" ");
                    String x = s.nextLine();*/
                    
                    System.out.println("Autor ");
                    String autor = s.nextLine();

                    System.out.println("Titulo ");
                    String titulo = s.nextLine();

                    System.out.println("Genero ");
                    String genero = s.nextLine();

                    System.out.println("Duracion ");
                    int duracion = Integer.parseInt(s.nextLine());

                    discos[op] = new Disco(autor, titulo, genero, duracion);

                    break;

                case 2:
                    
                    System.out.println("Que disco quieres borrar");
                    op = Integer.parseInt(s.nextLine());
                    discos[op] = new Disco();

                    break;

                case 3:

                    System.out.println("Que disco quieres ver");
                    op = Integer.parseInt(s.nextLine());
                    System.out.println(discos[op]);
                    break;

                case 4:

                    for (int i = 0; i < 10; i++) {

                        System.out.println(discos[i]);

                    }
                    break;

            }

        } while (num != 5);
    }

}
