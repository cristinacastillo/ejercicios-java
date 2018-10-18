import java.util.Scanner;
public class ejercicio11{
  public static void main(String[]args){
    
    int hora;
    int minutos;
    int segundosTranscurridos;
    int segundosHastaMedianoche;
    
    Scanner s=new Scanner(System.in);
    
    System.out.println("Introduce primero la hora y luego introduce los minutos");
    System.out.println("Hora: ");
    hora=Integer.parseInt(s.nextLine());
    
    System.out.println("Minutos: ");
    minutos=Integer.parseInt(s.nextLine());
    
    segundosTranscurridos = (hora*3600) + (minutos*60);
    segundosHastaMedianoche = (24*3600) - segundosTranscurridos;
    
    System.out.printf("Has introducido %d horas %d minutos y quedan %d segundos.",hora,minutos,segundosHastaMedianoche);
    
  }
}
