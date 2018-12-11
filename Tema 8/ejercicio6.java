import paquetes.funciones;

public class ejercicio6 {

  public static void main(String[] args) {   

    System.out.println("Introduce un numero entero positivo para voltearlo: ");
    int num = Integer.parseInt(System.console().readLine());

    System.out.print(funciones.voltear(num));
    
  }

}