import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nIF="";
        int num_DNI=0;
        int opcion;
        boolean error;

        Scanner sc = new Scanner(System.in);

        DNI mi_DNI = new DNI();

        do {
            error=false;
            System.out.println("Elige una de las siguientes opciones\n1- Introducir DNI\n2-Introducir NIF\n3-Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {

                System.out.println("Introduce los NUMEROS de tu dni");

                 try{
                    num_DNI = sc.nextInt();

                } catch (InputMismatchException e) {
                     e.printStackTrace();
                    JOptionPane.showMessageDialog(null,e,"Warning",JOptionPane.WARNING_MESSAGE);
                    System.out.println(e);
                    error=true;
                    sc.next();

                }
                if (!error) {


                    try {
                        mi_DNI.establecer(num_DNI);

                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null,e,"Warning",JOptionPane.WARNING_MESSAGE);
                        System.out.println(e);

                    }
                }

            } else if (opcion == 2) {

                System.out.println("Introduce Tu NIF completo numeros y letra");
                try {
                    nIF = sc.next();
                    mi_DNI.establecer(nIF);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,e,"Warning",JOptionPane.WARNING_MESSAGE);
                    System.out.println(e);

                }

            } else if (opcion == 3) {
                System.out.println("Vuelve Pronto");

            } else {

                System.out.println("Introduce una opcion correcta");

            }
        }while (opcion!=3);

    }
}