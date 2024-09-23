public class Conecta4 {
    private char[][] juego = new char[7][8];
    private String ganador;

    public Conecta4() {
        for(int i = 0; i < this.juego.length; ++i) {
            for(int j = 0; j < this.juego[0].length; ++j) {
                if (i == 0) {
                    this.juego[i][j] = String.valueOf(j).charAt(0);
                } else if (j == 0) {
                    this.juego[i][j] = String.valueOf(i).charAt(0);
                } else {
                    this.juego[i][j] = '*';
                }
            }
        }

    }

    public boolean rangoy(int y) throws Exception {
        if (y <= 8 && y >= 1) {
            return true;
        } else {
            throw new Exception("El tamaño maximo del eje y del tablero es 7");
        }
    }

    public boolean rangox(int x) throws Exception {
        if (x <= 7 && x >= 1) {
            return true;
        } else {
            throw new Exception("El tamaño maximo del eje x del tablero es 6");
        }
    }

    public boolean estaDisponible(int x, int y) throws Exception {
        if (this.rangoy(y) && this.rangox(x)) {
            if (this.juego[x][y] == '*') {

                return true;

            } else {

                throw new Exception("Esa Posicion ya esta ocupada");
            }
        }else {
            return false;
        }
    }



    public boolean esO(int x, int y) {
        return this.juego[x][y] == 'O';
    }

    public boolean esX(int x, int y) {
        return this.juego[x][y] == 'X';
    }

    public void set_X(int x, int y) throws Exception {
        if (this.rangox(x) && this.rangoy(y)) {
            if (estaDisponible(x,y)) {
                this.juego[x][y] = 'X';
            }
        }

    }

    public void set_O(int x, int y) throws Exception {
        if (this.rangox(x) && this.rangoy(y)) {
            if (estaDisponible(x,y)) {
                this.juego[x][y] = 'O';
            }
        }

    }

    public boolean ganaX() {
        for(int i = 0; i < this.juego.length; ++i) {
            for(int j = 0; j < this.juego[0].length; ++j) {
                if (j + 3 < 8 && this.esX(i, j) && this.esX(i, j + 1) && this.esX(i, j + 2) && this.esX(i, j + 3)) {
                    return true;
                }

                if (i + 3 < 7 && this.esX(i, j) && this.esX(i + 1, j) && this.esX(i + 2, j) && this.esX(i + 3, j)) {
                    return true;
                }

                if (i - 3 >= 0 && j - 3 >= 0 && this.esX(i, j) && this.esX(i - 1, j - 1) && this.esX(i - 2, j - 2) && this.esX(i - 3, j - 3)) {
                    return true;
                }

                if (i - 3 >= 0 && j + 3 < 8 && this.esX(i, j) && this.esX(i - 1, j + 1) && this.esX(i - 2, j + 2) && this.esX(i - 3, j + 3)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean ganaO() {
        for(int i = 0; i < this.juego.length; ++i) {
            for(int j = 0; j < this.juego[0].length; ++j) {
                if (j + 3 < 7 && this.esO(i, j) && this.esO(i, j + 1) && this.esO(i, j + 2) && this.esO(i, j + 3)) {
                    return true;
                }

                if (i + 3 < 7 && this.esO(i, j) && this.esO(i + 1, j) && this.esO(i + 2, j) && this.esO(i + 3, j)) {
                    return true;
                }

                if (i - 3 >= 0 && j - 3 >= 0 && this.esO(i, j) && this.esO(i - 1, j - 1) && this.esO(i - 2, j - 2) && this.esO(i - 3, j - 3)) {
                    return true;
                }

                if (i - 3 >= 0 && j + 3 < 7 && this.esO(i, j) && this.esO(i - 1, j + 1) && this.esO(i - 2, j + 2) && this.esO(i - 3, j + 3)) {
                    return true;
                }
            }
        }

        return false;
    }

    public void mostrarTablero() {
        for(int i = 0; i < this.juego.length; ++i) {
            for(int j = 0; j < this.juego[0].length; ++j) {
                System.out.printf("%5s", this.juego[i][j]);
            }

            System.out.println();
        }

    }

    public boolean nolleno(){
        boolean llen=false;
        for (int i = 0; i < this.juego.length; i++) {
            for (int j = 0; j < this.juego.length; j++) {
                if (this.juego[i][j]=='*'){

                    llen=true;

                }
            }
        }
        return true;
    }
}
