public class sumavarios{
  public static void main(String[] args) {
  
    int acumulador = 0;
    int sumando;
    int numSumandos;

      System.out.print("Introduzca el nº de números que quiere sumar: ");
      numSumandos = Integer.parseInt(System.console().readLine());

    for (int i=1; i<=numSumandos; i++) {
      System.out.print("Introduzca el sumando nº " + i +": ");
      sumando = Integer.parseInt(System.console().readLine());
      acumulador += sumando;

    }
   System.out.print("La suma de los " + numSumandos + "números introducidos es: " + acumulador);
   
  }

}
