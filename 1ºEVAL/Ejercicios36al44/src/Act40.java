import java.util.Scanner;

public class Act40 {

    public static void main(String[] args) {

        int menu1;
        String menu2;

        Scanner sc=new Scanner(System.in);

        do {

            System.out.println("Elige una de las siguentes opciones\n1-Juegos de salon" +
                    "\n2-Juegos al ire libre" +
                    "\n3- Salir");

            menu1=sc.nextInt();

            if(menu1==1){

                System.out.println("Vale tenemos los siguientes juegos\nCartas" +
                        "\nAjedrez" +
                        "\nDamas" +
                        "\nPrendas");

            } else if (menu1==2) {
               do{
                System.out.println("Elige tu preferencia" +
                        "\na) Individuales: atletismo, senderismo,natacion" +
                        "\nb) Colectivos: gimnasia, ritmica,rugby,polo,futbol" +
                        "\nc) Salir");

                menu2 = sc.next().charAt(0)+"";

                if (menu2.equalsIgnoreCase("a")) {

                    System.out.println("Tu solo");

                } else if (menu2.equalsIgnoreCase("b")) {

                    System.out.println("Ves a buscar a alguien para la actividad");

                } else if(menu2.equalsIgnoreCase("c")) {

                    System.out.println("Has cambiado de idea?");;

                }else{

                    System.out.println("Pon correctamente la opcion");

                }

           }while(!(menu2.equalsIgnoreCase("c")));

            }else if (menu1==3) {

                System.out.println("Adios");

            }else{

                System.out.println("Escribe bien la opcion");

            }


        }while(menu1!=3);

    }

}
