
import java.util.Scanner;
public class ejercicio1{
  public static void main(String[]args){

  int num1;
  int num2;
  int mult;
  
  Scanner escanerEntrada = new Scanner(System.in);  
  
  System.out.println("\nIntroduce el primer numero: ");
  num1=Integer.parseInt(escanerEntrada.nextLine());
  
  System.out.println("Introduce el regundo numero: ");
  num2=Integer.parseInt(escanerEntrada.nextLine());
  
  mult = num1*num2;
    
  System.out.printf("\n %d x %d = %d", num1,num2,mult);
  
}
}
