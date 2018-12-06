import paquetes.funciones;

public class ejercicio5 {

  public static void main(String[] args) {   

    System.out.println("Introduce un numero entero positivo para saber cuantos digitos tiene: ");
    int num = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.digitos(num));
    System.out.println(" digitos.");

  }

}