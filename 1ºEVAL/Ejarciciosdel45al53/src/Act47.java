import java.util.Scanner;

public class Act47 {

    public static void main(String[] args) {

        final double tarifa_normal=8;
        double horas_trabajadas;
        final double pago_extra=(1.5*tarifa_normal);
        final double libre_imp=600;
        final double[] impuestos = {0.25,0.45};
        final double impuesto_25= 1000;
        final double tarifa_normal_max_horas=35;
        double salario_sinExtras=0;
        double salario_bruto=0;
        double salario_extra=0;
        double impuesto_total=0;
        double impuesto25=0;
        double impuesto45=0;
        double salario_neto;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas esta semana segun tus registros de entrada/salida");
        horas_trabajadas=sc.nextDouble();
        if (horas_trabajadas>tarifa_normal_max_horas) {
            salario_sinExtras = tarifa_normal_max_horas * tarifa_normal;
        }else {

            salario_sinExtras =horas_trabajadas*tarifa_normal;

        }
        if(horas_trabajadas>tarifa_normal_max_horas) {
            salario_extra = ((horas_trabajadas -tarifa_normal_max_horas)*pago_extra);

        }

        salario_bruto=salario_extra+salario_sinExtras;
        if (salario_bruto>libre_imp) {


                impuesto25 = impuesto_25 * impuestos[0];

            if (salario_bruto > impuesto_25) {

                impuesto45 = ((salario_bruto - impuesto_25) * impuestos[1]) + impuesto_total;

            }
        } if (salario_bruto>libre_imp && salario_bruto<impuesto_25) {

            impuesto25=(salario_bruto-libre_imp)*impuestos[0];

        }
            impuesto_total=impuesto25+impuesto45;

            salario_neto=salario_bruto-impuesto_total;
            System.out.println("Esta semana has trabajado "+horas_trabajadas+" horas. Por ello recibiras "+salario_bruto+" euros brutos" +
                    " en total se te descontaran "+impuesto_total+" euros en impuestos por lo que vas a percibir "+salario_neto+" euros netos. " +
                    "Hacienda somos todos =D");





    }

}
