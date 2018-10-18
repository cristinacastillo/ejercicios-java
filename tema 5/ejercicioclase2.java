public class ejercicioclase2 {
    public static void main(String[] args) {    
      


    int numeroAdivinado = 5;
    int resultado = 0;
    int numeroMenor =0;
    int numeroMayor = 0;
    int contador = 0;
    
    
    
    do{
      
      System.out.println("Introduce un número para adivinarlo");
      resultado=Integer.parseInt(System.console().readLine());
      
      if (resultado<numeroAdivinado){
        
            
        System.out.println("El numero es menor");
      
    
      if (contador==0){
        
        numeroMenor = resultado;
        
      }
      
      
      if(resultado<numeroMenor){
        
        numeroMenor =  resultado;
     
      }
        
        
        else if(resultado>numeroAdivinado){
          
          System.out.println("El numero introducido es mayor");
          
          if(contador==0){
            numeroMator=resultado;
           }
          
          
      }
      
      contador++;
        
       if(contador>1){
          System.out.println("El numero menor que se acerca", numeroMenor);
          System.out.println("El numero maoyor que se acerca", numeroMayor);
         
      }
      
      }while(resultado!=numeroAdivinado);

      
        
        System.out.println("Has acertado el número");
        
        
  }
       
}      
