import java.util.Scanner;

public class ejercicio23corregido {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double baseimponible;

    String iva;

    double riva = 0;
    
    String codigo;

    double rcodigo = 0;

    double rpromo = 0;

    System.out.println("Introduzca la base imponible:");

    baseimponible = Double.parseDouble(s.nextLine());

    System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");

    iva = s.nextLine();

    System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");

    codigo = s.nextLine();

    if (iva.equals("general")){

      riva = 0.21;

    }else if (iva.equals("reducido")){

      riva = 0.10;

    }else if (iva.equals("superreducido")){

      riva = 0.4;

    }

    if(codigo.equals("nopro")){

      rcodigo = (baseimponible * riva) + baseimponible;

    }else if(codigo.equals("mitad")){

      rcodigo = (((baseimponible * riva) + baseimponible) /2);
      rpromo = (((baseimponible * riva) + baseimponible) /2);

    }else if(codigo.equals("meno5")){

      rcodigo = (((baseimponible * riva) + baseimponible) - 5);
      rpromo = 5;

    }else if(codigo.equals("5porc")){

      rcodigo = ((((baseimponible * riva)+ baseimponible) * 0.05)+ baseimponible);
      rpromo = (((baseimponible * riva)+ baseimponible) * 0.05);

    }

    double precioconiva = (baseimponible * riva)+ baseimponible;

    System.out.printf("Base imponible:             %.2f \n",baseimponible);
    System.out.printf("IVA(%.2f)                   %.2f \n",riva,baseimponible * riva);
    System.out.printf("Precio con iva              %.2f \n",precioconiva);
    System.out.printf("Cód. promo. ("+codigo+"):       -%.2f \n",rpromo);
    System.out.printf("Total                       %.2f \n",rcodigo);



  }  
}
