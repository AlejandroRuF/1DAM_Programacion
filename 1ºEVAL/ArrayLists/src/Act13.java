import java.util.ArrayList;

public class Act13 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");
        listaAlumnos.add("Emi");
        listaAlumnos.add("Alex");
        listaAlumnos.add("Manolo");

        System.out.println("Vamos a comparar esta lista con otra usando el metodo equals");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }
        System.out.println();
        ArrayList<String>  parteAlumnos = new ArrayList<String>(listaAlumnos.subList(3,listaAlumnos.size()));


        System.out.println();
        System.out.println();
        for (int i = 0; i < parteAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", parteAlumnos.get(i));

        }

        System.out.println("Estas dos listas son iguales?---> "+listaAlumnos.equals(parteAlumnos));

        ArrayList<String> listaAlumnos2 = new ArrayList<String>();
        listaAlumnos2.add("Eduardo");
        listaAlumnos2.add("Jose Manuel");
        listaAlumnos2.add("Carlos");
        listaAlumnos2.add("Emi");
        listaAlumnos2.add("Alex");
        listaAlumnos2.add("Manolo");


        System.out.println("Vamos a comparar esta lista con otra usando el metodo equals");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < listaAlumnos2.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos2.get(i));

        }

        System.out.println("Estas dos listas son iguales?---> "+listaAlumnos.equals(listaAlumnos2));



    }

}
