public class Alimanya {

    public char[][] alimanya = new char[4][4];

    private int tipoalimanya(){
        int tipo = (int) (Math.random()*4)+1;


        return tipo;
    }

    public void generarAlimanya(){


        int tipo= tipoalimanya();
        int aleatorio=(int) (Math.random()*3);

        for (int i = 0; i<this.alimanya.length;i++){
            for(int j = 0; j<this.alimanya[0].length; j++){

                this.alimanya[i][j]='*';

            }
        }

        if (tipo==1){

            for (int i=0; i<this.alimanya[0].length;i++){

                this.alimanya[aleatorio][i]='@';

            }

        }
        if (tipo==2){

            for (int i =0; i<this.alimanya.length; i++){

                this.alimanya[i][aleatorio]='@';

            }

        }
        if (tipo==3){

            for (int i=0; i<this.alimanya.length; i++){

                this.alimanya[i][i]='@';

            }

        }
        if (tipo==4){

            for (int j=3; j>=0; j--){

                this.alimanya[j][(3-j)]='@';

            }

        }
    }

    public boolean disparar(int disparo){
        String sdisparo=String.valueOf(disparo);


        if (sdisparo.length()==1){

            if (this.alimanya[0][disparo]=='@'){

                this.alimanya[0][disparo]='*';
                return true;

            }else {

                return false;

            }

        }else {

            int fila = Integer.parseInt(sdisparo.charAt(0)+"");
            int columna = Integer.parseInt(sdisparo.charAt(1)+"");

            if (this.alimanya[fila][columna]=='@'){

                this.alimanya[fila][columna]='*';
                return true;

            }else {

                return false;

            }

        }
    }

    public void get_tablero(){

        for (int i = 0; i<this.alimanya.length;i++){
            for(int j = 0; j<this.alimanya[0].length; j++){

                System.out.printf("%5s",this.alimanya[i][j]);

            }
            System.out.println();
        }

    }


}
