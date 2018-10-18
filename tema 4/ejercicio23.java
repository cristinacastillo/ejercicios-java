import java.util.Scanner;
public class ejercicio23{
  public static void main(String[]args){
    
    
  Scanner s = new Scanner(System.in);
  
  double baseImponible;
  
  String iva;
  
  String codigo;
  
  double resiva = 0;
  
  double rescodigo = 0;
  
  double respromo;
  
  System.out.println("Introduce la base imponible: ");
  baseImponible=Double.parseDouble(s.nextLine());
  
  
  System.out.println("Introduce el tipo de IVA (general, reducido o superreducido): ");
  iva=System.console().readLine();
  
  System.out.println("Introduce el codigo promocional (nopro, mitad, meno5 o 5porc)");
  codigo=System.console().readLine();

  if(iva.equals("general")){
  
      resiva = 0.21;
      
  }
  else if(iva.equals("reducido")){
      
      resiva = 0.10;
  }
  else if(iva.equals("superreducido")){
      
      resiva = 0.4;
  }
  
  if(iva.equals("nopro")){
  
      rescodigo = (baseImponible * resiva);
  }
  else if(iva.equals("mitad")){
      
      rescodigo = (baseImponible * resiva)/2;
  }
  else if(iva.equals("meno5")){
      
      rescodigo = (baseImponible * resiva)-5;
  }
  else if(codigo.equals("5porc")){
  
      rescodigo =((baseImponible*resiva) + baseImponible) *0.05;
  }
  double precioconiva = (baseImponible*resiva)+baseImponible;
  
  System.out.printf("Base imponible:  %.2f \n",baseImponible);
  System.out.printf("IVA(%.2f)          %.2f\n",resiva, resiva*baseImponible);
  System.out.printf("Precio con IVA:   %.2f\n", (resiva*baseImponible)+baseImponible);
  System.out.printf("Cód.promo. ("+codigo+") %.2f\n",rescodigo);
  System.out.printf("TOTAL:           %.2f\n",rescodigo);
 
 
  }
  
}
  
  
  
