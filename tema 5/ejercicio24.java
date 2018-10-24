public class ejercicio24 {
    public static void main(String[] args) {   
    
    int altura;
    
    System.out.println("Introduce la altura: ");
    altura=Integer.parseInt(System.console().readLine());
    
    int contadorEspacios = altura-1;
    int contador1 = 1;
    int contFilas = contador1;
    
      for(int i=1; i<=altura; i++){
        
        for(int j=1; j<=contadorEspacios; j++){
          
          System.out.print(" ");
        }
        
        for(int c=1; c<=contador1; c++){
          
          System.out.print(c%10);
        }
        
        for(int a=1; ((a<=contFilas)&&(i>=2)); a++){
          
          System.out.print(a%10);
        } 
        

      System.out.println("");
      contadorEspacios--;
      contador1++;
      contFilas++;
      }
      
    
    
    
    }
    
}
  
