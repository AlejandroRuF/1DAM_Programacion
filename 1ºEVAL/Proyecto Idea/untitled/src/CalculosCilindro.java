import java.util.Scanner;

public class CalculosCilindro {

    public static void main(String[] args){

        double altura;
        double radio;
        double area;
        double volumen;
        final double NPI= Math.PI;


        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce la altura");

        altura=sc.nextDouble();

        System.out.println("Introduce el radio");

        radio=sc.nextDouble();

        area=2*NPI*radio*altura;

        System.out.println(String.format("El Area del circulo es "+"%.2f",area));

        volumen= NPI*Math.pow(radio,2)*altura;

        System.out.println(String.format("El Volumen del cilindro es " + "%.2f",volumen));


    }

}
