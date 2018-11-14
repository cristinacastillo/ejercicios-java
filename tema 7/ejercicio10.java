
public class ejercicio10 {

	public static void main(String[] args) {

		int[] num = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];

		int par = 0;
		int impar = 0;

		for (int i = 0; i < 20; i++) {

			num[i] = (int) (Math.random() * 101);

		}

		for (int i = 0; i < 20; i++) {

			if (num[i] % 2 == 0) {
				pares[i] = num[i];

				par++;

			} else if (num[i] % 2 != 0) {
				impares[i] = num[i];

				impar++;
			}

		}

		for (int i = 0; i < par; i++) {

			num[i] = pares[i];

		}

		for (int i = 0; i < impar; i++) {

			num[i + par] = impares[i];

		}

		for (int i = 0; i < 20; i++) {

			System.out.println("Posicion[" + (i + 1) + "]=" + num[i]);

		}
	}

}
