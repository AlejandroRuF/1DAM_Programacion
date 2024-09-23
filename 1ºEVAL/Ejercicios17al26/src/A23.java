import java.util.Scanner;

public class A23 {

    public static void main(String[] args) {

       double nota,valorpreguntas;
       int preguntas, correctas;

        Scanner sc= new Scanner(System.in);

        System.out.println("Cuantas preguntas tiene el examen");
        preguntas= sc.nextInt();
        valorpreguntas=(double) 100/preguntas;

        System.out.println("Cuantas preguntas tienes bien?");
        correctas= sc.nextInt();

        nota=valorpreguntas*correctas;

        if (nota>=90){

            System.out.println("Muy bueno has sacado un "+nota);

        }else if (nota <90&&nota>=70){

            System.out.println("Bueno, has sacado un "+nota);

        } else if (nota<50) {

            System.out.println("Mal, tienes un "+nota);

        }else {

            System.out.println("Regular, tienes un "+nota);

        }



    }

}
