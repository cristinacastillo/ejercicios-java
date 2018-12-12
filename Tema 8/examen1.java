public class examen1 {
	public static void main(String[] args) {

		System.out.println("Rellenamos array");

		int[] array = new int[10];
		int[] aux1 = new int[10];
		int[] aux2 = new int[10];
		int contador1 = 0;
		int contador2 = 0;
		int max = 0;
		int min = 0;

		// Genera los numeros contenidos en el array
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 200);
		}

		// Printea el indice del array
		System.out.print("Filas: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%5d", i);
		}

		System.out.println(" ");

		// Printea el array original
		System.out.print("Filas: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%5d", array[i]);
		}

		System.out.println(" ");

		System.out.println("----------------------------------------------------");

		// Busca menor y mayor en el array original y va almacenando en los arrays
		// "aux1" y "aux2"
		for (int i = 0; i < 10; i++) {
			if (array[i] < 100) {
				aux1[contador1] = array[i];
				contador1++;
			} else if (array[i] >= 100) {
				aux2[contador2] = array[i];
				contador2++;
			}
		}

		// Compara los dos contadores para definir la variable max y min para obtener el
		// numero de extraidos
		if (contador1 > contador2) {
			max = contador1;
			min = contador2;
		} else if (contador2 > contador1) {
			max = contador2;
			min = contador1;
		}

		// Printea el indice del array
		System.out.print("Filas: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%5d", i);
		}

		System.out.println(" ");

		// Combinar array "aux1" y "aux2", alternando entre el menos y mayor
		System.out.print("Filas: ");

		// Iniciamos el bucle hasta el maximo de numeros
		for (int i = 0; i < max; i++) {
			// Array "aux1", Si el valor del array en la posicion i es 0, muestra espacio en
			// blanco, si no muestra el numero (minimo)
			if (aux1[i] == 0) {
				System.out.print("");
			} else {
				System.out.printf("%5d", aux1[i]);
			}
			// Array "aux2", Si el valor del array en la posicion i es 0, muestra espacio en
			// blanco, si no muestra el numero (maximo)
			if (aux2[i] == 0) {
				System.out.print("");
			} else {
				System.out.printf("%5d", aux2[i]);
			}
		}

		System.out.println(" ");

	}
}
