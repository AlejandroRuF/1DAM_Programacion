import java.util.Scanner;

public class Act3 {

    public static void main(String[] args) {
        int numero;
        String simb="*";
        Scanner sc=new Scanner(System.in);
do {
    System.out.println("Introduce un número positivo y te hare un triángulo cutre relacionado con ese número");
    numero = sc.nextInt();
}while (numero<0);

        for (int i = 0; i<numero;i++){

            for (int j = numero; j >= 0;j--){
                if (j>i){
                    System.out.print(" ");

                }else {
                    System.out.print(simb);
                }
            }
            System.out.println();

        }
    }

}
