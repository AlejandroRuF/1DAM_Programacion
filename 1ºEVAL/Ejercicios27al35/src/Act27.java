import java.util.Scanner;

public class Act27 {

    public static void main(String[] args) {

        int numero;

        System.out.println("Introduce un numero entero para obtener su tabla de multiplicar");

        Scanner sc =new Scanner(System.in);
        numero= sc.nextInt();

        for (int i=0; i<=10; i++){

            System.out.println(numero+" x "+i+" = "+numero*i);

        }

    }

}
