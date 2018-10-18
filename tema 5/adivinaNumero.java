public class adivinaNumero {
    public static void main(String[] args) {    
      

    int numeroSecreto = 31;
    int intento;
    int valorSuperior;
    int valorInferior;
    boolean okvalorInferior = false;
    boolean okvalorSuperior = false;
    
    
    do{
      
      System.out.println("Introduce un numero");
      intento=Integer.parseInt(System.console().readLine());
      
      
      if(numeroSecreto<intento)
      
          if(okvalorSuperior==false){
            
            okvalorSuperior=true;
            valorSuperior=intento;
            
          }
          else if(valorSuperior>intento){
            
            valorSuperior=intento;
            
          }  
       System.out.println("El numero secreto es menor");
        
      }
      else if(numeroSecreto>intento){
        
         System.out.println("El numero secreto es mayor");
      
      }
      
      
    }while(intento!=numeroSecreto);
    
    System.out.println("Número secreto adivinado");
    
  }  
  
}    
