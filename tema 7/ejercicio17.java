import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {

		int[] num = new int[10];

		Scanner s = new Scanner(System.in);

		boolean salida = false;

		int valor = 0;

		for (int i = 0; i < 10; i++) {

			num[i] = (int) (Math.random() * 101);
		}

		for (int i = 0; i < 10; i++) {

			System.out.print(num[i] + " ");
		}

		while (salida == false) {
			for (int i = 0; i < 10; i++) {

				for (int j = 0; j < 10; j++) {

					if (valor != num[j]) {

						System.out.println("Introduce un número del 0 al 100: ");
						valor = s.nextInt();

					} else {

						valor = num[j];

						salida = true;

					}
				}
			}
		}

	}

}
