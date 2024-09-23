public class Profesor extends Persona {

    private String id_profesor;


    public Profesor(String nombre, String apellidos, int edad) {

        this(nombre, apellidos,edad, "Desconocido");
        //super(nombre, apellidos, edad);
        //this.id_profesor = "Desconocido";
    }

    public Profesor(String nombre, String apellidos, int edad, String id_profesor) {
        super(nombre, apellidos, edad);
        setId_profesor(id_profesor);
    }

    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }

    public void mostrarDatos(){

        System.out.println("Este profesor tiene:\n" +
                "  Id --> "+this.id_profesor+
                "  Nombre --> "+this.getNombre()+
                "  Apellidoos -->"+ this.getApellidos()+
                "  Edad --> "+this.getEdad());

    }
}
