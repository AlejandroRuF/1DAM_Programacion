import java.util.Scanner;

public class Area_cuadrado {

    public static void main(String[] args) {

        double lon;
        double al;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce la longitud");

        lon= sc.nextDouble();

        System.out.println("Introduce la altura del rectangulo");

        al= sc.nextDouble();

        double per= (2*lon)+(2*al);

        System.out.println("Si la longitud del rectangulo es " + lon + " y la altura es " + al + " el perimetro seria " + per);

        double area=lon*al;

        System.out.println("Y el Area del rectangulo seria " + area);



    }

}
