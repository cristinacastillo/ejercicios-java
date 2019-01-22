//@author: CRISTINA CASTILLO OBREGÓN  
public class piedraPapelTijera{ 

  //FUNCION PARA SABER LOS RESULTADOS TOTALES Y QUIEN HA GANADO, PERDIDO O EMPATE
  public static void quienGana(int ganar, int perder, int empate){

    System.out.println("RESULTADOS: ");
    System.out.println(empate + " empate/s ");
    System.out.println(ganar + " partida/s ganadas ");
    System.out.println(perder + " partida/s perdidas ");

    System.out.println("-----------------------");



      if(ganar > perder){

        System.out.println("ENHORABUENA HAS GANADO ");
      }

      else if(ganar < perder){

        System.out.println("LO SIENTO HAS PERDIDO, OTRA VEZ SERA ");
      }

      else{

        System.out.println("AMBOS EMPATES ");
      }

  }

  public static void main(String[] args){

    //INFORMAR NOMBRE DEL JUEGO
    System.out.println("Piedra, papel, tijera: ");

    System.out.println("Indica cuantas jugadas quieres jugar: ");
    int partidas = Integer.parseInt(System.console().readLine());

    int acumulador = 0;
    String[] palabras = {"Piedra", "Papel", "Tijera"};

    int ganar = 0;
    int perder = 0;
    int empate = 0;

    do{
      
    System.out.println("0.Piedra 1.Papel 2.Tijera: ");
    int res1 = Integer.parseInt(System.console().readLine());

    int res2 = 0;
    
    //GENERAR RESULTADO DEL ORDENADOR
    for(int i = 0; i < 1; i++){

      res2 = (int)(Math.random()*3);
      /*System.out.print(res2);*/
      System.out.println(" ");

    }

    //MOSTRAR QUE ES LO QUE SE HA JUGADO
    System.out.println(palabras[res1] + " vs " + palabras[res2]);

    //AVERIGUAR QUIEN GANA EN UNA PARTIDA Y ACUMULAR LOS RESULTADOS DEL JUGADOR QUE ESTA JUGANDO
    if(palabras[res1] == palabras[res2]){

      System.out.println("EMPATE");
      empate++;
    }
    if(((res1 == 0)&&(res2 == 1)) || ((res1 == 1)&&(res2 == 2)) ||  ((res1 == 2)&&(res2 == 0))){

      System.out.println("HAS PERDIDO");
      perder++;

    }

    if(((res1 == 1)&&(res2 == 0)) || ((res1 == 0)&&(res2 == 2)) ||  ((res1 == 2)&&(res2 == 1))){

      System.out.println("HAS GANADO");
      ganar++;

    }

    //ACUMULADOR PARA QUE HAGA LAS PARTIDAS QUE EL USUARIO LE HA INTRODUCIDO
    acumulador++;

  }while(partidas>acumulador);

  quienGana(ganar, perder, empate);
  
  }


}
