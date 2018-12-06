
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

  
  public static int siguientePrimo(int numero){

    do{
      numero++;

    }while(funciones.esPrimo(numero) == false);

    return numero;

  }


  public static int numPotencia(int base, int exponente){

    
    int resultado = 1; 

    if(exponente == 0){
      
      resultado = 1;
    }
    
    if(exponente>0){ 
      
      for(int i = 1; i <= exponente; i++){
      
        resultado*=base;
       
      }
    } 
    
    if(exponente < 0){
      
      for(int i= 0 ; i<exponente; i++){

        resultado*=base;
    }
    
      resultado=1/resultado;
    }

    return resultado;

  }

  
  public static int digitos(int numero){

    int digitos = 0;

    while(numero>0){

      numero = numero/10;

      digitos++;

    }

    return digitos;

  }

  

}