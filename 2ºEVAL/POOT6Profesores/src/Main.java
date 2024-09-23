import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Profesor> lista = new ArrayList<Profesor>();

        lista.add(new ProfesorTitular("Eduardo", "Sapiña", 35));
        lista.add(new ProfesorTitular("Sebastian", "Villa", 31, "ABC1234"));
        lista.add(new ProfesorInterino("Adrian", "Alfonso", 31, "ASD5543"));
        lista.add(new ProfesorInterino("Manel","Merino",31));

        ListinProfesores listin = new ListinProfesores(lista);

        Iterator<Profesor> profes = listin.getListprofe().iterator();

        while (profes.hasNext()){
            Profesor uno = profes.next();
            if (uno instanceof ProfesorTitular){

                ProfesorTitular a = (ProfesorTitular) uno;
                a.mostrarDatos();

            } else if (uno instanceof ProfesorInterino) {
                ProfesorInterino b = (ProfesorInterino) uno;
                b.mostrarDatos();

            }else {

                System.out.println("Introduce los tipos de datos correctos");

            }

        }

    }
}