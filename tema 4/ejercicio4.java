import java.util.Scanner;
public class ejercicio4{
  public static void main(String[]args){
    
    double horas;
    
    Scanner s= new Scanner(System.in);
    
    System.out.println("Introduce las horas trabajadas esta semana");
    horas=Double.parseDouble(s.nextLine());
    
    if(horas<=40){
      System.out.printf("Su sueldo es de %.2f x 12 = %.2f €", horas, horas*12);
    }
    else if(horas>=41){
      System.out.printf("Su sueldo es de %.2f x 16 = %.2f €",horas, horas*16);
    }
    
  }
  
}
