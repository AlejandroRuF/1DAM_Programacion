import java.util.Objects;
import java.util.Scanner;

public class Act1 {

    public static void inicializar_Tablero(char[][] tablero) {
        char sim = '*';
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                tablero[i][j] = sim;

            }
        }

    }


    public static void generar_regalos(char[] presente, char[][] tablero) {

        boolean repetidoPos = false;
        boolean repetidoCupon = false;
        int fila;
        int columna;
        int ncupones = 5;

        for (int x = 0; x < presente.length; x++) {
            do {
                repetidoPos = false;
                fila = (int) (Math.random() * (tablero.length));
                columna = (int) (Math.random() * (tablero[0].length));
                if (tablero[fila][columna] != '*') {
                    repetidoPos = true;
                }
                if (!repetidoPos){
                    tablero[fila][columna]=presente[x];

                }
            } while (repetidoPos);

        }
    }
    public static  char elegir_Regalo(int posicion,char[][] tablero){
        char letra_Regalo;
        int fila=(int) posicion/tablero.length;
        int columna=(int)posicion%tablero[0].length;

        letra_Regalo=tablero[fila][columna];

        return letra_Regalo;
    }
    public static void marcar_Regalo(int posicion,char[][] tablero){
        int fila=(int) posicion/tablero.length;
        int columna=(int)posicion%tablero[0].length;

        if(tablero[fila][columna]!='*'){
            tablero[fila][columna]='*';
        }


    }

        public static void main (String[]args) {
            char[][] tablero = new char[4][4];
            char[] presente = {'R', 'P', 'C', 'U', 'M'};
            int[] elegidos = {20, 20, 20, 20, 20};
            String[] premiosganados = new String[5];
            String[] premios = {"Reloj", "Pulsera Inteligente", "Calcetines", "Cable USB tipo C", "Movil"};
            String opcion="";
            int posicion;
            int intentos=0;
            boolean posrep;
            boolean rango = false;
            boolean premiado;
            Scanner sc = new Scanner(System.in);


            System.out.println("Felicidades Puedes participar en nuestro sorteo para ganar varios premios sigue" +
                    "nuestras instrucciones para poder participar =D");
            do {
                for (int i = 0;i<elegidos.length;i++){
                    elegidos[i]=20;
                }
                inicializar_Tablero(tablero);
                generar_regalos(presente, tablero);

                for (int i = 0; i < tablero.length; i++) {
                    System.out.println();
                    for (int j = 0; j < tablero[0].length; j++) {

                        System.out.print(tablero[i][j] + "");

                    }
                }
                System.out.println();
                System.out.println("Que quieres hacer?");
                System.out.println("1. Selecciona 5 posiciones para obtener regalos(p)");
                if (intentos==0){
                    System.out.println("2. Salir (s)");
                }else {
                    System.out.println("2. Nuevo Intento(n)");
                    System.out.println("3. Salir (s)");
                }
                opcion=sc.next();

                if((opcion.equalsIgnoreCase("p") || opcion.equalsIgnoreCase("n")) && intentos>0) {
                    System.out.println("Generando Nuevo Intento...");

                }
                if(opcion.equalsIgnoreCase("p") || opcion.equalsIgnoreCase("n")) {
                    System.out.println();
                    System.out.println("Elige cinco números entre 0 y 15 y te diremos si has sido premiado");
                    for (int i = 0; i < 5; i++) {
                        do {
                            posrep = false;
                            do {
                                rango = false;
                                System.out.println("Intento " + (i + 1));
                                try {
                                    posicion = sc.nextInt();
                                } catch (Exception ex) {
                                    System.out.println("No intentes romperme solo acepto números enteros ):");
                                    posicion = 20;
                                    sc.next();

                                }
                                if (posicion < 0 || posicion > 15) {
                                    rango = false;
                                    posicion = 0;
                                    System.out.println("La posición dbe estar entre 0 y 15");
                                } else {
                                    rango = true;
                                }
                            } while (!rango);
                            for (int j = 0; j < elegidos.length; j++) {
                                if (posicion == elegidos[j]) {
                                    posrep = true;
                                }
                            }
                            if (posrep) {
                                System.out.println("Ya has elegido ese número no hagas trampa!!!");
                            }
                        } while (posrep);

                        elegidos[i] = posicion;

                        if (elegir_Regalo(posicion, tablero) == 'R') {
                            premiosganados[i] = premios[0];
                        }
                        if (elegir_Regalo(posicion, tablero) == 'P') {
                            premiosganados[i] = premios[1];
                        }
                        if (elegir_Regalo(posicion, tablero) == 'C') {
                            premiosganados[i] = premios[2];
                        }
                        if (elegir_Regalo(posicion, tablero) == 'U') {
                            premiosganados[i] = premios[3];
                        }
                        if (elegir_Regalo(posicion, tablero) == 'M') {
                            premiosganados[i] = premios[4];
                        }
                        if (elegir_Regalo(posicion, tablero) == '*') {
                            premiosganados[i] = "*";
                        }
                    }
                    premiado = false;
                    for (int j = 0; j < elegidos.length; j++) {
                        if (!Objects.equals(premiosganados[j], "*")) {
                            premiado = true;
                        }
                    }
                    if (premiado) {
                        System.out.println("Felicidades Has ganado:");
                        for (int j = 0; j < elegidos.length; j++) {
                            if (!Objects.equals(premiosganados[j], "*")) {
                                System.out.println(premiosganados[j]);
                            }
                        }
                    } else {

                        System.out.println("Lo siento no has ganado nada mas suerte la próxima vez");

                    }
                    intentos++;
                }else if(opcion.equalsIgnoreCase("s")) {
                    System.out.println("Hasta Luego");

                }else if(opcion.equalsIgnoreCase("n")) {
                    System.out.println();

                }else{
                    System.out.println("Solo puedes elegir una de las acciones anteriores");

                }
            }while(!opcion.equalsIgnoreCase("s"));
        }
}
