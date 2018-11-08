
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("3 dados al azar");
		
		int dado1 = 0;
		int dado2 = 0;
		int dado3 = 0;
		int total;
		
		
		for(int i=0; i<=1; i++) {
		
		dado1=((int)(Math.random()*7)+1);
		dado2=((int)(Math.random()*7)+1);
		dado3=((int)(Math.random()*7)+1);
		
		}
		
		total = dado1 + dado2 + dado3;
		
		System.out.println("Dado 1 : "+dado1);
		System.out.println("Dado 2 : "+dado2);
		System.out.println("Dado 3 : "+dado3);
		System.out.println("Suma de los dados : "+total);
	}

}
