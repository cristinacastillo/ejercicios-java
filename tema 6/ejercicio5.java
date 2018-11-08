
public class ejercicio5 {

	public static void main(String[] args) {

		System.out.println("50 numero aleatorios entre el 100 y 199");

		int numero;

		int maximo = 0;
		int minimo = 200;
		int media;

		int acumulador = 0;

		for (int i = 1; i <= 50; i++) {

			numero = (int) (Math.random() * 100) + 100;

			System.out.print(numero + " ");

			acumulador += numero;

			if (numero <= minimo) {

				minimo = numero;

			}
			if (numero >= maximo) {

				maximo = numero;
			}

		}

		media = acumulador / 50;

		System.out.println("");
		System.out.println("Media : " + media);
		System.out.println("Mínimo : " + minimo);
		System.out.println("Máximo : " + maximo);

	}

}
