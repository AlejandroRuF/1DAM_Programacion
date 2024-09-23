import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Act52 {
 /*Escribir un programa que muestre un menú con las diferentes categorías de empleados.

Cuando se seleccione una categoría, se pedirá el nombre y apellidos del trabajador, la fecha
de ingreso en la empresa (año), cantidad de horas trabajadas en el mes y la cantidad de
horas extras trabajadas. Con estos datos, el programa deberá informar del apellido, el
nombre, el sueldo base, la cantidad de dinero por horas extras si existe, la cantidad por
antigüedad, la cantidad de cada descuento y el sueldo total a cobrar.
La categoría puede ser: administrativo, técnico, profesional u operario.
El valor de la hora trabajada por categoría es: 5€, 7€, 12€ y 3€ respectivamente.
Las horas extras tienen un valor superior en un 50%.

El sueldo a cobrar se compone de: sueldo base (cantidad de horas * valor hora) + cantidad
por horas extras + porcentaje por años de antigüedad - un descuento del 3% por obra social -
un descuento del 10% por jubilación.
Los porcentajes se calculan sobre el sueldo base.
La antigüedad se calcula según: 5% entre 1 y 3 años, 10% entre 4 y 6 años, 20% entre 7 y 10
años, 50% entre 11 y 15 años, 100% más de 16 años (años cumplidos).*/

  public static String sueldo_Base(double horas_Trabajadas, double precio_Hora){
      double salariob;


      salariob=horas_Trabajadas*precio_Hora;

     return salariob+"";
  }

    public static String sueldo_Extra(double horas_Extra, double precio_Extra){
        double salariob;

        salariob=horas_Extra*precio_Extra;

        return salariob+"";
    }
    public static double antiguedad(int anyo_Entrada){
        double porcentaje;
        int YEAR;
        int anti;
        Date dt = new Date();

        YEAR=dt.getYear()+1900;
        anti=YEAR-anyo_Entrada;
        if (anti>=1 && anti<=3){

            porcentaje=0.05;

        }else if (anti>=4 && anti<=6){

            porcentaje=0.1;

        }else if (anti>=7 && anti<=10){

            porcentaje=0.2;

        } else if (anti>=11 && anti<=15){

            porcentaje=0.5;

        }else if (anti>=16){

            porcentaje=1;

        }else{

            porcentaje=0;

        }




        return porcentaje;
    }
    public static String plus_Antiguedad(double cobro_Extra, double cobro_Normal, double antiguedad){
        double salariob;

        salariob=(cobro_Extra+cobro_Normal)*antiguedad;

        return salariob+"";
    }
    public static String cobro_Total(double cobro_Extra, double cobro_Normal, double plus_Antiguedad,double descuentos){
        double salariob;

        salariob=(cobro_Extra+cobro_Normal+plus_Antiguedad)-descuentos;

        return salariob+"";
    }
    public static String descuentos(double cobro_Extra, double cobro_Normal, double plus_Antiguedad){
        double salariob;

        salariob=((cobro_Extra+cobro_Normal+plus_Antiguedad)*0.13);

        return salariob+"";
    }

    public static void main(String[] args) {

        int anyocontrato;
        int opcion;
        double horas_Normal;
        double horas_Extra;
        double administrativo_Hora=5;
        double tecnico_Hora=7;
        double profesional_Hora=12;
        double precio_Hora=0;
        double precio_Horas_Extra;
        double operario_Hora=3;//Un poco explotadores no??
        double operario_Hora_Extra=operario_Hora*1.5;
        /* Cada array debera contener: Nombre, Apellido, Año contratacion, horas mes, horas extra, sueldo base,
        sueldo extra, plus antiguedad, descuentos, sueldo total.
         */
        String[] info={"0","1","2","3","4","5","6","7","8","9","10"};
        String[] leyenda={"Nombre","Apellidos","Año de Entrada","Horas Normales","Horas Extra","Porcentaje por Antiguedad","Sueldo Base","Sueldo Extra","Cobro por Antiguedad","Total Descuentos","Sueldo Total"};
        Scanner sc= new Scanner(System.in);
do {
    System.out.println("Introduce la categoria del trabajador\n1- Administrativo\n2- Tecnico\n3- Profesional\n4- Operario" +
            "\n5- Salir");
    opcion= sc.nextInt();

    if (opcion==1){
        precio_Hora=administrativo_Hora;

    }
    if (opcion==2){

        precio_Hora=tecnico_Hora;

    }
    if(opcion==3){

        precio_Hora=profesional_Hora;

    }
    if (opcion==4){

        precio_Hora=operario_Hora;

    }
    precio_Horas_Extra=precio_Hora*1.5;
    if (opcion==1||opcion==2||opcion==3||opcion==4){

        System.out.println("Introduce el nombre del trabajador");
        sc.nextLine();
        info[0]= sc.nextLine();

        System.out.println("Introduce el apellido del trabajador");
        info[1]= sc.nextLine();

        System.out.println("Introduce el año en el que el trabajador empezo en la empresa");
        anyocontrato= sc.nextInt();
        info[2]=String.valueOf(anyocontrato);
        info[5]=antiguedad(Integer.parseInt(info[2]))+"";

        System.out.println("Introduce las horas normales trabajadas este mes(40 Horas a la semana=160 Horas Mensuales)");
        info[3]= sc.next();
        info[6]=sueldo_Base((Double.parseDouble(info[3])),precio_Hora);

        System.out.println("Introduce las horas extra trabajadas este mes");
        info[4]= sc.next();
        info[7]=sueldo_Extra((Double.parseDouble(info[4])),precio_Horas_Extra);
        info[8]=plus_Antiguedad((Double.parseDouble(info[7])),(Double.parseDouble(info[6])),(Double.parseDouble(info[5])));
        info[9]=descuentos((Double.parseDouble(info[6])),(Double.parseDouble(info[5])),(Double.parseDouble(info[8])));
        info[10]=cobro_Total((Double.parseDouble(info[6])),(Double.parseDouble(info[7])),(Double.parseDouble(info[8])),(Double.parseDouble(info[9])));
        info[5]=String.valueOf(Double.parseDouble(info[5])*100)+"%";

        for (int i=0;i<info.length;i++){

            System.out.println(leyenda[i]+":"+info[i]);

        }
        System.out.println();
    }
}while(opcion!=5);


    }

}
