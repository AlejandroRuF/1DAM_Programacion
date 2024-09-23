abstract class Animal implements Comportamiento {

    protected String nombre;
    protected int numeroPatas;
    protected String color;

    public Animal(String nombre, int numeroPatas, String color) {
       setNombre(nombre);
        setNumeroPatas(numeroPatas);
        setColor(color);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){

        return ("Este animal es un "+getNombre()+" con "+getNumeroPatas()+" número de patas y es de color "+getColor());

    }



}
