import java.util.Scanner;

public class Act49 {

    public static double calcularInteresesMensuales(double saldoPendiente, double tasaInteresMensual) {
        return saldoPendiente * tasaInteresMensual;
    }

    public static double calcularAmortizacionMensual(double cuotaMensual, double interesesMensuales) {
        return cuotaMensual - interesesMensuales;
    }

    public static int calcularMeses(double cuotaMensual, double prestamo, double tasaInteresMensual) {
        double calculo = Math.log(cuotaMensual / (cuotaMensual - prestamo * tasaInteresMensual)) / Math.log(1 + tasaInteresMensual);
        return (int) Math.ceil(calculo);
    }

    public static void main(String[] args) {
        double prestamo;
        double cuotaMensual;
        double tasaInteresMensual =0.12/12;
        double saldoPendiente;
        double interesesMensuales;
        double amortizacionMensual;
        int meses;
        double intereses= 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad total del préstamo: ");
        prestamo = sc.nextDouble();

        System.out.println("Introduce la cuota mensual: ");
        cuotaMensual = sc.nextDouble();

        meses = calcularMeses(cuotaMensual, prestamo, tasaInteresMensual);

        System.out.println("Mes | Cuota Mensual | Saldo Pendiente | Intereses Mensuales | Amortización al Mes");
        System.out.println("----------------------------------------------------------------------------------");

        saldoPendiente = prestamo;
        for (int mes = 1; mes <= meses; mes++) {
            interesesMensuales = calcularInteresesMensuales(saldoPendiente, tasaInteresMensual);
            amortizacionMensual = calcularAmortizacionMensual(cuotaMensual, interesesMensuales);
            if (mes == meses) {
                cuotaMensual = saldoPendiente + interesesMensuales;
                amortizacionMensual = saldoPendiente;
            }

            System.out.printf("%3d | %14.2f | %15.2f | %19.2f | %18.2f%n", mes, cuotaMensual, saldoPendiente, interesesMensuales, amortizacionMensual);

            saldoPendiente -= amortizacionMensual;

            intereses= intereses+interesesMensuales;

        }

        System.out.println(intereses);
    }
}
