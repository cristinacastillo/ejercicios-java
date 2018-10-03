
import java.util.Scanner;
public class restaNum{
  public static void main(String[]args){

    int num1;
    int num2;
    int resultado;
    
    Scanner escanerEntrada = new Scanner(System.in);
    
    

    System.out.println("\nIntroduzca el primer sumando: ");
    num1 = Integer.parseInt(escanerEntrada.nextLine());  
    
      
    System.out.println("\nIntroduzca el segundo sumando: ");
    num2 = Integer.parseInt(escanerEntrada.nextLine());
    

    System.out.printf("\nnum1 = %d ; num2 = %d\n",num1,num2);
    
      
    resultado = num1 - num2;
    
    
    System.out.printf("\n %d - %d = %d ",num1,num2,resultado);
    
  }
}
