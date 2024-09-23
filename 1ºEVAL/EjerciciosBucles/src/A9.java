import java.util.InputMismatchException;
import java.util.Scanner;

public class A9 {

    public static void main(String[] args) {//calcula el productro de 5 valores introducidos

        int numdenum=5; //numero de numeros que tienes que introducir
        int error=0;
        double[] numeros=new double[numdenum];
        int correcto=0;
        double producto=1;

        //do {
            do {//bucle para reiniciar en caso de que no se cumplan las condiciones o de error

                System.out.println("Introduce 5 numeros mayores que 0");
                Scanner sc = new Scanner(System.in);


                for (int i = 0; i < numdenum; i++) {

                    try {//como siempre nos aseguramos que no se cierre el progrma al dar error por introducir numeros no validos

                        numeros[i] = sc.nextDouble();

                        if (numeros[i] > 0) {//los valores deben ser positivos en caso de ser positivo un valor en esta vuelta se suma una condicion para la salida del 1er while

                            error++;

                           /* if ((i+1)==numdenum){//si llegamos a completar el bucle for sin errores se cumple la condicion para salir del segundo while
                                //el mas 1 es porque al comenzar las arrays por 0 el bucle for tambien debe hacerlo
                                correcto++;

                            }vaya lio*/

                        } else {

                                System.out.println("El numero debe ser mayor a 0");
                                i=numdenum;//salimos del primer del bucle for para reiniciarlo
                                error=0;

                        }

                    } catch (InputMismatchException ex) {

                        System.out.println("Introduce los datos correctamente");
                        sc.next();//limpiamos la clase Scanner para que no de error al reinicio
                        i=numdenum;//salimos del primer del bucle for para reiniciarlo
                        error=0;
                    }
                }
            } while ((error) != numdenum);//cuando se sale del bucle for por errores debemos reiniciar el bucle y podemos salir de aqui al poner bien los datos
       // }while (correcto==0); me hice un lio

        for (int z=0;z<numdenum;z++){//array para multiplicar el producto por cada numero

            producto=producto*numeros[z];//el producto guarda el resultado de la operacion anterior y multiplica por el siguiente

        }
        System.out.println("El producto de los numeros que has introducido es "+producto);//faltaria otro while y otro try cach por si el resultado excede el valor de un int pero...
    }

}
