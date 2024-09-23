import java.util.ArrayList;
import java.util.Collections;

public class Act12 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");
        listaAlumnos.add("Emi");
        listaAlumnos.add("Alex");
        listaAlumnos.add("Manolo");

        System.out.println("Vamos a extraer y copiar parte de esta lista en otra usando los metodos subList");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }
        System.out.println();
        ArrayList<String>  parteAlumnos = new ArrayList<String>(listaAlumnos.subList(3,listaAlumnos.size()));


        System.out.println();
        System.out.println("Lista resultante");
        for (int i = 0; i < parteAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", parteAlumnos.get(i));

        }

    }
}
