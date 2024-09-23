import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Jugador extends Participante implements Actuar, Comparable<Jugador> {

    private int dorsal;
    private String posicion;
    private String equipo;

    private final static String[] ACCION = {"Cometer Falta", "Rematar", "Defender", "Parar", "Asistir"};

    public Jugador(String nombre, int edad, String nacionalidad, int dorsal, String posicion, String equipo) {
        super(nombre, edad, nacionalidad);

        this.dorsal = 0;
        setDorsal(dorsal);
        this.equipo = "";
        setEquipo(equipo);
        this.posicion = "";
        setPosicion(posicion);

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String Accion() {
        int aleatorio = (int) (Math.random()*ACCION.length);

        return ACCION[aleatorio];
    }

    @Override
    public int compareTo(Jugador o) {
        if (getDorsal() - o.getDorsal() > 0){
            return -1;
        } else if (getDorsal() - o.getDorsal() < 0) {
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString()+", Dorsal=" + dorsal +
                ", posicion='" + posicion+
                ", equipo='" + equipo;
    }
}
