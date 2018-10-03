import java.util.Scanner;
public class ejercicio6{
  public static void main(String[]args){
    
        
    double base;
    double altura;
    double resultado;
    
    
    Scanner area = new Scanner(System.in);
    
    System.out.print("\nPara calcular el area del triangulo introduce la base: ");
    base=Double.parseDouble(area.nextLine());
    
    
    System.out.print("\nIntroduce la altura: ");
    altura=Double.parseDouble(area.nextLine());
    
    resultado=(base*altura)/2;
    
    System.out.printf("\nEl area es: ("+base+ " x " +altura+ ")/2 = "+resultado+" cm cuadrados");
}
}
