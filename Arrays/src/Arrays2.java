import java.util.Scanner;
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int [10];
		
		for (int i = 0; i < 10; i++) {
			
			
			
			a[i] = sc.nextInt();
			
			System.out.println("Posición "+i+ " contiene el valor "+a[i]);
		}
		
	}

}
