
public class ejercicio16 {
    public static void main(String[] args) {    
    
    
    int num;
    int resultado;
    
    boolean primo = true;
    
    System.out.println("Introduce un numero, para saber si es primo o no");
    num=Integer.parseInt(System.console().readLine());

    for (int i=2;i<3;i++){
      
      
      resultado=num%i;
        
        
        if(resultado==0){
              primo = false;
                
        System.out.println("El numero no es primo");      
          
        }else{
            
        System.out.println("El numero es primo");   
            
        }
        
      } 
              
    }
    
}

