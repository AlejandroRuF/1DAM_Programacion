import java.util.Scanner;

public class Act22 {
    /*Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario
también pueda solicitar el cálculo del volumen. Añade la función:
double volumen(double r) // Calcula el volumen y lo devuelve
*/

    public static int menu(){
        System.out.println("1- Calcular Circunferencia" +
                "\n2- Calcular Area" +
                "\n3- Calcular Volumen" +
                "\n4- Salir");
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

                System.out.println("Adios!!");

            } else {

                System.out.println("No has introducido una opcion valida\n");

            }

        }while(opcion!=4);

    }

}


