import javax.swing.JOptionPane;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_user=JOptionPane.showInputDialog("Introduce tu nombre por favor");
		
		String edad=JOptionPane.showInputDialog("introduce tu edad por favor");
		
		int edad_user=Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_user + " el año que viene tendras " + (edad_user+1) + " años");

	}

}
