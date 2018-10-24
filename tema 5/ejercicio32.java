public class ejercicio32 {
    public static void main(String[] args) {

      System.out.print("Por favor, introduzca un número entero positivo: ");
      
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      long numero = numeroIntroducido;
      
      long volteado = 0;
      
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        //System.out.println(volteado);
        //System.out.println(numero);
      }

      long numero1 = volteado;

      long volteado1 = 0;

      long resultado;

      long acumulador = 0;

      System.out.print("Dígitos pares:");

      while (numero1 > 0) {
        volteado1 = (volteado1 * 10) + (numero1 % 10);
        numero1 /= 10;

        resultado = volteado1 % 2;

        if (resultado == 0){

          System.out.print(volteado1+" ");

          acumulador += volteado1;

        }

        //System.out.println(volteado1);
        //System.out.println(numero1);
        volteado1 = 0;
      }

      System.out.println("");
      System.out.println("Suma de los dígitos pares: "+acumulador);
  }  
}  