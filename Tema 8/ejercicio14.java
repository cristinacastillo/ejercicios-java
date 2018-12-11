import paquetes.funciones;

public class ejercicio14 {

  public static void main(String[] args) {

    System.out.println("Introduce un numero: ");
    int n = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce otro: ");
    int i = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.juntaNumeros(n, i));
  }

}