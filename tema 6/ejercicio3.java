public class ejercicio3 {
  public static void main(String[] args) { 


  System.out.println("Muestra un día de la semana al azar:");
    
    
    int carta = 0;
    int palo = 0;
    
    //for(int i=0; i<=1; i++){
        
      palo=(int)(Math.random()*3) + 1;
      carta=(int)(Math.random()*9) + 1;
    
    //}
    
    switch(palo) {
      
        case 1:
        System.out.println("OROS");
        
        break;
        
        case 2:
        System.out.println("COPAS");
        
        break;
        
        case 3:
        System.out.println("ESPADAS"); 
        
        break;
        
        case 4:
        System.out.println("BASTOS");
        
        break;
        
    }
    
    switch(carta) {
      
        case 1:
        System.out.println("1");
        
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
        System.out.println("SOTA");
        
        break;
        
        case 9:
        System.out.println("CABALLO");
        
        break;
        
        case 10:
        System.out.println("REY");
        
        break;
        
        
    }
    
    
    
  }
  
}
