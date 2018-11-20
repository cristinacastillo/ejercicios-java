import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {

		int[] num = new int[10];

		Scanner s = new Scanner(System.in);

		boolean salida = false;

		int valor = 0;
		int ultimo;

		for (int i = 0; i < 10; i++) {

			num[i] = (int) (Math.random() * 101);
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("[" + i + "]" + num[i]);
		}

		while (salida == false) {

			System.out.println("Introduce un número del 0 al 100: ");
			valor = s.nextInt();

			for (int j = 0; j < 10; j++) {

				if (valor == num[j]) {

					salida = true;

				}
			}

			if (salida == false) {

				System.out.println("Incorrecto ");

			}
		}

		s.close();


		while (valor != num[0]) {

			// Guarda el ultimo

			ultimo = num[9];

			// Rotacion a la derecha una posicion

			for (int i = 9; i > 0; i--) {

				num[i] = num[i - 1];
			}
			
			//Se coloca el primero
			
			num[0]= ultimo;

		}
		
		for (int i = 0; i < 10; i++) {

			System.out.println("[" + i + "]" + num[i]);
		}

	}

}
