import java.util.InputMismatchException;
import java.util.Scanner;

public class A10 {//ingresa 2 numeros diferentes de 0 y muestra la division decimal entre ellos

    public static void main(String[] args) {

        double num1=0;
        double num2=0;
        double resultado=0;



         Scanner sc=new Scanner(System.in);

         do {//como siempre bucle para no cerrar el progrma en caso de dar error los datos introducidos

             try {

                System.out.println("Introduce 2 numeros que no sean 0 para dividrlos");



                 num1= sc.nextDouble();

                 if (num1!=0) {//para pedir el 2º numero primero pon bien el primero
                     num2 = sc.nextDouble();
                 }


                     if (num1!=0 && num2 !=0){//si los 2 numeros se han introducido bien haz la division

                     resultado=num1/num2;


                 }else{

                     System.out.println("Que leas bien");



                 }

             } catch (InputMismatchException es) {

                 System.out.println("Madre mia que leas bien");
                 sc.next();//limpiamos la clase Scanner que ha dado el error

             }
         }while (num1==0 || num2 ==0);

        System.out.println("La divison dara: "+resultado);

    }

}
