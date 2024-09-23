import java.util.Scanner;

public class Act39 {

    public static void main(String[] args) {


        int num1;
        int num2;
        int grande;
        int pequenyo;



        System.out.println("Introduce el primer numero");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        num2=sc.nextInt();
    if (num1>num2) {
        pequenyo=num2;
        grande = num1;
    }else{

        pequenyo=num1;
        grande=num2;

    }



        for (int i=pequenyo;i<=grande;i++){

            System.out.println("El cuadrado de "+i+" es -->"+Math.pow(i,2));
            System.out.println("El cubo de "+i+" es     -->"+Math.pow(i,3));

        }

    }

}
