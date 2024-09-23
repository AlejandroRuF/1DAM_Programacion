import java.util.ArrayList;
import java.util.Iterator;

public class Act2 {

    public static void main(String[] args){

        ArrayList<Coche> coches = new ArrayList<Coche>();

        try {
            coches.add(new Coche("Seat", "Leon", "2008"));
            coches.add(new Coche("Seat", "Ibiza", "2015"));
            coches.add(new Coche("Audi", "R8", 2023));
            coches.add(new Coche("Ford", "Mustang", 1965));


        }catch (Exception e){
            System.out.println(e);
        }

        Iterator<Coche> it = coches.iterator();

        while (it.hasNext()){

            System.out.println(it.next().mostrar()+"\n\n");

        }

        coches.get(1).claxon();
    }

}
