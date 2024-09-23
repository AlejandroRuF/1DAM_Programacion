package Act3;

abstract class ElementoDomotico {



    protected boolean estado_Actual = true;
    protected String nombre;

    public ElementoDomotico() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract void interruptor();

    abstract String estado();


    @Override
    public String toString() {
        return "ElementoDomotico{" +
                "estado_Actual=" + estado_Actual +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
