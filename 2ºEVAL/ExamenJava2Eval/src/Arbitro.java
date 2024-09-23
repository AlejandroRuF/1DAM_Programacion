public class Arbitro extends Participante implements Actuar{

    private String funcion;
    private final static String[] ACCIONES = {"Roja", "Amarilla", "Fuera de Juego", "Falta", "Gol"};

    public Arbitro(String nombre, int edad, String nacionalidad, String funcion) {
        super(nombre, edad, nacionalidad);
        this.funcion = "";
        setFuncion(funcion);
    }
    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return super.toString()+", funcion='" + funcion;
    }

    @Override
    public String Accion() {
        int aleatorio = (int) (Math.random()*ACCIONES.length);

        return ACCIONES[aleatorio];
    }
}
