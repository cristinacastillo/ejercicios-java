import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {

		int[] numero = new int[100];

		int num1;

		int num2;

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {

			numero[i] = (int) (Math.random() * 21);

			System.out.print(numero[i] + " ");
		}

		System.out.println(" ");
		System.out.println("Introduce un numero de los genereados: ");
		num1 = s.nextInt();
		System.out.println("Introduce el numero por el que quieres sustituirlo: ");
		num2 = s.nextInt();

		s.close();

		for (int i = 0; i < 100; i++) {

			if (numero[i] == num1) {

				numero[i] = num2;
				System.out.println("'" + numero[i] + "'");
			} else {

				System.out.println(numero[i] + " ");
			}
		}

	}

}
