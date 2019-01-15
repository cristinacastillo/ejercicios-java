import paquetes.funciones;

public class ejercicio28 {
  
  public static void main(String[] args) {

    System.out.println("Introduce el tamano del array: ");
    int tam = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el minimo: ");
    int min = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el maximo: ");
    int max = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce cuantas posiciones se rota a la derecha: ");
    int posiciones = Integer.parseInt(System.console().readLine());

    

    int array[] = funciones.generaArrayInt(tam, min, max);
    funciones.mostrarArray(array);

    System.out.println("");
    System.out.println("rotado: "+posiciones+"posiciones");
    funciones.mostrarArray(funciones.rotaDchaArrayInt(array,posiciones));

  }

}