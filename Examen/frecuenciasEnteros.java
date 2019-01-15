public class frecuenciasEnteros {
  public static void main (String[] args) {
    int frecuenciasValores[] = new int[100];
    
    for (int i=0; i<frecuenciasValores.length; i++) {
      frecuenciasValores[i] = 0;
    }
    
    int captura;
    do {
      System.out.print("Introduzca un valor entre 1 y 100 (-1 para finalizar): ");
      captura = Integer.parseInt(System.console().readLine());
      if ((captura >=1) && (captura <=100)) {
        frecuenciasValores[captura-1]++;
      } else if (captura != -1) {
        System.out.println("Valor introducido fuera de rango. No se ha tenido en cuenta.");
      }
      
    } while (captura != -1);

    for (int i=0; i<frecuenciasValores.length; i++) {
      if (frecuenciasValores[i]>0) {
        System.out.printf("%3d: ",i+1);
      }
      for (int j=0; j<frecuenciasValores[i]; j++) {
        System.out.print("*");
      }
      if (frecuenciasValores[i]>0) {
        System.out.println();
      }
    }
    
  }
}