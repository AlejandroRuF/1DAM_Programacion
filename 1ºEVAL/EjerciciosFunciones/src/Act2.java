import java.util.Scanner;

public class Act2 {

    public static boolean esMayoeEdad(int edad){
        boolean mayor;
        if (edad>=18){

            mayor=true;

        }else {

            mayor=false;

        }
        return mayor;
    }

    public static void imprime(int edad){

        if(esMayoeEdad(edad)){

            System.out.println("Eres mayor de edad");

        }else {

            System.out.println("Eres menor de edad");

        }

    }

    public static void main(String[] args) {

        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad= sc.nextInt();

        imprime(edad);

    }

}
