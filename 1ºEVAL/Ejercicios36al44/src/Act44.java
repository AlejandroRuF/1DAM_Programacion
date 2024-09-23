import java.util.Scanner;

public class Act44 {

    public static void main(String[] args) {


        String pelisydirectores[][] = {{"Avatar", "James Camaron"},
                {"Vengadores Endgame ", "Hermanos Russo"},
                {"Cadena perpetua","Frank Darabont"},
                {"El padrino","Coppola"},
                {"El caballero oscuro","Christopher Nolan"}};
        String peli;
        String director;
        String respuesta;
        int menu;
        int contador=0;
        int correctas=0;
        int random;
        int puntos=5;
        double porcentaje;
        Scanner sc=new Scanner(System.in);

        do {
            if (contador==0) {

                System.out.println("Vamos a ver si sabes quien es el director de cada pelicula" +
                        "\n1- Comenzar juego" +
                        "\n2- Salir");
            }else {

                System.out.println("1- Seguir Jugando" +
                        "\n2- Salir");
            }
            menu=sc.nextInt();
            if (menu==1){

                random = (int) (Math.random() * 4);

                peli= pelisydirectores[random][0];
                director=pelisydirectores[random][1];
                System.out.println("Quien es el director de la pelicula "+peli+" debes escribirlo correctamente");
                sc.nextLine();
                respuesta=sc.nextLine();
                if (respuesta.equalsIgnoreCase(director)){

                    System.out.println("Felicidades es correcto de director era "+director);
                    correctas++;

                }else {

                    System.out.println("Lo siento el director era "+director+" lo tenias bien?");
                    respuesta=sc.nextLine();
                    if (respuesta.equalsIgnoreCase("Si")){

                        System.out.println("Vale... te la doy por buena ");
                        correctas++;

                    }else{

                        puntos--;

                    }

                }

            }
            contador++;

        }while(menu!=2 && puntos!=0);

        porcentaje=(100d/contador)*correctas;
        System.out.println("Tienes correctas "+correctas+" de "+contador+" preguntas eso es un "+porcentaje+"%");

    }
}
