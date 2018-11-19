import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {

		int[] numero = new int[20];

		Scanner s = new Scanner(System.in);
		int mult;

		for (int i = 0; i < 20; i++) {

			numero[i] = (int) (Math.random() * 401);

		}

		for (int i = 0; i < 20; i++) {

			System.out.print(numero[i] + " ");

		}

		System.out.println();

		System.out.println("Intruduce *1*--> Multiplos de 5.  *2*--> Multiplos de 7");
		mult = s.nextInt();

		s.close();

		for (int i = 0; i < 20; i++) {

			if ((mult == 1) && ((numero[i] % 5) == 0)) {

				System.out.print("[" + numero[i] + "] ");
			}
			if ((mult == 2) && ((numero[i] % 7) == 0)) {

				System.out.print("[" + numero[i] + "] ");
			} else {
				System.out.print(numero[i] + " ");

			}

		}
	}

}
