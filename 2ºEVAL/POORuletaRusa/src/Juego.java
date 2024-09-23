import java.util.ArrayList;
import java.util.Iterator;

public class Juego {

    public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    public Revolver rev = new Revolver();

    public Juego( int numjug) throws Exception {

        setJugadores(numjug);

    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(int numJug) throws Exception {
        String n = "Jugador ";
        if (numJug > 6 || numJug < 1 ){

            numJug = 6;

        }else {

            for (int i = 0; i < numJug; i++) {

                this.jugadores.add(new Jugador((n+String.valueOf(i+1
                ))));

            }

        }
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

    public void ronda(){

        Iterator<Jugador> it = this.jugadores.iterator();
        boolean muerto = false;
        while (!muerto && it.hasNext()){

            Jugador a = it.next();
            a.disparar(this.rev);
            if (!a.isVivo()) {

                muerto = true;

            }

        }

    }

    public boolean finJuego(){
        boolean muerto = false;

        for (int i = 0; i < this.jugadores.size(); i++) {

            if (!this.jugadores.get(i).isVivo()){

                muerto = true;

            }

        }

        return muerto;

    }
}
