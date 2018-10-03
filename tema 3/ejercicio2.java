
import java.util.Scanner;
public class ejercicio2{
  public static void main(String[]args){
    
    double euros;
    int pesetas;
    
    
    Scanner convertir = new Scanner(System.in);
    
    System.out.println("Introduce la cantidad de euros: ");
    euros=Double.parseDouble(convertir.nextLine());
    
    pesetas = (int)(euros*166.386);
    
    System.out.print("\n"+euros+ "€ = "+pesetas+ " pesetas");
  }
}

  
