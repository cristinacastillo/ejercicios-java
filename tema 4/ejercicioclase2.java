import java.util.Scanner;
public class ejercicioclase2{
  public static void main(String[]args){
    
    int dia;
    int mes;
    int año;
    
    Scanner s =new Scanner (System.in);
  
  System.out.println("Introduce el dia");
  dia=Integer.parseInt(s.nextLine());
  
  System.out.println("Introduce el mes");
  mes=Integer.parseInt(s.nextLine());
  
  System.out.println("Introduce el año");
  año=Integer.parseInt(s.nextLine());
  
    if( (mes=2)&&(dia=29) ){
      System.out.println("El año es bisiesto");
    }
    
    if( dia
