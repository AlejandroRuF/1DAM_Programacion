import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        String caracter="";
        int numero;
        Scanner sc = new Scanner(System.in);
//Se colocan espacios para estilizar el dibujo
        System.out.println("Dime un número y un carácter y te hare un dibujito cutre");
        do{
        System.out.println("Dime el número igual o mayor a 3");
        numero=sc.nextInt();
        }while (numero<=2);
        System.out.println("Dime el carácter");
        caracter=sc.next();

        System.out.println(numero+caracter);
        for (int j = 0; j<numero;j++){
            for (int i = 0; i<numero;i++){

                if (j==0 || j==numero-1){
                    System.out.print(caracter+"  ");
                } else if (i==0 || i==numero-1) {
                    System.out.print(caracter+"  ");
                } else if (i!=0 || i!=numero-1) {
                    System.out.print("   ");
                }

        }
            System.out.println();
        }
    }
}
