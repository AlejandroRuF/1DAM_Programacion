import java.util.ArrayList;
import java.util.Scanner;

public class Act3 {

    public static void main(String[] args) {

        ArrayList<String> nuevo = new ArrayList<String>();
        nuevo.add("Hola");
        nuevo.add(" Edu ");
        nuevo.add("y ");
        nuevo.add("Sebas.");

        String dato;
        Scanner sc = new Scanner(System.in);

        for (String i:nuevo){

            System.out.print(i);

        }
        System.out.println();


        System.out.println("Introduce un dato para insertarlo en la primera posicion del ArrayList");
        dato=sc.next();
        nuevo.set(0,dato);

        for (String i:nuevo){

            System.out.print(i);

        }
        System.out.println();
    }

}
