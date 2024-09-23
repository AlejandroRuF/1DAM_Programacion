import java.util.Scanner;

public class ACT29 {

    public static void main(String[] args) {

        int numero;
        int resultado=1;

        System.out.println("Introduce un numero entero para encontrar su factorial");
        Scanner sc=new Scanner(System.in);
        numero= sc.nextInt();

        for (int i=numero; i>0;i--){

            resultado=i*resultado;

    }

        System.out.println("El factorial de "+numero+" es "+resultado);

}
}
