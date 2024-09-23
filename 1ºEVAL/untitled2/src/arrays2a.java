
public class arrays2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz_aleatoria=new int[150];
		
		for(int i=0; i<matriz_aleatoria.length;i++) {
			
			matriz_aleatoria[i]=(int)Math.round(Math.random()*100);
		
			
		}
		
		for(int numeros:matriz_aleatoria) {
			
			System.out.println(numeros + " ");
			
		}
		
	}

}
