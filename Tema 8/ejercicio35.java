import paquetes.funciones;

public class ejercicio35 {

  public static void main(String[] args) {

    System.out.println("Introduce un numero");
    long n = Long.parseLong(System.console().readLine());

    System.out.print(funciones.convierteEnPalotes(n));

  }
}