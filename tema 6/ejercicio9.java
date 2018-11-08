
public class ejercicio9 {

	public static void main(String[] args) {

		int numero = 0;

		int pares = 0;

		for (int i = 1; numero != 24; i++) {

			numero = (int) (Math.random() * 101);

			if ((numero % 2) == 0) {

				System.out.print(numero + " ");

				pares++;
			}

		}

		System.out.println("");
		System.out.println("Se han generado " + (pares - 1) + " numeros");

	}

}
