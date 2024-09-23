import java.util.Scanner;

public class loteria {
       /*Escribir un programa que simule LA PRIMITIVA: Pedir 6 números y los almacenará en un
array (números entre el 1 y el 49). Después generará aleatoriamente 6 número entre el 1 y el
49, y no pueden repetirse. Después hallará un numero aleatorio entre 1 y 9 para el reintegro.
Esto se almacenará también en un array.
*/

    public static int[] ganadores() {
        int[] numGanadores = new int[6];
        boolean repetido = false;
        int aleatorio;

        for (int i = 0; i < numGanadores.length; i++) {
            do {
                repetido = false;
                aleatorio = (int) ((Math.random() * 49) + 1);
                for (int j = 0; j < numGanadores.length; j++) {
                    if (aleatorio == numGanadores[j]) {
                        repetido = true;
                    }
                }
                if (!repetido) {

                    numGanadores[i] = aleatorio;

                }

            } while (repetido);

        }
        /*for (int i = 0; i < numGanadores.length;i++){
            System.out.print(numGanadores[i]+" ");
        }*/


        return numGanadores;
    }

    public static int reintegrog() {
        return (int) ((Math.random() * 9) + 1);
    }

    public static int coinciden(int[] numeros, int[] numGanadores) {
        int contador = 0;
        for (int i = 0; i < numGanadores.length; i++) {
            for (int j = 0; j < numGanadores.length; j++) {
                if (numeros[i] == numGanadores[j]) {
                    contador++;
                }
            }

        }

        return contador;
    }


    public static void main(String[] args) {

        int[] numeros = new int[6];
        int reintegro;
        int numGanadores[] = ganadores();
        int reintegroGanador = reintegrog();
        boolean repetido = false;
        int temporal;
        boolean rangoCorrecto = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame los numeros de tu primitiva");
        for (int i = 0; i < numGanadores.length; i++) {
            do {
                repetido = false;
                do {
                    rangoCorrecto = false;
                    System.out.println("Numero " + (i + 1) + " ----> ");
                    temporal = sc.nextInt();
                    if (temporal > 0 && temporal < 50) {
                        rangoCorrecto = true;
                    }
                    if (!rangoCorrecto) {
                        System.out.println("Los numeros solo abarcan del 1 al 49");
                    }
                } while (!rangoCorrecto);
                for (int j = 0; j < numGanadores.length; j++) {

                    if (temporal == numeros[j]) {
                        repetido = true;
                    }

                }
                if (!repetido && rangoCorrecto) {
                    numeros[i] = temporal;
                }

                if (repetido) {
                    System.out.println("Ya has introducido ese numero");
                }
            } while (repetido);
        }

            System.out.println("Introduce el numero del reintegro");
            reintegro = sc.nextInt();

            System.out.println("Los Numeros Ganadores son:");
            for (int i = 0; i < numGanadores.length; i++) {
                System.out.print(numGanadores[i] + " ");
            }
            System.out.println("Reintegro Ganador: " + reintegroGanador);

            System.out.println("Tus Numeros son:");
            for (int i = 0; i < numGanadores.length; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println("Tu Reintegro es: " + reintegro);

            System.out.println("Coinciden " + coinciden(numeros, numGanadores));
            if (reintegro==reintegroGanador){
                System.out.println("Tu reintegro Coincide");
            }else {
                System.out.println("Tu reintegro no coincide");
            }


        }
    }

