import java.util.Scanner;
public class MediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double [] a = new double [10];
		double sumaPar=0;
		int par=0;
		double mediaPar;
		
		for (int i=0; i<10; i++) {
			System.out.print("Introduce un número: ");
			a[i] = sc.nextDouble();
			
			if (i%2==0) {
				par++;
				sumaPar=a[i]+sumaPar;
			}
		}
		mediaPar=sumaPar/par;
		System.out.println("La media de los números pares es "+mediaPar);
	}

}
