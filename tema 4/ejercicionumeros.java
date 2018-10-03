import java.util.Scanner;
public class ejercicionumeros{
  public static void main(String[]args){
  
  double num1;
  double num2;
  
  Scanner s= new Scanner(System.in);

  System.out.println("Introduce un numero");
  num1=Double.parseDouble(s.nextLine());
  
  System.out.println("Introduce otro numero");
  num2=Double.parseDouble(s.nextLine());  
  
  if(num1 == num2){
    System.out.printf("\n%.2f es igual que %.2f",num1,num2);
  }
  else if(num1 < num2){
    System.out.printf("\n%.2f es mayor que %.2f",num2,num1);
  }
  else{
    System.out.printf("\n%.2f es mayor que %.2f",num1,num2);
  }
  
 }

}
