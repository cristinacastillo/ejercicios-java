
public class ejercicio4 {
  public static void main(String[] args) {

    System.out.println("Introduce el tamano del array: ");
    int tam = Integer.parseInt(System.console().readLine());

    int[] num = new int[tam];
    String[] palabras = new String[tam];

    /*ALMECENAR DATOS EN LOS ARRAYS*/
    for(int i = 0; i < tam; i++){

      System.out.println("Introduce la palabra de la posicion "+ i);
      palabras[i] = System.console().readLine();

      System.out.println(" ");

      System.out.println("Introduce el numero de la posicion "+ i);
      num[i] = Integer.parseInt(System.console().readLine());

    }

    /*MOSTRAR ARRAYS*/
    for(int i = 0; i < tam; i++){

      System.out.println(" ");
      System.out.print(palabras[i]+" ");
      /*System.out.println(" ");*/
      System.out.print(num[i]+" ");
    }

    System.out.println(" ");
    System.out.println("_______________________");
    
    /*BUSCAR EL NUMERO MAS PEQUEÑO Y MOSTRAR LA PLABRA CON LA POSICION DEL NUMERO MAS PEQUEÑO*/
    for(int j = 0; j < tam; j++){

      for(int i = 0; i < tam; i++){

        if(num[i] == j){

          System.out.print(palabras[num[i]] + " ");
        }
      }
    }
  }
}
