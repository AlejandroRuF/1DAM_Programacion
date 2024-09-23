import java.util.Scanner;

public class Act12 {
    /*Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa
debe tener una función que reciba como parámetro una cantidad en kilómetros y nos la
devuelva en millas.*/

    public static double convertMillas(double kilometros){
        return (kilometros* 0.621371d);

    }

    public static void main(String[] args) {

        double km;

        Scanner sc =new Scanner(System.in);

        System.out.print("Escribe los Kilometros que quieras pasar a millas ---->  ");
        km= sc.nextDouble();

        System.out.println(km+" Kilometros son "+convertMillas(km)+" millas.");

    }


}
