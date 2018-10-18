import java.util.Scanner;
public class ejrecicio13{
  public static void main(String[]args){
    //MAAAL
  
  double a;
  double b;
  double c;
  double aux;
  
    Scanner s=new Scanner (System.in);
    
    System.out.println("Para calcular el orden ascendente de los números (ninguno puede ser igual) , introduce el primero: \n");
    a=Double.parseDouble(s.nextLine());
    
    System.out.println("Introduce el segundo número: \n");
    b=Double.parseDouble(s.nextLine());    
    
    System.out.println("Introduce el tercer número: \n");
    c=Double.parseDouble(s.nextLine());
    
  
    if(a>b){
      aux = a;
      a = b;
      b = aux;
    }
    else if(b>c){
      aux = b;
      b = c;
      c = aux;
    }
    if(a>b){
      aux = a;
      a = b;
      b = aux;
    }
    System.out.printf("Número menor %.2f , número intermedio %.2f , número mayor %.2f",a,b,c);
  }
}
    
    
      
      
      
