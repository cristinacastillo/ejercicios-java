import paquetes.funciones;

public class ejercicio3 {
  public static void main(String[] args) {

    int num = 0;

    System.out.println("Introduce un numero");
    num = Integer.parseInt(System.console().readLine());

    if(funciones.esPrimo(num)){

      System.out.println("El numero "+num+" es primo");

    }else{

      System.out.println("El numero "+num+" no es primo");

    }
    System.out.print("El siguiente primo es el ");
    System.out.println(funciones.siguientePrimo(num));
    
  }
}