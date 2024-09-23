import java.util.Scanner;

public class Act16 {
    /*Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene
con valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array
con valores aleatorios.*/
    public static int[][] aleatorio(int[][] array){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[0].length; i++) {

                array[j][i] = (int) ((Math.random() * 100) + 1);

            }
        }
        return array;
    }

    public static void imprime(int[][] numeros){

        for (int j = 0; j < numeros.length; j++) {
            System.out.println();
            for (int i = 0; i < numeros[0].length; i++) {

                System.out.printf("%03d",numeros[j][i]);
                System.out.print(" ");

            }
        }

    }

    public static void main(String[] args) {

        int filas,columnas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de filas");
        filas=sc.nextInt();
        System.out.println("Introduzca el numero de columnas");
        columnas= sc.nextInt();

        int[][] numeros = new int[filas][columnas];

        aleatorio(numeros);
        System.out.println("La matriz resultante es:");
        imprime(numeros);


    }

}
