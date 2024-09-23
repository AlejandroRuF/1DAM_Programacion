package Ej3;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void imprime(ArrayList<Alumno> al){

        for (int i = 0; i < al.size(); i++) {

            System.out.println(al.get(i).toString());

        }
        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {

        ArrayList<Alumno> al = new ArrayList<Alumno>();
        al.add(new Alumno(2588,"Alex",31,"1ºDAM"));
        al.add(new Alumno(258,"Raul",21,"1ºDAM"));
        al.add(new Alumno(2588,"Logan",19,"1ºDAM"));
        al.add(new Alumno(2589,"Emi",27,"1ºDAM"));

        imprime(al);


        Collections.sort(al);
        System.out.println("Comparable");
        imprime(al);

        Collections.shuffle(al);
        System.out.println("Comprator por edad");
        Collections.sort(al,new ComparadorAlumnoEdad());

        imprime(al);

        Collections.sort(al,new ComparadorAlumnoNombre());
        System.out.println("Comparator por nombre");
        imprime(al);



    }



}
