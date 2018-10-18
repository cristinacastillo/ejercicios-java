public class sumavarios2{
  public static void main(String[] args) {
  
  
    int acumulador = 0;
    int sumando;
    int contador = 0;

    do{
      System.out.print("Introduzca el sumando nº (0 para terminar): ");
      sumando = Integer.parseInt(System.console().readLine());
      
      if(sumando!=1){
      acumulador += sumando;
      contador++;
      }

    }while(sumando!=0);
    
   System.out.print("La suma de los "+(contador-1)+" números introducidos es: " + acumulador);
   
  }

}
  
