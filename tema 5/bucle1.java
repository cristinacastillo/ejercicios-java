public class bucle1{
    public static void main(String[] args) {

    
    int altura;
    String simbolo;
   
    
    System.out.print("Introduce la altura d ela pirámide: ");
    altura=Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe el carácter con el que la dibuje: ");
    simbolo = System.console().readLine();
    
    //bucle para pintar cada linea de la piramide
    
    int contEspacios = altura - 1;
    int contSimbolos = 1;
    
    for(int i=1; i<=altura; i++){
      
      
        //bucle para pintar los espacios en blanco
        for(int j=1; j<=contEspacios; j++){
          
          System.out.print(" ");
        }
    
        //bucle para pintar los caracteres de la pirámide
        for(int j=1; j<=contSimbolos; j++){
          
          System.out.print(simbolo);
        }
    
    
    System.out.println("");//pasa a la siguiente linea sin hacer salto de linea
    contEspacios --;
    contSimbolos+=2;// se incrementa en dos pq en cada linea hay dos simbolos mas
    
    }    
    
  }
   
}   
