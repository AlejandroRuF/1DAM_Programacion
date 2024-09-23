import java.util.InputMismatchException;
import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {

        int nEntradas=500;
        int[] numeros=new int[nEntradas];//creamos un array o matriz de igual tamaño a la variable de arriba
        int temp;
        int error=(nEntradas);


        System.out.println("Introduce "+ (nEntradas) +" numeros.");
        Scanner sc= new Scanner(System.in);

       do {//creamos un while con try-cach para asegurarnos que los datos introducidos son correctos
           try{

               for (int i=0;i<nEntradas;i++){//comenzamos el bucle en 0 ya que las posiciones de las matrices empiezan en 0

                   numeros[i]=(int)(Math.random()*1000+1);
                  //numeros[i]= sc.nextInt();
                   error--;

               }

           }catch (InputMismatchException ex){
               System.out.println("Tienen que ser numeros enteros");
               sc.next();//limpiamos el Scanner del error
           }

       }while (error!=0);

        for (int j=0;j<nEntradas;j++){

            for (int z=0;z<nEntradas-1;z++){// se repite un numero de veces igual al tamaño de la matriz por cada vez que repite el primer bucle

                if (numeros[z] > numeros[z + 1]) {

                    temp=numeros[z];//guardamos el numero grande de la matriz en una variable temporal
                    numeros[z]=numeros[z+1];//colocamos la variable mas pequeña en el primer puesto
                    numeros[z+1]=temp;//colocamos la variable grande en segundo lugar
                    //esto se repite un numero de veces igual a el tamaño de la matriz por cada vez que se repite el primer bucle

                }


            }


        }

        System.out.println("Los numeros de menor a mayor son:");

        for (int c=0;c<nEntradas;c++) {

            System.out.println(numeros[c]);

        }
    }
}