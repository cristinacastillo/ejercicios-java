public class ejercicio7i {
  public static void main(String[] args) {
  

    int combinacion = 1234;
    int maxIntentos = 5;
    int intento;
    int contador;
    boolean adivinado= false;
    
    do{
      System.out.println("Introduzca el numero secreto");
      intento=Integer.parseInt(System.console().readLine());
      
      //comprobamos si hemos adivinado el numero
      if(intento==combinacion){
          adivinado=true;
      }
      contador++;
      
    }while ((adivinado==false)&&(contador<maxIntentos));
    //salimos del bucle cuando no se cumpla la condicion, cuando se haya adivinado o cont=5
    
    
    if(adivinado){
      
      System.out.println("Numero secret adiviando");
     }
     else{
       
       System.out.println(""); 
      }

  }
  
}
