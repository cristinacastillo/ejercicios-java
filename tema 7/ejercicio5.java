import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {

		int[] numero = new int[10];

		int maximo = 0;
		int minimo = 11;

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce números: ");

		for (int i = 0; i < 10; i++) {

			numero[i] = s.nextInt();

			if (numero[i] < minimo) {

				minimo = numero[i];

			}
			if (numero[i] > maximo) {

				maximo = numero[i];

			}

		}
		s.close();

		System.out.println();

		for (int i = 0; i < 10; i++) {

			System.out.print(numero[i]);

			if (numero[i] == maximo) {

				System.out.print(" maximo");
			}

			if (numero[i] == minimo) {

				System.out.print(" minimo");
			}

			System.out.println();

		}

	}

}
