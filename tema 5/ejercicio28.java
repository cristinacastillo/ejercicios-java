public class ejercicio28 {
  public static void main(String[] args) { 


    int numero;
    int contador = 0;
    int acumulador = 1;

    System.out.print("Introduce un numero para calcular el factorial: ");
    numero = Integer.parseInt(System.console().readLine());
    
    
    for(int i=2; i<=numero; i++){
      
      acumulador = acumulador * i;
      
    }
    
    System.out.println(acumulador);
    
  }
  
}
