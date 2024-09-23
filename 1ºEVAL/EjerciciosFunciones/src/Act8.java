import java.util.Scanner;

public class Act8 {
/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:*/
    public static int sumatorio(int n){
        int sumatorio=0;
        for (int i = 1;i<n;i++){

            sumatorio=sumatorio+i;

        }

        return sumatorio;
    }
    public static int producto1aN(int n){

        int prod=1;
        for (int i = 1;i<n;i++){

            prod=prod*i;

        }
     return prod;
    }
    public static double intermedio1aN(int n){

        return  n/2d;

    }

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        n=sc.nextInt();

        System.out.println("El sumatorio de 1 a "+n+" es "+sumatorio(n));
        System.out.println("El producto de 1 a "+n+" es "+producto1aN(n));
        System.out.println("El numero intermedio entre 1 y "+n+" es "+intermedio1aN(n));


    }

}
