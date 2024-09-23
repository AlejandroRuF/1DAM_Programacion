import java.util.InputMismatchException;
import java.util.Scanner;

public class Act35 {

    public static void main(String[] args) {

        double superficie;
        double cateto1;
        double cateto2;
        int bandera=0;
        int repetir;
        String pregunta;


        Scanner sc = new Scanner(System.in);


        do {
            repetir=0;
            do {
                try {

                    System.out.println("Escribe los catetos para averiguar la superficie tiene que ser positivo  mayor a 0");
                    bandera=0;
                    cateto1 = sc.nextDouble();
                    cateto2 = sc.nextDouble();

                    if (cateto2 > 0 && cateto1 > 0) {
                        System.out.println("Datos introducidos correctamente");
                        System.out.println("La superficie del triangulo seria "+(cateto1*cateto2)/2);
                        bandera++;

                    } else {

                        System.out.println("Los numeros deben ser positivos");
                        sc.nextLine();

                    }
                } catch (InputMismatchException ex) {

                    System.out.println("Los datos deben ser numeros");
                    sc.nextLine();

                }


            } while (bandera == 0);

            System.out.println("Quieres repetir la operacion? Si/No");
            pregunta=sc.next();
            if (pregunta.equalsIgnoreCase("no")){

               repetir++;

            }else {sc.nextLine();}

        }while(repetir==0);
    }
}
