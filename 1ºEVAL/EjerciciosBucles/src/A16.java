import java.util.Scanner;

public class A16 {

    public static void main(String[] args) {

        double celsius;
        double fahrenheit;

        Scanner sc=new Scanner(System.in);

        System.out.println("Escribir los grados celsius que quieres convertir a fahrenheit");

        celsius=sc.nextDouble();

        fahrenheit=(celsius*9/5)+32;

        System.out.println(celsius+" grados celsius son "+fahrenheit+" grados fahrenheit");


    }

}
