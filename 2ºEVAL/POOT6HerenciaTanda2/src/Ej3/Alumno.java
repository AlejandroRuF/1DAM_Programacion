package Ej3;

public class Alumno implements Comparable {

    private int codigo;
    private String Nombre;
    private int edad;
    private String curso;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public Alumno(int codigo, String nombre, int edad, String curso) {
        this.codigo = codigo;
        Nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }


    @Override
    public int compareTo(Object o) {
        Alumno al1 = (Alumno) o;
        if (this.edad-al1.getEdad() < 0){
            return 1;
        } else if (this.edad - al1.getEdad() > 0 ) {
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString(){

        return "Alumno " + getCodigo()+ " " + getNombre() + " de " + getEdad()+ " Años cursa " + getCurso();

    }
}
