import java.util.InputMismatchException;
import java.util.Scanner;

public class A12 {

    public static void main(String[] args) {/*Suma, producto y división de dos valores tomados del teclado, imprimiendo el
resultado. Es necesario que la división no proporcione error si hay una división por cero, sino
que informe de la situación. */

        double num1;
        double num2;
        double multiplicacion;
        double division;
        double suma;

        int elige;
        int error=1;

        Scanner sc=new Scanner(System.in);

        System.out.println("Elige el numero de la operacion que quieres hacer:\n1: Multipica\n2: Divide\n3: Suma\n4: Suma, Multiplica y Divide");

        elige=sc.nextInt();


        switch (elige){

            case 1:

                do {
                    try {
                        System.out.println("Introduce 2 numeros que quieras multiplicar");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();


                            multiplicacion = num1 * num2;
                            System.out.println("El resustado de la operacion es: " + multiplicacion);
                            error--;

                    }catch (InputMismatchException ex){

                        System.out.println("Solo numeros");
                        sc.next();

                    }
                }while (error==1);
                break;

            case 2:

                do {
                    try {
                        System.out.println("Introduce 2 numeros que quieras dividir");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();

                        if (num2 != 0) {

                            division = num1 / num2;
                            System.out.println("El resustado de la operacion es: " + division);
                            error--;



                        } else {

                            System.out.println("No puedes dividir entre 0");

                        }
                    }catch (InputMismatchException ex){

                        System.out.println("Solo numeros");
                        sc.next();

                    }
                }while (error==1);
                break;

            case 3:

                do {
                    try {
                        System.out.println("Introduce 2 numeros que quieras sumar");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();


                        suma = num1 + num2;
                        System.out.println("El resustado de la operacion es: " + suma);
                        error--;

                    }catch (InputMismatchException ex){

                        System.out.println("Solo numeros");
                        sc.next();

                    }
                }while (error==1);
                break;

            case 4:

                do {
                    try {
                        System.out.println("Introduce 2 numeros que quieras dividir, multiplicar y sumar");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();

                        if (num2 != 0) {

                            division = num1 / num2;
                            multiplicacion=num1*num2;
                            suma=num1*num2;
                            System.out.println("El resultado de la division es: " +division);
                            System.out.println("El resustado de la Multiplicacion es "+multiplicacion);
                            System.out.println("El resultadod e la suma es "+suma);
                            error--;



                        } else {

                            System.out.println("No puedes dividir entre 0");

                        }
                    }catch (InputMismatchException ex){

                        System.out.println("Solo numeros");
                        sc.next();

                    }
                }while (error==1);
                break;

        }

    }

}