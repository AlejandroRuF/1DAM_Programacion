import java.util.Scanner;

public class Act50 {
/*Una empresa de alquiler de automóviles tiene un sistema de cobro basado en los
kilómetros realizados por sus clientes. Sus tarifas son las siguientes:
Entre 10 y 100 Km: 2 euros/Km.
De 100 y 999 Km: 1 ́50 euros/Km.
Más de 1000 Km: 1 euro/Km.
Realizar un programa que calcule la factura de un cliente en base a los Km realizados.*/

    public static double pagos(double km, double[] tarifa){
        double pago=0;

        if (km>=10 && km<=100){

            pago=km*tarifa[0];

        } else if (km>100 && km<=999) {

            pago=km*tarifa[1];

        } else if (km>=1000) {

            pago=km*tarifa[2];

        }


        return pago;
    }

    public static double impuesto(double pago, double tipoiva){
        double impuestos=pago*tipoiva;

        return impuestos;
    }

    public static double totalpago(double pago, double impuesto){
       double totalpagos=pago+impuesto;

        return totalpagos;
    }

    public static void main(String[] args) {

        double km;
        double[] tarifa= {2,1.50,1};
        double pago;
        double iva;
        double tipoiva=0.21;
        double totalpagar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los Kilometros recorridos");
        km= sc.nextDouble();

        pago=pagos(km,tarifa);
        iva=impuesto(pago,tipoiva);
        totalpagar=totalpago(pago,iva);

        System.out.println("En total has acumulado un gasto de "+pago+" sin iva al hacer una cantidad de "+km+" kilometros"+
                " el iva seria "+iva+" por lo tanto deberias pagar "+totalpagar);


    }

}
