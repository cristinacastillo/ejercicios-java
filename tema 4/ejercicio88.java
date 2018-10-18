public class ejercicio8 {
    public static void main(String[] args) {
  
    int numIntroducido;
  
    int maxMulti = 0;

    int resultado;

    System.out.println("Introduce la tabla de multiplicación que deseas ver:");

    numIntroducido = Integer.parseInt(System.console().readLine());


    for (; maxMulti < 11; ){

      resultado = maxMulti * numIntroducido;

      System.out.println(numIntroducido + "*" + maxMulti + "=" + resultado );
    
      maxMulti ++;
    
    }
  }  
}