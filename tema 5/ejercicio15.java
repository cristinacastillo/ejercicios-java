
public class ejercicio15 {
    public static void main(String[] args) {    
    
    int base;
    int exponente;
    int contador = 0;
    
    System.out.println("Introduce la base");
    base=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el exponente");
    exponente=Integer.parseInt(System.console().readLine());
    
    
    for(int i=1; i<=exponente; i++){
      
      contador++;
      
      System.out.println(base+" ^ "+contador);
      
    }
    
  }
  
}
