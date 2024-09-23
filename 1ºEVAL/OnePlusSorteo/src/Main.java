import java.util.Scanner;

public class Main {

    public static void generar_cupones(String semilla, int ncupones,String matriz[][]) {

        boolean repetidoPos = false;
        boolean repetidoCupon = false;
        String fila = "";
        String columna = "";
        String cupon;
        String pos = "";



        String[] posiciones = new String[ncupones];

        for (int x = 0; x < ncupones; x++) {
            do {
                repetidoPos = false;
                fila = String.valueOf((int) (Math.random() * (matriz.length)));
                columna = String.valueOf((int) (Math.random() * (matriz[0].length)));
                pos = fila + columna;
                for (int i = 0; i < posiciones.length; i++) {

                    if (pos.equals(posiciones[i])) {

                        repetidoPos = true;

                    }
                }
            } while (repetidoPos);
            do {
                repetidoCupon = false;

                posiciones[x] = pos;
                cupon = semilla + String.valueOf((int) (Math.random() * ncupones));
                for (int j = 0; j < matriz.length; j++) {
                    for (int z = 0; z < matriz[0].length; z++) {

                        if (cupon.equals(matriz[j][z])) {

                            repetidoCupon = true;

                        }

                    }


                }
            } while (repetidoCupon);
            if (!repetidoCupon) {

                matriz[Integer.parseInt(fila)][Integer.parseInt(columna)] = cupon;

            }


        }
        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (!matriz[i][j].equals("*")) {
                    System.out.println(matriz[i][j]);
                }
            }
        }*/
    }

    public static void generar_matriz(String matriz[][]) {

        for (int i = 0;i<25;i++){
            matriz[((int)(i/5))][((int)(i%5))]="*";

        }

    }

    public static String seleccionar_regalo(int numero, String matriz[][]){
        int fila= numero/matriz.length;
        int columna = numero%matriz.length;
        String premio=matriz[fila][columna];
        matriz[fila][columna]="*";
        return premio;
    }


    public static void main(String[] args) {
        String matriz[][] = new String[5][5];
        String semilla ="Cupon ONEP_";
        String opcion;
        String regalo;
        int cupones_Sorteo;
        int sorteo;



        System.out.println("Felicidades Vamos a realizar un sorteo y vas a poder participar en esta ronda las veces que quieras");
        Scanner sc = new Scanner(System.in);
        do{
            do {
                System.out.println("Introduce el numero de cupones que se van a generar de manera aleatoria debe estar entre 1 y 25");
                cupones_Sorteo= sc.nextInt();
            } while (cupones_Sorteo > 25 || cupones_Sorteo < 1);
            generar_matriz(matriz);
            generar_cupones(semilla, cupones_Sorteo, matriz);
            for (int i =0; i< matriz.length;i++){
                for (int j = 0; j< matriz[0].length;j++){
                    System.out.printf("%-20s",matriz[i][j]);
                }
                System.out.println();
            }

                do {
                    System.out.println("Indica el numero con el que quieres participar en " +
                            "el sorteo (Min 0 -- Max 24)");
                    sorteo = sc.nextInt();
                } while (sorteo > 25 || sorteo < 0);



                regalo = seleccionar_regalo(sorteo, matriz);
                if (regalo.equals("*")) {

                    System.out.println("Lo siento no has tenido suerte");

                } else {

                    System.out.println("Felicidades has ganado " + regalo);

                }

                System.out.println("Quieres volver a Participar? (S/N)");
                opcion = sc.next();


        }while (!opcion.equalsIgnoreCase("n"));

    }


}

