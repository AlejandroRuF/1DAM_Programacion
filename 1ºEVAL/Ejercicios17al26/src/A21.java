import java.util.Scanner;

public class A21 {

    public static void main(String[] args) {

        double lado1;
        double lado2;
        double lado3;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el lado 1");
        lado1=sc.nextDouble();

        System.out.println("Introduce lado 2");
        lado2=sc.nextDouble();

        System.out.println("introduce el lado 3");
        lado3=sc.nextDouble();

        if (lado2==lado1 && lado1==lado3){

            System.out.println("Tu triangulo es Equilatero");

        }else  if (lado2 !=lado3 && lado2!=lado1 && lado1!=lado3){

            System.out.println("Tu triangulo es Escaleno");

        }else{

            System.out.println("Tu triangulo es Isosceles");

        }

    }

}
