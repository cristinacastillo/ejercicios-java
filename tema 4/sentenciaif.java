import java.util.Scanner;
public class sentenciaif{
  public static void main(String[]args){

    int num;
    
    Scanner s=new Scanner(System.in);
    
    System.out.println("\nLe voy a deicr si el numero introducido es par o impar\nIntroduce el numero: ");
    num=Integer.parseInt(s.nextLine());
    
    if((num % 2) == 0){
      
      System.out.printf("\nEl número %d es par",num);
      
    }else{
      
      System.out.printf("\nEl número %d es impar",num);
    
    }

  }
    
}
