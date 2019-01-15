import libreria.numCuriosos;

public class numerosCuriosos {
  public static void main (String[] args) {
    int valorUsuario;
    
    System.out.println("Este programa mostrará los números curiosos que hay entre 2");
    System.out.println("y el valor que introduzca.");
    do {
      System.out.print("Introduzca un valor entero superior a 2: ");
      valorUsuario = Integer.parseInt(System.console().readLine());
    } while (valorUsuario <2);
    for (int i=2; i<=valorUsuario; i++) {
      if (numCuriosos.esNumCurioso(i)) {
        System.out.println (i);
      }
    }
  }
}