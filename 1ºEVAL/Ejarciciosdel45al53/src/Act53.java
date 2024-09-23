import java.util.Scanner;

public class Act53 {
/*Diseña un programa que imite a una calculadora capaz de realizar las operaciones básicas
(suma, resta, producto y multiplicación) y dos operaciones complejas como la potencia y la
raíz cuadrada, la aplicación debe mostrar inicialmente un menú similar al siguiente:
Emulador Calculadora
Elige una opción:
1.- Operaciones básicas.
2.- Operaciones complejas.
3.- Salir.
En el caso de la opción 1 se deberá mostrar:
a. Suma.
b. Resta.
c. Producto.
d. División.
En el caso de la opción 2 se deberá mostrar:
a. Potencia.
b. Raíz cuadrada.
Una vez elegida la opción correspondiente el programa deberá solicitar los datos necesarios
y mostrar por pantalla el resultado obtenido en cada caso. El programa deberá controlar los
posibles errores que se puedan producir a la hora de elegir la opción y de introducir los
datos por teclado de tal forma que si los datos introducidos fueran erróneos los vuelva a
solicitar.*/



    public static void main(String[] args) {

        int opcion;
        double num1;
        double num2;
        double resultado=0;
        Scanner sc = new Scanner(System.in);

        do {

            opcion=0;
            System.out.println("Elige una opción:" +
                    "\n1.- Operaciones básicas." +
                    "\n2.- Operaciones complejas." +
                    "\n3.- Salir.");
            opcion= sc.nextInt();

            if (opcion==1){
                opcion=0;
                do {
                    System.out.println("1. Suma.\n" +
                            "2. Resta.\n" +
                            "3. Producto.\n" +
                            "4. División." +
                            "\n5. Salir");
                    opcion= sc.nextInt();

                    if (opcion==1){

                        System.out.println("Introduce los números a sumar");
                        num1=sc.nextDouble();
                        num2=sc.nextDouble();
                        resultado=num1+num2;

                    } else if (opcion==2) {

                        System.out.println("Introduce los números a restar");
                        num1=sc.nextDouble();
                        num2=sc.nextDouble();
                        resultado=num1-num2;

                    } else if (opcion==3) {

                        System.out.println("Introduce los números a multiplicar");
                        num1=sc.nextDouble();
                        num2=sc.nextDouble();
                        resultado=num1*num2;

                    } else if (opcion==4) {

                        System.out.println("Introduce los números a dividir");
                        num1=sc.nextDouble();
                        num2=sc.nextDouble();
                        resultado=num1/num2;

                    }
                    if (opcion==1 || opcion==2 || opcion==3 || opcion==4) {
                        System.out.println(resultado);
                    }

                }while (opcion!=5);

            } else if (opcion==2){
                opcion=0;
                do {
                    System.out.println("1. Potencia.\n" +
                            "2. Raíz cuadrada."+
                    "\n3-Salir");
                    opcion= sc.nextInt();

                    if (opcion==1){

                        System.out.println("Introduce la base y el exponente para hacer una potencia");
                        num1=sc.nextDouble();
                        num2=sc.nextDouble();
                        resultado=Math.pow(num1,num2);

                    } else if (opcion==2) {

                        System.out.println("Introduce la base y el exponente para hacer una raíz");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        resultado = Math.pow(num1,1/num2);
                    }
                    if (opcion==1 || opcion==2) {
                        System.out.println(resultado);
                    }

                }while (opcion!=3);
                opcion=0;
                }else {

                        System.out.println("Elige una de las siguientes opciones");

                    }

        }while (opcion!=3);

    }


}
