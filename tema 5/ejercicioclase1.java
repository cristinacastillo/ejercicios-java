public class ejercicioclase1 {
    public static void main(String[] args) {    
      


    int numeroAdivinado = 5;
    int resultado ;
    
    
    do{
      
      System.out.println("Introduce un número para adivinarlo");
      resultado=Integer.parseInt(System.console().readLine());
      
      if(numeroAdivinado<resultado){
        
        System.out.println("El número introducido es mayor que el número correcto");
        
      }
      
      if(numeroAdivinado>resultado){
        
        System.out.println("El número introducido es menor que el número correcto");
      
      }
      
      }while(resultado!=numeroAdivinado);

      
        
        System.out.println("Has acertado el número");
        
        
  }
       
}      
