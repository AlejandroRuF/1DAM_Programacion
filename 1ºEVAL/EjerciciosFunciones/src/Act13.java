import java.util.Scanner;

public class Act13 {
/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar
algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se
debe crear una función a la que le pasemos ambos valores y nos devuelva el descuento.*/

    public static double descuento(double conDescuento, double sinDescuento){

        double diferencia=(sinDescuento-conDescuento);

        return 100-((conDescuento*100)/sinDescuento);

    }

    public static void main(String[] args) {

        double conDescuento,sinDescuento;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el precio sin descuento?");
        sinDescuento=sc.nextDouble();
        System.out.println("Cual es el precio con descuento?");
        conDescuento=sc.nextDouble();

        System.out.print("El descuento aplicado es del ");
        System.out.printf("%.2f",descuento(conDescuento,sinDescuento));
        System.out.println("%");

    }


}
