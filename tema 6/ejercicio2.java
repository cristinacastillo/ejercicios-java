public class ejercicio2 {
  public static void main(String[] args) { 
    
    System.out.println("Muestra una carta de la baraja francesa al azar:");
    
    
    int carta = 0;
    int palo = 0;
    
    //for(int i=0; i<=1; i++){
        
      palo=(int)(Math.random()*3) + 1;
      carta=(int)(Math.random()*13) + 1;
    
    //}
    
    switch(palo) {
      
        case 1:
        System.out.println("PICAS");
        
        break;
        
        case 2:
        System.out.println("CORAZONES");
        
        break;
        
        case 3:
        System.out.println("DIAMANTES"); 
        
        break;
        
        case 4:
        System.out.println("TREBOLES");
        
        break;
        
    }
    
    switch(carta) {
      
        case 1:
        System.out.println("A");
        
        break;
        
        case 2:
        System.out.println("2");
        
        break;
        
        case 3:
        System.out.println("3");
        
        break;
        
        case 4:
        System.out.println("4");
        
        break;
        
        case 5:
        System.out.println("5");
        
        break;
        
        case 6:
        System.out.println("6");
        
        break;
        
        case 7:
        System.out.println("7"); 
        
        break;
        
        case 8:
        System.out.println("8");
        
        break;
        
        case 9:
        System.out.println("9");
        
        break;
        
        case 10:
        System.out.println("10");
        
        break;
        
        case 11:
        System.out.println("J");
        
        break;
        
        case 12:
        System.out.println("Q");
        
        break;
        
        case 13:
        System.out.println("K");
        
        break;
    }
    
    
    
  }
  
}
