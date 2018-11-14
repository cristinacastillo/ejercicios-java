import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {

		int[] num = new int[8];

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce 8 números: ");

		for (int i = 0; i < 8; i++) {

			num[i] = s.nextInt();

		}

		s.close();

		for (int i = 0; i < 8; i++) {

			if (num[i] % 2 == 0) {

				System.out.println("Posicion[" + (i + 1) + "]=" + num[i] + " PAR");
			} else if (num[i] % 2 != 0) {

				System.out.println("Posicion[" + (i + 1) + "]=" + num[i] + " IMPAR");
			}

		}

	}

}
