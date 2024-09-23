import java.util.Scanner;

public class Act30 {

    public static void main(String[] args) {

        int[] numero=new int[30];
        System.out.println("Introduce un numero entero, introduce un 0 cuando acabes");
        Scanner sc=new Scanner(System.in);

    for (int i = 0; i < numero.length; i++) {
        do {
            numero[i] = sc.nextInt();
        }while (numero[i]<0);
       /* if (numero[i]<0){

            if (i==0){

                numero[i]=sc.nextInt();

            }else {

                i--;

                }
            }*/

        if (numero[i] == 0) {

            i = numero.length+10;


        }

    }
        for (int i=0; i<numero.length;i++) {

            if(numero[i]>0){

                System.out.println("-->"+numero[i]);

            }

        }



            }

}
