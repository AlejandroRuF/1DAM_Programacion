public class Act54 {
/*Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece
en la matriz.*/

    public static void main(String[] args) {

        int[][] numeros= {{1,2,3},
                {4,5,6},
                {7,8,9}};

        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Fila " + "Columna " + i + " " + j + "-----> " + numeros[i][j]);


            }
        }
            System.out.println("\n\nModo Matriz:");
            for (int i=0;i<3;i++) {

                System.out.println();
                for (int j = 0; j < 3; j++) {

                    System.out.print(numeros[i][j]+"  ");


                }
            }
        }

}


