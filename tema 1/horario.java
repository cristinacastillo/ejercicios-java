public class horario{
  public static void main(String[]args){

    String rojo= "\033[31m";
    String verde= "\033[32m";
    String naranja= "\033[33m";
    String azul= "\033[34m";
    String morado= "\033[35m";
    String blanco= "\033[37m";



    

    System.out.println("LUNES\tMARTES\tMIERCOLES\tJUEVES\tVIERNES");
    System.out.println("=====\t======\t=========\t======\t=======");
    System.out.println(verde +"EED"+ rojo +"\tSI" + naranja +"\tPROG\tPROG"+ azul +"\tSI");
    System.out.println(morado +"LM"+ azul +"\tSI"+ naranja + "\tPROG\tPROG"+ azul +"\tSI");
    System.out.println(morado +"LM"+ azul +"\tSI"+ naranja + "\tPROG"+ verde +"\tEED"+ azul +"\tSI");
    System.out.println("R\tE\tCR\tE\tO");
    System.out.println(blanco +"BD"+ naranja +"\tPROG"+ blanco +"\tBD"+ verde +"\tEED"+ verde +"\tFOL");
    System.out.println(blanco +"BD"+ naranja +"\tPROG"+ blanco +"\tBD"+ morado +"\tLM"+ verde +"\tFOL");
    System.out.println(blanco +"BD"+ naranja +"\tPROG"+ blanco +"\tBD"+ morado +"\tLM"+ verde +"\tFOL");

}
}
