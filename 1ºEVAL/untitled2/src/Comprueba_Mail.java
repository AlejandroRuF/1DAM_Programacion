import javax.swing.JOptionPane;

public class Comprueba_Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arroba = 0;

		boolean punto = false;

		boolean punto2 = false;

		int pos = 0;

		int pos2 = 0;

		String mail = JOptionPane.showInputDialog("Introduce mail");

		for (int i = 0; i < mail.length(); i++) {


			if (mail.charAt(i) == '@') {

				arroba++;

			}

			if (mail.charAt(i) != '@' && arroba == 0) {

				pos++;

				//System.out.println(pos);

			}
			
			/*if(mail.charAt(i)==('.')) {
				
				punto=true;
				
			}*/

			if (mail.charAt(i) != '@' && arroba == 1) {

				for (int z = pos; z < mail.length(); z++) {

					if (mail.charAt(z) == ('.')) {

						punto = true;

					}


				}

			}
			if (arroba == 1 && punto == true) {

				System.out.println("Es correcto");

			} else {

				System.out.println("No es correcto");

			}

			//System.out.println();


		}
	}
}
