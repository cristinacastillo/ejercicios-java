import java.util.Scanner;
public class ejercicio7{
  public static void main(String[]args){
    
    double base;
    
    
    Scanner factura = new Scanner(System.in);
    
    System.out.print("\nPara calcular la factura introduce la base imponible: ");
    base=Double.parseDouble(factura.nextLine());
    
    System.out.printf("Base imponible %.2f\n",base);
    System.out.printf("IVA            %.2f\n",base*0.21);
    System.out.printf("--------------------\n");
    System.out.printf("Total          %.2f\n",base*1.21);
  }
}
