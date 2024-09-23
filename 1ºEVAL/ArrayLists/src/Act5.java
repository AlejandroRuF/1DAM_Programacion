import java.util.ArrayList;
import java.util.Scanner;

public class Act5 {

    public static void main(String[] args) {

        int pos=1;
        int numero;
        String dato;
        ArrayList<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");

        Scanner sc = new Scanner(System.in);

        for (String i:listaAlumnos){

            System.out.print("Nombre ("+pos+")");
            System.out.printf("%20s%n",i);
            pos+=1;

        }

        System.out.println("\nIntroduce un dato para insertarlo en la posicion elegida del ArrayList\n" +
                "Introduce el dato");

        dato=sc.next();

        System.out.println("Introduce la posicion");
        numero=sc.nextInt();

        listaAlumnos.set(numero,dato);

        pos=1;
        System.out.println();
        for (String i:listaAlumnos){

            System.out.print("Nombre ("+pos+")");
            System.out.printf("%20s%n",i);
            pos+=1;

        }

    }

}
