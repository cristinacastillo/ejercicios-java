import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {

		int[] ocupadas = new int[10];

		Scanner s = new Scanner(System.in);

		int personas = 8;

		boolean salida = false;
		boolean sentados = false;

		for (int i = 0; i < 10; i++) {

			ocupadas[i] = (int) (Math.random() * 5);

		}

		System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
		System.out.println("│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │");
		System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
		System.out.printf("│Ocupación│%4d│%4d│%4d│%4d│%4d│%4d│%4d│%4d│%4d│%4d│\n", ocupadas[0], ocupadas[1],
				ocupadas[2], ocupadas[3], ocupadas[4], ocupadas[5], ocupadas[6], ocupadas[7], ocupadas[8], ocupadas[9]);
		System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");

		while (salida == false) {

			for (int i = 0; ((personas > 4) && (salida == false)); i++) {

				System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
				personas = s.nextInt();

				if (personas > 4) {

					System.out.println(
							"Lo siento, no admitimos grupos de este tamaño, haga grupos de 4 personas como máximo e intente de nuevo");
				}
				if (personas == -1) {

					salida = true;
				}
			}

			if (salida == false) {

				for (int i = 0; ocupadas[i] == 0; i++) {

					sentados = true;
				}

				for (int i = 0; ocupadas[i] <= 5 && sentados == false; i++) {

					if ((ocupadas[i] + personas) <= 4) {

						ocupadas[i] += personas;

						System.out.println("Sientate en la mesa: " + (i + 1));

						sentados = true;

					}

				}
			}
			if (salida == false) {

				System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
				System.out.println("│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │");
				System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
				System.out.printf("│Ocupación│%4d│%4d│%4d│%4d│%4d│%4d│%4d│%4d│%4d│%4d│\n", ocupadas[0], ocupadas[1],
						ocupadas[2], ocupadas[3], ocupadas[4], ocupadas[5], ocupadas[6], ocupadas[7], ocupadas[8],
						ocupadas[9]);
				System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
			}

			personas = 8;
			sentados = false;

		}

	}

}
