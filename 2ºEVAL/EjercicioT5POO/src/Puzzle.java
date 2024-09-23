import java.util.ArrayList;
import java.util.Collections;

public class Puzzle {

    private int[][] tablero = new int[4][4];

    public void crear_tablero() {

        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 1; i < 16; i++) {

            num.add(i);

        }
        num.add(0);
        num.set(15,15);
        num.set(14,0);

        int contador = 0;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                this.tablero[i][j] = num.get(contador);
                contador++;

            }
        }

    }

    public void desordenar(){
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 16; i++) {

            num.add(i);

        }

        Collections.shuffle(num);

        int contador = 0;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                this.tablero[i][j] = num.get(contador);
                contador++;

            }
        }
    }

    public boolean estaResuelto() {

        boolean resuelto = true;

        int contador = 1;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                if (i != 3 || j != 3) {

                    if (this.tablero[i][j] != contador) {
                        resuelto = false;
                        contador++;
                    } else {
                        contador++;
                    }
                }

            }

        }

        return resuelto;
    }

    public boolean bajar(){

        boolean ok;
        int fila=0;
        int columna=0;
        int temp=0;

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                if (this.tablero[i][j]==0){

                    fila=i;
                    columna=j;

                }

            }
        }
        if (fila == (this.tablero.length-1)){

            return false;
        }else {

            temp=this.tablero[fila+1][columna];
            this.tablero[fila+1][columna]=0;
            this.tablero[fila][columna]=temp;
            return true;

        }

    }

    public boolean subir(){

        boolean ok;
        int fila=0;
        int columna=0;
        int temp=0;

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                if (this.tablero[i][j]==0){

                    fila=i;
                    columna=j;

                }

            }
        }
        if (fila == 0){

            return false;
        }else {

            temp=this.tablero[fila-1][columna];
            this.tablero[fila-1][columna]=0;
            this.tablero[fila][columna]=temp;
            return true;

        }

    }
    public boolean moverIzquierda(){

        boolean ok;
        int fila=0;
        int columna=0;
        int temp=0;

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                if (this.tablero[i][j]==0){

                    fila=i;
                    columna=j;

                }

            }
        }
        if (columna == (0)){

            return false;
        }else {

            temp=this.tablero[fila][columna-1];
            this.tablero[fila][columna-1]=0;
            this.tablero[fila][columna]=temp;
            return true;

        }

    }

    public boolean moverDerecha(){

        boolean ok;
        int fila=0;
        int columna=0;
        int temp=0;

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                if (this.tablero[i][j]==0){

                    fila=i;
                    columna=j;

                }

            }
        }
        if (columna == (this.tablero[0].length-1)){

            return false;
        }else {

            temp=this.tablero[fila][columna+1];
            this.tablero[fila][columna+1]=0;
            this.tablero[fila][columna]=temp;
            return true;

        }

    }
    public int getPosicion(int x, int y){
        return this.tablero[x][y];
    }

    public int getFilaEspacio(){
        int fila=0;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                if (this.tablero[i][j]==0){

                    fila=i;


                }

            }
        }
        return fila;
    }

    public int getColumnaEspacio(){
        int columna=0;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                if (this.tablero[i][j]==0){

                    columna=i;


                }

            }
        }
        return columna;
    }

    public void mostrar(){

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                System.out.printf("%5d",this.tablero[i][j]);

            }
            System.out.println();
        }

    }

}
