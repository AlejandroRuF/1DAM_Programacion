import java.util.Date;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int YEAR;
        int age, bornIn;

        Date dt = new Date();

        YEAR=dt.getYear()+1900;

        System.out.print("How old are you this year?" );

        age = keyboard.nextInt();

        bornIn = YEAR - age;

        System.out.println("I think you were born in " + bornIn);

        System.out.println(YEAR);
    }
}
