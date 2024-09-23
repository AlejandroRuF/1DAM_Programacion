import java.util.Scanner;

public class CubodeDado {

    public static void main(String [] args){

        int dado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Tira un dado y escribe el resultado aqui");

        dado=sc.nextInt();

        System.out.println("El resustado de tu dado al cubo es " + Math.pow(dado,3));

    }

}
