import java.util.Scanner;

public class A25 {

    public static void main(String[] args) {/*Algoritmo que calcule la distancia euclídea entre dos puntos del plano tomando como
        entrada las coordenadas de los puntos.*/

        double punto1;
        double punto1_1;
        double punto2;
        double punto2_2;
        double resultado;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce los puntos de la coordenada 1");
        punto1=sc.nextDouble();
        punto1_1=sc.nextDouble();

        System.out.println("Introduce los puntos de la coordenada 2");
        punto2= sc.nextDouble();
        punto2_2=sc.nextDouble();

        resultado=Math.sqrt(Math.pow((punto1_1-punto1),2)+Math.pow((punto2_2-punto2),2));

        System.out.println("La distancia euclídea de las cordenadas proporcionadas será "+ resultado);



    }

}
