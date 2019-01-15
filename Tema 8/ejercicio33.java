import paquetes.funciones;

public class ejercicio33 {

  public static void main(String[] args) {


    System.out.println("Introduce el numero de filas del array: ");
    int f = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el numero de columnas: ");
    int c = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el minimo: ");
    int min = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el maximo: ");
    int max = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce de que numero quieres saber las coordenadas: ");
    int numdes = Integer.parseInt(System.console().readLine());

    int array[][] = funciones.generaArrayBiInt(f, c, max, min);
    funciones.mostrarArrayBi(array, f, c);

    funciones.coordenadasEnArrayBiInt(array, f, c, numdes);

  }
}