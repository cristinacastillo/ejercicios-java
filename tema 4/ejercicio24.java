import java.lang.*;
import java.util.Scanner;
public class ejercicio24{
  public static void main(String[]args){
  
  //322
  
    int opcion;
    int dias;
    int estado;
    double sueldobase = 0;
    double sueldodietas;
    double sueldobruto ;
    double irpf = 0;
    double cuantiairpf;
    
    Scanner s = new Scanner(System.in);
     
    System.out.println("1. Programador junior");
    System.out.println("2. Programador senior");
    System.out.println("3. Jefe de proyecto");
    System.out.println("Introduzca el cargo del empleado: ");
    opcion=Integer.parseInt(s.nextLine());
    
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes? ");
    dias=Integer.parseInt(s.nextLine());
    
    System.out.println("Introduzca su estado civil: 1- Soltero 2-Casado ");
    estado=Integer.parseInt(s.nextLine());
    
    switch(opcion){
      case 1:
        sueldobase = 950;
      break;
      
      case 2:
        sueldobase = 1200;
      break;
      
      case 3:
        sueldobase = 1600;
      break;
      
      default:
        System.out.println("No ha elegido ninguna opción correcta"); //sueldobase=0;
        
      }
      
      sueldodietas = dias *30;
      sueldobruto = (sueldodietas + sueldobase);
      
      
    if (estado == 1){
      irpf = 25;
    }
    else if (estado == 2){
      irpf = 20;
    } 
    else{
      System.out.println("No ha elegido correctamente el estado civil");
    }
    
    cuantiairpf = (sueldobruto * irpf)/100 ;
    
    
    System.out.printf("#####################################\n");
    System.out.printf("# Sueldo base                %7.2f#\n",sueldobase);
    System.out.printf("# Dietas (%2d viajes)         %7.2f#\n",dias,sueldodietas );
    System.out.printf("#####################################\n");
    System.out.printf("# Sueldo bruto               %7.2f#\n",sueldobruto);
    System.out.printf("# Retencion IRPF (%.0f%%)       %7.2f#\n",irpf,cuantiairpf);
    System.out.printf("#####################################\n");
    System.out.printf("# Sueldo neto                %7.2f#\n",sueldobruto-cuantiairpf);
    System.out.println("#####################################\n");
    
  }
}
    
    
