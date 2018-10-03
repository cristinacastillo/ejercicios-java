import java.lang.*;
import java.util.Scanner;
public class ejercicio9{
  public static void main(String[]args){
  
    /////MAAAAAAAL/////
    double a;
    double b;
    double c;
    double raiz;
    double discriminante;
    
    Scanner s=new Scanner (System.in);
    
    System.out.println("Introduce el valor de a: ");
    a=Double.parseDouble(s.nextLine());
    
    System.out.println("Introduce el valor de b: ");
    b=Double.parseDouble(s.nextLine());
    
    System.out.println("Introduce el valor de c: ");
    c=Double.parseDouble(s.nextLine());
    
    discriminante=((b*b)-(4*a*c));
    raiz= (Math.sqrt((b*b)-4*a*c));
    
    
    if((a==0)&&(b==0)&&(c==0)){
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }
    if((a!=0)&&(b!=0)&&(c!=0){
    if (discriminante < 0){
      System.out.println("La solución no tiene soluciones reales");
    }
    else{
      System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
      System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
    }
  }
    
  }
}
    
  
