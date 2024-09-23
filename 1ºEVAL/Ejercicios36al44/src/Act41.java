public class Act41 {

    public static void main(String[] args) {

        int maximo=100;
        int resfor=0;
        int reswhile=0;
        int resdowhile=0;
        int banderawhile=2;
        int banderado=2;

        for (int i=2;i<maximo;i+=3){

            resfor=i+resfor;

        }
        System.out.println("La suma usando el bucle for es "+resfor);

        do {

            resdowhile=banderado+resdowhile;
            banderado=banderado+3;

        }while(banderado<maximo);

        System.out.println("La suma usando el bucle do while es "+resdowhile);

        while(banderawhile<maximo){

            reswhile=banderawhile+reswhile;
            banderawhile=banderawhile+3;

        }

        System.out.println("La suma usando el bucle while es "+reswhile);

    }

}
