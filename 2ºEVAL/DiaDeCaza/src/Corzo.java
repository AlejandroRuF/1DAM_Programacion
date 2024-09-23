import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Corzo extends Animal implements Comportamiento{

    private int velocidad;
    protected final static String[] ACCION = {"Esconderse", "Correr", "Beber agua", "Comer", "Dormir"};

    public Corzo(String nombre, int numeroPatas, String color, int velocidad) {
        super(nombre, numeroPatas, color);
        setVelocidad(velocidad);

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String Accion() {
        int eleccion = (int) (Math.random()*5);

        return ACCION[eleccion];
    }

    @Override
    public String toString(){

        return (super.toString()+"\nTiene una velocidad de "+getVelocidad()+".");

    }
}
