import java.util.Scanner;
public class ejercicioclase{
  public static void main(String[]args){
    
  int hora;
  int min;
  int seg;
  
  Scanner s =new Scanner (System.in);
  
  System.out.println("Introduce la hora");
  hora=Integer.parseInt(s.nextLine());
  
  System.out.println("Introduce los minutos");
  min=Integer.parseInt(s.nextLine());
  
  System.out.println("Introduce los segundos");
  seg=Integer.parseInt(s.nextLine());

  
    if(seg<60){
    
    System.out.printf("La hora en el segundo siguiente sería: %d : %d : %d ",hora,min,seg+1);

    }
    else if(seg>60){
      System.out.println("La hora introducida no es correcta");
    }
    else{
      System.out.printf("La hora en el segundo siguiente sería: %d : %d : 01",hora,min);
    }
  
  }
}
