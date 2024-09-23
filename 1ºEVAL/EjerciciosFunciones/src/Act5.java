import java.util.Scanner;

public class Act5 {

public static double millas_a_Kilometros(int millas){

    return millas*1.60934;
}

public static void imprime(int millas){

    System.out.println(millas+" millas son "+millas_a_Kilometros(millas)+" Kilometros");

}

    public static void main(String[] args) {

    int millas;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce las millas que quieres pasar a Kilometros");
        millas=sc.nextInt();

        imprime(millas);

    }

}
