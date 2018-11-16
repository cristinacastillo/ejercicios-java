import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {

		int[] num = new int[20];

		int opcion;

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {

			num[i] = (int) (Math.random() * 401);

		}

		System.out.println("Indica si quieres resaltar los multiplos de *5* o de *7*: ");
		opcion = s.nextInt();
		System.out.println();

		for (int i = 0; i < 20; i++) {

			if ((opcion == 5) && (num[i] % 5) == 0) {

				System.out.print("[" + num[i] + "]");

			}
			if ((opcion == 7) && (num[i] % 5) == 0) {

				System.out.print("[" + num[i] + "]");

			} else {

				System.out.print(num[i] + " ");

			}
		}

	}

}
