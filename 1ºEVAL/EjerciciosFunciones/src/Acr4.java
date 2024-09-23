import java.util.Scanner;

public class Acr4 {

    public static int dimeSigno(int a){
        int signo;

        if (a>0){

            signo=1;

        }else if (a<0){

            signo=-1;

        }else {

            signo=0;

        }

        return signo;
    }

    public static void imprime(int a){

        if (dimeSigno(a)==1){

            System.out.println("El numero es positivo");

        } else if (dimeSigno(a)==-1) {

            System.out.println("El numero es negativo");

        }else {

            System.out.println("El numero es 0 no es ni positivo ni negativo");

        }

    }

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un  numero positivo o negativo");
        a= sc.nextInt();

        imprime(a);

    }

}
