import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int[] primo = new int[10];
		int[] noprimo = new int[10];

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce 10 números: ");

		int primos = 0;
		int noprimos = 0;
		
		boolean p = false;

		for (int i = 0; i < 10; i++) {

			num[i] = s.nextInt();

		}

		s.close();
		
		for(int i =2; i<10;i++) {
			
			for(int j=0 ; j<10;j++) {
				
				
				
			}
		}

		for (int i = 0; i < 10; i++) {

			if () {

				primo[i] = num[i];

				primos++;

			} else {

				noprimo[i] = num[i];

				noprimos++;

			}

		}

		for (int i = 0; i < primos; i++) {

			num[i] = primo[i];

		}

		for (int i = 0; i < noprimos; i++) {

			num[i + primos] = noprimo[i];

		}

		for (int i = 0; i < 10; i++) {

			System.out.println("Posicion[" + (i + 1) + "]=" + num[i]);

		}

	}

}
