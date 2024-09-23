public class Perdiz extends Animal implements Comportamiento{

    private int velocidad;
    private boolean pico;
    protected final static String[] ACCION = {"Esconderse","Volar raso","Beber agua","Comer","Dormir",
            "Volar alto"};

    public Perdiz(String nombre, int numeroPatas, String color, int velocidad, boolean pico) {
        super(nombre, numeroPatas, color);
        this.velocidad = velocidad;
        this.pico = pico;

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    @Override
    public String Accion() {
        int eleccion = (int) (Math.random()*6);

        return ACCION[eleccion];
    }

    public String tieneOPico(){

        if(this.pico){
            return "tiene pico";
        }else{
            return "no tiene pico";
        }

    }


    @Override
    public String toString(){

        return (super.toString()+"\nTiene una velocidad de "+getVelocidad()+
                " y "+ tieneOPico());

    }
}
