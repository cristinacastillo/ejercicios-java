import java.util.Scanner;
public class ejercicio12{
  public static void main(String[]args){
    
    int r1;
    int r2;
    int r3;
    int total;
    
    
    Scanner s=new Scanner(System.in);
    
    System.out.println("¿De qué color es la pared de la clase?: ");
    System.out.println("1- Amarillo 2-Azul ");
    r1=s.nextInt();
    
    if(r1==1){
      
      r1=1;
      
    }else{
      
      r1=0;
    }
    
    System.out.println("¿Cuántas filas hay en la clase?: ");
    System.out.println("1- Dos filas 2- 5 filas ");
    r2=s.nextInt();
    
    if(r2==2){
      
      r2=1;
      
    }else{
      
      r2=0;
    }
    
    System.out.println("¿Cuántos proyectores hay en la clase?: ");
    System.out.println("1- Ocho 2- Uno ");
    r3=s.nextInt();
    
    if(r3==2){
      
      r3=1;
      
    }else{
      
      r3=0;
    }
    
    total = r1+r2+r3;
    
    System.out.println("El total de tus puntos es: "+total);
  }
}
