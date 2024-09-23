import java.util.Scanner;

import javax.swing.JOptionPane;
public class Aceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Alex";
		
		String pass="";

		JOptionPane.showMessageDialog(null, "Sigue las Instrucciones","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta");
				
			}
			
		}

		System.out.println("Correcto. Acceso permitido");
		
		final double apulgadas=2.54;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce los centimetros que quieras convertir a pulgadas");
		
		double cm=entrada.nextDouble();
		
		double resultado=cm/apulgadas;
		
		System.out.println("En " + cm + "cm hay " + resultado + " pulgadas");
				
	}

}
