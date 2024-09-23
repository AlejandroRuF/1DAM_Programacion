import java.util.Scanner;

public class DNI2 {

    public static char calcularDNI(int dni) {

        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;

        return caracteres.charAt(resto);
    }

    public static boolean letras(String letraDNI) {

        boolean esLetra = false;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        for (int i = 0; i < letras.length(); i++) {

            if ((letras.charAt(i) + "").equals(letraDNI)) {
                esLetra = true;
            }
        }

        return esLetra;
    }

    public static int repararDNI(String DNI, String patron, String[] posibles_dni) {

        int sumaX = 0;
        boolean validacionDNI = false;
        boolean vecesAparecePatronCorrecto = false;
        boolean validacionLetra = false;
        String letraDNI = (DNI.charAt(DNI.length() - 1) + "");
        String dniSinLetra = "";
        int remplazo = 0;
        char letraDNI2 = DNI.charAt(DNI.length() - 1);
        String remplazo1="";
        String remplazo2="";
        int k=0;
        int posa1=0;
        int posa2=0;

        for (int i = 0; i < posibles_dni.length; i++) {
            posibles_dni[i] = "*";
        }

        for (int i = 0; i < DNI.length(); i++) {

            if ((DNI.charAt(i) + "").equals(patron)) {

                sumaX++;
            }
        }

        if (DNI.length() == 9 && !((DNI.charAt(0) + "").equals(patron)) && !(DNI.charAt(DNI.length() - 2) + "").equals(patron)) {

            validacionDNI = true;
        }

        if (sumaX == 1 || sumaX == 2) {
            vecesAparecePatronCorrecto = true;
        } else {
            System.out.println("Tú eres gilipollas.");
        }

        if (letras(letraDNI.toUpperCase())) {
            validacionLetra = true;
        }

        if (validacionDNI && validacionLetra && vecesAparecePatronCorrecto) {

            if (sumaX == 1) {

                // PARA QUEDARME CON SOLO LOS NUMS
                for (int i = 0; i < DNI.length() - 1; i++) {

                    dniSinLetra += (DNI.charAt(i) + "");
                }

                for (int i = 0; i <= 9; i++) {

                    remplazo = Integer.parseInt(dniSinLetra.replaceFirst(patron, String.valueOf(i)));

                    if ((calcularDNI(remplazo) + "").equals(letraDNI)) {

                        posibles_dni[i] = String.valueOf(remplazo);


                    }
                }
            } else if (sumaX == 2) {

                for (int i=0; i< DNI.length();i++){

                    if ((DNI.charAt(i)+"").equals(patron) && posa1 == 0){

                        posa1=i;

                    }
                    if ((DNI.charAt(i)+"").equals(patron) && posa1 != 0){

                        posa2=i;

                    }

                }
                    if ((posa1+1)==posa2) {
                        for (int i = 0; i < DNI.length() - 1; i++) {

                            dniSinLetra += (DNI.charAt(i) + "");
                        }

                        for (int i = 0; i <= 9; i++) {

                            remplazo1 = dniSinLetra.replaceFirst(patron, String.valueOf(i));

                            for (int j = 0; j <= 9; j++) {

                                remplazo2 = remplazo1.replaceFirst(patron, String.valueOf(j));
                                remplazo = Integer.parseInt(remplazo2);

                                if ((calcularDNI(remplazo) + "").equals(letraDNI)) {

                                    k++;
                                    posibles_dni[k] = (remplazo2);

                                }
                            }

                        }
                    }else {

                        System.out.println("eres gilipollas");

                    }
            }else {

                System.out.println("eres gilipollas");

            }
        }


            return remplazo;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String dni;
        String patron;
        String [] posiblesDNI = new String[82];

        System.out.println("\nIntroduce un DNI con un máximo de 2 errores. No pueden estar seguidos y tampoco al " +
                "principio de la letra: ");
        dni = entrada.next();

        System.out.println("\nIntroduce el patron del error: ");
        patron = entrada.next();

        repararDNI(dni, patron, posiblesDNI);

        for (int i = 0; i < posiblesDNI.length; i++){

            if (!posiblesDNI[i].equals("*")){

                System.out.println(posiblesDNI[i]);
            }
        }

    }
}