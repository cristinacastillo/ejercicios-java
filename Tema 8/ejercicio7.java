import paquetes.funciones;

public class ejercicio7 {

  public static void main(String[] args) {

    System.out.println("Introduce un numero entero positivo : ");
    long x = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce la posicion : ");
    int n = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.digitoN(x,n));
  }

}