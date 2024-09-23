import java.util.Scanner;
public class intercambio
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // declaración de variables
        int x, y, z, w;
        // Introducción de datos
        System.out.print("Enter value for x ");
        x = sc.nextInt();
        z = x;
        System.out.print("Enter value for y ");
        y = sc.nextInt();
        w = y;
        // Código que intercambia los valores
        x = w;
        y = z;
        //muestra resultado
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}