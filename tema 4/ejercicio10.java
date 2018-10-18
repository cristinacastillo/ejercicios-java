import java.util.Scanner;
public class ejercicio10{
  public static void main(String[]args){

    int dia;
    int mes;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Intrdocue el dia y el mes con número de tu cumpleaños: ");
    dia=s.nextInt();
    mes=s.nextInt();
    
    switch(mes){
      
      case 1:
        
        if(dia < 21){
          System.out.println("CAPRICORNIO");
        }else{
          System.out.println("ACUARIO");
        }        
      break;
      
      case 2:
      
        if(dia<=19){
          System.out.println("ACUARIO");
        }else{
          System.out.println("PISCIS");
        }
      break;
      
      case 3:
      
        if(dia<=20){
          System.out.println("PISCIS");
        }else{
          System.out.println("ARIES");
        }
      break;
      
      case 4:
      
        if(dia<=20){
          System.out.println("ARIES");
        }else{
          System.out.println("TAURO");
        }
      break;
      
      case 5:
        
        if(dia<=21){
          System.out.println("TAURO");
        }else{
          System.out.println("GÉMINIS");
        }
      break;
      
      case 6:
        
        if(dia<=21){
          System.out.println("GÉMINIS");
        }else{
          System.out.println("CÁNCER");
        }
      break;
      
      case 7:
      
        if(dia<=22){
          System.out.println("CÁNCER");
        }else{
          System.out.println("LEO");
        }
      break;
      
      case 8:
      
        if(dia<=22){
          System.out.println("LEO");
        }else{
          System.out.println("VIRGO");
        }
      break;
      
      case 9:
      
        if(dia<=9){
          System.out.println("VIRGO");
        }else{
          System.out.println("LIBRA");
        }
      break;
      
      case 10:
      
        if(dia<=22){
          System.out.println("LIBRA");
        }else{
          System.out.println("ESCORPIO");
        }
      break;
      
      case 11:
      
        if(dia<=22){
          System.out.println("ESCORPIO");
        }else{
          System.out.println("SAGITARIO");
        }
      break;
      
      case 12:
      
        if(dia<=21){
          System.out.println("SAGITARIO");
        }else{
          System.out.println("CAPRICORNIO");
        }
      break;
      
      default:
        System.out.println("Ese mes no existe");
      break;
      
    }
  }
}
      
      
  
      
      
      
