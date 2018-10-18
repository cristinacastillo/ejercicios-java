public class ejercicio20c {
  public static void main(String[] args) {
  
  int altura = 0;
  String c;
  
  
    System.out.println("Introduce la altura de la piramide: ");
    altura=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter para pintar la piramide: ");
    c=System.console().readLine();
    
    
    int contEspacios=altura-1;
    int anchoPiramide=1;
    
    //pintar cada linea
    for (int i=1; i<=altura; i++){
      
      //pintar espacios en blanco de fuera
      for(int j=1; j<=contEspacios;j++){
        
        System.out.print(" ");
      }
      
      if(i==1){
        
        System.out.print(c);
      }
      else if(i==altura){
        
        //bucle para los simbolos de dentro
        
        for( int j=1; j<=anchoPiramide; j++){
          
          System.out.print(c);
        }
        
      }else{
        
        System.out.print(c);
      
      //bucle para espacios interiores
      for(int j =1; j<=anchoPiramide-2;j++){
        
        System.out.print(" ");
      
      }
      
      System.out.print(c);
   
      
      }
      System.out.println("");
      contEspacios--;
      anchoPiramide+=2;
    
    }
  
  }

}
        


   
