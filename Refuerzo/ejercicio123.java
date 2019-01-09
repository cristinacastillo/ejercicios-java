
public class ejercicio123 {
  
  public static int[] mostrarArray(int x[]){
    for( int i = 0 ; i < x.length; i++){

      System.out.print(x[i] + " ");

    }
    return x;
  }
  
  public static int[] mostrarArrayReves(int x[]){
    for( int i = x.length-1 ; i >= 0; i--){

      System.out.print(x[i] + " ");

    }
    return x;
  }

  /*public static int[] rotarArray(int x[]){

    int aux = x[0];

    for(int i = 1; i < x.length; i++){

      x[i-1] = x[i]; 
    }

    x[x.length-1] = aux;

    mostrarArray(x);

    return x;
  }*/


  public static int[] voltearArray(int x[]){
    int cont = 1;
    for (int i=0; i<x.length/2; i++) {
    
      int aux = x[x.length-cont];
      x[x.length-cont] = x[i];
      x[i] = aux;
      cont++;
    }
    return x;
  }

  
  public static void main(String[] args) {

    
    System.out.println("Introduce el tamaño del array: ");
    int tam = Integer.parseInt(System.console().readLine());

    int[] num = new int[tam];

    
    for(int i = 0; i < tam; i++){
      System.out.println("Introduce los valor de la posicion "+i);
      int valor = Integer.parseInt(System.console().readLine());
      num[i] = valor;
    }

    System.out.println("Array original");
    System.out.println("--------------------------");
    mostrarArray(num);
    System.out.println("");

    System.out.println("Array al reves");
    System.out.println("--------------------------");
    mostrarArrayReves(num);
    System.out.println("");

    /*System.out.println("Array rotado");
    System.out.println("--------------------------");
    rotarArray(num);
    System.out.println("");*/

    System.out.println("Array volteado");
    System.out.println("--------------------------");
    voltearArray(num);
    mostrarArray(num);
    System.out.println("");

  }

}