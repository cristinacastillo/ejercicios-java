public class ejercicio27 {
  public static void main(String[] args) { 


      int numero;
      int resultado;
      int acumulador = 0;
      
      System.out.print("Introduce un numero: ");
      numero = Integer.parseInt(System.console().readLine());
      
      for(int i=1; i<=numero; i++){
      
      resultado = 3*i;  
        
      acumulador+=resultado;
      
      System.out.println("3 x "+i+" = "+resultado);
      
      }
     
     System.out.println("La suma de los multiplos es: "+acumulador);
  }

}    
    
