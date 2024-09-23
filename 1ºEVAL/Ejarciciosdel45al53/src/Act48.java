import java.util.Scanner;

public class Act48 {
//(j) Un hotel tiene un sistema para el cobro de las tarifas de sus clientes. Las habitaciones
//están clasificas en grupos o categorías, cada una con un precio:
//A: 200 euros/día
//B: 180 euros/día
//C: 120 euros/día
//D: 80 euros/día
//Realizar un programa que calcule la tarifa total de un cliente a partir del número total de días que
//ha permanecido en el hotel y de la categoría de la habitación en la que se ha alojado.
public static double total_pago(int dias, String[] categoria) {
    int[] precio={80,120,180,200};
    double [] pagoPorHabitacion=new double[categoria.length];
    double pago=0;
    double pago_Todo=0;

    for (int i=0;i<pagoPorHabitacion.length;i++) {
        if (categoria[i].equalsIgnoreCase("A")) {
            pago = dias * precio[3];
            pagoPorHabitacion[i]=pago;
        }
        if (categoria[i].equalsIgnoreCase("B")) {

            pago = dias * precio[2];
            pagoPorHabitacion[i]=pago;

        }
        if (categoria[i].equalsIgnoreCase("C")) {

            pago = dias * precio[1];
            pagoPorHabitacion[i]=pago;

        }
        if (categoria[i].equalsIgnoreCase("D")) {

            pago = dias * precio[0];
            pagoPorHabitacion[i]=pago;

        }
    }

    for (int i = 0; i<pagoPorHabitacion.length;i++){

        pago_Todo=pago_Todo+pagoPorHabitacion[i];

    }

return pago_Todo;
}

    public static void main(String[] args) {

    int numHabitaciones;
    int dias;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce el numero de habitaciones que tenia");
        numHabitaciones=sc.nextInt();
        System.out.println("Cuantos dias se quedo");
        dias=sc.nextInt();
        String[] categoria=new String[numHabitaciones];
        for (int i =0;i<numHabitaciones;i++){
            System.out.println("Cual era la categoria de la habitacion "+(i+1)+"(introduzca A,B,C o D segun la categoria)");
            categoria[i]=sc.next();


        }

        System.out.println("Muy bien en total sera "+total_pago(dias,categoria));

    }


}
