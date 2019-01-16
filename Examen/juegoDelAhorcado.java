public class juegoDelAhorcado {  
  public static void main (String[] args) {

    //Creamos array que contendra el nombre de las palabras para el ahorcado
    String[] palabras = {"UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ"};
    
    //Creamos array de caracteres para elegir la palabra mediante la funcion "eligePlabra"
    char palabraElegida[];
    palabraElegida = eligePalabra (palabras);

    //Creamos array de caracteres para almacenar la palabra seleccionada pasada a "_" recorriendo el array anterior para saber cuantas "_" se necesitan
    char palabraOculta[];
    palabraOculta = palabraEnBlanco(palabraElegida.length);
   
    //presentaPalabra(palabraElegida);

    //Muestra la palabra oculta con los "_"
    presentaPalabra(palabraOculta);
    
    //Creamos variable para la letra introducida por el usuario y contador de fallos
    char letraUsuario;
    int fallos = 5;
    do {
      
      System.out.print("Te quedan "+fallos+" intentos erróneos.");
      System.out.print("Introduzca una letra (0 para abandonar): ");
      //letraUsuario = System.console().readLine().toUpperCase().charAt(0);
      
      //Capturamos la letra introducida por el usuario como caracter
      letraUsuario = System.console().readLine().charAt(0);

      //Cualquier letra que le pase el usuario la convierte a mayusculas
      letraUsuario = Character.toUpperCase(letraUsuario);
      

      //Variable booleana para comprobar si la letra introducida por el usuario esta de dentro del array que contiene la palabra seccionada en caracteres
      boolean laLetraEsta;
      
      //Funcion que sirve para recorrer el array que contiene la letra y comprobar si esta
      laLetraEsta = destapaLetra(palabraElegida,palabraOculta,letraUsuario);
      
      //Si el usuario introduce el numero 0, el programa finaliza y muestra la palabra oculta
      if (letraUsuario != '0') {
        presentaPalabra(palabraOculta);

        //Si al comprobar si esta la letra, se determina que la letra no esta resta 1 al numero de fallos predefinido
        if (laLetraEsta == false) {
          fallos--;
        }
      }
    }while ((palabraDescubierta(palabraOculta) == false) && (fallos>0) && (letraUsuario !='0'));
    
    //Cuando termine el nº de intentos o se acierte la palabra
    if (palabraDescubierta(palabraOculta)) {
      System.out.println("¡¡ HAS GANADO!! ");
    } else if (fallos==0) {
      System.out.println("Has agotado todas las vidas.");
      presentaPalabra(palabraElegida);
    }
    
  }
  
  //Funcion que recoge el array de palabras seleccionadas para el juego, hace un math.random para seleccionar la palabra y luego la secciona para pasarla al array donde se alamacenara la palabra elegida por caracteres
  public static char[] eligePalabra (String[] palabras) {
    int elegida = (int)(Math.random()*palabras.length);
    char[] palabraElegida = new char[palabras[elegida].length()];
    
    for (int j=0; j<palabras[elegida].length(); j++) {
      palabraElegida[j] = palabras[elegida].charAt(j);
    }
    return palabraElegida;
  }
  

  //funcion que recorre el array donde esta la palabra elegida y asigna el nº de "_" necesarios para mostrar el numero de letras que tiene la palabra
  public static char[] palabraEnBlanco (int cantidadLetras) {
    char[] palabraBlanca = new char[cantidadLetras];
    
    for (int j=0; j<cantidadLetras; j++) {
      palabraBlanca[j] = '_';
    }
    return palabraBlanca;
  }
  
  //Funcion que sirve para mostrar el array de caracteres
  public static void presentaPalabra (char[] palabraAPresentar) {
    System.out.println();
    for (int i=0; i<palabraAPresentar.length; i++) {
      System.out.print(palabraAPresentar[i]+" ");
    }
    System.out.println();
    System.out.println();
    
  }
  
  //comprueba que la palabra no este descubierta para continuar el programa
  public static boolean palabraDescubierta (char[] palabra) {
    boolean letrasALaVista = true;
    for (int i=0; (i<palabra.length) && letrasALaVista ; i++) {
      if (palabra[i] == '_') {
        letrasALaVista = false;
      }
    }
    return letrasALaVista;
  }
  
  //Funcion que sirve para recorrrer array y comprobar si la letra introducida por el usuario esta y si esta, la asgina al array que tiene las "_" para continuar destapando
  public static boolean destapaLetra (char[] palabraALaVista, char[] palabraEnJuego, char letra) {
    boolean laLetraEsta = false;
    
    for (int i=0; i<palabraALaVista.length; i++) {
      if (palabraALaVista[i]==letra) {
        palabraEnJuego[i] = letra;
        laLetraEsta = true;
      }
    }
    
    return laLetraEsta;
  }
  
}