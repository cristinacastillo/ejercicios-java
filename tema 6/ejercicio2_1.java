public class ejercicio2_1 {
    public static void main(String[] args) {
        
        String palo = "";
        String carta;
        
        int tipopalo = (int)(Math.random()*4)+1;
        
        switch(tipopalo) {
        case 1:
            palo = "picas";
            break;
        
        case 2:
            palo = "corazones";
            break;
            
        case 3:
            palo = "diamantes";
            break;
        
        case 4:
            palo = "treboles";
            break;
        default:
        }
        
        int n = (int)(Math.random()*13)+1;
        
        switch(n) {
        case 11:
            carta = "J";
            break;
            
        case 12:
            carta = "Q";
            break;
            
        case 13:
            carta = "K";
            break;
            
        case 1:
            carta = "A";
            break;
            
        default:
            carta = String.valueOf(n);
        }
        
        System.out.println(carta+" de "+palo);
    }

}