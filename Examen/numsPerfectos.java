

public class numsPerfectos{

  public static boolean esDivisor(long numero, long candidato){

    boolean esDivisor = false;

    if((numero != candidato) && (numero % candidato == 0)){

      esDivisor = true;
      
    }

    return esDivisor;
  }

  public static long sumaDivisores(long numero){

    long divisores = 0;

    for(int i = 1; i <= numero; i++){

      if(esDivisor(numero, i)){

        divisores += i;
      }
    }

    return divisores;
  }

  public static boolean esPerfecto(long numero){

    boolean esPerfecto = false;

    if(sumaDivisores(numero) == numero){

      esPerfecto = true;
    }

    return esPerfecto;
  }

  public static void main (String[] args) {

    long numero;

    do{

      System.out.println("Introduce hasta que numero quieres saber los numeros que son perfectos: ");
      numero = Long.parseLong(System.console().readLine());

    }while(numero < 2);

    System.out.println ("Numeros perfectos: ");

    for(int i = 2; i <= numero; i++){

      if(esPerfecto(i)){

        System.out.print(i + " ");
      }
    }
  }

}