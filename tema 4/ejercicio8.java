import java.util.Scanner;
public class ejercicio8{
  public static void main(String[]args){

    double nota1;
    double nota2;
    double nota3;
    double media;
    
    
    Scanner s=new Scanner (System.in);
    
    System.out.println("Para calcular la media de tus notas, introduce la primera: \n");
    nota1=Double.parseDouble(s.nextLine());
    
    System.out.println("Introduce la segunda nota: \n");
    nota2=Double.parseDouble(s.nextLine());    
    
    System.out.println("Introduce la tercera nota: \n");
    nota3=Double.parseDouble(s.nextLine());
    
  media= (nota1+nota2+nota3)/3;
  
  if (media<5){
    System.out.printf("Tu media es: %.2f => INSUFICIENTE",media);
  }
  else if(media == 5){
    System.out.printf("Tu media es: %.2f => SUFICIENTE",media);
  }
  else if((media >=5) && (media <6)){
    System.out.printf("Tu media es: %.2f => BIEN",media);
  }
  else if((media >=7) && (media <8)){
    System.out.printf("Tu media es: %.2f => NOTABLE",media);
  }
  else{
    System.out.printf("Tu media es: %.2f4 => SOBRESALIENTE",media);
    
    }
  }
}
