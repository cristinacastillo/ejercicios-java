import paquetes.funciones;

public class ejercicio15 {

  public static void main(String[] args) {

    for (int i = 0; i < 101; i++) {

      if (funciones.esPrimo(i)) {

        System.out.print(" " + i);
      }

    }

  }

}