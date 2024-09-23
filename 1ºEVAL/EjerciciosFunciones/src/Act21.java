import java.util.Scanner;

public class Act21 {
    /* Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”. En
ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. Implementa las funciones
int menu() // Muestra el menú y devuelve el número elegido
double pideRadio() // Pide que se introduzca el radio y lo devuelve
double circunferencia(double r) // Calcula la circunferencia y la devuelve
double area(double r) // Calcula el área y la devuelve*/

    public static int menu(){
            System.out.println("1- Calcular Circunferencia" +
                    "\n2- Calcular Area" +
                    "\n3- Salir");
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


        } else {

            System.out.println("No has introducido una opcion valida\n");

        }

    }while(opcion!=3);

    }

}
