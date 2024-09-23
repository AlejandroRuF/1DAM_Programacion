import java.util.Scanner;

public class Act55 {
    /*Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
    aleatorios entre 0 y 10.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero de columnas que tendra el array");
        int num= sc.nextInt();

        int[][] numeros=new int[5][num];
        for (int i = 0;i<5;i++){
            for (int j = 0;j<num;j++){

                numeros[i][j]=(int)(Math.random()*10);

            }
        }
        for (int i = 0;i<5;i++){
            System.out.println();
            for (int j = 0;j<num;j++){

                System.out.print(numeros[i][j]+" ");

            }
        }

    }

}
