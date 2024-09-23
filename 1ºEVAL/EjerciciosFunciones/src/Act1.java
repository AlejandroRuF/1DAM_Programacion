import java.util.Scanner;

public class Act1 {

    public static double multiplica(double num1, double num2){

        return num1*num2;

    }
    public static void imprime(double num1, double num2){

        System.out.println("El resultado es "+multiplica(num1,num2));

    }

    public static void main(String[] args) {

        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 2 numeros que quieras multiplicar");
        System.out.print("Numero 1 ----> ");
        num1= sc.nextDouble();
        System.out.print("Numero 2 ----> ");
        num2=sc.nextDouble();

        imprime(num1,num2);

    }

}
