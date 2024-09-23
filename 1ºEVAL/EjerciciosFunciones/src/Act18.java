import java.util.Scanner;

public class Act18 {
    /* El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de
DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
deberá crear una función a la que se le pase el número y devuelva la letra.*/

    public static String letra(int numero){
        String[] letra={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};



        return letra[((int) numero%23)];
    }

    public static void main(String[] args) {

       String dni;
       int numdni;
       boolean correctolargo;
       boolean correctonumeros;
       boolean acaba=false;

        Scanner sc = new Scanner(System.in);

        do {
            correctolargo=false;
            correctonumeros=false;
            System.out.println("Introduce los 8 numeros del DNI");
            dni=sc.next();
            if (dni.length()==8){

                correctolargo=true;

            }
            try {

                Integer.parseInt(dni);
                correctonumeros=true;

            }catch (Exception ex){

                correctonumeros=false;

            }
            if (correctolargo && correctonumeros){
                numdni=Integer.parseInt(dni);

                System.out.println("La tu dni completo es "+dni+letra(numdni));
                acaba=true;

            }else{

                System.out.println("No has introducido los datos correctamente");

            }

        }while (!acaba);

    }

}
