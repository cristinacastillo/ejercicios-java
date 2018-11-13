import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {

		int[] numero = new int[15];

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce 15 numeros por teclado");

		for (int i = 0; i < 15; i++) {

			numero[i] = s.nextInt();

		}
		s.close();

		for (int i = 0; i < 15; i++) {

			System.out.println("Posicion[" + i + "]=" + numero[i]);

		}

	}

}
