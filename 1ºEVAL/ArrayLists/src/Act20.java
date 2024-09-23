import java.util.ArrayList;

public class Act20 {

    public static void main(String[] args) {


        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose");
        listaAlumnos.add("Sara");
        listaAlumnos.add("Raul");
        ArrayList<String> listaAlumnosClon = new ArrayList<String>();

        System.out.println("Vamos a clonar la siguiente lista de forma manual");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

        for (String i:listaAlumnos){

            listaAlumnosClon.add(i);

        }

        System.out.println();
        System.out.println("Este es el resultado del clon");
        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnosClon.get(i));

        }

    }

}
