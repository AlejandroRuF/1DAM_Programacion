import java.util.Scanner;

public class Act11 {
    /*Realiza un programa que escriba la tabla de multiplicar de un número introducido por
teclado. Para ello implementa una función que reciba como parámetro un número entero y
muestre por pantalla la tabla de multiplicar de dicho número*/

    public static void tabla(int numero){

        System.out.println("\nTabla del "+numero+":\n");
        for (int i = 0; i <= 10; i++){

            System.out.println(numero+" X "+i+" = "+numero*i);

        }

    }

    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero y te mostrare la tabla de multiplicar");

        numero=sc.nextInt();

        tabla(numero);

    }

}
