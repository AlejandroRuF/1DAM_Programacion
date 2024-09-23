import java.util.Scanner;

public class Act7 {

    public static double preimetroRrctangulo(double ancho, double alto){

        return 2*(ancho+alto);
    }
    public static double areaRectangulo(double alto, double ancho){

        return alto*ancho;
    }
    public static void imprime(double alto, double ancho){

        System.out.println("El perimetro del rectangulo es "+preimetroRrctangulo(alto,ancho)+
                "\nEl area del rectangulo es "+areaRectangulo(alto,ancho));

    }

    public static void main(String[] args) {

        double alto;
        double ancho;

        Scanner sc =new Scanner(System.in);

        System.out.println("Introduce el alto del crectangulo");
        alto=sc.nextDouble();
        System.out.println("Introduce el ancgo del crectangulo");
        ancho=sc.nextDouble();

        imprime(alto,ancho);

    }

}
