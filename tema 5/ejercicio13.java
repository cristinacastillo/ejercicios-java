public class ejercicio13 {
    public static void main(String[] args) {    
      
    int negativo = 0;
    int positivo = 0;
    
    System.out.println("Introduce números");
    
    for(int i = 0; i<10; i++){
      
      
      if(Integer.parseInt(System.console().readLine()) < 0){
        
        negativo++;
      }
      else{
        
       positivo++;
      }
      
    }
      
    System.out.println("Has introducido "+positivo+" números positivos y "+negativo+" números negativos");
    
  }
  
}
        
