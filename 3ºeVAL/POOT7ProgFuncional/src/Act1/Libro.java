package Act1;

public class Libro {

    protected String autor;
    protected String titulo;
    protected double precio;

    public Libro(String autor, String titulo, double precio) {
        this.autor = "";
        setAutor(autor);
        this.titulo = "";
        setTitulo(titulo);
        this.precio = 0;
        setPrecio(precio);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Act1.Libro{" +
                "autor='" + autor +
                ", titulo='" + titulo +
                ", precio=" + precio +
                '}';
    }
}
