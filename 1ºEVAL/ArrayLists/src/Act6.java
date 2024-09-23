import java.util.ArrayList;
import java.util.Scanner;

public class Act6 {

    public static void main(String[] args) {

        int pos=1;
        int numero;
        String dato;
        ArrayList<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");

        for (String i:listaAlumnos){

            System.out.print("Nombre ("+pos+")");
            System.out.printf("%20s%n",i);
            pos+=1;

        }

        System.out.println("\nVamos a eliminar el 3er elemento de la lista");

        listaAlumnos.remove(2);

        pos=1;
        System.out.println();
        for (String i:listaAlumnos){

            System.out.print("Nombre ("+pos+")");
            System.out.printf("%20s%n",i);
            pos+=1;

        }

    }

}
