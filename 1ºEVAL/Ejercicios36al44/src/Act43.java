import java.util.Scanner;

public class Act43 {
    public static void main(String[] args) {

        double num1;
        double num2;
        double respuesta=0;
        double respuestaJugador;
        double pocertaje;
        double correctas=0;
        double preguntas=20;
        int operacion;
        String suma = "+";
        String resta = "-";
        String multiplicacion = "x";
        String division = "/";
        String representaope = "?";
        Scanner sc=new Scanner(System.in);


        System.out.println("Vamos a jugar a un juego resuelve las siguientes operaciones");
        for (int i = 0;i<preguntas;i++) {
            num1 = (int)(Math.random()*10+1);
            num2 = (int)(Math.random()*10+1);
            operacion  = (int)(Math.random()*4+1);
            if (operacion == 1) {

                representaope=suma;
                respuesta=num1+num2;

            }
            if (operacion==2) {

                representaope = resta;
                respuesta = (Math.round(num1 - num2)*100d)/100d;

            }
            if (operacion==3){

                representaope = multiplicacion;
                respuesta = num1*num2;

            }
            if (operacion==4){

                representaope = division;
                respuesta = (Math.round((num1 / num2)*100d)/100d);

            }
            System.out.printf("%01.0f",num1);
            System.out.printf(representaope);
            System.out.printf("%01.0f",num2);
            System.out.print("=");

            respuestaJugador= sc.nextDouble();

            if (respuesta==respuestaJugador){

                System.out.println("Correcto");
                correctas++;

            }else{

                System.out.println("Icorrecto la respuesta es "+respuesta);

            }

        }

        pocertaje=(100/preguntas)*correctas;
        System.out.println("Bien tienes "+correctas+" respuestas correctas en tatal has respondido bien "+pocertaje+"%");

    }
}