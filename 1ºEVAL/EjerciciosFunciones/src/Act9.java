import java.util.Scanner;

public class Act9 {

    public static int maximo(int num1,int num2){
        int max;
        if (num1>num2){

            max=num1;

        }else {

            max=num2;

        }

        return max;
    }

    public static void main(String[] args) {
        int num1,num2,num3,grande;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 valores y te dire cual es el mayor");
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3= sc.nextInt();

        grande=maximo(num1,num3);
        grande=maximo(grande,num2);

        System.out.println("El mayor es "+grande);



    }

}
