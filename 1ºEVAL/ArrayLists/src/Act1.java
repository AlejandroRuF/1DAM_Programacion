import java.util.ArrayList;
import java.util.Iterator;

public class Act1 {

    public static void main(String[] args) {

        String rojo="Rojo";

        System.out.println("Ejercicio 1\n" +
                "Vamos a imprimir los colores de la lista");

        ArrayList<String> lista = new ArrayList<String>();

        lista.ensureCapacity(3);

        lista.add(rojo);
        lista.add("Azul");
        lista.add("Amarillo");

        lista.trimToSize();


        System.out.println("\nImprimimos con un FOR\n");

        for(String i:lista){

            System.out.println("Color: "+i);

        }

        System.out.println("\nImprimimos con un Iterator\n");

        Iterator<String> iterador = lista.iterator();

        while (iterador.hasNext()){

            System.out.println("Color: "+iterador.next());

        }

    }
}

