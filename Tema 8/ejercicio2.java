
import paquetes.funciones;

public class ejercicio2 {
  public static void main(String[] args) {

    long numeroIntroducido;

    System.out.println("Introduce un numero, para saber si es capicua o no");
    numeroIntroducido = Integer.parseInt(System.console().readLine());

    if (funciones.esCapicua(numeroIntroducido)) {

      System.out.println("El numero es capicua ");
    } else {

      System.out.println("El numero NO es capicua ");

    }

  }

}