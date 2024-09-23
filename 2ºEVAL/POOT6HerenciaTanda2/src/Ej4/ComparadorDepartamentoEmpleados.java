package Ej4;

import java.util.Comparator;

public class ComparadorDepartamentoEmpleados implements Comparator<Departamento> {


    @Override
    public int compare(Departamento o1, Departamento o2) {
        if (o1.getEmpleados()-o2.getEmpleados() < 0){
            return 1;
        } else if (o1.getEmpleados() - o2.getEmpleados() > 0 ) {
            return -1;
        }else {
            return 0;
        }
    }
}
