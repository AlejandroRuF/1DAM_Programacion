import java.util.*;

public class Act7 {

    public static void main(String[] args) {


        int pos = 1;
        String dato;
        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");

        Scanner sc=new Scanner(System.in);


        for (String i : listaAlumnos) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }

        System.out.println("\nVamos a Buscar si el elemento introducido esta en la lista\n" +
                "Introduce lo que quieres buscar");

        dato=sc.nextLine();
        if ( listaAlumnos.contains(dato)){

            System.out.println("El elemento esta en la lista en la posicion "+(listaAlumnos.indexOf(dato)+1));

        }else {

            System.out.println("El Dato no se encuentra en la lista");

        }

        pos = 1;
        System.out.println();
        for (String i : listaAlumnos) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }
    }
}