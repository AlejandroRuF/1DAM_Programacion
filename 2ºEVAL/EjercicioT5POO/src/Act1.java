import java.util.ArrayList;
import java.util.Iterator;

public class Act1 {

    public static void main(String[] args) {

        int contador = 1;
        ArrayList<Libreria> libros = new ArrayList<>();
        try {

            libros.add(new Libreria( "asd12","Libro1", "Autor1", 15));
            libros.add(new Libreria("123as","Libro2"));
            libros.add(new Libreria("qwe12","Libro3","Autor3"));
            libros.add(new Libreria("1234a","Libro4"));

        }catch (Exception e){

            System.out.println(e);

        }

        Iterator<Libreria> it = libros.iterator();

        System.out.println("En total tenemos estos "+ Libreria.getNum_libros()+ " Libros");
        while (it.hasNext()){

            System.out.print(contador+": ");
            it.next().mostrar();
            contador++;

        }

    }

}
