import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int[] numero = new int[10];

		for(int i=0; i<10;i++) {
			
			System.out.println("Introduce un numero: ");
			numero[i]= s.nextInt();
		}
		
		for(int i =9; i>=0; i--) {
			
			System.out.print(numero[i]+" ");
		}
		
	}

}
