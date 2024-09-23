import java.util.Scanner;

public class A22 {

    public static void main(String[] args) {

        double nota1,nota2,nota3,nota4,promedio;
        String materia;


        System.out.println("Dame las 4 notas de tus examenes y te dire si apruebas");
        Scanner sc=new Scanner(System.in);

        nota1= sc.nextDouble();
        nota2= sc.nextDouble();
        nota3= sc.nextDouble();
        nota4=sc.nextDouble();

        promedio=(nota1+nota2+nota3+nota4)/4;

        if (promedio>=4.5){

            materia="Aprobado";

        }else{

          materia="Suspenso";

        }


        System.out.println("Tu promedio es "+promedio+" por lo tanto estas "+materia);

    }

}
