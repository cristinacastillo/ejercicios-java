import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {

		
		int[] num = new int[10];
		
		int numero1;
		int numero2;

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce 10 n�meros: ");


		for (int i = 0; i < 10; i++) {

			num[i] = s.nextInt();

		}
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Posicion[" + (i + 1) + "]=" + num[i]);
		}
		
		System.out.println("Introduce la posici�n incial: ");
		numero1=s.nextInt();
		
		System.out.println("Introduce la posici�n final: ");
		numero2=s.nextInt();
		
		for(int i=0; i<10; i++) {
			
			if(i==numero1) {
				
				numero2 = i;
			
			}
			
		}
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Posicion[" + (i + 1) + "]=" + num[i]);
			
		}
		
		
		
		
		
		
	}

}
