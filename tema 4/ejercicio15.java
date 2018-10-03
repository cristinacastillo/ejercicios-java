import java.util.Scanner;
public class ejercicio15{
  public static void main(String[]args){
  
  
      int opcion;
      String r;
      
      Scanner s= new Scanner(System.in);
      
      System.out.println("Para dibujar la pirámide introduce una de las opciones numéricas: ");
      System.out.println("1. Vértice hacia arriba");
      System.out.println("2. Vértice hacia abajo");
      System.out.println("3. Vértice hacia la derecha");
      System.out.println("4. Vértice hacia la izquierda");
      System.out.println("Introduce la opción:  ");
      opcion=Integer.parseInt(s.nextLine());
      
      System.out.println("Introduce el caracter elegido: ");
      r=System.console().readLine();
      System.out.println("\n");
      
      switch(opcion){
        
        case 1:
          System.out.println("   "+r);
          System.out.println(" "+r+r+r);
          System.out.println(r+r+r+r+r+r+r);
        break;
        
        case 2:
          System.out.println(r+r+r+r+r+r+r);
          System.out.println(" "+r+r+r);
          System.out.println("   "+r);
        break;
        
        case 3:
          System.out.println(r);
          System.out.println(r+r);
          System.out.println(r+r+r);
          System.out.println(r+r+r+r);
          System.out.println(r+r+r+r+r);
          System.out.println(r+r+r+r);
          System.out.println(r+r+r);
          System.out.println(r+r);
          System.out.println(r);
          
        case 4:
          System.out.println("    "+r);
          System.out.println("   "+r+r);
          System.out.println("  "+r+r+r);
          System.out.println(" "+r+r+r+r);
          System.out.println(r+r+r+r+r);
          System.out.println(" "+r+r+r+r);
          System.out.println("  "+r+r+r);
          System.out.println("   "+r+r);
          System.out.println("    "+r);
          break;
        }
      }
    }
          
    
      
