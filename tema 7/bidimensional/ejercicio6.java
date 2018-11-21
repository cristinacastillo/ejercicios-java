public class ejercicio6 {
	public static void main(String[] args) {

		int[][] num = new int[6][10];
		int[] nums = new int[60];

		int maximo = 0;
		int maximoFil = 0;
		int maximoCol = 0;

		int minimo = 1002;
		int minimoFil = 0;
		int minimoCol = 0;

		int contador = 0;

		// Bucle selecciona filas
		for (int i = 0; i < 6; i++) {

			// Bucle selecciona columnas
			for (int x = 0; x < 10; x++) {

				// Crear variable para comprobacion
				boolean comprobacion = false;

				// Bucle Para que no se repita
				while (comprobacion == false) {

					int aux;
					aux = (int) (Math.random() * 1001);

					// Bucle compara valor con valores ya existentes
					for (int c = 0; c < 60; c++) {

						// Comprobar que en cada vuelta no exista el num de "aux"
						if (aux != nums[c]) {
							comprobacion = true;
						} else {
							comprobacion = false;
						}

					}
					// Si el num de "aux" no existe, aÃ±adelo al array
					if (comprobacion == true) {
						num[i][x] = aux;
					}
				}

				// AÃ±ade el numero obtenido para el array, al array nums, para comparar en la
				// siguiente vuelta
				nums[contador] = num[i][x];
				contador++;

				// Bucle compara el maximo
				if (num[i][x] > maximo) {
					maximo = num[i][x];
					maximoCol = x;
					maximoFil = i;
				}

				// Bucle compara el minimo
				if (num[i][x] < minimo) {
					minimo = num[i][x];
					minimoCol = x;
					minimoFil = i;
				}
			}
		}
		System.out.println("Máximo posición: [" + maximoFil + "][" + maximoCol + "] = " + maximo);
		System.out.println("Mínimo posición: [" + minimoFil + "][" + minimoCol + "] = " + minimo);

		for (int i = 0; i < 6; i++) {
			for (int x = 0; x < 10; x++) {
				System.out.print(" " + num[i][x]);
			}
		}
	}

}
