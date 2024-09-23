import java.util.Scanner;

public class Xy {

    public static void main(String[] args) {

        int x=3;

        int y=7;

        x=y++;

        System.out.println("X= " + x + " Y= " + y);

        Scanner ain = new Scanner(System.in);

        Scanner bin = new Scanner(System.in);


        boolean a=false;

        boolean b=false;

        System.out.println("introduce si A es verdadero o falso (V/F)");

        String ac=ain.next();

        System.out.println("introduce si B es verdadero o falso (V/F)");

        String bc=bin.next();

       //do {

           if (ac.equalsIgnoreCase("V") || ac.equalsIgnoreCase("F") || bc.equalsIgnoreCase("F") || bc.equalsIgnoreCase("V")) {

               if (ac.equalsIgnoreCase("V")) {

                   a = true;

               }

               if (bc.equalsIgnoreCase("V")) {

                   b = true;

               }

               if (a && b) {

                   System.out.println("2 Si");

               } else if (a || b) {

                   System.out.println("A es " + ac + " y B es " + bc);

               } else {

                   System.out.println("2 no");
               }
           } else {

               System.out.println("Introduce los datos correctamente");

           }

       }









            }



