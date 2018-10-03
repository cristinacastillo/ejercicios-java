import java.util.Scanner;
public class ejercicio5{
  public static void main(String[]args){
    
    double base;
    double altura;
    double resultado;
    
    
    Scanner area = new Scanner(System.in);
    
    System.out.print("\nPara calcular el area del rectángulo introduce la base: ");
    base=Double.parseDouble(area.nextLine());
    
    
    System.out.print("\nIntroduce la altura: ");
    altura=Double.parseDouble(area.nextLine());
    
    resultado=base*altura;
    
    System.out.printf("\nEl area es: "+base+ " x " +altura+ " = "+resultado+" cm cuadrados");
    
    
    
}
}
