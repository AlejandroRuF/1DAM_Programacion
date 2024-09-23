import java.util.Scanner;

public class Act14 {
/*Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá
recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.*/

    public static void dibujo(String caracter,int numero){

        for (int i = 0; i < numero ; i++) {
            for (int j = numero; j > i; j--) {
                System.out.print(" ");}

            for (int x = 0; x < i ; x++) {
                System.out.print(caracter);

            }
            for (int x = 0; x < i-1 ; x++) {
                System.out.print(caracter);

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        String caracter;
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un caracter");
        caracter=sc.next().charAt(0)+"";
        System.out.println("Escribe un numero");
        numero=sc.nextInt();

        dibujo(caracter,numero);


    }

}
