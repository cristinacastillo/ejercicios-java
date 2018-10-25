public class ejercicio5 {
  public static void main(String[] args) {
  
  int numero,
  int maximo=0;
  int minimo=200;
  int acumulador=0;
    
    for (int i = 1; i <=50 ; i++) {
    
      numero=((int)(Math.random()*100)+100;
      
      if(numero<=minimo){minimo=numero;}
      if(numero>=maximo){maximo=numero;}
      
      acumulador++;
      
      
    }

      System.out.println();
      
      int media= acumulador/50;
      
      System.out.println("Maximo: "+maximo);
      System.out.println("Minimo: "+minimo);
      System.out.println("Media: "+,media);
      
      
  }
}
