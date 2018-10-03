public class sumaNum{
  public static void main(String[]args){

    int num1;
    int num2;
    int resultado;
    
    String lineaDeEntrada;
    
    System.out.println("\nIntroduzca el primer sumando: ");
    lineaDeEntrada = System.console().readLine();
    num1 = Integer.parseInt(lineaDeEntrada);  
      
    System.out.println("\nIntroduzca el segundo sumando: ");
    lineaDeEntrada = System.console().readLine();
    num2 = Integer.parseInt(lineaDeEntrada);

    System.out.printf("\nnum1 = %d ; num2 = %d\n",num1,num2);
      
    resultado = num1 + num2;
    
    System.out.printf("\n %d + %d = %d ",num1,num2,resultado);






}
}
