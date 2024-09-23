import javax.swing.JOptionPane;

public class Uso_arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];

		/*String[] paises={"España", "Mexico", "Colombia", "Peru", "Chile", "Argentina",
				"Ecuador", "Venezuela"};*/
		
		for(int i=0; i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
			
		}
		
		for(String z:paises) {
			
			System.out.println("Pais " + z);
			
			
		}
		
		
		
	}

}
