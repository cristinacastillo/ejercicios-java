import java.util.Scanner;
public class ejercicio4{
  public static void main(String[]args){
    
    
    double num1;
    double num2;
    double suma;
    double resta;
    double mult;
    double div;
    
    Scanner s= new Scanner(System.in);
    
    System.out.println("Introduce el primer numero: ");
    num1= Double.parseDouble(s.nextLine());
    
    System.out.println("Introduce el primer numero:" );
    num2= Double.parseDouble(s.nextLine());
    
    suma= num1 + num2;
    resta= num1 - num2;
    mult= num1 * num2;
    div= num1 / num2;    
    
    System.out.printf("\nSuma: %.2f + %.2f = %.2f ",num1,num2,suma);
    System.out.printf("\nResta: %.2f - %.2f = %.2f ",num1,num2,resta);    
    System.out.printf("\nMultiplicacion: %.2f * %.2f = %.2f ",num1,num2,mult);   
    System.out.printf("\nDivision: %.2f / %.2f = %.2f ",num1,num2,div);   
}
}
