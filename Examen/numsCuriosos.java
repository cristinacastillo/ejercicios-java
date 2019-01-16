public class numsCuriosos{

  public static long ultimoDigito(long numero){

    return (long)(numero%10);

  }

  public static long ultimoDigitoSinUnidades(long numero){

    return (long)(numero/10);

  }

  public static boolean esCurioso(long numero){

    boolean esCurioso = true;
    long cuadrado = numero*numero;

    while((numero > 0) && (esCurioso)){

      if(ultimoDigito(numero)!= ultimoDigito(cuadrado)){

        esCurioso = false;

      }

      numero = ultimoDigitoSinUnidades(numero);
      cuadrado = ultimoDigitoSinUnidades(cuadrado);

    }

    return esCurioso;

  }

  public static void main (String[] args) {

    long numero;

    do{

      System.out.println("Introduce hasta que numero quieres saber los numeros que son curiosos: ");
      numero = Long.parseLong(System.console().readLine());

    }while(numero < 2);

    System.out.println ("Numeros curiosos: ");

    for(int i = 2; i <= numero; i++){

      if(esCurioso(i)){

        System.out.print(i + " ");
      }
    }
  }

}