import java.util.Scanner;

public class A26 {

    public static void main(String[] args) {

        String caracter;

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una letra");
        caracter=sc.nextLine().charAt(0)+"";


        if(caracter.equalsIgnoreCase("r")){

            System.out.println("La letra "+ caracter+" corresponde al color rojo");

        }else if(caracter.equalsIgnoreCase("v")){

            System.out.println("La letra "+ caracter+" corresponde al color verde");

        }else if(caracter.equalsIgnoreCase("a")){

            System.out.println("La letra "+ caracter+" corresponde al color azul");

        }else if(caracter.equalsIgnoreCase("n")){

            System.out.println("La letra "+ caracter+" corresponde al color negro");

        }else {

            System.out.println(caracter+" no corresponde a ningun color");

        }

    }

}
