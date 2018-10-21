public class ejercicio20 {
    public static void main(String[] args) {   
    
    
    int altura = 0;
    String caracter;
  
  
    System.out.println("Introduce la altura de la piramide: ");
    altura=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter para pintar la piramide: ");
    caracter=System.console().readLine();
    
    int contadorEspacios = altura - 1;
    int anchoPiramide = 1;
    
    //bucle para dibujar cada linea de la piramide
    
    for(int i=1; i<=altura; i++){
      
      for(int j=1; j<=contadorEspacios;j++){
        
        System.out.print(" ");
      }
      
      if(i==1){
        
        System.out.print(caracter);
      }//buble para pintar ultima linea de caracteres
      else if(i==altura){
                
        for(int j=1; j<=anchoPiramide; j++){
          
            System.out.print(caracter);
            
            
        }
      }
      //pintar caracteres exteriores
      else{
        
        System.out.print(caracter);
        
        for(int j=1; j<=anchoPiramide-2;j++){
          
          System.out.print(" ");
        }
        
        System.out.print(caracter);
        
      }
      
      System.out.println("");
      contadorEspacios--;
      anchoPiramide+=2;
    }
  }
  
}
