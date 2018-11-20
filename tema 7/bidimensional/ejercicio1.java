
public class ejercicio1 {

	public static void main(String[] args) {

		int[][] n = new int[3][6];

		n[0][1] = 30;
		n[0][2] = 2;
		n[0][5] = 5;
		n[1][0] = 75;
		n[2][2] = -2;
		n[2][3] = 9;
		n[2][5] = 11;

		System.out.println("Array num   Col0  Col1  Col2  Col3  Col4  Col5");
		System.out.println("----------------------------------------------");
		System.out.printf("Fila 0 |  %5d %5d %5d %5d %5d %5d \n", n[0][0], n[0][1], n[0][2], n[0][3], n[0][4], n[0][5]);
		System.out.println("----------------------------------------------");
		System.out.printf("Fila 1 |  %5d %5d %5d %5d %5d %5d \n", n[1][0], n[1][1], n[1][2], n[1][3], n[1][4], n[1][5]);
		System.out.println("----------------------------------------------");
		System.out.printf("Fila 2 |  %5d %5d %5d %5d %5d %5d \n", n[2][0], n[2][1], n[2][2], n[2][3], n[2][4], n[2][5]);
		System.out.println("----------------------------------------------");

	}

}
