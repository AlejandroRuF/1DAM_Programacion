package Ej4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void imprime(ArrayList<Departamento> al){

        for (int i = 0; i < al.size(); i++) {

            System.out.println(al.get(i).toString());

        }
        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {

        ArrayList<Departamento> deps = new ArrayList<Departamento>();

        deps.add(new Departamento("Informatica",110));
        deps.add(new Departamento("Musica",25));
        deps.add(new Departamento("Ingles",4));
        deps.add(new Departamento("Economia",10));
        deps.add(new Departamento("Castellano",15));


        Collections.shuffle(deps);
        imprime(deps);

        System.out.println("Con comparable ordenado por trabajadores");
        Collections.sort(deps);
        imprime(deps);
        System.out.println("Shuffle");
        Collections.shuffle(deps);
        imprime(deps);
        System.out.println("Comparator por empleados");
        Collections.sort(deps,new ComparadorDepartamentoEmpleados());
        imprime(deps);
        System.out.println("Shuffle");
        Collections.shuffle(deps);
        imprime(deps);
        System.out.println("Comparator por Nombre invertido");
        Collections.sort(deps,new ComparadorDepartamentoNombre());
        imprime(deps);




    }

}
