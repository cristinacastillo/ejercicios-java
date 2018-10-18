public class ejercicio22Bis {
    public static void main(String[] args) {   
      
    boolean esPrimo;
      
    System.out.println("Numeros primos entre 2 y 100");
    
      System.out.print("2-");
        
      for(int i=3; i<=100; i+=2){ //comprobar solo los impares
        
        esPrimo = true; 
        
      
        for(int j=3; (j<i)&& (esPrimo==true); j+=2){  // j<=(i/2) 
          
          if((i%j)==0){
            
            esPrimo=false;
          }
        }
        
        if(esPrimo){
          
          System.out.print(i+"-");
        }
        
        
      }
      
    
    }
    
  
}
