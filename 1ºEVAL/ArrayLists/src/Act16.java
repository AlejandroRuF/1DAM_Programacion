import java.util.ArrayList;

public class Act16 {

    public static void main(String[] args) {
        int pos =1;
        ArrayList<String> listaAlumnos = new ArrayList<String>();
        listaAlumnos.add("Eduardo");
        listaAlumnos.add("Jose Manuel");
        listaAlumnos.add("Carlos");

        //ArrayList<String> copiarlista= (ArrayList<String>)listaAlumnos.clone();
        ArrayList<String> copiarlista= (ArrayList)listaAlumnos.clone();
        //ArrayList<String > copiar2 = new ArrayList<>(listaAlumnos);

        System.out.println("Vamos a clonar esta lista");

        for (String i : listaAlumnos) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }
        pos=1;
        System.out.println("Aqui usando el metodo clone");
        for (String i : copiarlista) {

            System.out.print("Nombre (" + pos + ")");
            System.out.printf("%20s%n", i);
            pos += 1;

        }



    }

}
