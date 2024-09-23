public class Act58 {
//Generar una matriz de 3×3 con números aleatorios sin repetirse.

    public static void main(String[] args) {

        int[][] matriz=new int[3][3];
        int temporal;
        boolean repetido=false;

        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3; j++){
                do {
                    repetido=false;
                temporal=(int)(Math.random()*10+1);
                for (int x = 0;x < 3 ; x++){
                    for (int y = 0;y < 3 ; y++){

                     if (temporal==matriz[x][y]){

                         repetido=true;

                     }

                    }
                }
                if (!repetido){

                    matriz[i][j]=temporal;

                }
            }while (repetido);

            }
        }
        for (int i = 0;i < 3;i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.printf("%02d",(matriz[i][j]));
                System.out.print(" ");

            }
        }

    }

}
