import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Alimanya tabla = new Alimanya();
        int disparo;
        String opcion;
        int aciertos=0;
        int contador=1;

        System.out.println("Cazando Alimañas\n" +
                "Disponemos de un tablero 4x4 en el cual hay ubicada una alimaña en 4 posiciones consecutivas\n" +
                "Trata de eliminar esta alimaña con 8 disparos");

        tabla.generarAlimanya();
        tabla.get_tablero();

        do {
            contador=1;
            aciertos=0;
            System.out.println("Disparar(D)\n" +
                    "Nueva Partida(N)\n" +
                    "Salir(S)");
            opcion= sc.next();
            if (opcion.equalsIgnoreCase("d")) {
                do {

                    System.out.println("Introduce el disparo " + contador);
                    disparo = sc.nextInt();
                    if (tabla.disparar(disparo)) {
                        contador++;
                        aciertos++;
                        System.out.println("Felicidades le has dado");
                        tabla.get_tablero();

                    } else {
                        contador++;
                        System.out.println("Afina la punteria crack que no le das ni al aire");

                    }
                    if (aciertos==4){

                        System.out.println("Felicidades has cazado la alimaña");

                    }

                } while (contador <= 8 && aciertos < 4);
            } else if (opcion.equalsIgnoreCase("n")) {

                tabla.generarAlimanya();
                tabla.get_tablero();

            } else if (opcion.equalsIgnoreCase("s")) {

                System.out.println("Hasta luego");

            }else {

                System.out.println("Selecciona la opcion correcta");

            }


        }while (!opcion.equalsIgnoreCase("s"));
    }
}