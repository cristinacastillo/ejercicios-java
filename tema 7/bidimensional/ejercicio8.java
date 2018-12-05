import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {

		int[][] tablero = new int[8][8];

		Scanner s = new Scanner(System.in);

		String posicion;

		int filAlfil;
		int colAlfil;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				tablero[i][j] = 0;
			}
		}

		System.out.println("Introduce la posción del alfil: ");
		posicion = s.nextLine();

		s.close();

		filAlfil = posicion.charAt(1) - '0';
		filAlfil = 8 - filAlfil;

		colAlfil = posicion.charAt(0) - 'a';

		// posicionar el alfil

		tablero[filAlfil][colAlfil] = 1;

		// diagonal izq arriba
		int i = filAlfil - 1;
		int j = colAlfil - 1;

		while ((i >= 0) && (j >= 0)) {

			tablero[i][j] = 2;

			i--;
			j--;
		}

		// diagonal dcha arriba
		i = filAlfil - 1;
		j = colAlfil + 1;

		while ((i >= 0) && (j < 8)) {

			tablero[i][j] = 2;

			i--;
			j++;
		}

		// diagonal dcha abajo
		i = filAlfil + 1;
		j = colAlfil + 1;

		while ((i < 8) && (j < 8)) {

			tablero[i][j] = 2;

			i++;
			j++;
		}

		// diagonal izq abajo
		i = filAlfil + 1;
		j = colAlfil - 1;

		while ((i < 8) && (j >= 0)) {

			tablero[i][j] = 2;

			i++;
			j--;
		}

		// presentar las coordenadas

		for (i = 7; i >= 0; i--) {

			for (j = 0; j < 8; j++) {

				if (tablero[i][j] == 2) {

					System.out.print((char) ('a' + j));
					System.out.print(8 - i + " ");

				}
			}
		}
	}

}
