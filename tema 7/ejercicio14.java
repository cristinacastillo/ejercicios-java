import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {

		String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		String[] palabra = new String[8];
		String[] nuevo = new String[8];

		Scanner s = new Scanner(System.in);

		
		System.out.println("Introduzca 8 palabras (Colores disponibles: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco, morado ):");
		
		for (int i = 0; i < 8; i++) {
			
			palabra[i] = s.nextLine();

		}

		s.close();

		System.out.println(" ");

		// Muestra el antiguo array

		for (int i = 0; i < 8; i++) {
			
			System.out.println(palabra[i]);
		}

		int contador = 0;
		int contador1 = 7;
		boolean color = false;

		// Seleccionar palabra

		for (int i = 0; i < 8; i++) {

			// Bucle comprueba valores

			for (int j = 0; ((j < 9) && (color == false)); j++) {

				// Comprobar si es color

				if (palabra[i].equals(colores[j])) {
					nuevo[contador] = palabra[i];
					contador++;
					color = true;
				}

			}

			// Si no es color añadelo desde la ultima posicion del array

			if (color == false) {
				nuevo[contador1] = palabra[i];
				contador1--;
			}

			// Cambia color a false para poder hacer 2º bucle for

			color = false;
		}

		System.out.println("");

		// Muestra el nuevo array

		for (int i = 0; i < 8; i++) {
			System.out.println(nuevo[i]);
		}

	}
}