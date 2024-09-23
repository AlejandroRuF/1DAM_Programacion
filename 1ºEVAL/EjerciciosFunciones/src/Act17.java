import java.util.Scanner;

public class Act17 {
    /* Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si
es divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función
que pasándole un número entero devuelva si es primo o no.*/
    public static boolean primo(int numero){
        boolean esprimo=true;
        for (int i = 2; i < numero; i++){

            if (numero%i==0){

                esprimo=false;

            }
        }
        return esprimo;
    }

    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);


        do {


            System.out.println("Introduce numeros y te dire si son primos hasta que introduzcas 0");
            numero=sc.nextInt();

            if (numero!=0){


                if (primo(numero)){

                    System.out.println("Es primo");

                }else {

                    System.out.println("No es primo");

                }

            }

        }while(numero!=0);
    }

}
