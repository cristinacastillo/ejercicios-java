import paquetes.funciones;

public class ejercicio31 {

  public static void main(String[] args) {


    System.out.println("Introduce el numero de filas del array: ");
    int f = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el numero de columnas: ");
    int c = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el minimo: ");
    int min = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el maximo: ");
    int max = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce que fila quieres sacar: ");
    int filades = Integer.parseInt(System.console().readLine());

    int array[][] = funciones.generaArrayBiInt(f, c, max, min);
    funciones.mostrarArrayBi(array, f, c);

    funciones.filaDeArrayBiInt(array, f, c, filades);
  }


}