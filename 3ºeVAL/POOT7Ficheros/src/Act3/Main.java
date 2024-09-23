package Act3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        List<Libro> listalibros = new ArrayList<Libro>();
        String [] temp = new String[3];
        File archivo = new File("libros.txt");
        File archivo2 = new File("libros_ordenados.txt");
        File archivo3 = new File("estadisticas.txt");
        Scanner leer_libro = new Scanner(archivo);
        PrintStream escribir = new PrintStream(archivo2);
        archivo2.createNewFile();
        String linea;
        leer_libro.useDelimiter("fasfasd");

        while (leer_libro.hasNext()){

            linea = leer_libro.nextLine();
            temp = linea.split(";");
            temp[2] = temp[2].replaceFirst(",",".");


            listalibros.add(new Libro(temp[0],temp[1],(Double.parseDouble(temp[2]))));

        }

        String librotemp;
        listalibros = listalibros.stream()
                .sorted((p1,p2)-> p2.nombre.compareTo(p1.nombre))
                .toList();

        listalibros.stream()
                .forEach(p ->  escribir.println(p.toString()));


        Scanner leerOrdenados = new Scanner(archivo2);
        librotemp = "";
        while (leerOrdenados.hasNext()){

            librotemp += leerOrdenados.nextLine()+"\n";

        }

        leerOrdenados.close();
        leer_libro.close();
        escribir.close();

        System.out.println(librotemp);

        PrintStream escribir_estadisticas =  new PrintStream(archivo3);
    if (listalibros.stream()
            .max((p1,p2) -> Double.compare(p1.getPrecio(),p2.getPrecio())).isPresent()){
        librotemp ="El libro mas caro de la lista es : "+ listalibros.stream()
                .max((p1,p2) -> Double.compare(p1.getPrecio(),p2.getPrecio())).get()
               .toString();

        escribir_estadisticas.println(librotemp);
    }

    if (listalibros.stream()
            .mapToDouble(p1 -> p1.getPrecio())
            .average().isPresent())
         librotemp ="La media de los precios de todos los libros es: "+ listalibros.stream()
                .mapToDouble(p1 -> p1.getPrecio())
                .average().getAsDouble()+ "";


        escribir_estadisticas.println(librotemp);

        escribir_estadisticas.close();
        Scanner leer_estadisticas =  new Scanner(archivo3);

        while (leer_estadisticas.hasNext()){

            System.out.println(leer_estadisticas.nextLine());

        }



    }

}
