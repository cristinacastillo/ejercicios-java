public class loteria {

  public static void main (String[] args) {
    int[] premios = {1000,500,250,50,50,50,50,50,50,50,50,50,50};
    
    int[] numerosPremiados;
    
    numerosPremiados = sacaDelBombo (premios.length,1,9999);
   
    ganadores(numerosPremiados,premios);
    
    int boleto;
    do {
      System.out.print("Introduzca su numero de loteria (0 para salir): ");
      boleto = Integer.parseInt(System.console().readLine());
      if (boleto != 0) {
        System.out.println("Numero "+boleto+" premiado con: "+premio(numerosPremiados,premios,boleto)+" euros");
      }
      
    } while (boleto != 0);
    ganadores(numerosPremiados,premios);
  }


  public static int[] sacaDelBombo (int cantidadPremios, int extremoInferior, int extremoSuperior) {
  
    int[] premiados = new int[cantidadPremios];
    
    int bola;
    int i=0;
    boolean repetido = false;
    
    while (i<cantidadPremios) {
      bola = (int)(Math.random()*(extremoSuperior-extremoInferior+1)) + extremoInferior;
      for (int j=0; j<i; j++) {
        if (premiados[j] == bola) {
          repetido = true;
        }
      }
      if (!repetido) {
        premiados[i] = bola;
        i++;
      }
    }
    return premiados;
  }
  
  public static int premio (int[] premiados, int[] premios, int boleto) {
    int gana = 0;
    
    for (int i=0; i<premiados.length && (gana ==0); i++) {
      if (premiados[i] == boleto) {
        gana = premios[i];
      }
    }
    if (gana == 0) {
      if ((boleto % 10) == (premiados[0] % 10)) {
        gana = 5;
      } else {
        int primeraCifra = boleto;
        while (primeraCifra >= 10) {
          primeraCifra /= 10;
        }
        if (primeraCifra == (premiados[0] % 10)) {
          gana = 5;
        }
      }
        
    }
    return gana;
  }
  public static void ganadores (int[] premiados, int[] premios) {
    System.out.println("LISTA DE LOS NUMEROS GANADORES:");
    for (int i=0; i<premiados.length; i++) {
      System.out.printf("Num. %6d ---> %6d euros\n",premiados[i],premios[i]);
    }
    System.out.println("Reintrego de 5 euros a la terminacion: "+(premiados[0]%10));
  }
  
}