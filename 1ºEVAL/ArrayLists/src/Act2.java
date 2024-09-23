import java.util.ArrayList;
import java.util.Iterator;

public class Act2 {

    public static void main(String[] args) {


        int pos=1;

        System.out.println("Ejercicio 2");
        System.out.println("Vamos a imprimir los nombres que estan en las 3 Listas\n");


        ArrayList<String> listaAlumnos = new ArrayList<>();
        ArrayList<String> listaApellido1 = new ArrayList<>();
        ArrayList<String> listaApellido2 = new ArrayList<>();



        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");

        listaApellido1.add("Martinez");
        listaApellido1.add("Perez");
        listaApellido1.add("Lopez");

        listaApellido2.add("Giménez");
        listaApellido2.add("Romero");
        listaApellido2.add("Gomez");

        Iterator<String> iterador = listaAlumnos.iterator();
        Iterator<String> iterador2 = listaApellido1.iterator();
        Iterator<String> iterador3 = listaApellido2.iterator();

        System.out.println("Con For Each\n");

        for (String i:listaAlumnos){

            System.out.print("Nombre ("+pos+")");
            System.out.printf("%20s  %20s  %20s",i,iterador2.next(),iterador3.next());
            System.out.println();
            pos+=1;
        }
        pos=1;
        iterador = listaAlumnos.iterator();
       iterador2 = listaApellido1.iterator();
       iterador3 = listaApellido2.iterator();

        System.out.println("\nCon Iterador\n");
        while (iterador.hasNext()){

            System.out.print("Nombre ("+pos+")");
            System.out.printf("%20s  %20s  %20s",iterador.next(),iterador2.next(),iterador3.next());
            System.out.println();
            pos+=1;

        }
        System.out.println("\nCon For\n");
        pos=1;
        for (int i = 0; i<listaAlumnos.size();i++){

            System.out.print("Nombre ("+pos+")");
            System.out.printf("%20s  %20s  %20s%n",listaAlumnos.get(i),listaApellido1.get(i),listaApellido2.get(i));
            pos+=1;

        }

    }

}
