
public class ejercicio10 {

	public static void main(String[] args) {

		
		String caracter = "";
		int tipocaracter;
		
		
		//for(int i=1; i<=1; i++) {
			
		
		tipocaracter=(int)(Math.random()*6);
		
		switch(tipocaracter) {
		
		case 0:
			
			caracter = "@";
		
		break;
		
		case 1:
		
			caracter = "|";
			
		break;
		
		case 2:
			
			caracter = "*";
		
		break;
		
		case 3:
			
			caracter = "-";
		
		break;
		
		case 4:
			
			caracter = "=";
		
		break;
		
		case 5:
			
			caracter = ".";
		
		break;
		
		default:
			
		caracter=String.valueOf(tipocaracter);
		
		
		}
				
	}

}
