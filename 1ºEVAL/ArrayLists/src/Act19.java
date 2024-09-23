import java.util.ArrayList;

public class Act19 {

    public static void main(String[] args) {

        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose");
        listaAlumnos.add("Sara");
        listaAlumnos.add("Raul");

        System.out.println("Vamos a comparar esta lista con otra usando el metodo contains ya que puede estar desordenada");

        System.out.println("Lista 1: ");
        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos.get(i));

        }

        ArrayList<String> listaAlumnos2 = new ArrayList<String>();
        listaAlumnos2.add("Jose");
        listaAlumnos2.add("Sara");
        listaAlumnos2.add("Raul");
        listaAlumnos2.add("Eduardo");

        System.out.println("Lista 2:");
        for (int i = 0; i < listaAlumnos.size(); i++) {

            System.out.print("Nombre (" + (i + 1) + ")");
            System.out.printf("%20s%n", listaAlumnos2.get(i));

        }

        System.out.println();
        System.out.println();

        boolean igual=true;
        for (int i = 0; i < listaAlumnos.size(); i++) {

            if (!(listaAlumnos2.contains(listaAlumnos.get(i)))){
                igual=false;

            }

        }

        if (igual && listaAlumnos.size()==listaAlumnos2.size()){
            System.out.println("Las Listas contienen los mismos elementos");
        }else {
            System.out.println("Las Listas son diferentes");
        }




    }

}
