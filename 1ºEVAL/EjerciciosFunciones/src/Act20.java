import java.util.Scanner;

public class Act20 {
    /*Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una
función que reciba un número entero como parámetro e imprima su tabla de multiplicar.*/
    public static void tabla(int numero){
        System.out.println("Tabla del "+numero);
        for (int i = 1; i < 11; i++){

            System.out.print(numero+" x ");
            System.out.printf("%02d",i);
            System.out.print(" = ");
            System.out.printf("%3d%n",(numero*i));

        }

    }

    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero y te digo su tabla de multiplicar");
        numero= sc.nextInt();

        tabla(numero);

    }

}
