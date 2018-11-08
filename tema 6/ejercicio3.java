
public class ejercicio3 {

	public static void main(String[] args) {

		
		System.out.println("BARAJA ESPAÑOLA");
		
		String palo ="";
		String carta = "";
		
		int tipocarta;
		int tipopalo;
		
		tipopalo=(int)(Math.random()*4)+1;
		tipocarta=(int)(Math.random()*11)+1;
		
		switch(tipopalo){
			
			case 1:
				
				palo = "OROS";
				
				break;
				

			case 2:
				
				palo = "ESPADAS";
				
				break;
				

			case 3:
				
				palo = "COPAS";
				
				break;
				

			case 4:
				
				palo = "BASTOS";
				
				break;
		}
		
		switch(tipocarta){
		
		case 8:
			
			palo = "10 sota";
			
			break;
			

		case 9:
			
			palo = "11 caballo";
			
			break;
			

		case 10:
			
			palo = "12 rey";
			
			break;
			

		default:
			
			carta=String.valueOf(tipocarta);
	}
	
		
		System.out.println(palo);
		System.out.println(carta);

	}

}
