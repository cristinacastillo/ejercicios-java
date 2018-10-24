public class ejercicio33 {
    public static void main(String[] args) {
    
      int altura;
      
      System.out.print("Altura de la U: ");
      altura = Integer.parseInt(System.console().readLine());
      
      
      for(int i=1; i<=altura-1; i++){
        
        System.out.print("*");
      
      
    
        for(int j=1; j<=altura/2+1; j++){
          
          System.out.print(" ");
        }
        
        
        System.out.println("*");
      }
      
        System.out.print(" ");
        
      for(int c=1; c<=altura/2+1; c++){
        
        System.out.print("*");
      }
      
        System.out.print("\n");
   }
  
}

