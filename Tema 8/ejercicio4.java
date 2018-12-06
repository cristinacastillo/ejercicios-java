import paquetes.funciones;

public class ejercicio4 {

  public static void main(String[] args) {    
      


  System.out.println("Introduce la base");
  int base=Integer.parseInt(System.console().readLine());
    
  System.out.println("Introduce el exponente");
  int exponente=Integer.parseInt(System.console().readLine());

  System.out.print(base+" ^ "+exponente+" =  ");
  System.out.println(funciones.numPotencia(base, exponente));  


    }

}


