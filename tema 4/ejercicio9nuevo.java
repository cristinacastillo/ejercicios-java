import java.util.Scanner;
import java.lang.*;

public class ejercicio9nuevo {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double a;
    double b;
    double c;
    double x1;
    double x2;

    System.out.print("Resolver ecuacion de segundo grado \n");

    System.out.print("Por favor, introduzca el valor de a: \n");

    a = Double.parseDouble(s.nextLine());

    System.out.print("Por favor, introduzca el valor de b: \n");

    b = Double.parseDouble(s.nextLine());

    System.out.print("Por favor, introduzca el valor de c: \n");

    c = Double.parseDouble(s.nextLine());


    if ((a == 0) && (b == 0) && (c == 0)){

      System.out.println("La ecuación tiene infinitas soluciones.");

    }
    if ((a == 0) && (b == 0) && (c != 0)) {

      System.out.println("La ecuación no tiene solución.");

    }
    if ((a != 0) && (b != 0) && (c ==0 )){

      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));

    }
    if ((a == 0) && (b != 0) && (c != 0)) {

      System.out.println("x1 = x2 = " + (-c / b));

    }
    if ((a != 0) && (b != 0) && (c != 0)) {

      double discriminante = b*b - (4 * a * c);
      //double discriminante = ((bb)-4ac);    {Fallaba la expresión}

    if (discriminante <0){

      System.out.println("No se puede calcular");

    } else {

      double raiz = Math.sqrt(discriminante);

      x1 = ((-b +raiz)/(2*a));
      x2 = ((-b -raiz)/(2*a));

      System.out.printf("x1 = %.2f \n",x1);
      System.out.printf("x2 = %.2f \n",x2);

      }
    }
  }
}
