import java.util.Scanner;

public class CalculoHipotensa {

    public static void main(String [] args){

        double cateto1;
        double cateto2;
        double hipotenusa;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce el valor del cateto 1");

        cateto1=sc.nextDouble();

        System.out.println("introduce el valor del cateto 2");

        cateto2=sc.nextDouble();

        hipotenusa=Math.sqrt((Math.pow(cateto1,2))+(Math.pow(cateto2,2)));

        System.out.println("La hipotenusa de un triangulo con esos catetos medirá " + hipotenusa);

    }

}
