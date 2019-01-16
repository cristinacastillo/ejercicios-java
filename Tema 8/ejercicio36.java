import paquetes.funciones;

  
public class ejercicio36 {

  public static void main(String[] args) {

    int[] num= new int[5];
    int[] aux= new int[num.length];

    num[0] = 2;
    num[1] = 3;
    num[2] = 4;
    num[3] = 7;
    num[4] = 8;
    
    funciones.filtraPrimos(num, aux);
    funciones.mostrarArray(aux);
   
  }
}

