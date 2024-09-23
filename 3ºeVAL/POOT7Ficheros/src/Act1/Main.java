package Act1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        String palabra;
        String texto = "";
        File fichero = new File("fichero.txt");
        Scanner leer_Fichero = new Scanner(fichero);
        //leer_Fichero.useDelimiter("Esto es una prueba");

        if (fichero.canRead()){
            while (leer_Fichero.hasNext()){
                palabra = leer_Fichero.next();

                texto += palabra;
            }
            leer_Fichero.close();
            System.out.println(texto);

        }


    }
}