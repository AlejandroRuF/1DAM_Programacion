import java.util.Scanner;

public class A20 {

    public static void main(String[] args) {

        double nota;
        String genero;

        Scanner sc=new Scanner(System.in);

        System.out.println("Indica tu genero (Hombre o Mujer)");
        genero=sc.nextLine();

        System.out.println("Indica tu nota");
        nota=sc.nextInt();


        if (nota< 5 && (genero.equalsIgnoreCase("Hombre") || genero.equalsIgnoreCase("H"))){

                System.out.println("Estas Suspenso");

            }
        if (nota< 5 && (genero.equalsIgnoreCase("Mujer") || genero.equalsIgnoreCase("M"))){

            System.out.println("Estas Suspensa");

        }
        if (nota>=5 && nota<8 && (genero.equalsIgnoreCase("Hombre") || genero.equalsIgnoreCase("H"))){

                System.out.println("Muy bien estas aprobado");

            }
        if (nota>=5 && nota<8 && (genero.equalsIgnoreCase("Mujer") || genero.equalsIgnoreCase("M"))){

            System.out.println("Muy bien estas aprobado");

        }

        if (nota>=8 && nota<10){

                System.out.println("Que crack tienes un notable");

        }
        if (nota==10){

            System.out.println("Impresionante tienes un Sobresaliente");

        }


    }

}
