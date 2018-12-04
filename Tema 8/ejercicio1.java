
import paquetes.funciones;

public class ejercicio1 {
  public static void main(String[] args) {    
    
    int num;
    
    System.out.println("Introduce un numero, para saber si es primo o no");
    num=Integer.parseInt(System.console().readLine());
    
    if(funciones.esPrimo(num)){

      System.out.println("El numero es primo ");
    }else{

      System.out.println("El numero NO es primo ");
    
    }
    
  }  

}

