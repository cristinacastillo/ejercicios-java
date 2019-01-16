public class tresEnRaya {
  
  /* no se ha implementado la función que chequea si no es posible que gane un jugador */
  
  public static void main (String[] args) {
    char[][] tablero;
    
    tablero = creaTableroEnBlanco();
    
    int fil, col;
    int turno=0;
    char jugador='X';
    do {
      turno ++;
      if (turno ==3) {
        turno = 1;
      }
      if (turno ==1) {
        jugador = 'X';
      } else {
        jugador = 'O';
      }
      boolean sePudoColocar;
      do {
        presentaTablero (tablero);
        System.out.print("Turno jugador "+turno);
        System.out.println();
        System.out.print("Introduce nº de fila: ");
        fil = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce nº de columna: ");
        col = Integer.parseInt(System.console().readLine());
        sePudoColocar = intentoColocar(tablero,fil,col,jugador);
        if (!sePudoColocar) {
          System.out.println("Algún problema hubo (coordenadas incorrectas, posición ocupada)");
        }
      } while (!sePudoColocar);
    } while (!ganaJugador(tablero, jugador) && !tableroLleno(tablero));
    
    if (ganaJugador(tablero,jugador)) {
      System.out.println("Ha ganado el jugador "+turno);
      presentaTablero (tablero);
    } else {
      System.out.println("Tablero agotado. Nadie gana.");
    }
    
  } 
  
  public static char[][] creaTableroEnBlanco () {
    char [][] tablero = new char[3][3];
    for (int i=0; i<3; i++){
      for (int j=0; j<3; j++) {
        tablero[i][j] = ' ';
      }
    }
    return tablero;
  }
  
  public static void presentaTablero (char[][] tablero) {
    System.out.println();
    System.out.print(" |");
    for (int j=0; j<3; j++) {
      System.out.print((j+1)+"|");
    }
    System.out.println();
    for (int j=0; j<8; j++){
      System.out.print("-");
    }
    
    for (int i=0; i<3; i++) {
      System.out.println();
      System.out.print((i+1)+"|");
      for (int j=0; j<3; j++) {
        System.out.print(tablero[i][j]+"|");
      }
      System.out.println();
      for (int j=0; j<8; j++){
        System.out.print("-");
      }
    }
    System.out.println();
  }

  public static boolean ganaJugador (char [][] tablero, char simbolo) {
    boolean gana=true;
    boolean salir = false;
    for (int i=0; (i<3) && !salir; i++) {
      gana = true;
      for (int j=0; (j<3) && gana; j++) {
        if (tablero[i][j] != simbolo) {
          gana = false;
        }
      }
      if (gana == true) {
        salir = true;
      }
      
    }
    if (!gana) {
      salir = false;
      for (int j=0; (j<3) && !salir; j++) {
        gana = true;
        for (int i=0; (i<3) && gana; i++) {
          if (tablero[i][j] != simbolo) {
            gana = false;
          }
        }
        if (gana == true) {
          salir=true;
        }
      }
    }
    if (!gana) {
      gana = true;
      for (int i=0; (i<3) && gana; i++) {
        if (tablero[i][i] != simbolo) {
          gana = false;
        }
      }
    }
    if (!gana) {
      gana = true;
      for (int i=0; (i<3) && gana; i++) {
        if (tablero[i][2-i] != simbolo) {
          gana = false;
        }
      }
    }
    return gana;
  }
  
  public static boolean intentoColocar(char[][] tablero, int fil, int col, char jugador) {
    boolean colocado = false;
    
    if ((fil>=1) && (fil<=3)) {
      fil--;
    } else {
      return colocado;
    }
    
    if ((col>=1) && (col<=3)) {
      col--;
    } else {
      return colocado;
    }
    
    if (tablero[fil][col] == ' ')
    {
      tablero[fil][col] = jugador;
      colocado = true;
    }
    return colocado;
  }
  
  public static boolean tableroLleno(char[][] tablero) {
    boolean estaLleno = true;
    
    for (int i=0; (i<3) && estaLleno; i++) {
      for (int j=0; (j<3) && estaLleno; j++) {
        if (tablero[i][j] == ' ') {
          estaLleno = false;
        }
      }
    }
    return (estaLleno);
  }
}