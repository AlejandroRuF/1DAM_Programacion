import javax.swing.JOptionPane;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu genero H/M");
			
		} while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros"));
		
		int peso_ideal=0;
		
		if(genero.equalsIgnoreCase("h")) {
		
		peso_ideal=altura-110;
		
		}
		
		else if(genero.equalsIgnoreCase("m")) {
			
			peso_ideal=altura-120;
			
		}
		
		System.out.println("Tu peso ideal seria " + peso_ideal + " Kg");

	}

}
