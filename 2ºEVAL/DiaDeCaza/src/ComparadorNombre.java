import java.util.Comparator;

public class ComparadorNombre implements Comparator<Cazador> {


    @Override
    public int compare(Cazador o1, Cazador o2) {
        if(o1.getNombre().compareTo(o2.getNombre()) > 0){

            return -1;
        } else if (o1.getNombre().compareTo(o2.getNombre()) < 0) {
            return 1;
        }else {
            return 0;
        }
    }
}
