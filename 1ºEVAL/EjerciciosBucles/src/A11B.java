import java.util.Scanner;

public class A11B {

    public static void main(String[] args) {

        int num;
        int num1;
        int num2;
        int peq=0;
        int med=0;
        int grand=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce 3 numeros");

        num=sc.nextInt();
        num1=sc.nextInt();
        num2= sc.nextInt();

        if (num<num1 && num<num2){

            peq=num;

            if (num1<num2){

                med=num1;
                grand=num2;

            }else {

                med=num2;
                grand=num1;

            }



        }
        if (num1<num && num1<num2){

            peq=num1;

            if (num<num2){

                med=num;
                grand=num2;

            }else {

                med=num2;
                grand=num;

            }

        }
        if (num2<num && num2<num1){

            peq=num2;

            if (num1<num){

                med=num1;
                grand=num;

            }else {

                med=num;
                grand=num1;

            }
        }

        System.out.println(peq+"\n"+med+"\n"+grand);

    }

}


