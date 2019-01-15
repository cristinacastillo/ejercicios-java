package libreria;

public class numPerfectos {
  public static boolean divisorPropio (long candidato, long numero) {
    boolean esDivisorPropio;
    if ((candidato != numero) && ((numero % candidato) == 0)) {
      esDivisorPropio = true;
    } else {
      esDivisorPropio = false;
    }
    return esDivisorPropio;
  }
  
  public static long sumaDivisoresPropios (long numero) {
    long total = 0;
    for (long i=1; i<=numero/2; i++) {
      if (divisorPropio(i,numero)) {
        total += i;
      }
    }
    return total;
  }
  
  public static boolean numeroPerfect (long numero) {
    boolean esNumeroPerfecto;
    if (numero == sumaDivisoresPropios(numero)) {
      esNumeroPerfecto = true;
    } else {
      esNumeroPerfecto = false;
    }
    return esNumeroPerfecto;
  }
}