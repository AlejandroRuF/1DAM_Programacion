import java.util.Scanner;

public class Act10 {

    public static boolean fecha(int dia,int mes,int anyo){
        boolean dias;
        boolean meses;
        boolean anyos;
        if (dia>0 && dia<31){

            dias=true;

        }else{

            dias=false;

        }
        if (mes>0&& mes<31){

            meses=true;

        }else {

            meses=false;

        }
        if (anyo>=0){

            anyos=true;

        }else {

            anyos=false;

        }

        if (dias && meses && anyos){

            return true;

        }else {

            return false;

        }

    }


    public static void main(String[] args) {

        int dia,mes,anyo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia");
        dia= sc.nextInt();
        System.out.println("Introduce el mes");
        mes=sc.nextInt();
        System.out.println("Introduce el año (aaaa)");
        anyo=sc.nextInt();

        System.out.println("La fecha "+dia+"/"+mes+"/"+anyo+" es ----> "+fecha(dia,mes,anyo) );


    }

}
