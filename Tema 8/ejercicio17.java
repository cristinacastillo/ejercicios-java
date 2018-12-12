import paquetes.funciones;

public class ejercicio17 {

  public static void main(String[] args) {

    long decimal = 0;

    System.out.print("Introduzca un numero binario: ");

    long binario = Long.parseLong(System.console().readLine());

    long bits = funciones.digitos(binario);

    for (int i = 0; i < bits; i++) {

      decimal += funciones.digitoN(binario, bits - i - 1) * funciones.numPotencia(2, i);

    }

    System.out.println(binario + " en binario es " + decimal + " en decimal.");

  }
}
