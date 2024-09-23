import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        double precioTotal=0;
        ArrayList<Electrodomestico> elec = new ArrayList<Electrodomestico>();
        elec.add(new Lavadora(255,35));
        elec.add(new Lavadora());
        elec.add(new Lavadora(25,true,"Lana"));
        elec.add(new Television(1080, true,"Antena 3 HD"));
        elec.add(new Television());
        elec.add(new Television(1500,15));
        elec.add(new Lavadora(130,"blanco",'a',10,41,true,"economico"));

        for (int i = 0; i < elec.size(); i++) {

           if (elec.get(i) instanceof Lavadora){
               Lavadora a = (Lavadora) elec.get(i);

               a.dimeAlexa();

           } else if (elec.get(i) instanceof Television){
               Television b = (Television) elec.get(i);

               b.dimeAlexa();

           }else {

               System.out.println("Este elemento no es un objeto del tipo requerido");

            }

        }

        for (int i = 0; i < elec.size(); i++) {



            if (elec.get(i) instanceof Lavadora){
                Lavadora a = (Lavadora) elec.get(i);

                System.out.println("Lavadora ---> "+a.getPrecio());

                precioTotal += a.getPrecio();

            } else if (elec.get(i) instanceof Television){
                Television b = (Television) elec.get(i);
                System.out.println("Television ---> "+b.getPrecio());

                precioTotal += b.getPrecio();

            }else {

                System.out.println("Este elemento no es un objeto del tipo requerido");

            }

        }
        System.out.println("Precio total de la compra --> "+ precioTotal);




    }
}