import java.util.ArrayList;
import java.util.Iterator;

public class Act18 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");
        listaAlumnos.add("Emi");
        listaAlumnos.add("Alex");
        listaAlumnos.add("Manolo");

        System.out.println("\nVamos a vaciar esta ArrayLIst usando el metodo remove con un for que va decreciendo " +
                "tambien podemos usar el metodo lista.clear ");

        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

        for (int i = listaAlumnos.size()-1; i >= 0; i--) {

            listaAlumnos.remove(i);

        }

        Iterator<String> iter = listaAlumnos.iterator();
        System.out.println();
        System.out.println("Ahora vamos a comprobar si la lista esta vacia usando iterator\n" +
                "Esta lista esta vacia---> "+!(iter.hasNext()));
        System.out.println();
        System.out.println("Ahora vamos a comprobar si la lista esta vacia usando el metodo isEmpty\n" +
                "Esta lista esta vacia---> "+(listaAlumnos.isEmpty()));
        System.out.println();
        System.out.println("Tambien podemos usar el metodo size para saber cuantos elementos tiene\n" +
                "Esta lista tiene "+listaAlumnos.size()+" elementos");



    }

}
