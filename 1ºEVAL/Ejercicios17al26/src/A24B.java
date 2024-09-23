import java.util.Scanner;

public class A24B {

    public static void main(String[] args) {

        double numero;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero entre 0 y 9999");
        numero= sc.nextInt();

        if ((numero/10)<1){

            System.out.println("Tiene una cifra");

        }else if ((numero/100)<=1){

            System.out.println("Tiene dos cifras");

        } else if ((numero/1000)<=1) {

            System.out.println("Tiene tres cifras");

        } else if ((numero/10000)<=1) {

            System.out.println("Tiene cuatro cifras");

        }

    }

}
