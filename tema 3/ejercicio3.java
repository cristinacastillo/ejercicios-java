//286
import java.util.Scanner;
public class ejercicio3{
  public static void main(String[]args){
    
        
    double euros;
    int pesetas;
    
    
    Scanner convertir = new Scanner(System.in);
    
    System.out.println("Introduce la cantidad de euros: ");
    pesetas=Integer.parseInt(convertir.nextLine());
    
    euros = pesetas/166.386;
    
    System.out.printf("\n%d pesetas = %.2f €",pesetas,euros);
  }
}

