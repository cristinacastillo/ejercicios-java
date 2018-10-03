import java.util.Scanner;
public class ejercicio10{
  public static void main(String[]args){
    
    double mb;
    double kb;
    
    Scanner convertir=new Scanner(System.in);
    
    System.out.println("Introduce los MB que quieres convertir: ");
    mb=Double.parseDouble(convertir.nextLine());
    
    kb=mb*1024;
    
    System.out.printf("La cantidad introducida equivale a: "+kb+" KB");
    
  }
  
}
