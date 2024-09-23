
public class arrays_3_2D_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix={
				{00,01,02,03,04},
				{10,11,12,13,14},
				{20,21,22,23,24},
				{30,31,32,33,34}
		};
		
		for(int[] fila:matrix){
			
			System.out.println();
			
			for(int z:fila){
				
				System.out.print(z + " ");
			}
		}
		
		
	}

}
