import java.util.Arrays;
import java.util.Scanner;

public class Act56 {
/*Crear dos matrices de nxn e implementar la suma de matrices, los resultados se deben
almacenar en otra matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar
las matrices originales y el resultado.*/

    public static void main(String[] args) {
        int filas;
        int columnas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de filas");
        filas = sc.nextInt();
        System.out.println("Introduce el numero de columnas");
        columnas = sc.nextInt();


        int[][] num1 = new int[filas][columnas];
        int[][] num2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j++) {

                num1[i][j] = (int) ((Math.random() * 101));
                num2[i][j] = (int) ((Math.random() * 101));
                suma[i][j] = num1[i][j] + num2[i][j];
                System.out.printf("%03d",num1[i][j]);
                System.out.print(" ");


            }
            System.out.print("   +   ");
            for (int j = 0; j < columnas; j++) {

                System.out.printf("%03d",num2[i][j]);
                System.out.print(" ");

            }

            System.out.print("  ------>  ");

            for (int j = 0; j < columnas; j++) {

                System.out.printf("%03d",suma[i][j]);
                System.out.print(" ");

            }


        }
    }
}
