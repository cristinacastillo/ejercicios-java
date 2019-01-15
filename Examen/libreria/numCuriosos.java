package libreria;

public class numCuriosos {
  public static int ultimoDigito (long numero) {
    return (int)(numero % 10);
  }
  
  public static long quitaCifraUnidades (long numero) {
    return (numero / 10);
  }
  
  public static boolean esNumCurioso (long numero) {
    boolean esCurioso = true;
    long cuadrado = numero*(long)numero;
    
    while ((numero>0) && esCurioso) {
      if (ultimoDigito(numero)!=ultimoDigito(cuadrado)) {
        esCurioso = false;
      }
      numero = quitaCifraUnidades(numero);
      cuadrado = quitaCifraUnidades(cuadrado);
    }
    
    return esCurioso;
  }
}