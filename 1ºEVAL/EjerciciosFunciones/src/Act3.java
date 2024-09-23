import java.util.Scanner;

public class Act3 {

    public static int minimo(int num1,int num2){
        int minimo;
        if (num1>num2){

            minimo=num2;

        }else {

            minimo=num1;

        }
        return minimo;
    }

    public static void imprime(int num1,int num2){

        if (num1==num2){

            System.out.println("Los numeros son iguales");

        }else {

            System.out.println("El numero menor es "+minimo(num1,num2));

        }

    }

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        num1= sc.nextInt();
        System.out.println("Introduce el numero 2");
        num2= sc.nextInt();

        imprime(num1,num2);

    }

}
