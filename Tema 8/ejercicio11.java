import paquetes.funciones;

public class ejercicio11 {

  public static void main(String[] args) {

    System.out.println("Introduce un numero entero positivo : ");
    long x = Integer.parseInt(System.console().readLine());

    System.out.println("Añade un digito por detras: ");
    int n = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.pegaPorDetras(x,n));
  }

}   