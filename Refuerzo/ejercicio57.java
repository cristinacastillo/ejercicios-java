
public class ejercicio57 {
  
  public static int[] mostrarArray(int x[]){
    for( int i = 0 ; i < x.length; i++){

      System.out.print(x[i] + " ");

    }
    return x;
  }

  public static void main(String[] args) {

    /*PEDIR TAMAÑO DEL ARRAY UNIDMENSIONAL */
    System.out.println("Introduce el tamano del array con un numero que sea una raiz cuadrada exacta: ");
    int tam = Integer.parseInt(System.console().readLine());

    int[] num = new int[tam];

    /*ALMACENAR LOS VALORES DEL ARRAY*/
    for(int i = 0; i < tam; i++){

      System.out.println("Introduce los valor de la posicion "+i);
      int valor = Integer.parseInt(System.console().readLine());
      num[i] = valor;
    }
    /*HACER LA RAIZ AL TAMAÑO DEL ARRAY*/
    int raiz = (int)Math.sqrt(tam);
    //System.out.print(raiz);

    /*CREAR ARRAY BIDIMENSIONAL*/
    int[][] bi = new int[raiz][raiz];

    /*ALMACENAR EL PRIMER ARRAY EN EL BIDIMENSIONAL */
    int c = 0;

    for( int i = 0; i < raiz; i++){
      
      for(int j = 0; j < raiz; j++){

        bi[i][j] = num[c];

        c++;
      }
    }

    /*MOSTRAR ARAY UNIDIMENSIONAL */
    mostrarArray(num);
    System.out.println("");
    System.out.println("__________________________");
    System.out.println("");

    /*MOSTRAR BIDIMENSIONAL */
    for( int i = 0 ; i < raiz; i++){

      for( int j= 0; j < raiz; j++){
        
      System.out.print(bi[i][j] + " "); 
      
      }
      System.out.println("");
    }
  }

}
