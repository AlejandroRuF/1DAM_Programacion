package Ej3;

import java.util.Comparator;

public class ComparadorAlumnoEdad implements Comparator<Alumno> {


    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getEdad()-o2.getEdad() < 0){
            return 1;
        } else if (o1.getEdad() - o2.getEdad() > 0 ) {
            return -1;
        }else {
            return 0;
        }
    }
}
