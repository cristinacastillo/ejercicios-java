import paquetes.funciones;

public class ejercicio12 {

  public static void main(String[] args) {

    System.out.println("Introduce un numero entero positivo : ");
    long x = Integer.parseInt(System.console().readLine());

    System.out.println("Añade un digito por delante: ");
    int n = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.pegaPorDelante(x,n));
  }

}   