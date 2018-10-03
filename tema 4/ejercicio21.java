import java.lang.*;
import java.util.Scanner;
public class ejercicio21{
  public static void main(String[]args){
  
  double nota1;
  double nota2;
  double notamedia;
  int cristina;
  
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Introduce la primera nota: ");
  nota1=Double.parseDouble(s.nextLine());
  
  System.out.println("Introduce la segunda nota: ");
  nota2=Double.parseDouble(s.nextLine());
  
  notamedia= (nota1+nota2)/2;
  
  if(notamedia >= 5){
    System.out.printf("Tu nota de programación es = %.2f\n",notamedia);
  }
  else if(notamedia < 5){
    System.out.println("Introduce el resultado de la recuperación:  1.APTO  2.NO APTO");
    cristina=Integer.parseInt(s.nextLine());
    
    if(cristina == 1){
      System.out.println("Tu nota de programación es un 5");
    }
    else if(cristina == 2){
      System.out.println("Tu nota de programación es: %.2f \n");
    }
    else{
      System.out.println("Es erróneo");
      
      }
    }
  }
}
    
