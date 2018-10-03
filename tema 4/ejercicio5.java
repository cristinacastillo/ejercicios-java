import java.util.Scanner;
public class ejercicio5{
  public static void main(String[]args){
    //37
    
    double a;
    double b;

    
    Scanner s=new Scanner(System.in);
    
    System.out.println("Este programa resuelve ecuaciones tipo: ax + b = 0.\n");
    
    System.out.println("Introduce el valor de a: \n");
    a=Double.parseDouble(s.nextLine());
    
    System.out.println("Introduce el valor de b: \n");
    b=Double.parseDouble(s.nextLine());
    

    
    if (a == 0){
      System.out.println("La ecuación no tiene solución real\n");
    
    }else{

    System.out.printf("El resultado es: x = "+(-b/a));
    
    } 
    
  }
  
}
