import java.util.Scanner;
public class sentenciaifanidada{
  public static void main(String[]args){

   int num;
    
    Scanner s=new Scanner(System.in);
    
    System.out.println("\nLe voy a deicr si el numero introducido es par o impar\nIntroduce el numero: ");
    num=Integer.parseInt(s.nextLine());
    
    
    if(num == 0){
      
      System.out.println("El numero que has introducido es un 0");
    
    }else if((num%2)==0){
      
      System.out.printf("\nEl número %d es par",num);
      
    }else{
      
      System.out.printf("\nEl número %d es impar",num);
    

      
    }

  }
  
}

