public class Revolver {

private int posicionActual;
private int posicionBala;

    public Revolver() {
        aleatorios();
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    private void aleatorios(){

        int bala = (int) (Math.random()*6)+1;
        int actual =(int) (Math.random()*6)+1;

        this.posicionActual = actual;
        this.posicionBala = bala;

    }


    public void siguienteBala(){

        if (this.posicionActual == 6){

            this.posicionActual = 1;

        }else {

            this.posicionActual++;

        }

    }
    public boolean disparar(){

        if (this.posicionActual == this.posicionBala){

            return true;

        }else {

            siguienteBala();
            return false;

        }

    }

    @Override
    public String toString(){

        return ("La bala esta en la posición --> "+getPosicionBala()+
                "El revolver esta en la posición --> "+getPosicionActual());

    }

}
