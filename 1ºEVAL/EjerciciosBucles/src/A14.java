import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {

        int numero;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero positivo o negativo");

        numero=sc.nextInt();

        if (numero==0){

            System.out.println("Cero no es positivo ni negativo");

        }else if(numero<0){

            System.out.println("Tu numero es negativo");

        }else {

            System.out.println("Tu numero es positivo");

        }


    }
}
