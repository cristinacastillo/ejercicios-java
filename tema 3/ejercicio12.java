import java.util.Scanner;
public class ejercicio12{
  public static void main(String[]args){
    
    double nota1;
    double nota2;
    double notafinal;
    
    Scanner notas=new Scanner(System.in);
    
    System.out.println("Introduce la nota del primer examen: ");
    nota1=Double.parseDouble(notas.nextLine());
    
    
    System.out.println("Nota que quieres sacar en el trimestre: ");
    notafinal=Double.parseDouble(notas.nextLine());
    
    nota2= ((notafinal*100)-(nota1*40))/60;

    System.out.println("Para poder poder tener un "+notafinal+" necesitas sacar un "+nota2);
    
  }
}
