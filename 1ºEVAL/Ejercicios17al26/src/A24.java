import java.util.Scanner;

public class A24 {

    public static void main(String[] args) {//Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.

        int numero;
        String entrada;//pedimos String ya que podemos contar el numerom de caracteres que tiene.

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero del 0 al 9999");

        numero= sc.nextInt();
        entrada= String.valueOf(numero);

        System.out.println("Tu numero tiene "+entrada.length()+" cifras");//String.length te devuelve el largo de la cadena introducida.


    }

}
