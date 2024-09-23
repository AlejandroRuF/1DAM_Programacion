import java.util.ArrayList;
import java.util.Scanner;

public class Act4 {

    public static void main(String[] args) {

        ArrayList<String> nuevo = new ArrayList<String>();
        nuevo.add("Hola");
        nuevo.add(" Edu ");
        nuevo.add("y ");
        nuevo.add("Sebas.");
        boolean correcto;
        int pos=-1;
        Scanner sc = new Scanner(System.in);

        for (String i:nuevo){

            System.out.print(i);

        }
        System.out.println();

        do {
            correcto=false;
            System.out.println("Introduce una posicion para saber que hay en el ArrayLIst que tiene "+nuevo.size()+" posiciones");
            try {
                pos = sc.nextInt();
            }catch (Exception e){
                System.out.println("Introduce un numero");
                sc.next();
            }
            if (pos<nuevo.size() && pos > -1){
                correcto=true;
            }else {

                System.out.println("El ArrayLIst que tiene "+nuevo.size()+" posiciones de 0 a "+(nuevo.size()-1));

            }
        }while (!correcto);
        System.out.println(nuevo.get(pos));

        for (String i:nuevo){

            System.out.print(i);

        }
        System.out.println();
    }

    }


