public class Nombre {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Nombre(String nombre, String primerApellido, String segundoApellido) {
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
    }



}
