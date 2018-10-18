import java.util.Scanner;
public class ejercicio17{
  public static void main(String[]args){
  
  int num;
   
  Scanner s =new Scanner(System.in);
  
  System.out.println("Introduce un número entero");
  num=s.nextInt();
  System.out.println("La última cifra del número introducido es el "+(num%10));
  }
}
