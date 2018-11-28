import java.util.Scanner;

public class ejercicio7 {

	static final int VACIO = 0;
	static final int MINA = 1;
	static final int TESORO = 2;
	static final int INTENTO = 3;

	public static void main(String[] args) {

		int[][] cuadrante = new int[4][5];

		int minax;
		int minay;

		int tesorox;
		int tesoroy;

		int posicionx = 6;
		int posiciony = 6;

		int valorx;
		int valory;

		boolean paso = true;

		Scanner s = new Scanner(System.in);

		// inicializar el array

		for (int x = 0; x <= 3; x++) {

			for (int y = 0; y <= 4; y++) {

				cuadrante[x][y] = VACIO;
			}
		}

		// colocar la mina

		minax = (int) (Math.random() * 4);
		minay = (int) (Math.random() * 3);

		cuadrante[minax][minay] = MINA;

		// colocar el tesoro

		do {

			System.out.printf(" %5d %5d %5d %5d %5d\n", cuadrante[0][0], cuadrante[0][1], cuadrante[0][2],
					cuadrante[0][3], cuadrante[0][4]);
			System.out.printf(" %5d %5d %5d %5d %5d\n", cuadrante[1][0], cuadrante[1][1], cuadrante[1][2],
					cuadrante[1][3], cuadrante[1][4]);
			System.out.printf(" %5d %5d %5d %5d %5d\n", cuadrante[2][0], cuadrante[2][1], cuadrante[2][2],
					cuadrante[2][3], cuadrante[2][4]);
			System.out.printf(" %5d %5d %5d %5d %5d\n", cuadrante[3][0], cuadrante[3][1], cuadrante[3][2],
					cuadrante[3][3], cuadrante[3][4]);

			tesorox = (int) (Math.random() * 4);
			tesoroy = (int) (Math.random() * 3);

		} while ((minax == tesorox) && (minay == tesoroy));

		cuadrante[tesorox][tesoroy] = TESORO;

		do {

			System.out.println("Coodenada x: ");
			posicionx = s.nextInt();

			System.out.println("Coodenada y: ");
			posiciony = s.nextInt();

			paso = true;

			// Comprobar si el usuario ha encontado el tesoro o la mina

			if (cuadrante[posicionx][posiciony] == cuadrante[tesorox][tesoroy]) {

				System.out.println("Has encontrado el tesoro ");
				paso = false;

			} else if (cuadrante[posicionx][posiciony] == cuadrante[minax][minay]) {

				System.out.println("Has encontrado una mina ");
				paso = false;
			}

			// en base a los valores introducidos comprueba los alrededores de alcance 1
			if (paso == true) {

				// seleciona la columna
				for (int y = posiciony - 1; y < (posiciony - 1) + 2; y++) {
					// seleciona la fila
					for (int x = posicionx - 1; x < (posicionx - 1) + 2; x++) {

						// evita que se salga del cuadrante
						valorx = (x + 4) % 4;
						valory = (y + 5) % 5;

						// si en alguna posicion encuentra una mina
						if (cuadrante[valorx][valory] == MINA) {

							System.out.println("Tienes una mina cerca ");
						}

					}
				}
			}
			// mientras que no se encuente ni mina ni tesoro, sigue pidiendo posiciones
		} while (paso == true);

		s.close();
	}

}
