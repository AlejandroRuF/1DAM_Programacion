import java.util.Scanner;

public class Act45 {

    public static void main(String[] args) {

        double[] monedas = {2,1,0.50,0.20,0.10,0.05};
        int[] vueltas = new int[6];
        double precio=0;
        double precioprod=2.10;
        double entrada;




        Scanner sc= new Scanner(System.in);

        System.out.println("El precio es 2.10 introduce las monedas por aqui -->(Escribelo bajo...) ");
do {


    precio = sc.nextDouble()+precio;
    entrada= precio;

    if (precio < precioprod) {

        System.out.println("Te faltan " + Math.round(((precioprod - precio)*100d))/100d + " para poder comprar el producto introducelo porfavor");

    } else {
        precio = precio - precioprod;

        for (int i = 0; i < monedas.length; i++) {

            vueltas[i] = (int) (precio / monedas[i]);
            precio = (Math.round((precio % monedas[i] * 100d)) / 100d);

        }

        if (vueltas[0]!=0 || vueltas[1]!=0 || vueltas[2]!=0 || vueltas[3]!=0 || vueltas[4]!=0 || vueltas[5]!=0 ) {
            System.out.println("Aqui tienes las veltas");
            precio=0;
        }else {

            System.out.println("No sobra nada tu que ya has acabado de comprar deja hueco a otro cliente anda");
            precio=0;

        }
        for (int i = 0; i < vueltas.length; i++) {

            if (vueltas[i]>0) {
                if (i==0 || i==1) {
                    System.out.println(vueltas[i] + " monedas de " + monedas[i]);
                    precio=0;
                }else {

                    System.out.print(vueltas[i] + " monedas de ");
                    System.out.printf("%01.0f",(monedas[i]*100));
                    System.out.print(" centimos\n");
                    precio=0;

                }
            }
        }


    }
}while(entrada<precioprod);
    }

}
