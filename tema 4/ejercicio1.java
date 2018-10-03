import java.util.Scanner;
public class ejercicio1{
  public static void main(String[]args){
    //293
    //36
    
    String dia;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el dia de la semana con la primera letra en mayúscula: ");
    dia=(System.console().readLine());
    
    switch(dia){
      
      case "Lunes": 
        System.out.println("Sistemas Informáticos");
      break;
      
      case "Martes":
        System.out.println("Programacion");
      break;
      
      case "Miercoles":
      System.out.println("Entornos de desarrollo");
      break;
      
      case "Jueves":
        System.out.println("Entornos de desarrollo");
      break;
      
      case "Viernes":
        System.out.println("Sistemas Informáticos");
      break;
      
      default:
        System.out.println("NO HAY CLASE");
      
    }
    
  }
  
}
      
