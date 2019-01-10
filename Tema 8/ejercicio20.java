import paquetes.funciones;

public class ejercicio20 {
  
  public static void main(String[] args) {


    System.out.println("Introduce el tamano del array: ");
    int tam = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el minimo: ");
    int min = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el maximo: ");
    int max = Integer.parseInt(System.console().readLine());

    funciones.mostrarArray(funciones.generaArrayInt(tam, min, max));

    System.out.println("El minimo es: " + funciones.minimoArrayInt(funciones.generaArrayInt(tam, min, max)));
    


  }

}
