import java.util.Scanner;

public class Act57 {
/*Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos
piden hacer un menú con estas opciones:
Rellenar TODA la matriz de números. Esto debe pedirse al usuario.
Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
Sumar la diagonal principal (ver ejemplo)
Sumar la diagonal inversa (ver ejemplo)
La media de todos los valores de la matriz*/

    public static void main(String[] args) {

        int[][] numeros= new int[4][4];
        int opcion;
        int entrada;
        int fila;
        int columna;
        int suma=0;
        boolean relleno=false;

        Scanner sc = new Scanner(System.in);
do {
    System.out.println("Elige una de las Siguentes opciones" +
            "\n1- Rellenar la matriz" +
            "\n2- Sumar una fila" +
            "\n3- Sumar diagonal" +
            "\n4- Suma diagonal inversa" +
            "\n5- Suma toda la matriz" +
            "\n6- Salir");
    opcion = sc.nextInt();

    if (opcion==1){

        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
                System.out.println("Rellena el espacio "+i+" "+j);
                numeros[i][j]=sc.nextInt();
                //numeros[i][j]=(int) (Math.random()*99);


            }
        }
        System.out.println("Tu matriz es:");
        for (int i = 0;i<4;i++){
            System.out.println();
            for (int j = 0;j<4;j++){

                System.out.printf("%02d",numeros[i][j]);
                System.out.print(" ");


            }
        }

        System.out.println();
        relleno=true;

    } else if (opcion==2 && relleno) {

        System.out.println("Elige una fila para sumar");
        fila= sc.nextInt();
        System.out.println("La suma de la fila "+(fila+1));
        for (int i = 0;i<4;i++){
            System.out.printf("%02d",numeros[(fila)][i]);
            System.out.print(" ");
            suma=suma+numeros[(fila)][i];


        }
        System.out.println("es -----> "+suma);
        suma=0;


    }else if (opcion==3 && relleno) {

        System.out.println("La suma de la diagonal ");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%02d",numeros[i][i]);
            System.out.print(" ");
            suma = suma + numeros[(i)][i];


        }
        System.out.println("es -----> " + suma);
        suma = 0;
    }else if (opcion==4 && relleno) {


        System.out.println("La suma de la diagonal ");
        for (int i = 3; i >= 0; i--) {
            System.out.printf("%02d",numeros[i][3-i]);
            System.out.print(" ");
            suma = suma + numeros[(i)][(3-i)];


        }
        System.out.println("es -----> " + suma);
        suma = 0;
    }else if (opcion==5 && relleno) {


        System.out.println("La suma de la matriz ");
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4 ; j++) {
                System.out.printf("%02d",numeros[i][j]);
                System.out.print(" ");
                suma = suma + numeros[(i)][(j)];
            }

        }
        System.out.println();
        System.out.println("es -----> " + suma);
        suma = 0;
    }

}while (opcion!=6);
    }

}
