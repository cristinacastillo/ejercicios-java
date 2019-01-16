

public class tresEnRayax{

  public static void estadoTablero (char[][] tablero){

    System.out.print("   0    1    2 \n");
    System.out.print("  --------------\n");
 
    for(int i = 0; i < 3; i++){

      
      for(int j = 0; j < 3; j++){

        System.out.print("   " + tablero[i][j] + " ");
      }

      System.out.println(" |" + i);
    }
    
  }

  public static boolean jugadorGana (char[][] x){

    boolean gana = false;

    //COMPROBAR FILAS QUE SON IGUALES
    for(int i = 0; i < 3; i++){
      for(int j = 1; j < 3; j++){

        if(x[i][j - 1] == x[i][j]){

          gana = true;
        }else{

          gana = false;
        }
      }
    }

    //COMPROBAR COLUMNAS QUE SON IGUALES
    for(int i = 0; (i < 3)&&(gana == false); i++){
      for(int j = 1; j < 3; j++){

        if(x[j -1][i] == x[j][i]){

          gana = true;
        }else{

          gana = false;
        }
      }
    }

    //COMPROBAR MOVIENTO / Y \

    if((x[0][0] == x[1][1]) && (x[2][2] == x[1][1])){

      gana = true;
    }
    if((x[0][2] == x[1][1]) && (x[2][0] == x[1][1])){

      gana = true;
    }

    return gana;
  }


  public static boolean tableroLleno(char[][] x){

    boolean lleno = true;

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){

        if(x[i][j] == ' '){

          lleno = false;
        }

      }
    }
    return lleno;
  }

  public static boolean sePudoColocar(char[][] x, int fil, int col){

    boolean sepuede = false;

      if(x[fil][col] == ' '){

          sepuede = true;
      }

    return sepuede;
  }


  public static void main (String[] args) {

    char[][] tablero = new char [3][3];

    int fil, col;
    int turno=0;
    char jugador='X';

    do{

      turno++;

      if(turno == 3){

        turno = 1;
      }if(turno == 1){

        jugador = 'X';
      }else{

        jugador = 'O';
      }

      do{
        estadoTablero(tablero);
        System.out.print("Turno jugador " + turno);
        System.out.println();
        System.out.println("Introduce el numero de fila: ");
        fil = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el numero de columna: ");
        col = Integer.parseInt(System.console().readLine());

        if(sePudoColocar(tablero, fil, col) == false){

          tablero[fil][col] = jugador;
        }
      }while(!sePudoColocar(tablero, fil, col));

    }while(!tableroLleno(tablero) && !jugadorGana(tablero));

    /*do{

      System.out.println(" J1 Introduce posicion X: ");
      tablero[i][j] = Integer.parseInt(System.console().readLine());

    }while(tablero[i][j] == 0);*/
  }

}