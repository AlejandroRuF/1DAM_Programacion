package Ej3;

import java.util.Comparator;

public class ComparadorAlumnoNombre implements Comparator<Alumno> {


    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getNombre().compareTo(o2.getNombre()) < 0){
            return 1;
        } else if (o1.getNombre().compareTo(o2.getNombre()) > 0 ) {
            return -1;
        }else {
            return 0;
        }
    }

}
