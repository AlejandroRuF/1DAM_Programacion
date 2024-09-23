import java.util.Comparator;

public class ComparadorEdad implements Comparator<Cazador> {


    @Override
    public int compare(Cazador o1, Cazador o2) {
        if((o1.getEdad()- o2.getEdad()) > 0){

            return 1;
        } else if ((o1.getEdad()- o2.getEdad()) < 0) {
            return -1;
        }else {
            return 0;
        }
    }
}
