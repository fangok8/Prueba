/*Realiza un prgrama que conste de una clase y un metodo que tiene
 *  como parametro de entrada un numero y utilice ese numero para crear 
 *  un array de enteros de ese tamaño. A continuacionn el metodo inicializara el array con los
 *  valores que el usuario introduzca por entrada. finalmente se debera imprimir
 *  el array.
 */
	import java.util.Scanner;
	public class ArrayMetodo {
		
		Scanner sc = new Scanner(System.in);
		
		public void generarArray(int x) {
			
			int [] miarray = new int [x];
			
			for (int r=0;r<miarray.length;r++) {
				System.out.print("Introduce un número: ");
				miarray[r]=Integer.parseInt(sc.nextLine());
			}
			
			for (int rr=0;rr<miarray.length;rr++) {
				System.out.println("Valor de posición "+rr+": "+miarray[rr]);
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayMetodo x = new ArrayMetodo();
		
		System.out.print("Número de array: ");
		x.generarArray(Integer.parseInt(sc.nextLine()));
		
		
	}

}
