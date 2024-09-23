abstract class Participante {
    //ULTIMA VERSION DE JDK UTILIZADA (21)
    //SEGUN LA HOJA DEL EXAMEN NO VEO NINGUN METODO ABSTRACTO Y TAMPOCO SE SUPONE QUE DEBAMOS IMPLEMENTAR ACTUAR AQUI
    protected String nombre;
    protected int edad;
    protected String nacionalidad;

    public Participante(String nombre, int edad, String nacionalidad) {
        this.nombre = "";
        setNombre(nombre);
        this.edad = 0;
        setEdad(edad);
        this.nacionalidad = "";
        setNacionalidad(nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return  "nombre='" + this.nombre + ',' +
                " edad=" + this.edad + "," +
                " nacionalidad='" + this.nacionalidad;
    }
}
