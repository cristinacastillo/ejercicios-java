import java.util.Scanner;
public class ejercicio13{
  public static void main(String[]args){
    
    double base;
    
    
    Scanner factura = new Scanner(System.in);
    
    System.out.print("Para calcular la factura introduce la base imponible: ");
    base=Double.parseDouble(factura.nextLine());
    
    System.out.printf("Base con iva %8.2f\n",base);
    System.out.printf("IVA          %8.2f\n",base*0.173);
    System.out.printf("---------------------\n");
    System.out.printf("Total        %8.2f\n",(base-(base*0.173)));
  }
}

