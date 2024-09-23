import java.util.Scanner;

public class A17 {

    public static void main(String[] args) {

        int anyo;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un año para saber si es bisiesto");
        anyo= sc.nextInt();

        if (anyo%4==0 && anyo%100!=0){

            System.out.println("Es bisiesto");

        }else if(anyo%100==0 && anyo%400==0) {

            System.out.println("Es bisiesto");

        }else{

            System.out.println("No es bisiesto");

        }

    }

}
