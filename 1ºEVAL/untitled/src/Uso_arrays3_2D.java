
public class Uso_arrays3_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix=new int[4][5];
		
		matrix[0][0]=0;
		matrix[0][1]=1;
		matrix[0][2]=2;
		matrix[0][3]=3;
		matrix[0][4]=4;
		
		matrix[1][0]=10;
		matrix[1][1]=11;
		matrix[1][2]=12;
		matrix[1][3]=13;
		matrix[1][4]=14;
		
		matrix[2][0]=20;
		matrix[2][1]=21;
		matrix[2][2]=22;
		matrix[2][3]=23;
		matrix[2][4]=24;
		
		matrix[3][0]=30;
		matrix[3][1]=31;
		matrix[3][2]=32;
		matrix[3][3]=33;
		matrix[3][4]=34;
		
		for(int i=0;i<4;i++) {
			
			
			for(int z=0;z<5;z++) {
				
			System.out.println("El valor almacenado en " + i + "." + z + " es " + matrix[i][z]);	
				
			}
			
			
		}
		
		
	}

}
