
public class histograma {

  public static int[] almacenarNum(int[] numeross, int numero ){

    for(int i = 0; i < numeross.length; i++){

        if(numero == i){

          numeross[i]+= 1;
       }
    }

    return numeross;
  }

  public static int[] mostrarAstericos(int[] numeross){

    for(int i = 0; i < numeross.length; i++){

      if(numeross[i]!=0){

        System.out.print(i + ": ");

      }

      for(int j = 0; j < numeross[i]; j++){

        System.out.print("*");

        if(j == numeross[i] - 1){

          System.out.println("");
        }
      }
    }

    return numeross;
  }

  public static void main(String[] args) {

    int numeross[] = new int[101];

    int numero;
    do{
    
    System.out.println("Introduce numeros desde el 1 al 100, para terminar introduce -1 ");
    numero = Integer.parseInt(System.console().readLine()); 

      if((numero > 0) && (numero < 101)){

        almacenarNum(numeross, numero);


      }
    }while(numero != -1);

    mostrarAstericos(numeross);

  }

}