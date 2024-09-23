import java.util.Scanner;

public class A19 {

    public static void main(String[] args) {

     int edad;

        Scanner sc=new Scanner(System.in);

        System.out.println("Cuantos años tienes?");
        edad= sc.nextInt();

        if (edad<5){

            System.out.println("Pasa");
        }
        if (edad >= 5 && edad <15){

            System.out.println("Son 2 euros");

        }
        if (edad>=15){

            System.out.println("Son 3 euros");

        }

    }

}
