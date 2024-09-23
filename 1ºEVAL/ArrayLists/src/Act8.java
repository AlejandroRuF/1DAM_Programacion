import java.util.ArrayList;
import java.util.Collections;

public class Act8 {

    public static void main(String[] args) {

        int pos = 1;
        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");

        System.out.println("Vamos a oredenar este arrayList");

        for (String i : listaAlumnos) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }

        Collections.sort(listaAlumnos);

        pos = 1;
        System.out.println();
        for (String i : listaAlumnos) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }

    }
}
