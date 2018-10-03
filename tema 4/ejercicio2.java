import java.util.Scanner;
public class ejercicio2{
  public static void main(String[]args){
    
    int hora;
    
    Scanner s= new Scanner(System.in);
    
    
    System.out.println("Introduce la hora: ");
    hora=Integer.parseInt(s.nextLine());
    
    if((hora>=6) && (hora<=12)){
      System.out.println("Buenos días");
    }
    else if((hora>=13) && (hora<=20)){
      System.out.println("Buenas tardes");
    }
    else if((hora>=21) && (hora<=24)){
      System.out.println("Buenas noches");
    }
    else{
      System.out.println("No es correcto");
    }
    
  }
  
}
  
  
