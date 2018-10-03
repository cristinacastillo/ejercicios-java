import java.util.Scanner;
public class ejrecicio13{
  public static void main(String[]args){
    //MAAAL
  
  double a;
  double b;
  double c;
  
    Scanner s=new Scanner (System.in);
    
    System.out.println("Para calcular el orden ascendente de los números (ninguno puede ser igual) , introduce el primero: \n");
    a=Double.parseDouble(s.nextLine());
    
    System.out.println("Introduce el segundo número: \n");
    b=Double.parseDouble(s.nextLine());    
    
    System.out.println("Introduce el tercer número: \n");
    c=Double.parseDouble(s.nextLine());
    
  
    if((a>b)&&(a>c)){
    }
     if(b>c){
  
      System.out.printf("El orden ascendete seria: %.2f > %.2f > %.2f", c, b, a);
    }
    
		else{
			System.out.printf("\n El orden ascente seria: %.2f > %.2f > %.2f", b, c, a);
		}

    if((b>a)&&(b>c)){
    }
      
		if(a>c){
			
			System.out.printf("\n El orden ascendete seria: %.2f > %.2f > %.2f", c, a, b);
		}
		else {
			System.out.printf("\n El orden ascente sería: %.2f > %.2f > %.2f", a ,c, b);
		}
    
    if((c>a)&&(c>b)){
    }
		if(a>b){
			
			System.out.printf("\n El orden ascendete seria: %.2f > %.2f > %.2f", b, a, c);
		}
		else{
			System.out.printf("\nEl orden ascente seria: %.2f > %.2f > %.2f", a, b, c);
      
		}
	}
}
