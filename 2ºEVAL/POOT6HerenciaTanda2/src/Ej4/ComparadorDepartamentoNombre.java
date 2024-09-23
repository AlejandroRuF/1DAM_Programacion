package Ej4;


import java.util.Comparator;

public class ComparadorDepartamentoNombre implements Comparator<Departamento> {


    @Override
    public int compare(Departamento o1, Departamento o2) {


        return o2.getNombre().compareTo(o1.getNombre());

    }

}
