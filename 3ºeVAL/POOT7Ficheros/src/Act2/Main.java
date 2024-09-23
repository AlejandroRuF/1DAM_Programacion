package Act2;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String ruta1 = "";
        Scanner rutafic = new Scanner(System.in);
        System.out.println("Introduce la ruta finalizando con el nombre y extension del archivo que quieres crear");
        ruta1 = rutafic.nextLine();


        File fichero = new File(ruta1);
        String ruta = fichero.getParent();
        if ((ruta.charAt(0)+"").equals("/")) {

            ruta = ruta.replaceFirst("/", "");
            fichero = new File(ruta+"FicheAct2.txt");
        }

        File crear_carpetas = new File(ruta);


        if(!crear_carpetas.exists()){
                crear_carpetas.mkdirs();

        }
        String texto = "";
        System.out.println("Escribe el texto a guardar en el fichero");
        texto = rutafic.nextLine();

        String leer="";
        String palabra = "";
        fichero.createNewFile();

        PrintStream escribir_Fichero = new PrintStream(fichero);

        escribir_Fichero.println(texto);
        escribir_Fichero.close();


        try (BufferedReader br = new BufferedReader(new
                FileReader(ruta+"FicheAct2.txt"))) {

            while((palabra = br.readLine()) != null){

                for (int i = 0; i < palabra.length(); i++) {

                    if (Character.isAlphabetic(palabra.charAt(i))) {
                        if ((palabra.charAt(i) + "").toLowerCase().equals((palabra.charAt(i) + ""))) {

                            leer += (palabra.charAt(i) + "").toUpperCase();

                        } else {
                            leer += (palabra.charAt(i) + "").toLowerCase();
                        }

                    }
                }

            }

        }

        escribir_Fichero.close();

        System.out.println(leer);

    }

}
