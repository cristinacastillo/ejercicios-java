import java.lang.*;
import java.util.Scanner;
public class ejercicio14{
  public static void main(String[]args){
    //307
    //38
  
  int num;
  
  Scanner s= new Scanner(System.in);
  
  System.out.println("Introduce un número: ");
  num=Integer.parseInt(s.nextLine());
  
  if((num%2)==0){
    System.out.println("El número introducido es par. ");
  }
  
  else if((num%5)==0){
    System.out.println("El número es divisible entre 5");
  }
  else{
    System.out.println("El numero no es par ni divisible entre 5");
    
    }
  }
}  

    
    
  
