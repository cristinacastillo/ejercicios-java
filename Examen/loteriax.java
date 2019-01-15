public class loteriax {
  
  public static int[] generarNumAleatorios(int[] numerosPremiados) {

    for(int i = 0; i < 13; i++){

      int num = (int)(Math.random()*10000)+1;
      numerosPremiados[i] = num;

    }
    return numerosPremiados;
  }


  public static int comprobarPremio(int numero, int[] numerosPremiados, int[]premios) {

    int dinero = 0;

    for(int i = 0; i < numerosPremiados.length; i++){

      if(numero == numerosPremiados[i]){

        dinero = premios[i];

      }

      if(numero%10 == numerosPremiados[0]%10){

        dinero = 5;

      }

    }
    
    return dinero;
  }

  public static void mostrarPremios(int[] numerosPremiados, int[] premios){

    System.out.println("LISTA DE LOS NUMEROS GANADORES:");

      for (int i = 0; i < numerosPremiados.length; i++) {

       System.out.printf("Num. %6d ---> %6d euros\n",numerosPremiados[i], premios[i]);

      }

     System.out.println("Reintrego de 5 euros a la terminacion: " + (numerosPremiados[0]%10));
  }
  

  public static void main(String[] args) {

      int[] premios = {1000,500,250,50,50,50,50,50,50,50,50,50,50};

      int[] numerosPremiados = new int[premios.length]; 

     
      numerosPremiados = generarNumAleatorios(numerosPremiados) ;
  
      mostrarPremios(numerosPremiados, premios);
    
      int numero;

      do{

      System.out.println("Introduce tu numero: ");
      numero = Integer.parseInt(System.console().readLine());

      System.out.println("Su premio es de "+comprobarPremio(numero, numerosPremiados, premios) + " euros");

      }while(numero != 0);

  }


  

}