
package paquetes;


//pg113  101
public class funciones {

  public static boolean esCapicua(long numeroIntroducido){
    
    long numero = numeroIntroducido;
    long volteado = 0;
    boolean capicua = false;

    while (numero > 0) {
      
      volteado = (volteado * 10) + (numero % 10);
      
      numero /= 10;
      
      }
      
      if (volteado == numeroIntroducido) {
        
        capicua =  true;

      }
    
    return capicua;
  }

  public static boolean esPrimo(int num){

    int resultado;
    boolean primo = true;

   for (int i=2;i<num;i++){
      
      resultado=num%i;
          
        if(resultado==0){

          primo = false;      
 
        }
        
    }
    
    return primo;
              
  } 

  
  public static boolean siguientePrimo(int num){

    int resultado;
    boolean primo = true;

   for (int i=2;i<num;i++){
      
      resultado=num%i;
          
        if(resultado==0){

          primo = false;      
 
        }
        
    }
    
    return primo;


}