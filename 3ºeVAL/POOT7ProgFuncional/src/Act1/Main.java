package Act1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(new Libro("Autor1","Libro6",11));
        libros.add(new Libro("Autor2","Libro5",15));
        libros.add(new Libro("Autor3","Libro4",17));
        libros.add(new Libro("Autor4","Libro3",12));
        libros.add(new Libro("Autor5","Libro2",7));
        libros.add(new Libro("Autor6","Libro1",9));

        libros.sort((l1,l2) -> l1.getTitulo().compareTo(l2.getTitulo()));

        for (Libro l : libros){

            System.out.println(l);

        }

    }
}