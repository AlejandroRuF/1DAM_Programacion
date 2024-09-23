import java.util.Scanner;

public class Act23 {
    /*Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una
sola vez y se muestren los tres cálculos posibles (circunferencia, área y volumen).
*/

    public static int menu(){
        System.out.println("1- Calcular Circunferencia" +
                "\n2- Calcular Area" +
                "\n3- Calcular Volumen" +
                "\n4- Todas" +
                "\n5- Salir");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
    public static double pideRadio(){

        System.out.println("Dime el radio");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public static double circunferencia(double r){

        return (2*(Math.PI)*r);

    }
    public static double area(double r){

        return (Math.PI*(Math.pow(r,2)));

    }
    public static double volumen(double r){

        return (4d/3d*(Math.PI)*Math.pow(r,3));

    }

    public static void main(String[] args) {

        double radio;
        int opcion;

        do{
            opcion = menu();
            if (opcion == 1) {

                radio = pideRadio();
                System.out.print("La circunferencia es ");
                System.out.printf("%.4f",circunferencia(radio));
                System.out.println("\n");

            } else if (opcion == 2) {

                radio = pideRadio();
                System.out.print("El area es ");
                System.out.printf("%.4f",area(radio));
                System.out.println("\n");

            } else if (opcion == 3) {

                radio = pideRadio();
                System.out.print("El volumen es ");
                System.out.printf("%.4f",volumen(radio));
                System.out.println("\n");

            } else if (opcion==4) {

            radio = pideRadio();
            System.out.print("El volumen es ");
            System.out.printf("%.4f%n",volumen(radio));
            System.out.print("El area es ");
            System.out.printf("%.4f%n",area(radio));
            System.out.print("La circunferencia es ");
            System.out.printf("%.4f%n",circunferencia(radio));
            System.out.println("\n");

        } else if (opcion==5) {

                System.out.println("Adios!!");

            } else {

                System.out.println("No has introducido una opcion valida\n");

            }

        }while(opcion!=5);

    }

}


