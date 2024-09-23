import java.util.ArrayList;

public class Act21 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");
        listaAlumnos.add("Emi");
        listaAlumnos.add("Alex");
        listaAlumnos.add("Manolo");

        System.out.println("\nVamos a vaciar esta ArrayLIst usando el metodo remove con un for que va decreciendo");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

        for (int i = listaAlumnos.size()-1; i >= 0; i--) {

            listaAlumnos.remove(i);

        }




    }

}


