public class Jabali extends Animal implements Comportamiento{

    private int velocidad;
    private int colmillos;

    protected final static String[] ACCION = {"Atacar","Gruñir","Beber agua","Comer","Dormir", "Correr"};

    public Jabali(String nombre, int numeroPatas, String color, int velocidad, int colmillos) {
        super(nombre, numeroPatas, color);
        setColmillos(colmillos);
        setVelocidad(velocidad);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getColmillos() {
        return colmillos;
    }

    public void setColmillos(int colmillos) {
        this.colmillos = colmillos;
    }

    @Override
    public String Accion() {
        int eleccion = (int) (Math.random()*6);

        return ACCION[eleccion];
    }

    @Override
    public String toString(){

        return (super.toString()+"\nTiene una velocidad de "+getVelocidad()+
        " y "+getColmillos()+" colmillos.");

    }

}
