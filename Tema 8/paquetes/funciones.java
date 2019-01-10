
package paquetes;

//pg113  101
public class funciones {

  public static boolean esCapicua(long numeroIntroducido) {

    long numero = numeroIntroducido;
    long volteado = 0;
    boolean capicua = false;

    while (numero > 0) {

      volteado = (volteado * 10) + (numero % 10);

      numero /= 10;

    }

    if (volteado == numeroIntroducido) {

      capicua = true;

    }

    return capicua;
  }

  public static boolean esPrimo(int x) {

    int resultado;
    boolean primo = true;

    for (int i = 2; i < x; i++) {

      resultado = x % i;

      if (resultado == 0) {

        primo = false;

      }

    }

    return primo;

  }

  public static int siguientePrimo(int numero) {

    do {
      numero++;

    } while (funciones.esPrimo(numero) == false);

    return numero;

  }

  public static int numPotencia(int base, long l) {

    int resultado = 1;

    if (l == 0) {

      resultado = 1;
    }

    if (l > 0) {

      for (int i = 1; i <= l; i++) {

        resultado *= base;

      }
    }

    if (l < 0) {

      for (int i = 0; i < l; i++) {

        resultado *= base;
      }

      resultado = 1 / resultado;
    }

    return resultado;

  }

  public static long digitos(long numero) {

    long digitos = 0;

    while (numero > 0) {

      numero = numero / 10;

      digitos++;

    }

    return digitos;

  }

  public static long voltear(long numero) {

    long volteado = 0;

    while (numero > 0) {

      volteado = (volteado * 10) + (numero % 10);

      numero /= 10;

    }

    return volteado;

  }

  public static long digitoN(long x, long l) {

    x = voltear(x);

    while (l-- > 0) {

      x = x / 10;

    }

    return (int) x % 10;

  }

  public static long posicionDeDigito(long x, int d) {

    int i;
    for (i = 0; (i < digitos(x)) && digitoN(x, i) != d; i++) {
    }
    ;

    if (i == digitos(x)) {

      return -1;

    } else {

      return 1;

    }
  }

  public static long quitaPorDetras(long x, int n) {
    return x / (long) numPotencia(10, n);
  }

  /*
   * public static int quitaPorDetras(int x, int n) { return
   * (int)quitaPorDetras((long) x, n); }
   */

  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltear(quitaPorDetras(voltear(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  public static int quitaPorDelante(int x, int n) {
    return (int) quitaPorDelante((long) x, n);
  }

  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  public static int pegaPorDetras(int x, int d) {
    return (int) pegaPorDetras((long) x, d);
  }

  public static int trozoDeNumero(long x, int inicio, int fin) {
    return (int) trozoDeNumero((long) x, inicio, fin);
  }

  public static long juntaNumeros(long x, long y) {
    return (int) (x * numPotencia(10, digitos(y))) + y;
  }

  public static String convierteEnPalotes(long n) {

    long vuelta = voltear(n);
    String palos = "";

    while (vuelta > 0) {

      long aux = vuelta % 10;

      for (int i = 0; i < aux; i++) {

        palos += "|";

      }
      vuelta = vuelta / 10;

      if (vuelta != 0) {

        palos += "-";

      }
    }

    return palos;
  }

  public static int[] filtraPrimos(int x[], int aux[]) {

    int contador = 0;

    for (int i = 0; i < x.length; i++) {

      if (funciones.esPrimo(x[i])) {

        aux[contador] = x[i];
        contador++;
      }
    }
    return aux;
  }

  public static int[] mostrarArray(int x[]) {

    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }
    return x;
  }



//ej20
  public static int[]generaArrayInt(int tam, int min, int max) {

    int[] num = new int [tam];
    int rango = (max - min) + 1;

   for(int i = 0; i < num.length; i++){

     num[i] = (int)(Math.random() * rango) + min;
   }

    return num;
  }

  public static int minimoArrayInt(int x[]) {

    int numMin = x[0];

    for(int i = 0; i < x.length; i++){

      if(numMin > x[i]){

        numMin = x[i];
      }

    }

    return numMin;
  }

  public static int maximoArrayInt(int x[]) {

    int numMax = x[0];

    for(int i = 0; i < x.length; i++){

      if(numMax < x[i]){

        numMax = x[i];
      }

    }

    return numMax;
  }

  public static float mediaArrayInt(int x[]) {

    float media = 0;
 

    for(int i = 0; i < x.length; i++){

      media+= x[i];
  
    }

    media = media / x.length;

    return media;
  }

  public static boolean estaEnArrayInt(int x[], int n) {
 
    boolean esta = false;

    for(int i = 0; i < x.length; i++){

      if(x[i] == n){
        
        esta = true;
      }
 
    }
    return esta;
  }

  public static int posicionEnArrayInt(int x[], int n) {
 
    int posicion = 0;

    for(int i = 0; i < x.length; i++){

      if(x[i] == n){
        
        posicion = i;
      }
    
 
    }
    return posicion;
  }

  public static int[] volteaArrayInt(int x[]) {
 
    int cont = 1;
    for (int i = 0; i < x.length/2; i++) {
    
      int aux = x[x.length-cont];
      x[x.length-cont] = x[i];
      x[i] = aux;
      cont++;
    }
    
    return x;
    
  }

  public static int[] rotaDerechaArrayInt(int x[]) {
 
    int cont = 1;
    for (int i = 0; i < x.length/2; i++) {
    
      int aux = x[x.length-cont];
      x[x.length-cont] = x[i];
      x[i] = aux;
      cont++;
    }
    
    return x;
    
  }


}