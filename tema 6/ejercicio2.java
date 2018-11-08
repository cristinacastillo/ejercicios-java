

public class ejercicio2 {
	public static void main(String[] args) {

	
	String carta;
	String palo ="";
	
	int tipopalo;
	int tipocarta;
	
	System.out.println("BARAJA FRANCESA");
	
	tipocarta=(int)(Math.random()*13)+1;
	tipopalo=(int)(Math.random()*4)+1;
	
	
	switch(tipopalo) {
	
	case 1:
		
		palo = "PICAS";
		
		break;
	
	case 2:
		
		palo = "CORAZONES";
		
		break;
		
	case 3:
		
		palo = "DIAMANTES";
		
		break;
		
	case 4:
		
		palo = "TRÉBOLES";
		
		break;
		
	}
	
	
	switch(tipocarta) {
	
	case 1: 
		
		carta ="A";
		
		break;
		
	case 11:
		
		carta = "J";
		
		break;
	
	case 12:
		
		carta = "Q";
		
		break;
		
	case 13:
		
		carta = "K";
		
		break;
		
	default:
		
		carta=String.valueOf(tipocarta);
		
	}
	
	System.out.println(palo);
	System.out.println(carta);
	
	}
}
