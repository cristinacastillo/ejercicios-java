public class sumavarios5{
  public static void main(String[] args) {
  
  
    int acumulador = 0;
    int sumando=1;


    for(;sumando!=0;){
      System.out.print("Introduzca el sumando nº (0 para terminar): ");
      sumando = Integer.parseInt(System.console().readLine());
      acumulador += sumando;
      }
      
    System.out.print("La suma de los números introducidos es: " + acumulador);
   
  }

}
  
