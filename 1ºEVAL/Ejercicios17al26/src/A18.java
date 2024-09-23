import java.util.Scanner;

public class A18 {

    public static void main(String[] args) {

        int mes;

        Scanner sc=new Scanner(System.in);

        System.out.println("Escribe el numero del mes que quieras consultar");

        mes= sc.nextInt();

        switch (mes){

            case 1:
                System.out.println("Enero tiene 31 dias");
                break;

            case 2:
                System.out.println("Febrero tiene 28 dias");
                break;

            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;

            case 4:
                System.out.println("Abril tiene 30 dias");
                break;

            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;

            case 6:
                System.out.println("Junio tiene 30 dias");
                break;

            case 7:
                System.out.println("Julio tiene 31 dias");
                break;

            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;

            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;

            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;

            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;

            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;

            default:
                System.out.println("Ese mes no existe");
                break;

        }

    }

}
