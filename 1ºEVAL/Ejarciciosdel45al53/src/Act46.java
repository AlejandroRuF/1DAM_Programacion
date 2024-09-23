import java.util.Scanner;

public class Act46 {

    public static void main(String[] args) {
/*Realizar un algoritmo que permita leer tres números para después ordenarlos de mayor a
menor o de menor a mayor. El tipo de ordenación se le pedirá al usuario, pudiendo este
volver a introducir nuevos datos sin tener que volver a ejecutar el algoritmo.*/

        int entrada;
        int guardanum;
        int largoarray = 3;
        int opcion = 0;
        int[] numeros = new int[largoarray];
        boolean repetido = false;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Escribe " + largoarray + " numeros para ordenarlos como tu quieras");
            for (int i =0; i<numeros.length;i++){

                numeros[i]=0;

            }


            for (int i = 0; i < numeros.length; i++) {
                do {
                    repetido = false;
                    entrada = sc.nextInt();// (int) ((Math.random() * 2000) + 1);
                    for (int j = 0; j < numeros.length; j++) {

                        if (entrada == numeros[j]) {

                            repetido = true;

                        }

                    }
                    if (repetido) {

                        System.out.println("No introduzca ningun numero repetido por favor");

                    }else{

                        numeros[i]=entrada;

                    }
                } while (repetido);
            }


            do {
                System.out.println("Como quieres ordenarlos" +
                        "\n1- De mayor a menor" +
                        "\n2- Se menor a mayor" +
                        "\n3- Volver a introducir los datos"+
                        "\n4- Salir");
                opcion = sc.nextInt();

                if (opcion == 1) {

                    for (int i = 0; i < numeros.length; i++) {
                        for (int j = 0; j < numeros.length; j++) {

                            if (numeros[i] > numeros[j]) {

                                guardanum = numeros[i];
                                numeros[i] = numeros[j];
                                numeros[j] = guardanum;

                            }

                        }


                    }

                }
                if (opcion == 2) {

                    for (int i = 0; i < numeros.length; i++) {
                        for (int j = 0; j < numeros.length; j++) {

                            if (numeros[i] < numeros[j]) {

                                guardanum = numeros[i];
                                numeros[i] = numeros[j];
                                numeros[j] = guardanum;

                            }

                        }


                    }

                }
                if (opcion == 1 || opcion == 2) {
                    for (int i = 0; i < numeros.length; i++) {

                        System.out.println(numeros[i]);

                    }
                }
            } while (opcion != 4 && opcion!=3);
        }while (opcion !=4);
    }

}
