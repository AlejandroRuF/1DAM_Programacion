import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Act1 {
    public static void menu(int veces){
        if (veces==0){
            System.out.println("Bienvenido a la gestion de Clientes:");
        }

        System.out.println("Elige una de las siguientes opciones:\n" +
                "Añadir Cliente(A)\n" +
                "Eliminar Cliente(E)\n" +
                "Consultar Clientes y Deudas(D)\n" +
                "Consultar Saldo Cliente(C)\n" +
                "Modificar deuda de un cliente(M)\n" +
                "Salir(S)");

    }
    public static boolean patronnum(String nom){

        Pattern cliente = Pattern.compile("^[A-Za-z]+$");
        Matcher nomClientes = cliente.matcher(nom);


        return nomClientes.matches();
    }
    public static boolean patrondig(String dig){

        Pattern digitos = Pattern.compile("^[0-9]*[.]*[0-9]{0,2}$");
        Matcher digDueda = digitos.matcher(dig);


        return digDueda.matches();
    }

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Float> deuda = new ArrayList<>();
        Iterator<String> itNombres = nombres.iterator();
        Iterator<Float> itDeuda = deuda.iterator();
        String opcion="";
        String nom="";
        String dig="";
        float num;
        int pos;
        int veces=0;
        Scanner sc = new Scanner(System.in);

        nombres.add("PEPE");
        deuda.add(102.45f);
        nombres.add("ALBERTO");
        deuda.add(235.32f);
        nombres.add("ANTONIO");
        deuda.add(600.01f);
        nombres.add("MARTA");
        deuda.add(13000.39f);
        nombres.add("EMI");
        deuda.add(635.55f);

        do {
            menu(veces);
                veces++;
                opcion = sc.nextLine().toLowerCase().charAt(0) + "";


            if (opcion.equalsIgnoreCase("A")){

                do {
                System.out.println("Introduce los datos del nuevo cliente\n" +
                        "Introduce el nombre (solo letras)");

                    nom = sc.nextLine().toUpperCase();
                    if(nombres.contains(nom)) {
                        System.out.println("No puedes poner dos clientes con el mismo nombre exacto");
                    }

                }while ((!patronnum(nom) || nombres.contains(nom)));
                    nombres.add(nom);

                do {
                    System.out.println("Introduce la deuda del cliente si no hay simplemente pon 0" +
                            " maximo 2 decimales");
                    dig = sc.nextLine();
                    dig = dig.replace(",",".");
                }while (!patrondig(dig));
                num=Float.parseFloat(dig);
                    deuda.add(num);

            }else if (opcion.equalsIgnoreCase("E")){

                System.out.println("Aqui tines la lista de Clientes");
                itNombres = nombres.iterator();
                itDeuda = deuda.iterator();
                pos=1;
                while (itNombres.hasNext()){

                    System.out.print(pos+".");
                    System.out.printf("%20s %20s%n",itNombres.next(),itDeuda.next());
                    pos+=1;

                }
                do {
                    System.out.println("Introduce el nombre del Cliente a Eliminar(Solo Letras)");
                    nom = sc.nextLine().toUpperCase();
                }while (!patronnum(nom));
                    if (nombres.contains(nom)) {
                        deuda.remove(nombres.indexOf(nom));
                        nombres.remove(nombres.indexOf(nom));
                    }else{
                        System.out.println("No existe ese cliente en la lista");
                    }

            }else if (opcion.equalsIgnoreCase("D")) {

                System.out.println("Aqui tines la lista de Clientes y sus deudas");
                itNombres = nombres.iterator();
                itDeuda = deuda.iterator();
                pos = 1;
                while (itNombres.hasNext()) {

                    System.out.print(pos + ".");
                    System.out.printf("%20s %20s%n", itNombres.next(), itDeuda.next());
                    pos+=1;

                }
            } else if (opcion.equalsIgnoreCase("C")) {

                do {
                    System.out.println("Introduce el nombre del cliente del que quieras consultar el saldo(Solo Letras)");
                        nom = sc.nextLine().toUpperCase();
                }while (!patronnum(nom));
                System.out.println(deuda.get(nombres.indexOf(nom)));

            } else if (opcion.equalsIgnoreCase("M")) {
                do {
                    System.out.println("Introduce el nombre del cliente del que quieras modificar el saldo(Solo Letras)");
                        nom = sc.nextLine().toUpperCase();
                }while (!patronnum(nom));
                do {
                    System.out.println("Introduce la nueva deuda en caso no estar saldada introduce 0 maximo 2 decimales");
                    dig = sc.nextLine();
                    dig= dig.replace(",",".");
                }while (!patrondig(dig));
                num=Float.parseFloat(dig);
                deuda.set(nombres.indexOf(nom),num);
            } else if (opcion.equalsIgnoreCase("S")) {

                System.out.println("Hasta Luego");

            }else {

                System.out.println("Introduce una opcion valida porfavor");

            }



        }while (!opcion.equalsIgnoreCase("s"));

    }

}
