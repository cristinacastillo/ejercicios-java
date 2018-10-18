import java.util.Scanner;
public class ejercicioclase3{
  public static void main(String[]args){

    int num;
    String numeroTexto="";
    
    System.out.println("Introduce un número del 0 al 99: ");
    String s =System.console().readLine();
    num=Integer.parseInt(s);
    
    switch(num){
      
        case 0:
        numeroTexto= "cero";
          
        break;
        
        case 11:
        numeroTexto = "once";
        
        break;
        
        case 12:
        numeroTexto = "doce";
        
        break;
        
        case 13:
        numeroTexto = "trece";
        
        break;
        
        case 14:
        numeroTexto = "catorce";
        
        break;
        
        case 15:
        numeroTexto = "quince";
        
        break;
        
        case 16:
        numeroTexto = "dieciseis";
        
        break;
        
        case 17:
        numeroTexto = "diecisiete";
        
        break;
        
        case 18:
        numeroTexto = "dieciocho";
        
        break;
        
        default:
          
          switch(num/10){

              case 1:
                numeroTexto="diez";
              
              break;
              
              
              case 2:
                numeroTexto="veinte";
              
              break;
              
              
              case 3:
                numeroTexto="treinta";
              
              break;
              
              
              case 4:
                numeroTexto="cuarenta";
              
              break;
              
              case 5:
                numeroTexto="cincuenta";
              
              break;
              
              
              case 7:
                numeroTexto="setenta";
              break;
              
              
              case 8:
                numeroTexto="ochenta";
                break;
                
              case 9:
                numeroTexto="noventa";
                
              break;
            }
            break;
            }
      
    if((num%19!=0)&&(num<10)){
      switch(num%10){
      
      
      case 1:
        numeroTexto= numeroTexto + "uno";
      
      break;
      
      
      case 2:
        numeroTexto= numeroTexto + "dos";
      
      break;
      
      
      case 3:
        numeroTexto=numeroTexto + "tres";
      
      break;
      
      
      case 4:
        numeroTexto=numeroTexto + "cuatro";
      
      break;
      
      case 5:
        numeroTexto=numeroTexto + "cinco";
      
      break;
      
      
      case 6:
        numeroTexto=numeroTexto + "seis";
      break;
      
      
      case 7:
        numeroTexto=numeroTexto + "siete";
        break;
        
      case 8:
        numeroTexto=numeroTexto + "ocho";
        break;
          
      case 9:
        numeroTexto=numeroTexto + "nueve";
        
      break;
      
      default:
      
      break;
      
    }
  }
   
  
    System.out.println("El numero es: "+numeroTexto);
    }
  
  }

  
  
  

      
      
      
      
      
      
      
      
      
      
      
      
