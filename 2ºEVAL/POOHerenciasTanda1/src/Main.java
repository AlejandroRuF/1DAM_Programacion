import java.util.*;

public class Main {



    public static boolean revAleat(){
        int al = (int)(Math.random()*2+1);

        if (al == 1){

            return true;

        }else{

            return false;

        }
    }


    public static void mostrarKms(ArrayList<Vehiculo> vehiculos){
        for (Vehiculo i:vehiculos) {

            if (i instanceof Coche2aMano a){
                //Coche2aMano a = (Coche2aMano) i;

                System.out.println("Km del coche de 2º mano: "+ a.getKms());

            } else if (i instanceof Coche) {

                System.out.println("Este cohe tiene 0 Kms");

            } else {

                System.out.println("Este Vehhiculo no tiene Kms");

            }

        }



    }

    public static boolean[] complet(boolean[] arra){
        for (int i = 0; i < arra.length; i++) {

            arra[i]=revAleat();

        }

         return arra;
    }

    public static void main(String[] args) {

        ArrayList<Coche> c2 = new ArrayList<Coche>();
        ArrayList<Vehiculo> c1 = new ArrayList<Vehiculo>();
        boolean[] revisiones = new boolean[5];

        int pos=1;





        c1.add(new Coche2aMano(12585,"Leon", "Seat", "Blanco",25000, complet(revisiones),"1234asd",88000));
        c1.add(new Vehiculo(548548,"Orbea500","Orbea","Rojo Carrera",1500));
        c1.add(new Coche(258800,"Serie1","BMW","Negro",35000,complet(revisiones),"1111AXM"));
        c1.add(new Coche(35856,"Golf","Volkswagen","Blanco",25000,complet(revisiones),"1896SDM"));
        c1.add(new Coche2aMano(12585,"OCtavia", "Skoda", "Gris Pizarra",27000, complet(revisiones),"9614VRP",1200000));

        c2.add(new Coche(258800,"Serie1","BMW","Negro",35000,complet(revisiones),"1121AXM"));
        c2.add(new Coche(35856,"Golf","Volkswagen","Blanco",25000,complet(revisiones),"1897SDM"));
        c2.add(new Coche2aMano(12585,"OCtavia", "Skoda", "Gris Pizarra",27000, complet(revisiones),"9624VRP",1200000));
        c2.add(new Coche2aMano(12585,"Leon", "Seat", "Blanco",25000, complet(revisiones),"1234ASD",88000));

        Iterator<Coche> itc2 = c2.iterator();

        for (int i = 0; i < c1.size(); i++) {

            System.out.println("\n"+(i+1)+": "+c1.get(i).toString());


        }
        mostrarKms(c1);

        System.out.println("\n\nAhora vamos a la segunda matriz usando iterator\n");

        while(itc2.hasNext()){

            System.out.println(pos+": \n"+itc2.next().toString());
            pos++;

        }




    }
}