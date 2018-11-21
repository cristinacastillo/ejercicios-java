
public class ejercicio5 {

	public static void main(String[] args) {

		int[][] n = new int[6][10];

		int maximo = 0;
		int minimo = 1000;

		int maxCol = 0;
		int maxFil = 0;

		int minCol = 0;
		int minFil = 0;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				n[i][j] = (int) (Math.random() * 1001);

			}
		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				if (n[i][j] > maximo) {

					maximo = n[i][j];

					maxCol = j;
					maxFil = i;
				}
				if (n[i][j] < minimo) {

					minimo = n[i][j];

					minCol = j;
					minFil = i;
				}
			}
		}

		System.out.println("Máximo posición: [" + maxFil + "][" + maxCol + "] = " + maximo);
		System.out.println("Mínimo posición: [" + minFil + "][" + minCol + "] = " + minimo);

	}

}
