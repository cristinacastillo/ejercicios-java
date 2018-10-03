public class factura{
  public static void main(String[]args){


    double baseimponible= 23.89;
    
    System.out.printf(" Base imponible %8.2f\n", baseimponible);
    System.out.printf(" IVA            %8.2f\n", baseimponible * 0.21);   
    System.out.printf(" --------------------\n", baseimponible);
    System.out.printf(" Total          %8.2f\n", (baseimponible * 0.21)+baseimponible);
    
}
}
