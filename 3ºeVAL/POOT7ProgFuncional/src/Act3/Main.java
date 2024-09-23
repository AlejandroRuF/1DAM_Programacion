package Act3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<ElementoDomotico> domotics = new ArrayList<ElementoDomotico>();
        domotics.add(new Calefaccion());
        domotics.add(new PuertaDeGaraje());
        domotics.add(new Ventana());
        domotics.add(new Calefaccion());
        domotics.add(new PuertaDeGaraje());
        domotics.add(new Ventana());

        domotics.stream()
                .sorted((p1, p2) -> p1.nombre.compareTo(p2.nombre))
                .forEach(p -> System.out.println(p.toString()));

//        for (String a : aa) {
//            System.out.println(a);
//        }
//                .forEach(p -> {
//                    if (p instanceof Ventana v) {
//                        v = (Ventana) p;
//                        System.out.println(p);
//                    } else if (p instanceof Calefaccion c) {
//                        c = (Calefaccion) p;
//                        System.out.println(c);
//                    } else if (p instanceof PuertaDeGaraje pg) {
//                        pg = (PuertaDeGaraje) p;
//                        System.out.println(pg);
//
//                    }
//                }).;


        System.out.println("\nAlternamos los elementos de encendido a apagado");

       domotics.stream()
                .forEach(ElementoDomotico::interruptor);

        domotics.stream()
                .forEach(p -> System.out.println(p.toString()));


    }




}
