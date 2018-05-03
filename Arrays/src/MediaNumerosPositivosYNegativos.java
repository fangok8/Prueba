import java.util.Scanner;
public class MediaNumerosPositivosYNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa en el que se leen 10 numeros enteros por teclado. A continuacion relaiza la media de dihcos numeros.
		Scanner sc = new Scanner(System.in);
	
		int [] a = new int [10]; 
		int suma=0, media;
				
	for (int i=0; i<10; i++) {
		
		
		  a[i] = sc.nextInt();
		  suma=a[i]+suma;
		  
		}
	media=suma/10;
	
	System.out.println("La media es "+media);
	}

}
