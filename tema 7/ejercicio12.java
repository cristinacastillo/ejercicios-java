import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {

		int[] num = new int[10];

		int numero1;
		int numero2;
		int aux = 0;
		int aux2 = 0;
		int aux3 = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce 10 números: ");

		for (int i = 0; i < 10; i++) {

			num[i] = s.nextInt();

		}

		for (int i = 0; i < 10; i++) {

			System.out.println("Posicion[" + i + "]=" + num[i]);
		}

		System.out.println("Introduce la posición incial: ");
		numero1 = s.nextInt();

		System.out.println("Introduce la posición final: ");
		numero2 = s.nextInt();

		s.close();

		aux = num[numero2];
		aux2 = num[9];

		for (int i = (numero2 + 1); i < 10; i++) {
			aux3 = num[i];
			num[i] = aux;
			aux = aux3;

		}

		num[numero2] = num[numero1];

		for (int i = 0; i <= numero1; i++) {
			aux3 = num[i];
			num[i] = aux;
			aux = aux3;

		}

		System.out.println();

		for (int i = 0; i < 10; i++) {

			System.out.println("Posicion[" + i + "]=" + num[i]);
		}
	}

}
