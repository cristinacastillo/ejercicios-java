public class libreriax {
  
  public static int[] generarNumAleatorios(int[] numerosPremiados) {

    for(int i = 0; i < 13; i++){

      int num = (int)(Math.random()*1000)+1;
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
    }
    
    return dinero;
  }

  public static void main(String[] args) {

      int[] premios = {1000,500,250,50,50,50,50,50,50,50,50,50,50};

      int[] numerosPremiados;
  

  }

}