import java.util.Scanner;

public class ConvertidorMetrosPulgadasPies {

    public static void main(String [] args){

        int elige;

        double metros=0;
        double pies=0;
        double pulgadas=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Indica que quieres hacer e introduce uno de los siguientes numeros segun tu caso\n 1: Metros a Pies \n 2: Pies a Pulgadas \n 3: Metros a Pulgadas ");

        elige=sc.nextInt();

        switch (elige){


            case 1:
                System.out.println("Introduce los metros que quieres pasar a pies");
                metros=sc.nextDouble();
                pies=metros*3.28084;
                System.out.println(metros+" metros son "+pies+" pies.");
                break;

            case 2:
                System.out.println("Introduce los pies que quieres pasar a pulgadas");
                pies =sc.nextDouble();
                pulgadas=pies*12;
                System.out.println(pies + " pies son "+pulgadas+" pulgadas");
                break;

            case 3:
                System.out.println("Introduce los metros que quieres convertir a pulgadas");
                metros=sc.nextDouble();
                pulgadas=metros*39.3701;
                System.out.println(metros+" metros son "+pulgadas+" pulgadas");
                break;

        }

        metros=sc.nextDouble();
        pies=metros*3.28084;
        pulgadas=metros*39.3701;

        System.out.println(metros +" son "+ pulgadas+" pulgadas o "+pies+" pies.");

    }

}
