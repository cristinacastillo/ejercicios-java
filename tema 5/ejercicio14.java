
public class ejercicio14 {
    public static void main(String[] args) {    
      
      
    int base;
    int exponente;
    double resultado = 1; 
     
    System.out.println("Introduce la base");
    base=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el exponente");
    exponente=Integer.parseInt(System.console().readLine());
    
    if(exponente == 0){
      
      resultado = 1;
    }
    
    if(exponente>0){ 
      
      for(int i = 0; i < exponente; i++){
      
        resultado*=base;
       
      }
    } 
    
    if(exponente<0){
      
      for(int i=0; i<-exponente; i++){
        resultado*=base;
    }
    
      resultado=1/resultado;
    }
    
    System.out.println(base+" ^ "+exponente+" =  "+resultado);
  }

}
