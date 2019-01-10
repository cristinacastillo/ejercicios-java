import paquetes.funciones;

public class ejercicio25 {
  
  public static void main(String[] args) {

    System.out.println("Introduce el tamano del array: ");
    int tam = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el minimo: ");
    int min = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el maximo: ");
    int max = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el que numero quieres saber si esta: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int array[] = funciones.generaArrayInt(tam, min, max);
    funciones.mostrarArray(array);

    System.out.println("El numero "+num+" esta en la posicon "+ funciones.posicionEnArrayInt(array, num));

  }

}