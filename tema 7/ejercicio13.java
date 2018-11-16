import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {

		int[] num = new int[100];

		int m;
		int maximo = 0;
		int minimo = 502;

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {

			num[i] = (int) (Math.random() * 501);

		}

		for (int i = 0; i < 100; i++) {

			System.out.print(num[i] + " ");

		}

		System.out.println();

		System.out.println("1.Maximo 2.Minimo ");
		m = s.nextInt();

		s.close();

		for (int i = 0; i < 100; i++) {

			if (num[i] < minimo) {

				minimo = num[i];

			}
			if (num[i] > maximo) {

				maximo = num[i];

			}

		}

		if (m == 1) {

			for (int i = 0; i < 100; i++) {

				if (num[i] == maximo) {

					System.out.print("*" + num[i] + "*");
				} else {
					System.out.print(num[i]);
				}

				System.out.print(" ");
			}
		}

		if (m == 2) {

			for (int i = 0; i < 100; i++) {

				if (num[i] == minimo) {

					System.out.print("**" + num[i] + "**");
				} else {
					System.out.print(num[i]);
				}

				System.out.print(" ");
			}
		}

	}

}
