import java.util.Scanner;


public class area_circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el radio del circulo en cm");
        double r;

        r = sc.nextDouble();


       final double npi = Math.PI;

        double r2;

        r2 = Math.pow(r,2);

        System.out.println("El Area de un circulo con un radio de " + r + " es " + npi*r2 + " cm");


    }

}
