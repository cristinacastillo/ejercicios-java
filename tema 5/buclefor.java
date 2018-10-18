import java.util.Scanner;
public class buclefor{
  public static void main(String[]args){

  int voluntad;
  
  
  
  System.out.println("Dime cuantos numeros que escriba:  ");
  
  String s = System.console().readLine();
  
  voluntad = Integer.parseInt(s);
  
  for (int i=0; i<=voluntad; i+=2){
    
    System.out.println(i);
  }

  }
} 
