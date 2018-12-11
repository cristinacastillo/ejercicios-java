import paquetes.funciones;

public class ejercicio13 {

  public static void main(String[] args) {

    System.out.println("Introduce un numero  : ");
    long x = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce otro: ");
    int n = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce otro: ");
    int i = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.trozoDeNumero(x, n, i));
  }

}