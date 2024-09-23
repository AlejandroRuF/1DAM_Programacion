package Ej2;

public interface Comparar {

    public static boolean esMayor(Object objeto1, Object objeto2){


        Departamento dep1 = (Departamento) objeto1;
        Departamento dep2 = (Departamento) objeto2;

        if(dep1.getEmpleados()-dep2.getEmpleados() > 0){

            return true;

        }
        return false;
    }//Devulve true si el nombre en el objeto 1 esta antes en orden alfabetico que el objeto b




    public static boolean esMenor(Object objeto1, Object objeto2) {
        Departamento dep1 = (Departamento) objeto1;
        Departamento dep2 = (Departamento) objeto2;

        if(dep1.getEmpleados()-dep2.getEmpleados() < 0){

            return true;

        }
        return false;
    }//Devulve true si el nombre en el objeto 1 está después en orden alfabético que el objeto b

    public static boolean esIgual(Object objeto1, Object objeto2) {
        if (!esMayor(objeto1,objeto2) && !esMenor(objeto1,objeto2)) {

            return true;

        }else {

            return false;

        }

    }// si los methods esMayor y esMenor son false significa que los parametros nombre en departamento son iguales


}
