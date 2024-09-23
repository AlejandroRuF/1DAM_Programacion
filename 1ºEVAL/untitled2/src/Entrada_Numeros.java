import javax.swing.JOptionPane;
public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1=JOptionPane.showInputDialog("Introduce un numero");
		
		Double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
	}

}
