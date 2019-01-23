public class Ex06cco2b {  
    
  public static int[] filtraSin7 (int[] x){

    int j = 0;
    int[] nuevo = new int[10];
    
    for(int i = 0; i < x.length; i++){

      //COMPROBAR SI EL NUMERO CONTIENE UN 7 Y ALMACENARLO EN UN NUEVO ARRAY SI NO LO TIENE
      if((x[i]/1 != 7) && (x[i]/10 != 7) && (x[i]/100 != 7) && (x[i]/1000 != 7) && (x[i]/10000 != 7) && (x[i]/100000!= 7) && (x[i]/1000000 != 7) && (x[i]/10000000 != 7)){

         nuevo[j] = x[i];
         j++;
      }

    }

    for(int i = 0; i < nuevo.length; i++){

      System.out.print(nuevo[i] + " ");
    }

    return nuevo;
  }
  public static void main (String[] args) {

    int num = 0;

    int[] numeros = new int[10];

    //ALMACENAR NUMEROS EN UN ARRAY
      for(int i = 0; i < 10; i++){

        System.out.println("Introduce 10 numeros: ");
        num = Integer.parseInt(System.console().readLine());
        numeros[i] = num;
      }


    System.out.println("ARRAY ORIGINAL: ");

    for(int j = 0; j < 10; j++){

      System.out.print(numeros[j]+ " ");

    }
    System.out.println(" ");
    System.out.println("ARRAY SIN 7: ");

     filtraSin7(numeros);
  }

}