import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {

		int numero;

		numero = (int) (Math.random() * 101);

		int intento = 0;

		Scanner s = new Scanner(System.in);

		for (int i = 1; (numero != intento) && (i <= 5); i++) {

			System.out.println("Adivina un número entre el 0 y el 100");
			intento = s.nextInt();

			if (intento < numero) {

				System.out.println("El número secreto es mayor");

			}
			if (intento > numero) {

				System.out.println("El número secreto es menor");

			}

			if (intento == numero) {

				System.out.println("Has acertado el número secreto");

			}

			System.out.println("Numero de intentos : " + i);

		}

	}

}
