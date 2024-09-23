package Ej4;

public class Departamento implements Comparable<Departamento> {
    private String nombre;
    private int empleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public Departamento(String nombre, int empleados) {
        setNombre(nombre);
        setEmpleados(empleados);
    }


    @Override
    public int compareTo(Departamento al1) {

        if (this.empleados-al1.getEmpleados() < 0){
            return 1;
        } else if (this.empleados - al1.getEmpleados() > 0 ) {
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString(){

        return "Departamento: "+getNombre()+"   Empleados: "+getEmpleados();
    }

    /*@Override
    public static boolean esMayor(Object objeto1, Object objeto2) {

        Departamento dep1 = (Departamento) objeto1;
        Departamento dep2 = (Departamento) objeto2;

        if(dep1.nombre.compareTo(dep2.nombre) < 0){

            return true;

        }
        return false;
    }//Devulve true si el nombre en el objeto 1 esta antes en orden alfabetico que el objeto b

    @Override
    public static boolean esMenor(Object objeto1, Object objeto2) {
        Departamento dep1 = (Departamento) objeto1;
        Departamento dep2 = (Departamento) objeto2;

        if(dep1.nombre.compareTo(dep2.nombre) > 0){

            return true;

        }
        return false;
    }//Devulve true si el nombre en el objeto 1 está después en orden alfabético que el objeto b


    @Override
    public static boolean esIgual(Object objeto1, Object objeto2) {
        if (!esMayor(objeto1,objeto2) && !esMenor(objeto1,objeto2)) {

            return true;
        }else {

            return false;

        }

    }// si los methods esMayor y esMenor son false significa que los parametros nombre en departamento son iguales

*/


}
