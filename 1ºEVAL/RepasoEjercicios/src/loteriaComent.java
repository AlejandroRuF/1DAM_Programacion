import java.util.Scanner;

public class loteriaComent {
    /*Escribir un programa que simule LA PRIMITIVA: Pedir 6 números y los almacenará en un
array (números entre el 1 y el 49). Después generará aleatoriamente 6 número entre el 1 y el
49, y no pueden repetirse. Después hallará un numero aleatorio entre 1 y 9 para el reintegro.
Esto se almacenará también en un array.
*/

    // Método para generar los números ganadores aleatoriamente
    public static int[] ganadores() {
        int[] numGanadores = new int[6];
        boolean repetido = false;
        int aleatorio;

        // Generar 6 números aleatorios únicos entre 1 y 49
        for (int i = 0; i < numGanadores.length; i++) {
            do {
                repetido = false;
                aleatorio = (int) ((Math.random() * 49) + 1);

                // Comprobar si el número aleatorio ya existe en el array
                for (int j = 0; j < numGanadores.length; j++) {
                    if (aleatorio == numGanadores[j]) {
                        repetido = true;
                    }
                }

                // Si el número no está repetido, se almacena en el array
                if (!repetido) {
                    numGanadores[i] = aleatorio;
                }
            } while (repetido);
        }

        // Devolver los números ganadores
        return numGanadores;
    }

    // Método para generar el número de reintegro aleatoriamente entre 1 y 9
    public static int reintegrog() {
        return (int) ((Math.random() * 9) + 1);
    }

    // Método para contar cuántos números coinciden entre los ingresados por el usuario y los números ganadores
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
        int numGanadores[] = ganadores(); // Obtener los números ganadores
        int reintegroGanador = reintegrog(); // Obtener el reintegro ganador
        boolean repetido = false;
        int temporal;
        boolean rangoCorrecto = false;
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese sus números
        System.out.println("Dame los números de tu primitiva");
        for (int i = 0; i < numGanadores.length; i++) {
            do {
                repetido = false;
                do {
                    rangoCorrecto = false;
                    System.out.println("Número " + (i + 1) + " ----> ");
                    temporal = sc.nextInt();
                    // Verificar si el número ingresado está en el rango permitido (1-49)
                    if (temporal > 0 && temporal < 50) {
                        rangoCorrecto = true;
                    }
                    if (!rangoCorrecto) {
                        System.out.println("Los números solo abarcan del 1 al 49");
                    }
                } while (!rangoCorrecto);

                // Comprobar si el número ingresado ya existe en el array
                for (int j = 0; j < numGanadores.length; j++) {
                    if (temporal == numeros[j]) {
                        repetido = true;
                    }
                }

                // Si el número no está repetido y está en el rango, se almacena en el array
                if (!repetido && rangoCorrecto) {
                    numeros[i] = temporal;
                }

                if (repetido) {
                    System.out.println("Ya has introducido ese número");
                }
            } while (repetido);
        }

        // Solicitar al usuario que ingrese el número del reintegro
        System.out.println("Introduce el número del reintegro");
        reintegro = sc.nextInt();

        // Mostrar los números ganadores y los números ingresados por el usuario
        System.out.println("Los Números Ganadores son:");
        for (int i = 0; i < numGanadores.length; i++) {
            System.out.print(numGanadores[i] + " ");
        }
        System.out.println("Reintegro Ganador: " + reintegroGanador);

        System.out.println("Tus Números son:");
        for (int i = 0; i < numGanadores.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("Tu Reintegro es: " + reintegro);

        // Mostrar la cantidad de números coincidentes entre los ingresados por el usuario y los ganadores
        System.out.println("Coinciden " + coinciden(numeros, numGanadores));

        // Comprobar si el reintegro ingresado coincide con el reintegro ganador
        if (reintegro == reintegroGanador) {
            System.out.println("Tu reintegro coincide");
        } else {
            System.out.println("Tu reintegro no coincide");
        }
    }
}
