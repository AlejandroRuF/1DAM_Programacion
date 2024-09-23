import java.util.Scanner;

public class Act34 {

    public static void main(String[] args) {

        int resultadopares=0;
        int resultadoimpares=0;
        int numero;
        int suma;

        System.out.println("Introduce numeros positivos pon un numero igual o menor a cero para parar1");

        do {
            Scanner sc=new Scanner(System.in);
            numero= sc.nextInt();
            if (numero%2==0 && numero>0){

                resultadopares=resultadopares+numero;

            }
            if (numero%2!=0 && numero>0){

                resultadoimpares=resultadoimpares+numero;

            }

        }while (numero>0);

        System.out.println("La suma de todos los pares es "+resultadopares);
        System.out.println("La suma de todos los impares es "+resultadoimpares);

    }

}
