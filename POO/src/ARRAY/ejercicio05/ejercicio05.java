/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY.ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crcs
 */
public class ejercicio05 {

    public static void main(String[] args) {

        Scanner s;
        s = new Scanner(System.in);

        ArrayList<Articulo> articulos = new ArrayList<>();

        int num = 0;
        int entradaMercancia = 0;

        do {
            System.out.println("1. Listado\n"
                    + "2. Alta\n"
                    + "3. Baja\n"
                    + "4. Modificación\n"
                    + "5. Entrada de mercancía\n"
                    + "6. Salida de mercancía\n"
                    + "7. Salir");

            num = Integer.parseInt(s.nextLine());

            switch (num) {

                case 1:
                    /*MOSTRAR ARRAY LIST*/

                    for (int i = 0; i < articulos.size(); i++) {

                        System.out.println(articulos.get(i));
                    }

                    break;

                case 2:

                    System.out.println("Codigo: ");
                    int codigo = Integer.parseInt(s.nextLine());

                    System.out.println("Descripcion: ");
                    String descripcion = s.nextLine();

                    System.out.println("Precio Compra: ");
                    double precioCompra = Double.parseDouble(s.nextLine());

                    System.out.println("Precio Venta: ");
                    double precioVenta = Double.parseDouble(s.nextLine());

                    System.out.println("Stock: ");
                    int stock = Integer.parseInt(s.nextLine());

                    articulos.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));

                    entradaMercancia += stock;

                    break;

                case 3:
                    
                    System.out.println("Codigo: ");
                    codigo = Integer.parseInt(s.nextLine());
                    
                    /*Articulo aux = null;*/
                    for (Articulo a: articulos) {
                        if(a.getCodigo() == codigo){
                            articulos.remove(a);/*aux = a*/
                            break;
                        }
                    }
                    
                    /*articulos.remove(aux);*/

                    break;
                  
                case 4:

                    
                    break;

                case 5:

                    break;

                case 6:

                    break;

            }

        } while (num != 7);

    }

}
