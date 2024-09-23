package Act2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Receta> recetas = new ArrayList<Receta>();

        recetas.add(new Receta("Receta1", "pasta",900));
        recetas.add(new Receta("Receta7", "carnes",500));
        recetas.add(new Receta("Receta3", "pescado",1250));
        recetas.add(new Receta("Receta4", "verduras",168));
        recetas.add(new Receta("Receta5", "verduras",625));
        recetas.add(new Receta("Receta6", "pasta",2447));
        recetas.add(new Receta("Receta2", "Carnes",447));



        System.out.println("Recetas con menos de 500 calorias\n");
        List<Receta> calorias500 = recetas.stream()
                .filter(p -> p.getCalorias() < 500)
                .toList();

        for (Receta a : calorias500){
            System.out.println(a);
        }

        System.out.println("\nRecetas de carne ordenadas\n");

        recetas.stream()
                .filter(p-> p.getCategoria().equalsIgnoreCase("carnes"))
                .sorted((p1,p2) -> p1.getNombre().compareTo(p2.getNombre()))
                .forEach(System.out::println);


        double mediaverduras = recetas.stream()
                .filter(p-> p.getCategoria().toLowerCase() == "verduras")
                .mapToInt(p-> p.getCalorias())
                .average()
                .getAsDouble();

        System.out.println("\nMedia de calorias de platos con verduras: "+mediaverduras);

        int masde800 = (int)recetas.stream()
                .mapToInt(p-> p.getCalorias())
                .filter(p -> p > 800)
                        .count();


        System.out.println("\nHay un total de "+masde800+ " recetas con mas de 800 calorias");


    }




}
