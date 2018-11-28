import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {

		int[][] tablero = new int[8][8];

		Scanner s = new Scanner(System.in);

		String posicion;

		

		System.out.println("Introduce la posción del alfil: ");
		posicion = s.nextLine();
		
		char posiciony = posicion.charAt(0);
		int posicionx = posicion.charAt(1);

		

		System.out.printf("8| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[0][0],tablero[0][1],tablero[0][2],tablero[0][3],tablero[0][4],tablero[0][5],tablero[0][6],tablero[0][7]);
		System.out.printf("7| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[1][0],tablero[1][1],tablero[1][2],tablero[1][3],tablero[1][4],tablero[1][5],tablero[1][6],tablero[1][7]);
		System.out.printf("6| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[2][0],tablero[2][1],tablero[2][2],tablero[2][3],tablero[2][4],tablero[2][5],tablero[2][6],tablero[2][7]);
		System.out.printf("5| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[3][0],tablero[3][1],tablero[3][2],tablero[3][3],tablero[3][4],tablero[3][5],tablero[3][6],tablero[3][7]);
		System.out.printf("4| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[4][0],tablero[4][1],tablero[4][2],tablero[4][3],tablero[4][4],tablero[4][5],tablero[4][6],tablero[4][7]);
		System.out.printf("3| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[5][0],tablero[5][1],tablero[5][2],tablero[5][3],tablero[5][4],tablero[5][5],tablero[5][6],tablero[5][7]);
		System.out.printf("2| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[6][0],tablero[6][1],tablero[6][2],tablero[6][3],tablero[6][4],tablero[6][5],tablero[6][6],tablero[6][7]);
		System.out.printf("1| %3d %3d %3d %3d %3d %3d %3d %3d\n",tablero[7][0],tablero[7][1],tablero[7][2],tablero[7][3],tablero[7][4],tablero[7][5],tablero[7][6],tablero[7][7]);
		
		System.out.println("-----------------------------------------");
		System.out.println("     a   b   c   d   e   f   g   h   ");
	}

}
