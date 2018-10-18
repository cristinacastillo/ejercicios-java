public class ejercicio11 {
    public static void main(String[] args) {


    int numIntroducido = 0;
    
    System.out.println("Introduce un número");
    numIntroducido=Integer.parseInt(System.console().readLine());
    
    for (int i = numIntroducido; i<numIntroducido+5; i++){
      
      System.out.println( i+ "  "+(i*i)+"  "+(i*i*i));
    }
    
  }
  
}
