import java.util.Scanner;

public class Act6 {

   public static double precioConIva(double precio){
       double iva=0.21;

       return precio*(1+iva);
   }
   public static void imprime(double[] precio){

       for (int i = 0; i < precio.length; i++){

           System.out.println(precio[i]+" Con iva serian "+precioConIva(precio[i]));

       }

   }

    public static void main(String[] args) {

       double[] precio= new double[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 5 precios que quieras saber cuanto costaria con iva");
        for (int i = 0;i < precio.length; i++){

            precio[i]= sc.nextDouble();

        }
        imprime(precio);

    }

}
