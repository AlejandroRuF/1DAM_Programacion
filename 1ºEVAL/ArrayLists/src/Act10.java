import java.util.ArrayList;
import java.util.Collections;

public class Act10 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");
        listaAlumnos.add("Emi");
        listaAlumnos.add("Alex");
        listaAlumnos.add("Manolo");

        System.out.println("Vamos a desprdenar esta lista usando el metodo Shuffle");

        for (int i =0;i< listaAlumnos.size();i++) {

            System.out.print("Nombre (" + (i+1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }
        Collections.shuffle(listaAlumnos);
        System.out.println();
        for (int i =0;i< listaAlumnos.size();i++) {

            System.out.print("Nombre (" + (i+1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }



    }

}
