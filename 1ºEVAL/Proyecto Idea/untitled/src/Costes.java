import javax.swing.*;
import java.util.Scanner;

public class Costes {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Calculadora de Impuestos","TAXES PRODUCTIONS",JOptionPane.INFORMATION_MESSAGE);

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el Precio en euros");

        double prec=sc.nextDouble();

        System.out.println("Introduce los impuestos (porcentaje)");

        double imp=sc.nextDouble();

        double res= prec*(1+(imp/100));

        System.out.println("El precio con los impuestos es " + res + " euros");

    }

}
