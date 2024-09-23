import java.util.Scanner;

public class Act37 {

    public static void main(String[] args) {



        int[] billetes= {500,200,100,50,20,10,5};
        int[] cambio=new int[7];
        int precio;
        int entrada;


        System.out.println("Introduce cual es el precio");
        Scanner sc=new Scanner(System.in);
        precio=sc.nextInt();
        entrada=precio;

        for (int i=0;i<billetes.length;i++){

            cambio[i]=(int)(precio/billetes[i]);
            //cambio[i]=(int)cambio[i];
            precio=precio%billetes[i];

        }
        System.out.println("En "+entrada+" euros hay");
        for (int i=0;i<cambio.length;i++){
            if(cambio[i]!=0) {

                System.out.println(" " +cambio[i] + " billetes de " + billetes[i]);

            }
        }

        System.out.println("Y sobran "+(int)(precio%billetes[6])+" euros");

    }

}
