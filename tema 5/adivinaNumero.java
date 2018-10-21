public class adivinaNumero {
    public static void main(String[] args) {    
      

    int numeroSecreto = 31;
    int intento;
    
    do{
      
      System.out.println("Introduce el número secreto");
      intento=Integer.parseInt(System.console().readLine());
      
      if(intento<numeroSecreto){
        
        System.out.println("El numero secreto es mayor");
      }
      else if(intento>numeroSecreto){
      
        System.out.println("El numero secreto es menor");
      }
    }while(intento!=numeroSecreto);
    
    System.out.println("Has adivinado el numero secreto");
    
  }
}    
