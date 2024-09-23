import java.util.Scanner;

public class Act59 {
    /* Nos piden que implementemos el software para una máquina expendedora de golosinas.
    Cada golosina tiene un nombre y un precio para ahorrar tiempo, os paso los datos que
    tendrá a continuación (copiar y pegar):*/
    public static void main(String[] args) {

        double[] monedas = {2, 1, 0.50, 0.20, 0.10, 0.05};
        int[] vueltas = new int[6];
        double dinerointroducido = 0;
        double guardadinero = 0;
        int fila;
        int columna;
        double precioprod;
        boolean correcto = false;
        int opcion=0;
        String pass="MaquinaExpendedora2021";
        String pass_validate="";

        Scanner sc = new Scanner(System.in);

        String[][] nombresGolosinas = {
                {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
                {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
                {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
                {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        double[][] precio = {
                {1.1, 0.8, 1.5, 0.9},
                {1.8, 1, 1.2, 1},
                {1.8, 1.3, 1.2, 0.8},
                {1.5, 1.1, 1.1, 1.1}
        };
        int[][] cantidad = {
                {5, 5, 5, 5},
                {5, 5, 5, 5},
                {5, 5, 5, 5},
                {5, 5, 5, 5}
        };
        do {
            System.out.println("Que quieres hacer" +
                    "\n1- Comprar" +
                    "\n2- Rellenar maquina" +
                    "\n3- Mostrar golosina" +
                    "\n4- Salir");
            opcion=sc.nextInt();


            if (opcion==1) {
                System.out.println("Elige un producto");
                for (int i = 0; i <= 3; i++) {
                    System.out.println();
                    for (int j = 0; j <= 3; j++) {
                        System.out.println(i + " " + j + "  " + nombresGolosinas[i][j]);

                    }
                }

                do {
                    correcto = false;
                    System.out.println("Introduce la fila de 0 a 3");
                    fila = sc.nextInt();
                    if (fila == 0 || fila == 1 || fila == 2 || fila == 3) {

                        correcto = true;
                    }

                } while (!correcto);

                do {
                    correcto = false;
                    System.out.println("Introduce la Columna de 0 a 3");
                    columna = sc.nextInt();
                    if (columna == 0 || columna == 1 || columna == 2 || columna == 3) {

                        correcto = true;
                    }

                } while (!correcto);

                if (cantidad[fila][columna] <= 0) {

                    System.out.println("Lo Siento no nos queda de ese producto");

                } else {

                    precioprod = precio[fila][columna];


                    System.out.println("El precio es " + precio[fila][columna]);
                    System.out.print("  Introduce las monedas por aqui --> ");
                    do {


                        dinerointroducido = sc.nextDouble() + dinerointroducido;
                        guardadinero = dinerointroducido;

                        if (dinerointroducido < precioprod) {

                            System.out.println("Te faltan " + Math.round(((precioprod - dinerointroducido) * 100d)) / 100d + " para poder comprar el producto introducelo por favor");

                        } else {
                            dinerointroducido = dinerointroducido - precioprod;

                            for (int i = 0; i < monedas.length; i++) {

                                vueltas[i] = (int) (dinerointroducido / monedas[i]);
                                dinerointroducido = (Math.round((dinerointroducido % monedas[i] * 100d)) / 100d);

                            }

                            if (vueltas[0] != 0 || vueltas[1] != 0 || vueltas[2] != 0 || vueltas[3] != 0 || vueltas[4] != 0 || vueltas[5] != 0) {
                                System.out.println("Aqui tienes las vueltas");
                                dinerointroducido = 0;
                                cantidad[fila][columna]--;
                                for (int i = 0; i < vueltas.length; i++) {

                                    if (vueltas[i] > 0) {
                                        if (i == 0 || i == 1) {
                                            System.out.println(vueltas[i] + " monedas de " + monedas[i]);
                                            dinerointroducido = 0;

                                        } else {

                                            System.out.print(vueltas[i] + " monedas de ");
                                            System.out.printf("%01.0f", (monedas[i] * 100));
                                            System.out.print(" centimos\n");
                                            dinerointroducido = 0;



                                        }
                                    }
                                }

                            } else {

                                System.out.println("No sobra nada, ya que has acabado de comprar deja hueco a otro cliente anda");
                                dinerointroducido = 0;
                                cantidad[fila][columna]--;



                            }



                        }
                    } while (guardadinero < precioprod);
                }
            }else if (opcion==3) {
                System.out.println("Elige un producto");
                for (int i = 0; i <= 3; i++) {
                    System.out.println();
                    for (int j = 0; j <= 3; j++) {
                        System.out.println(i + " " + j + "  " + nombresGolosinas[i][j]);

                    }
                }
            }else if (opcion==2) {
                opcion=0;
                do {
                    System.out.println("Que quieres hacer" +
                            "\n1- Rellenar maquina" +
                            "\n2- Salir");
                    opcion= sc.nextInt();

                    if (opcion==1) {
                        System.out.println("Indica la contraseña");
                        pass_validate = sc.next();

                        if (pass_validate.equals(pass)) {

                            System.out.println("Elige un producto");
                            for (int i = 0; i < 3; i++) {
                                System.out.println();
                                for (int j = 0; j < 3; j++) {
                                    System.out.println(i + " " + j + "  " + nombresGolosinas[i][j] + " quedan ----> " + cantidad[i][j]);
                                }
                            }
                            System.out.println("Que produccto deseas rellenar");
                            System.out.println("Indica la fila");
                            fila=sc.nextInt();
                            System.out.println("Indica la columna");
                            columna=sc.nextInt();
                            System.out.println("De"+nombresGolosinas[fila][columna]+" hay "+"Que cantidad quieres rellenar");
                        } else {

                            System.out.println("La contraseña es incorrecta");

                        }
                    }
                }while(opcion!=2);

                }


        } while(opcion!=4);
    }
}


