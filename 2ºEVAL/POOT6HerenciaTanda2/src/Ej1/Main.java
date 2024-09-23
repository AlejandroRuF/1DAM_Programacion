package Ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static double num(){

        return (Math.round((Math.random()*100)*100d)/100d);

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<Double>();
        double[] b = new double[5];


        System.out.println("ArrayList:");
        for (int i = 0; i < b.length; i++) {

            a.add(num());
            b[i]= num();
            System.out.printf("%5.2f%n",a.get(i));

        }

        System.out.println("\nVector: ");
        for (int i = 0; i < b.length; i++) {

            System.out.printf("%5.2f%n",b[i]);

        }

        ArrayDoubleEstadistica b2 = new ArrayDoubleEstadistica(b);
        ArrayListDoubleEstadistica a2 = new ArrayListDoubleEstadistica(a);

        System.out.println("Vamos a jugar un poco con el vector");

        b2.borrar(2);
        System.out.println(b2.cuantos()+" ---> total de numeros\nVamos a buscar si un numero en especifico existe en el array");
        b2.mostrar();
        System.out.println(b2.existe(sc.nextDouble()));
        System.out.println("Maximo ---> "+b2.maximo()+"\nMinimo ---> "+b2.minimo()+"\nMedia ---> "+b2.media());

        System.out.println("Ahora vamos a probar con el ArrayList:");

        System.out.println(a2.cuantos()+" ---> total de numeros\nVamos a buscar si un numero en especifico existe en el ArrayList");
        a2.mostrar();
        System.out.println(a2.existe(sc.nextDouble()));
        System.out.println("Maximo ---> "+a2.maximo()+"\nMinimo ---> "+a2.minimo()+"\nMedia ---> "+a2.media());


    }
}