public class ejercicio26 {
    public static void main(String[] args) { 
    
    int numeroIntroducido;
    int numero;
    int digito;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    
    System.out.print("Introduce un numero: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce un digito: ");
    digito = Integer.parseInt(System.console().readLine());
    
    
    
    numero=numeroIntroducido;
    
    
    
    while(numero>0){
    
    volteado = (volteado*10) + (numero%10);
    
    numero/=10;
    
    longitud ++;
    
    }
    
    
    while(volteado > 0){
      
      if((volteado%10)==digito){
        
        System.out.print(posicion + " ");
        
      }
      
      volteado/=10;
      posicion++;
      
    }
    
    System.out.println();
    
  }
  
}
      
