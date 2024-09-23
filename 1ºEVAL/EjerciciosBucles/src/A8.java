import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A8 {

    public static void main(String[] args) {//hay que enseñar los numeros pares que hay entre 2 numeros

        int valorpequenio=0;
        int valorgrande=0;
        int contador=0;
        int valor1 = 0;
        int valor2=0;
        int repite;
        int valoractual;
        Scanner sc=new Scanner(System.in);



        do {//para reiniciar el programa en caso de dar error con el try-catch

            try {//si no se introduce un entero en vez de cerrar el programa nos da un mensaje de advertencia

                System.out.println("Introduce dos numeros enteros porfavor");


                valor1= sc.nextInt();
                valor2= sc.nextInt();





                if(valor1>valor2){//si la variable 1 es mayor guardamos su valor en la variable correspendiente

                    valorgrande=valor1;
                    valorpequenio=valor2;
                    contador++;

                } else {//si no es porque la variable 2 es mayor

                    valorgrande=valor2;
                    valorpequenio=valor1;
                    contador++;

                }



            }catch(InputMismatchException ex){

                System.out.println("No has introducido los datos correctamente");
                sc.next();//limpiamos el valor que ha dado error de la clase Scanner

            }

            repite=valorgrande-valorpequenio;//calculamos en numero de veces que tenemos que hacer el bucle

        }while (contador==0);



        for (int i=0; i<repite+1; i++){


            if (valorgrande>=valorpequenio){//cuando el valor grande sea igual que el pequeño ya no hace falta hacer mas operaciones

                valoractual=valorgrande;//cada contador cambia el numero de los valores al cumplirse las condiciones de abajo
                if (valoractual%2==0){//si el residuo es 0 el numero es par y lo imprimimos

                    System.out.println(valoractual);
                    valorgrande--;//para saber el valor con el que debemos operar en el ciclo siguiente

                }else{
                    valorgrande--;

                }




            }



        }

    }

}
