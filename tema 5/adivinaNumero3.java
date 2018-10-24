public class adivinaNumero3 {
    public static void main(String[] args) {   

    
    int numeroSecreto = 31;
    
    int valorInferior = 0;
    int valorSuperior = 100;
    
    int intento;
    
    do{
      
      System.out.println("Dime un número superior a: "+valorInferior+" e inferior a: "+valorSuperior);
      intento=Integer.parseInt(System.console().readLine());
      
      if(numeroSecreto < intento){
        
        if(valorSuperior > intento){
          
          valorSuperior = intento;
        }
        
        System.out.println("El numero secreto es menor.");
        
      }
      
      if(numeroSecreto > intento){
        
        if(valorInferior < intento){
          
          valorInferior = intento;
        }
        
        System.out.println("El numero secreto es mayor.");
      }
      
    }while(intento!=numeroSecreto);
    
      System.out.println("Numero secreto adivinado");
      
  }
  
}
