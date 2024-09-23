import java.util.Scanner;

public class ConvertidorPulgadas {

    public static void main(String [] args){

        final double CMAPULGADAS=2.54;

        double pulgadas;

        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe las pulgadas que quieras convertir a cm");

        pulgadas=sc.nextDouble();

        System.out.println(pulgadas + " Pulgadas son " + pulgadas*CMAPULGADAS + " cm.");

    }

}
