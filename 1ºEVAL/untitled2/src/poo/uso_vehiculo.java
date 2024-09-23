package poo;

import javax.swing.JOptionPane;

public class uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault=new Coche();
		
		Renault.e_color(JOptionPane.showInputDialog("De que color es el coche?"));
		
		Renault.conf_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero? si/no"));
		
		Renault.c_climatizador(JOptionPane.showInputDialog("Tiene Climatizador? si/no"));
		
		System.out.println("Este coche tiene " + Renault.ruedas() + " ruedas.");
		
		System.out.println(Renault.dime_largo());
		
		System.out.println(Renault.d_color());
		
		System.out.println(Renault.dime_datos());
		
		System.out.println(Renault.d_asientos());
		
		System.out.println(Renault.d_climatizador());

		System.out.println(Renault.d_peso_coche());
		
		System.out.println("El precio del coche es " + Renault.precio_coche() + " €.");



		
		Coche micoche1=new Coche();
		
		micoche1.e_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.e_color("Blanco");
		
		mifurgoneta1.conf_asientos("si");
		
		mifurgoneta1.c_climatizador("si");

		
		System.out.println(micoche1.dime_datos()+ " " + micoche1.d_color());
		
		System.out.println(mifurgoneta1.dime_datos() + " " + mifurgoneta1.dime_datosf());
		
	}

}
