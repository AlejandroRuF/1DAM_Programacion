import java.util.Scanner;

public class Act4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conecta4 talbero = new Conecta4();
        String jugada;
        String nombre1;
        String nombre2;
        boolean correcto;
        boolean fin=false;
        String RED = "\u001B[31m";
        String Reset= "\u001B[0m";

        System.out.println("Vamos a jugar a conecta 4 o 4 en ralla en Español estas son las reglas\n" +
                "1- Juego para 2 jugadores" +
                "\n2- En turnos consecutivos ambos jugadores se le dara la oportunidad de colocar su ficha en el " +
                "lugar indicado\n" +
                "3- El jugador que coloque 4 fichas seguidas sea cual sea la direccion ganará" +
                "\n4- Disfruta el juego y no te piques");

        System.out.println("Introduce el nombre del jugador 1 su ficha seran las 'X'");
        nombre1=sc.next();

        System.out.println("Introduce el nombre del jugador 2 su ficha seran las 'O'");
        nombre2=sc.next();
        do {
            do {
                System.out.println("Este es el tablero ");
                talbero.mostrarTablero();

                correcto = false;
                System.out.println(nombre1 + " elige la posicion donde vas a colocar la ficha ej:12 donde 1 es la fila" +
                        "y 2 la columna");
                try {
                    jugada = sc.next();
                    talbero.set_X(Integer.parseInt(jugada.charAt(0) + ""), Integer.parseInt(jugada.charAt(1) + ""));
                    correcto = true;
                    if (talbero.ganaX()){
                        fin=true;
                        talbero.mostrarTablero();
                        System.out.println("Felicidaces "+nombre1+" has ganado!!!");
                    }
                } catch (Exception e) {

                    System.out.println(RED+"\n"+e);
                    System.out.println(Reset);
                }
            }while (!correcto) ;
            if(!talbero.nolleno()){

                fin=true;

            }
            if (!talbero.ganaX()) {
                do {
                    System.out.println("Este es el tablero ");
                    talbero.mostrarTablero();
                    correcto = false;
                    System.out.println(nombre2 + " elige la posicion donde vas a colocar la ficha  ej:12 donde 1 es la fila" +
                            "y 2 la columna");
                    try {
                        jugada = sc.next();
                        talbero.set_O(Integer.parseInt(jugada.charAt(0) + ""), Integer.parseInt(jugada.charAt(1) + ""));
                        correcto = true;
                        if (talbero.ganaO()){
                            fin=true;
                            talbero.mostrarTablero();
                            System.out.println("Felicidaces "+nombre2+" has ganado!!!");
                        }
                    } catch (Exception e) {
                        System.out.println(RED+"\n"+e);
                        System.out.println(Reset);
                    }
                } while (!correcto);
                if(!talbero.nolleno()){

                    fin=true;

                }
            }

        }while (!fin);
    }
}
