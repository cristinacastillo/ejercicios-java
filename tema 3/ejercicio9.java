import java.util.Scanner;
public class ejercicio9{
  public static void main(String[]args){
    
  double radio;
  double altura;
  double volumen;
  
  Scanner total= new Scanner(System.in);
  
  System.out.println("\nPara calcular el volumen del triángulo introduce su radio: ");
  radio=Double.parseDouble(total.nextLine());
  
  System.out.println("\nIntroduce la altura: ");
  altura=Double.parseDouble(total.nextLine());
  
  volumen=(3.14*radio*radio*altura)/3;
  
  System.out.printf("El volumen del cono es de: "+volumen+" cm cúbicos");
  
}
}
