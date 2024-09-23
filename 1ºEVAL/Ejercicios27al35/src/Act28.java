import java.util.Scanner;

public class Act28 {

    public static void main(String[] args) {

        double entrada;
        double resultado=0;

        System.out.println("Introduce numeros para sumar si no quieres introducir mas introduce uno negativo");
        Scanner sc=new Scanner(System.in);

        do {

            entrada= sc.nextDouble();
            resultado=resultado+entrada;

        }while (entrada>=0);

        System.out.println("La suma de todos los numeros es -->  "+resultado);

    }

}
