import libreria.numPerfectos;

public class numerosPerfectos{
  public static void main (String[] args) {
    long valorUsuario;
    
    System.out.println("Este programa mostrará los números perfectos que hay entre 2");
    System.out.println("y el valor que introduzca.");
    do {
      System.out.print("Introduzca un valor entero superior a 2: ");
      valorUsuario = Integer.parseInt(System.console().readLine());
    } while (valorUsuario <2);
    for (long i=2; i<=valorUsuario; i++) {
      if (numPerfectos.numeroPerfect(i)) {
        System.out.println (i);
      }
    }
    
  }
}