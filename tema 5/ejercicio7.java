public class ejercicio7 {
  public static void main(String[] args) {
  

    int combinacion = 0;
    int contador = 0;

    for(int i=1234; ((combinacion != 1234)&&(contador<=3));){
      
      System.out.print("Introduzca la comninación (4 dígitos): ");
      combinacion = Integer.parseInt(System.console().readLine());
      
      
      if(combinacion!=1234){
        System.out.println("Lo siento, esta no es la combinación.");
      
        contador ++;
      }
    }
      
    if((contador<4)&&(combinacion==1234)){
    
      System.out.print("La caja fuerte se ha abierto correctamente");
    }
    else{
      System.out.println("Has agotado el numero de intentos");
    
    }

  }
  
}
