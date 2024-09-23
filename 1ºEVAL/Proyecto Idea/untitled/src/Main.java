import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        final double pi = Math.PI;

        double num = 21;

        double mult = num*pi;

        long g = 3566*89992L;



                System.out.println("Si multiplicamos 21 por pi obtenemos " + mult);

                System.out.println(g);


        int da=0;

       do {



        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu edad?(Solo numeros enteros)");



            try {
                int edad = sc.nextInt();

                    if (edad >17){



                        System.out.println("Puedes entrar");

                        da++;

                }else{

                        System.out.println("A tu puta casa");
                        da++;
              }


            }catch (InputMismatchException ex) {
                System.out.println("No has introducido los datos correctamente");
                sc.close();

            }
        }while (da==0);
    }

       }


