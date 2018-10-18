
public class ejercicio12 {
    public static void main(String[] args) {    


    int n1 = 0;
    int n2 = 1;
    int numIntroducido;
    int aux;
    
    System.out.print("Introduce un número ");
    numIntroducido = Integer.parseInt(System.console().readLine());

    if((numIntroducido !=0)&&(numIntroducido!=1)){
    
    System.out.println("0");
    System.out.println("1");
    
      for (int i=3; i<=numIntroducido; i++){
      
       
        aux = n2;
        n2= n1 + n2;
        n1 = aux;

        System.out.println(n2);
       
      
      } 
    }
    
    else if(numIntroducido == 0){
    
      System.out.println("0");
    }
    
    else if(numIntroducido==1){
      
      System.out.println("0");
      System.out.println("1");
    }
    
  }
  
}
      
