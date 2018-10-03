import java.util.Scanner;
public class sentenciaswitch{
  public static void main(String[]args){
  
  //Es mas eficiente hacerlo con un switch-case
    String dia;
    
    System.out.println("\nIntroduce el dia de la semana en mayúscula: ");
    dia=(System.console().readLine());


    if (dia.equals("LUNES")){
      System.out.println("SISTEMAS INFORMÁTICOS");
    }
    else if(dia.equals("MARTES")){
      System.out.println("PROGRAMACIÓN");
    }
    else if(dia.equals("MIERCOLES")){
      System.out.println("PROGRAMACIÓN");
    }
    else if(dia.equals("JUEVES")){
      System.out.println("ENTORNOS DE DESARROLLO");
    }
    else if(dia.equals("VIERNES")){
      System.out.println("SISTEMAS INFORMÁTICOS");
    }
    else{
      System.out.println("NO HAY CLASE");
    }
  }
}
