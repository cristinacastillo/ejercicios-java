public class ejercicio9 {
    public static void main(String[] args) {


    int numIntroducido; 
    int contador = 1;
    
    System.out.println("Introduce un número");
    numIntroducido=Integer.parseInt(System.console().readLine());
    
    
    while(numIntroducido > 10){
      
      numIntroducido/=10;
      
      contador ++;
    
  }
  
  System.out.println("El numero tiene "+contador+" dígitos");
    
  
  }
}
