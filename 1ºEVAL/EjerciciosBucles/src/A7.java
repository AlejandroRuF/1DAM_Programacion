import java.util.Scanner;

public class A7{
    public static void main(String[] args) {//hay que determinar si un numero es par o impar

        int valor;
        double residuo;

        Scanner sc=new Scanner(System.in);
        System.out.println("introduce un numero entero");
        valor=sc.nextInt();
        residuo=valor%2; //cogemos el residuo de la operacion al dividirlo entre 2 si es 0 es porque el numero es par

        if (residuo==0){

            System.out.println("tu numero es par");

        }else {

            System.out.println("Tu numero no es par");

        }

    }
}
