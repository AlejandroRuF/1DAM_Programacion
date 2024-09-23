import java.util.Scanner;

public class Imc {

    public static void main(String[] args){

        double peso;
        double altura;
        double imc;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce tu altura en metros");

        altura=sc.nextDouble();

        System.out.println("Introduce tu peso en KG");

        peso= sc.nextDouble();

        imc= peso/(Math.pow(altura,2));

        System.out.println("Tu IMC con " + altura + " metros y " + peso + " Kg es " + imc);
    }

}
