import java.util.Scanner;
public class EjercicioNumerosEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa en el que se leen 10 numeros enteros por teclado. A continuaion se recorre el array y se calcula cuantos numeros son positivis, cuantos negativos y cuantos ceros.
	
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int [10]; 
		int positivos=0, negativos=0, ceros=0;
		
	for (int i=0; i<10; i++) {
		
		
		  a[i] = sc.nextInt();
		  
		  if (a[i]>0) {
			 positivos++;
		  }else if (a[i]<0) {
			  negativos++;
		  }else {
			  ceros++;
		  }
		}
	System.out.println("Hay "+positivos+" números positivos.");
	System.out.println("Hay "+negativos+" números negativos.");
	System.out.println("Hay "+ceros+" ceros.");
	}

}
