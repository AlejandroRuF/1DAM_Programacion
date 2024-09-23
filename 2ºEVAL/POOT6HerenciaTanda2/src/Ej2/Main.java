package Ej2;

import java.util.ArrayList;

public class Main {

    public static void imprimeComp(Departamento dep1, Departamento dep2 ){

        if (Comparar.esMayor(dep1,dep2)){

            System.out.println(dep1.getNombre()+" es mayor "+dep2.getNombre());

        }else if (Comparar.esMenor(dep1,dep2)){

            System.out.println(dep1.getNombre()+" es menor "+dep2.getNombre());

        }else if (Comparar.esIgual(dep1,dep2)){

            System.out.println(dep1.getNombre()+" y "+dep2.getNombre()+" son iguales");

        }

    }

    public static void main(String[] args) {

        ArrayList<Departamento> deps = new ArrayList<Departamento>();

        deps.add(new Departamento("Informatica",10));
        deps.add(new Departamento("Musica",5));
        deps.add(new Departamento("Ingles",4));
        deps.add(new Departamento("Economia",10));
        deps.add(new Departamento("Castellano",15));


        imprimeComp(deps.get(0),deps.get(4));
        imprimeComp(deps.get(0),deps.get(0));
        imprimeComp(deps.get(4),deps.get(0));


    }

}
