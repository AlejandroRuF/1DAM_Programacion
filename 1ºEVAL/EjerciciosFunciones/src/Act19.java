import java.util.Scanner;

public class Act19 {
    /*Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se
ajusta a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y,
z. Se deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.*/

    public static boolean correcto(int x,int y,int z){

        if ((Math.pow(x,2)+Math.pow(y,2))==(Math.pow(z,2))){

            return true;

        }else {

            return false;

        }

    }

    public static void main(String[] args) {

        int x,y,z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 valores y te dire si se ajustan a la teoria de pitagoras");
        x= sc.nextInt();
        y= sc.nextInt();
        z= sc.nextInt();

        if (correcto(x,y,z)){

            System.out.println("Se ajustan perfectamente");

        }else {

            System.out.println("No se ajustan");

        }

    }

}
