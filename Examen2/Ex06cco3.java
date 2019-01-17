
public class Ex06cco3 {  

  public static double precioTotalUnidades(double precio, double unidades, double descuento){

    double preciouni = 0;

    if(descuento == 685){

      preciouni = (precio * unidades) - 15;
    }
    if((descuento == 778) && (unidades > 20)){

      preciouni = ((precio * 20) - ((precio * 20) * 0.05)) + (precio * (unidades - 20));

    }
    if((descuento == 219) && (unidades < 6)){

      preciouni = unidades  * precio;
    }
    else{
      preciouni = precio * unidades;
    }

    return preciouni;
  }

  public static double devuelveNumCod(double descuento){

    boolean descuentocorrecto = false;

    //SI EL CODIGO ES INCORRECTO SE MOSTRARA UN 0
    if((descuento == 685) && (descuento == 778) && (descuento == 219))

      descuentocorrecto = true;

    else if(descuentocorrecto == false){

      descuento = 0;

    }

    return descuento;
  }

  public static double descuentoApli(double precio, double unidades, double descuento){

    double descuentoApli = 0;

    //CANTIDAD DE DINERO QUE SE LE VA A RESTAR AL PRECIO TOTAL DE UNIDADES
    if(descuento == 685){

      descuentoApli =  15;
    }
    if((descuento == 778) && (unidades > 20)){

      descuentoApli = (precio * 5) * 0.05;

    }
    if((descuento == 219) && (unidades > 6)){

      descuentoApli = precio * 5;
    }
    

    return descuentoApli;
  }



  public static void main (String[] args) {

    //ALMACENAR DATOS
    System.out.println("Introduzca el precio del articulo (en Euros): ");
    double precio = Double.parseDouble(System.console().readLine());
    System.out.println("Indique el numero de unidades: ");
    double unidades = Double.parseDouble(System.console().readLine());
    System.out.println("Indique el codigo de descuento: ");
    double descuento = Double.parseDouble(System.console().readLine());
    System.out.println("A continuacion, se le muestra el precio desglosado del pedido: ");

    
    double precioDescuento = (precioTotalUnidades(precio, unidades, descuento)) - (descuentoApli(precio, unidades, descuento));
    double precioIva = precioDescuento * 0.21;
    double precioTotal = precioDescuento + precioIva;

    //no pongo el simbolo € , % en el 21 ni las tildes porque la terminal no los reconoce.
    System.out.printf("-----------------------------------------------------\n");
    System.out.printf("Precio del articulo: %26.2f euros\n",precio);
    System.out.printf("Numero de unidades: %24.0f \n",unidades);
    System.out.printf("Precio total unidades: %24.2f euros\n",precioTotalUnidades(precio, unidades, descuento));
    System.out.printf("Descuento aplicado: Codigo: %3.0f %15.2f euros\n",descuento, (descuentoApli(precio, unidades, descuento)));
    System.out.printf("Precio con descuento: %25.2f euros\n",precioDescuento);
    System.out.printf("IVA (21): %37.2f euros\n",precioIva);
    System.out.printf("----------------------------------------------------- \n");
    System.out.printf("PRECIO FINAL:   %31.2f euros\n",precioTotal);
   
  }

}