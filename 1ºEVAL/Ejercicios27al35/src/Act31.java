import java.util.Scanner;

public class Act31 {

    public static void main(String[] args) {

        int[] numero=new int[30];

        System.out.println("Introduce un numero entero, introduce un 0 cuando acabes");
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<30;i++) {

            numero[i] = sc.nextInt();

        }

        for (int i=0;i<30;i++) {

            if(numero[i]<5 && numero[i]>(-5) && numero[i]!=0){

                System.out.println(numero[i]);

            }

        }



    }

}
