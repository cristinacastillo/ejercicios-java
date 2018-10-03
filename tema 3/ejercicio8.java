import java.util.Scanner;
public class ejercicio8{
  public static void main(String[]args){
    

    double horas;
    double salario;
    
    Scanner total = new Scanner(System.in);
    
    System.out.println("\nIntroduce las horas trabajadas esta semana: ");
    horas=Double.parseDouble(total.nextLine());
    
    salario = horas * 12;
    
    System.out.printf("\nEl salario semanal de esta semana es de "+salario+" €");
    
  }
}
