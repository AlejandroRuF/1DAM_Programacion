import java.util.Scanner;

public class A13 {

    public static void main(String[] args) {

        double base;
        double altura;
        double area;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce la base y la altura del rectangulo ");

        base=sc.nextDouble();
        altura= sc.nextDouble();

        area=base*altura;

        System.out.println("El area del rectangulo seria "+area);

    }

}
