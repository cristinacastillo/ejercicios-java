import java.lang.*;
import java.util.Scanner;
public class ejercicio16{
  public static void main(String[]args){
  
  int r1;
  int r2;
  int r3;
  int r4;
  int r5;
  int r6;
  int r7;
  int r8;
  int r9;
  int r10;
  int total;
  
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
  System.out.println("1.Verdadero 2.Falso");
  r1=s.nextInt();
  
  if(r1==1){
    r1=3;
  }else{
    r1=0;
  }
  
  System.out.println("Ha aumentado sus gastos de vestuario");
  System.out.println("1.Verdadero 2.Falso");
  r2=s.nextInt();
  
  if(r2==1){
    r2=3;
  }else{
    r2=0;
  }
  
  System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
  System.out.println("1.Verdadero 2.Falso");
  r3=s.nextInt();
  
  if(r3==1){
    r3=3;
  }else{
    r3=0;
  }
  
  System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
  System.out.println("1.Verdadero 2.Falso");
  r4=s.nextInt();
  
  if(r4==1){
    r4=3;
  }else{
    r4=0;
  }
  
  System.out.println("No te deja que mires la agenda de su teléfono móvil");
  System.out.println("1.Verdadero 2.Falso");
  r5=s.nextInt();
  
  if(r5==1){
    r5=3;
  }else{
    r5=0;
  }
  
  System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
  System.out.println("1.Verdadero 2.Falso");
  r6=s.nextInt();
  
  if(r6==1){
    r6=3;
  }else{
    r6=0;
  }
  
  System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
  System.out.println("1.Verdadero 2.Falso");
  r7=s.nextInt();
  
  if(r7==1){
    r7=3;
  }else{
    r7=0;
  }
  
  System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
  System.out.println("1.Verdadero 2.Falso");
  r8=s.nextInt();
  
  if(r8==1){
    r8=3;
  }else{
    r8=0;
  }
  
  System.out.println("Has notado que últimamente se perfuma más");
  System.out.println("1.Verdadero 2.Falso");
  r9=s.nextInt();
  
  if(r9==1){
    r9=3;
  }else{
    r9=0;
  }
  
  System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
  System.out.println("1.Verdadero 2.Falso");
  r10=s.nextInt();
  
  if(r10==1){
    r10=3;
  }else{
    r10=0;
  }
  
  total = r1+r2+r3+r4+r5+r6+r7+r8+r9+r10;
  
  if(total<=10){
    System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
  }
  else if((total>=11)&&(total<=22)){
    System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
  }
  else{
    System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
  }
 }
}

  
  
  
  
