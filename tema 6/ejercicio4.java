
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("20 numero aleatorios entre el 0 y 10");
		
		int numero;
		
		for(int i= 1; i<=20; i++) {
		
		numero= (int)(Math.random()*11);
		
		System.out.print(numero+" ");
		
		}
	}

}
