import java.util.ArrayList;

public class Act22 {

    public static void main(String[] args) {

        System.out.println("Vamos a copiar de manera manual 2 arraylist pero esta vez el segundo estara ordenado de manera inversa");
        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose");
        listaAlumnos.add("Sara");
        listaAlumnos.add("Raul");
        ArrayList<String> listaAlumnosClon = new ArrayList<String>();

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

        for (int i = listaAlumnos.size()-1; i >= 0; i--){

            listaAlumnosClon.add(listaAlumnos.get(i));

        }

        System.out.println();
        System.out.println("Este es el resultado del clon invertido");
        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnosClon.get(i));

        }

    }


}


