import java.util.Scanner;
public class ejercicio19{
  public static void main(String[]args){
  
  int n;
  
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = s.nextInt();
    
    if((n<=-1)&&(n>-10)){
      
      System.out.println("El número tiene un digito y es negativo");
    }
    else if((n<=-10)&&(n>=-99)){
      
      System.out.println("El número tiene dos dígitos y es negativo");
    }
    else if((n<=-100)&&(n>=-999)){
      
      System.out.println("El número tiene tres dígitos y es negativo");
    }
    else if((n<=-1000)&&(n>=-9999)){
      
      System.out.println("El número tiene cuatro dígitos y es negativo");
    }
    else if((n<=-10000)&&(n>=-999999)){
      
      System.out.println("El número tiene cinco dígitos y es negativo");
    }
    
    if((n>=1)&&(n<10)){
      
      System.out.println("El número tiene un digito");
    }
    else if((n>=10)&&(n<=99)){
      
      System.out.println("El número tiene dos dígitos");
    }
    else if((n>=100)&&(n<=999)){
      
      System.out.println("El número tiene tres dígitos");
    }
    else if((n>=1000)&&(n<=9999)){
      
      System.out.println("El número tiene cuatro dígitos");
    }
    else if((n>=10000)&&(n<=999999)){
      
      System.out.println("El número tiene cinco dígitos");
    }
    

  }
}

    
      
