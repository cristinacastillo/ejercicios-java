import java.util.Scanner;
public class ejercicio3{
  public static void main(String[]args){
    //293
    //36
    
    int num;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el número de un día de la semana: ");
    num=Integer.parseInt(s.nextLine());
    
    switch(num){
      
      case 1: 
      System.out.println("LUNES");
      break;
      
      case 2:
      System.out.println("MARTES");
      break;
      
      case 3:
      System.out.println("MIÉRCOLES");
      break;
      
      case 4:
      System.out.println("JUEVES");
      break;
      
      case 5:
      System.out.println("VIERNES");
      break;
      
      case 6:
      System.out.println("SÁBADO");
      break;
      
      case 7:
      System.out.println("VIERNES");
      break;
                  
      default:
      System.out.println("NO EXISTE ESE DÍA DE LA SEMANA");
      
    }
    
  }
  
}
