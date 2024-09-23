public class Alumno {

    private int num;
    private int edad;
    private String curso;
    private String nombre;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(int num, int edad, String curso, String nombre) {
        setNum(num);
        setEdad(edad);
        setCurso(curso);
        setNombre(nombre);
    }

    public Alumno() {

    }

    public Alumno(Alumno original) {
        setNum(original.getNum());
        setEdad(original.getEdad());
        setCurso(original.getCurso());
        setNombre(original.getNombre());

    }


}
