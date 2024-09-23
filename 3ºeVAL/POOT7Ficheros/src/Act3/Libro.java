package Act3;

public class Libro {

    protected String nombre;
    protected String autor;
    protected double precio;

    public Libro(String nombre, String autor, double precio) {
        setNombre(nombre);
       setAutor(autor);
       setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return getNombre() + "; "+ getAutor()+"; "+getPrecio();
    }
}
