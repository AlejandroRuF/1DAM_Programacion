import java.util.Scanner;

public class Act3 {

    public static void main(String[] args){

        String hora;
        int minutos;
        int opcion=0;
        boolean correcto=false;
        boolean rejok=false;
        Scanner sc = new Scanner(System.in);
        Hora reloj1 = null;
        try {
            reloj1 = new Hora("00:00");
        } catch (Exception e) {
            System.out.println();;
        }

        do {

            System.out.println("Elige una de las siguientes opciones\n" +
                    "1- Crear Reloj\n" +
                    "2- Adelantar Hora\n" +
                    "3- Atrasar Hora\n" +
                    "4- Convertir\n" +
                    "5- Salir\n");

            try {

                opcion = sc.nextInt();
            }catch (Exception e){

                sc.next();
                System.out.println("Error: "+e);

            }

            switch (opcion){

                case 1:
                    do {
                        correcto=false;
                        System.out.println("Introduce una hora en formato HH:MM para crear el reloj");
                        hora = sc.next();
                        try {
                            reloj1.ponerHora(hora);
                            correcto=true;
                            System.out.println("La hora actual es "+ reloj1.devolver_hora());
                            rejok=true;
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                    }while (!correcto);
                    break;

                case 2:
                    if (rejok){
                        do {
                            correcto = false;
                            try {

                                System.out.println("Cuantos minutos quieres adelantar el reloj\n");
                                minutos = sc.nextInt();
                                reloj1.adelantar(minutos);
                                correcto=true;
                                System.out.println("La hora actual es "+ reloj1.devolver_hora());
                            }catch (Exception e){

                                System.out.println("Error: "+e);

                            }
                        }while (!correcto);
                    }else {

                        System.out.println("Debes crear primero un reloj, tonto =D");

                    }
                    break;

                case 3:
                    if (rejok){
                        do {
                            correcto = false;
                            try {

                                System.out.println("Cuantos minutos quieres atrasar el reloj\n");
                                minutos = sc.nextInt();
                                reloj1.atrasar(minutos);
                                correcto=true;
                                System.out.println("La hora actual es "+ reloj1.devolver_hora());
                            }catch (Exception e){

                                System.out.println("Error: "+e);

                            }
                        }while (!correcto);
                    }else {

                        System.out.println("Debes crear primero un reloj, tonto =D");

                    }
                    break;

                case 4:
                    if (rejok) {
                        System.out.println(reloj1.convertir());
                    }else {

                        System.out.println("Debes crear primero un reloj, tonto =D");

                    }
                    break;

                case 5 :
                    System.out.println("Vuelve Pronto!!");
                    break;

                default:
                    System.out.println("Introduce una opcion valida");
                    break;


            }



        }while(opcion!=5);

    }

}
