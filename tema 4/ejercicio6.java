import java.lang.*;
import java.util.Scanner;
public class ejercicio6{
  public static void main(String[]args){


    double h;
    double t;
    double g=9.81;
    
    Scanner s= new Scanner(System.in);
    
    System.out.println("Introduce la altura: ");
    h=Double.parseDouble(s.nextLine());
    
    t= Math.sqrt(2*h/g);
    
    System.out.printf("El tiempo que tarda en caer es de: %.2f ",t);
    
  }
}
    
    
