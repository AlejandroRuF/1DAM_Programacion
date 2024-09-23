import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Act14 {

    public static void main(String[] args) {

        int pos1;
        int pos2;
        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");
        listaAlumnos.add("Emi");
        listaAlumnos.add("Alex");
        listaAlumnos.add("Manolo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos intercambiar 2 elementos de esta lista usando el metodo swap de colections");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

        System.out.println("Elige los elementos que quieres intercambiar\n" +
                "introduce la posicion 1 :");
            pos1=sc.nextInt();

        System.out.println("Introduce la posicion 2");
            pos2=sc.nextInt();

        Collections.swap(listaAlumnos,pos1,pos2);

        System.out.println("Resultado -------> ");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

    }

}
