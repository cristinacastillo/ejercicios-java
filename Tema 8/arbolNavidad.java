
public class arbolNavidad {

  public static void main(String[] args) {

    int altura=0;
    
    //Bucle para hacer que la altura sea minimo 5
    do {
      
      System.out.println("Introduce el numero de altura(Altura minima 5):");
      altura=Integer.parseInt(System.console().readLine());
  
    } while (altura < 5);

    int espacios = altura-2;
    int espaciosInt = 0;


    //Bucle pintar estrella
    for (int i=0; i<=altura-4;i++){
      System.out.print(" ");
    }

    //Pintar estrella
    System.out.println("*");

    //Contenedor del arbol/altura
    for (int i = 1; i<(altura-2);i++){

      //Pintar espacios decrecientes
      for (int c=1; c<espacios;c++){
        System.out.print(" ");
      }
      System.out.print("#");

      //Pintar espacios interiores
      for (int x=1; x< espaciosInt;x++){
        System.out.print(" ");
      }
      //Pintar las almoadillas de la parte derecha a partir de la vuelta 1
      if (i>1){System.out.print("#");}

      //Ajuste de contadores
      espaciosInt +=2;
      espacios--;
      
      //Salto de linea
      System.out.println("");
    }

    //Bucle para hacer la base del arbol
    for (int a=1; a< (altura*2)-4;a++){
      System.out.print("#"); 
    }

    System.out.println("");
    
    //Pintar palo del arbol
    for (int i=0; i<=altura-4;i++){
      System.out.print(" ");
    }
    System.out.println("#");

  }
}   