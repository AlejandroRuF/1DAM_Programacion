import java.util.Scanner;

public class Act5 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String opcion;
        Puzzle juego = new Puzzle();

        juego.crear_tablero();
        System.out.println("Vamos a jugar a este puzzle deberas poner en orden los numeros" +
                "de izquierda a derecha");
        do {
            juego.mostrar();
            System.out.println("Elige la opcion que deseas\n" +
                    "0- Desordenar\n" +
                    "1- Arriba\n" +
                    "2- Abajo\n" +
                    "3- Derecha\n" +
                    "4- Izquierda\n" +
                    "5- Salir");
            opcion= scanner.next();
            if (opcion.equals("1")){
                if (!juego.subir()){
                    System.out.println("No intentes salirte del tablero");
                }
            } else if (opcion.equals("2")) {
                if (!juego.bajar()){
                    System.out.println("No intentes salirte del tablero");
                }
            } else if (opcion.equals("3")) {
                if (!juego.moverDerecha()){
                    System.out.println("No intentes salirte del tablero");
                }
            } else if (opcion.equals("4")) {
                if (!juego.moverIzquierda()){
                    System.out.println("No intentes salirte del tablero");
                }
            } else if (opcion.equals("5")) {
                System.out.println("Adios");
            } else if (opcion.equals("0")) {
                juego.desordenar();
            } else {
                System.out.println("Elige una de las opciones disponibles");
            }
        }while (!juego.estaResuelto() && !opcion.equals("5"));

        if (juego.estaResuelto()){
            juego.mostrar();
            System.out.println("Felicidades has ganado");
        }


    }

}
