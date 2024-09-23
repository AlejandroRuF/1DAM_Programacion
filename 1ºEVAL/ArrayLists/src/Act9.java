import java.util.ArrayList;

public class Act9 {
    public static void main(String[] args) {
        int pos =1;
        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");

        ArrayList<String> copiarlista= new ArrayList<String>(listaAlumnos);

        System.out.println("Vamos a copiar esta lista");

        for (String i : listaAlumnos) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }
        pos=1;
        System.out.println("Aqui usando el constructor");
        for (String i : copiarlista) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }



    }

}
