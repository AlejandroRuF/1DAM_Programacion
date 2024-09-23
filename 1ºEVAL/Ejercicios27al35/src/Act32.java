import java.util.Scanner;

public class Act32 {

    public static void main(String[] args) {

        int numero;
        long resultadomultiplicacion = 1L;
        long resultadosuma = 0L;

        System.out.println("Introduce un numero entero para calcular suma y el producto de sus numeros anteriores pares");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        if (numero != 0) {
            for (int i = numero; i > 0; i--) {

                if (i % 2 == 0) {

                    resultadomultiplicacion = resultadomultiplicacion * i;
                    resultadosuma = resultadosuma + i;

                }

            }
            if (numero>42) {
                System.out.println("El resultado de los numeros pares menores de " + numero + " es demasiado grande para guardarlo en la memoria");

            } else {

                System.out.println("El resultado de los numeros pares menores de " + numero + " multiplicados es " + resultadomultiplicacion);

            }
            System.out.println("El resultado de los numeros pares menores de " + numero + " sumados es " + resultadosuma);

       }else{

            System.out.println("El resultado de los numeros pares menores de " + numero + " multiplicados es 0");
            System.out.println("El resultado de los numeros pares menores de " + numero + " sumados es 0");

       }
    }
}