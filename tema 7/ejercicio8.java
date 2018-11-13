import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {

		int[] temp = new int[12];

		Scanner s = new Scanner(System.in);

		int mes;
		String mest = " ";

		for (int i = 0; i < 12; i++) {
			System.out.println("Introduce la tempereatura media del mes " + (i + 1));
			temp[i] = s.nextInt();

		}
		s.close();

		for (int i = 0; i < 12; i++) {

			mes = i;
			mest = " ";

			switch (mes) {

			case 0:
				mest = "Enero";
				break;
			case 1:
				mest = "Febrero";
				break;
			case 2:
				mest = "Marzo";
				break;
			case 3:
				mest = "Abril";
				break;
			case 4:
				mest = "Mayo";
				break;
			case 5:
				mest = "Junio";
				break;
			case 6:
				mest = "Julio";
				break;
			case 7:
				mest = "Agosto";
				break;
			case 8:
				mest = "Enero";
				break;
			case 9:
				mest = "Febrero";
				break;
			case 10:
				mest = "Enero";
				break;
			case 11:
				mest = "Febrero";
				break;

			}
			System.out.print(mest + ": " + temp[i] + " grados");
			for (int j = 0; j < temp[i]; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}
}
