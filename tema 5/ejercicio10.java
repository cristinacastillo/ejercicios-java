public class ejercicio10 {
    public static void main(String[] args) {


    double contador = 0;
    double sumando = 1;
    double totalNum = 0;
    double media;
    
    while(sumando >=0 ){


    System.out.println("Introduce los números con los que quieras hacer la media");
    sumando=Double.parseDouble(System.console().readLine());
    
    if(sumando<0){break;}
    contador += sumando;
    
    totalNum++;
    
    }
  
    media = contador / totalNum;
    
    System.out.printf ("La media de los numeros introducidos es: %.2f",media);
    
  }
  
}
