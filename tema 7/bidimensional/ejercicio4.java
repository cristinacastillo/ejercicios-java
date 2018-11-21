import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) 
			throws InterruptedException{

		int[][] n = new int[5][6];

		int numero;

		Scanner s = new Scanner(System.in);


		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				numero = (int) (Math.random() * 900) + 100;

				n[i][j] = numero;

				n[i][5] += n[i][j];
				

			}

			n[4][5] += n[i][5];
		}

		s.close();

		System.out.println("Array num   Col0  Col1  Col2  Col3  Col4 ");
		System.out.println("-------------------------------------------------------");
		System.out.printf("Fila 0 |  %5d %5d %5d %5d %5d    total", n[0][0], n[0][1], n[0][2], n[0][3], n[0][4],n[0][5]);
		Thread.sleep(500);
		System.out.printf(" %5d \n", n[0][5]);
		System.out.println("-------------------------------------------------------");
		System.out.printf("Fila 1 |  %5d %5d %5d %5d %5d    total %5d\n", n[1][0], n[1][1], n[1][2], n[1][3], n[1][4],n[1][5]);
		System.out.println("-------------------------------------------------------");
		System.out.printf("Fila 2 |  %5d %5d %5d %5d %5d    total %5d\n", n[2][0], n[2][1], n[2][2], n[2][3], n[2][4],n[2][5]);
		System.out.println("-------------------------------------------------------");
		System.out.printf("Fila 3 |  %5d %5d %5d %5d %5d    total %5d\n", n[3][0], n[3][1], n[3][2], n[3][3], n[3][4],n[3][5]);
		System.out.println("------------------------------------------------------");
		System.out.printf("Total--------------------------------------------%5d", n[4][5]);

	}

}