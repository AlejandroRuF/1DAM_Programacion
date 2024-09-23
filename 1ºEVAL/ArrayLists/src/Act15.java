import java.util.ArrayList;
import java.util.Scanner;

public class Act15 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<String>();
            listaAlumnos.add("Eduardo");
            listaAlumnos.add("Jose Manuel");
            listaAlumnos.add("Carlos");
            listaAlumnos.add("Emi");
            listaAlumnos.add("Alex");
            listaAlumnos.add("Manolo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a fusionar 2 arrayList usando el metodo addAll");
        System.out.println("Lista nº 1:");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }
        System.out.println();
        System.out.println("Lista nº 2:");

        ArrayList<String> listaApellido1=new ArrayList<>();
            listaApellido1.add("Martinez");
            listaApellido1.add("Perez");
            listaApellido1.add("Lopez");
            listaApellido1.add("Giménez");
            listaApellido1.add("Romero");
            listaApellido1.add("Gomez");

        for (int i = 0; i < listaApellido1.size(); i++) {

            System.out.print("Nombre (" + (i) + ")");
            System.out.printf("%20s%n", listaApellido1.get(i));

        }
        System.out.println();

        listaAlumnos.addAll(listaApellido1);

        System.out.println("Resultado:");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }


    }

}
