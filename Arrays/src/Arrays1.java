import javax.swing.JOptionPane;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] s = new String [3];
		
		for (int i = 0; i < 3; i++) {
			
			if (i==0) {
				s[i] = JOptionPane.showInputDialog("Dime tu nombre");
						
			}else {
				s[i] = JOptionPane.showInputDialog("Dime tu apellido nº"+ i);
			}
			System.out.println(s[i] + " ");
		}
		
	}

}
