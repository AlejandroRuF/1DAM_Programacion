import java.util.Scanner;

public class DNI {

    public static String letra(int numero){
        String[] letra={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};



        return letra[((int) numero%23)].toUpperCase();
    }

    public static String[] repararDNI(String DNI, String caracterdif) {

        int numout = 0;
        boolean valido = true;
        boolean consecutivo = true;
        String numerodni="";
        String letredni;
        String tempNum = "";
        String tempLetra= "";
        int numDNIEnt;

        String posibles_dni[] = {"No es posible hacer el calculo con esos datos"};;
        for (int i = 0; i < DNI.length(); i++) {

            if ((DNI.charAt(i) + "").equals(caracterdif)) {

                numout++;

            }
            if (((DNI.charAt(i) + "").equals(caracterdif)) && (i == 0 || i == DNI.length() - 2) && DNI.length()==9) {

                valido = false;

            }
            if (numout == 2) {
                int primerChar = 0;
                int segundoChar = 0;
                int charac = 0;
                for (int j = 0; j < DNI.length()-1; j++) {

                    if ((((DNI.charAt(j) + "").equals(caracterdif)) && charac == 1)) {

                        segundoChar = j;
                        charac = 2;

                    }
                    if ((((DNI.charAt(j) + "").equals(caracterdif)) && charac == 0)) {

                        primerChar = j;
                        charac = 1;

                    }

                }
                if ((primerChar + 1) != segundoChar) {

                    consecutivo = false;

                }

            }

        }
        if (valido && consecutivo) {

            letredni=DNI.charAt(8)+"";
            for (int i =0;i<DNI.length()-1;i++){

                numerodni=numerodni+DNI.charAt(i);

            }

            if (numout == 1) {

                posibles_dni = new String[10];

                int pos=0;
                for (int i = 0;i<10;i++){

                    tempNum=numerodni.replace(caracterdif,(i+""));
                    numDNIEnt=Integer.parseInt(tempNum);

                    if ((letra(numDNIEnt)).equalsIgnoreCase(letredni)){

                        posibles_dni[pos]=tempNum;
                        posibles_dni[pos]=posibles_dni[pos]+letredni;
                        pos++;

                    }


                }

                return posibles_dni;

            }
            if (numout == 2) {
                posibles_dni = new String[100];
                String tempNum2;
                int pos=0;
                for (int i = 0;i<10;i++){

                    tempNum=numerodni.replaceFirst(caracterdif,(String.valueOf(i)));
                    for (int j = 0; j<10;j++) {

                        tempNum2=tempNum.replaceFirst(caracterdif,String.valueOf(j));
                        numDNIEnt=Integer.parseInt(tempNum2);


                        if ((letra(numDNIEnt).equalsIgnoreCase(letredni))) {

                            posibles_dni[pos] = tempNum2;
                            posibles_dni[pos]=posibles_dni[pos]+letredni;
                            pos++;

                        }
                    }

                }
                return posibles_dni;

            }


        }

        return posibles_dni;
    }
public static int menu(){

        Scanner sc =new Scanner(System.in);
    System.out.println("Que quieres hacer?" +
            "\n1- Saber la letra de mi DNI" +
            "\n2-Saber numeros de mi DNI" +
            "\n3-Nada");
   return sc.nextInt();

}
public static void imprimeArray(String[] posiblesDni){

    for (int i = 0;i<posiblesDni.length;i++){

        if (posiblesDni[i]!=null)
            System.out.println(posiblesDni[i]);

    }

}
public static String letraDNI(){

        int nunero;
    System.out.println("Escribe los numeros del DNI");
    nunero=entradaNumeros();

    return letra(nunero);

}
public static int entradaNumeros(){

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

}
public static String entradaString(){

        Scanner sc = new Scanner(System.in);
        return sc.next();

}
public static String[] dnis(){

        String dNI;
        String danyado;
    System.out.println("Introduce el DNI dañado introduce un caracter especial en representacionde los numeros dañados" +
            "\nSi hay varios numeros dañados deben ser consecutivos(Maximo 2)" +
            "\nEl numero dañado no puede ser el primero o el ultimo");
    dNI=entradaString();
    System.out.println("Introduce que caracter has utilizado");
    danyado=entradaString();
    return repararDNI(dNI,danyado);

}



    public static void main(String[] args) {


        String letradni;
        String posiblesDni[];
        int opcion;



        do {
            opcion=menu();
            if (opcion==1){

               letradni=letraDNI();
                System.out.println("La letra de tu DNI es "+letradni);


            } else if (opcion==2) {
                try {
                    posiblesDni = dnis();
                    System.out.println("Los posibles DNI serian:");
                    imprimeArray(posiblesDni);
                }catch (Exception ex){
                    System.out.println("No Puedes usar ese caracter intenta que no sea un operador");
                }
            }
        }while (opcion!=3);
    }
}
