public class Act15 {
/*Escribe un programa que cree un array de tamaño 100 con los primeros 100 números
naturales. Luego muestra la suma total y la media. Implementa una función que calcule la
suma de un array y otra que calcule la media de un array.*/

    public static int suma(int[] arrayNumeros) {
        int res = 0;
        for (int i = 0; i < arrayNumeros.length; i++) {

            res = res+arrayNumeros[i];

        }

        return res;
    }
    public static int media(int[] arrayNumeros){

        return suma(arrayNumeros)/arrayNumeros.length;

    }

    public static void main(String[] args) {

        int[] numeros = new int[100];

        for (int i = 0; i<numeros.length;i++){

            numeros[i]=(i+1);
            //System.out.println(numeros[i]);

        }


        System.out.println("La suma de los numeros del 1 al 100 es "+suma(numeros)+" y la media es "+media(numeros));

    }



}
