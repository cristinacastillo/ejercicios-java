public class ejercicio19c {
  public static void main(String[] args) {
  
  int altura ;
  String c;
  
  
  //buble para las lineas y dentro:
  //bucle para los epacios en blanco
  //bucle para simbolos
  
  
    System.out.println("Introduce la altura de la piramide: ");
    altura=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter para pintar la piramide: ");
    c=System.console().readLine();
    
    int contEsp= altura - 1;//hay que ponerlo despues de insertar el dato de la altura porque si no la altura no estara inicialidada y dara error
    int contC = 1;
    
    //bucle para la lineas
    for(int i = 1; i<=altura; i++){
      
      //bucle para espacios en blanco
      
      for(int j=1; j<=contEsp; j++){
        
        System.out.print(" ");
      }
      
      //bucle para caracteres
      
      for(int j=1; j<=contC; j++){
        
        System.out.print(c);
        
      }
      
      System.out.println("");
      contEsp--;
      contC+=2;
    }
    
  }
  
}
    
      
