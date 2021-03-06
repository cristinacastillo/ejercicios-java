
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

  public static int[] rotaIzqArrayInt(int x[], int posiciones) {
 
    for (int i = 0; i < posiciones; i++) {

      int aux = x[0];

      for(int j = 1; j < x.length; j++){

        x[j-1]=x[j];

      }

      x[x.length-1] = aux;
    } 

    return x;
  }


  public static int[] rotaDchaArrayInt(int x[], int posiciones) {
 
    for (int i = 0; i <posiciones; i++) {
    
      int aux = x[x.length-1];

      for (int j = x.length-2 ; j >= 0; j--){ 

      x[j+1] = x[j];
      
      }
      x[0] = aux;
    }
    
    return x;
    
  }

/rotar a la derecha x columnas
    public static int[][] rotarDerecha(int[][] x, int rotacion) {
        int[][] resultado = new int[x.length][x[0].length];
        rotacion = rotacion % x[0].length;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                resultado[i][(j + rotacion) % x[i].length] = x[i][j];
            }
        }

        return resultado;
    }

    //rotar a la dcha x columnas en dos funciones
    public static int[][] rotarDerechaBis(int[][] x, int rotacion) {
        int[][] resultado;
        resultado = duplicar(x);

        for (int i = 0; i < rotacion; i++) {
            resultado = rotarDerecha1(resultado);
        }

        return resultado;
    }

    
    
    public static int[][] rotarDerecha1(int x[][]) {
        int[][] resultado;
        int aux;
        resultado = duplicar(x);

        for (int i = 0; i < resultado.length; i++) {
            aux = resultado[i][resultado[i].length - 1];
            for (int j = resultado[i].length - 1; j > 0; j--) {
                resultado[i][j] = resultado[i][j - 1];
            }
            resultado[i][0] = aux;
        }

        return resultado;
    }

    
    //rotar abajo x filas
    public static int[][] rotarAbajo(int[][] x, int rotacion) {
        int[][] resultado = new int[x.length][x[0].length];
        rotacion = rotacion % x.length;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                //resultado[i][(j+rotacion)%x[i].length] = x[i][j];
                resultado[(i + rotacion) % x.length][j] = x[i][j];
            }
        }

        return resultado;
    }

    
    //rotar abajo x filas en dos funciones
    public static int[][] rotarAbajoBis(int[][] x, int rotacion) {
        int[][] resultado = duplicar(x);
        rotacion = rotacion % x.length;
        for (int i = 0; i < rotacion; i++) {
            resultado = rotarAbajo1(resultado);
        }

        return resultado;
    }

    public static int[][] rotarAbajo1(int[][] x) {
        int[][] resultado = duplicar(x);
        int aux;
        for (int j = 0; j < resultado[0].length; j++) {
            aux = resultado[resultado.length - 1][j];
            for (int i = resultado.length - 1; i > 0; i--) {
                resultado[i][j] = x[i - 1][j];
            }
            resultado[0][j] = aux;
        }

        return resultado;
    }

    
    //duplicar una matriz
    public static int[][] duplicar(int[][] x) {
        int[][] resultado = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                resultado[i][j] = x[i][j];
            }
        }
        return resultado;
    }
/**/

//OBTENER MATRIZ TRASPUESTA, CAMBIAR FILAS POR COLUMNAS
public static int[][] traspuesta(int[][] matriz) {

        int[][] resultado;
        int filas, columnas;
        filas = matriz.length;
        columnas = matriz[0].length;

        resultado = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                resultado[j][i] = matriz[i][j];

            }

        }

        return resultado;
    }


//29

  public static int[][] generaArrayBiInt(int f, int c, int max, int min) {
 
    int x[][] = new int [f][c];

    int range = (max - min) + 1;

    for (int i = 0; i < f; i++) {

      for (int j = 0 ; j < c; j++){ 

        x[i][j] = (int)(Math.random() * range) + min;
      
      }
    }
    
    return x;
    
  }

  public static int[][] mostrarArrayBi(int x[][], int f, int c) {

    for(int i = 0; i < f; i++){

      for (int j = 0 ; j < c; j++){ 

        System.out.print(x[i][j] + " ");
    }
    System.out.println("");
  }

    return x;
  
  }

  public static int[][] filaDeArrayBiInt(int x[][], int f, int c, int filades) {

    for(int i = 0; i < f; i++){

      for (int j = 0 ; j < c; j++){ 

        if(i == filades){
          
          System.out.print(x[i][j] + " ");

        }
  
    }
    System.out.println(" ");
   
  }
    return x;
  
  }

  public static int[][] columnaDeArrayBiInt(int x[][], int f, int c, int coldes) {

    for(int i = 0; i < f; i++){

      for (int j = 0 ; j < c; j++){ 

        if(j == coldes){
          
          System.out.print(x[i][j] + " ");

        }
  
    }
    System.out.println(" ");
   
  }
    return x;
  
  }

  public static int[][] coordenadasEnArrayBiInt(int x[][], int f, int c, int numdes) {

    boolean paso  = false;

    for(int i = 0; i < f; i++){

      for (int j = 0 ; j < c; j++){ 

        if((x[i][j] == numdes)&&(paso == false)){
          
          System.out.print("Posicion ["+i+"]["+j+"]");
          paso = true;

        }
     }
   }
    if(paso == false){

      System.out.println("{-1,-1}");
    }

    return x;
  
  }

  public static int[][] esPuntoDeSilla(int x[][], int f, int c, int numdes) {

    boolean min  = false;
    boolean max  = false;

    int minFil = x[0][0];
    int minCol = x[][];

    for(int i = 0; i < f; i++){

      for (int j = 0 ; j < c; j++){ 

        if((x[i][j] == numdes)&&(paso == false)){
          
          System.out.print("Posicion ["+i+"]["+j+"]");
          paso = true;

        }
     }
   }
    if(paso == false){

      System.out.println("{-1,-1}");
    }
    
    return x;
  
  }
  



}
