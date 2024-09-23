package Act5;

import java.util.ArrayList;
import java.util.List;

public class Alumno implements Comparable{

    private String nombre;
    private String apellidos;
    private int edad;
    private List<Double> notas = new ArrayList<Double>();
//    private double nota2;
//    private double nota3;
//    private double nota4;
//    private double nota5;
//    private double nota6;

    public Alumno(String nombre, String apellidos, int edad, double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setNota(nota1);
        setNota(nota2);
        setNota(nota3);
        setNota(nota4);
        setNota(nota5);
        setNota(nota6);


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Double> getNotas() {
        return this.notas;
    }

    public void setNota(double nota1) {
        this.notas.add(nota1);
    }

//    public double getNota2() {
//        return nota2;
//    }
//
//    public void setNota2(double nota2) {
//        this.nota2 = nota2;
//    }
//
//    public double getNota3() {
//        return nota3;
//    }
//
//    public void setNota3(double nota3) {
//        this.nota3 = nota3;
//    }
//
//    public double getNota4() {
//        return nota4;
//    }
//
//    public void setNota4(double nota4) {
//        this.nota4 = nota4;
//    }
//
//    public double getNota5() {
//        return nota5;
//    }
//
//    public void setNota5(double nota5) {
//        this.nota5 = nota5;
//    }
//
//    public double getNota6() {
//        return nota6;
//    }
//
//    public void setNota6(double nota6) {
//        this.nota6 = nota6;
//    }

    public int suspendidas(){
        int sus = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < 5){
                sus ++;
            }
        }
        return sus;
    }

    public boolean todasSuperiorA7(){
        boolean sus = true;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) <= 7){
                sus = false;
            }
        }
        return sus;
    }

    @Override
    public String toString() {
        return getNombre()+";"+getApellidos()+";"+getEdad()+";"+getNotas().get(0)+";"+getNotas().get(1)+";"+
                getNotas().get(2)+";"+getNotas().get(3)+";"+getNotas().get(4)+";"+getNotas().get(5);
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;

        if (this.getNombre().compareTo(a.getNombre()) < 0){
            return 1;
        }else if (this.getNombre().compareTo(a.getNombre()) > 0){
            return -1;
        }else {
            return 0;
        }

    }
}
