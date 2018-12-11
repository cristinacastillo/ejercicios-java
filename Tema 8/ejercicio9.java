import paquetes.funciones;

public class ejercicio9 {

  public static void main(String[] args) {

    System.out.println("Introduce un numero entero positivo : ");
    long x = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce cuantos numeros quieres quitar : ");
    int n = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.quitaPorDetras(x,n));
  }

}   
