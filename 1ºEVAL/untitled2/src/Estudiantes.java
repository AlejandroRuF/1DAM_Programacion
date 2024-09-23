import java.util.Scanner;

public class Estudiantes {

    public static void main(String[] args) {

       final int tam=8;

        int estu;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de estudiantes en su curso");

        estu= sc.nextInt();

        int equipos= (int) (estu/tam);
        int sobra= (int) (estu%tam);

        if (sobra>0) {

            System.out.println("Puedes hacer " + equipos + " equipos de " + tam + " estudiantes pero se quedaran fuera " + sobra + " estudiantes");
        } else {

            System.out.println("Puedes hacer " + equipos + " equipos de " + tam + " estudiantes y jugaran todos");

        }



    }

}
