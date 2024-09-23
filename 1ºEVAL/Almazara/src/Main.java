import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void crear_calendario(int citas[][], String dias_usados[][]){

        for (int i = 0; i< citas.length; i++){
            for (int j = 0; j<citas[0].length;j++){
                citas[i][j]=0;
                dias_usados[i][j]="*";
            }

        }

    }

    public static void rellenar_kilos_dia(int kilos, int citas[][]){

        int descanso;
        for (int i = 0; i< citas.length; i++){
            descanso=(int) (Math.random()*7);
            for (int j = 0; j<citas[0].length;j++){
               if (descanso==j){
                   citas[i][j]=-1;
               }else{
                   citas[i][j]=(int) (Math.random()*1000+1)+kilos;
               }


            }

        }

    }
   public static float LitrosAceite(String calidad, int kilos){
        int litros=0;
        if (calidad.equalsIgnoreCase("Suprema")){
            litros=(kilos/100)*28;
       }else if (calidad.equalsIgnoreCase("buena")){
            litros=(kilos/100)*22;
        }else if (calidad.equalsIgnoreCase("regular")){
            litros=(kilos/100)*15;
        }else if (calidad.equalsIgnoreCase("mala")){
            litros=(kilos/100)*8;
        }else{
            litros =-1;
        }
        return litros;
   }
    public static int dias_para_hacer_aceite(int numkilos, int citas[][],String dias_semana[][]){
       int kilos=numkilos;
       int contador_Dias=0;
       int contador_Semana=0;

            for (int i = 0;i<citas.length;i++){
                for(int j = 0;j<citas[0].length;j++){
                    if (contador_Semana==7){
                        contador_Semana=0;

                    }
                    if(citas[i][j]!=-1 && kilos>0){
                        if (kilos>=citas[i][j]){
                            kilos=kilos-citas[i][j];
                            citas[i][j]=0;
                            contador_Dias++;


                        }else {
                            citas[i][j]=citas[i][j]-kilos;
                            kilos=0;

                            contador_Dias++;
                        }
                        if(citas[i][j]!=-1){
                            dias_semana[i][j]=dia(contador_Dias);
                        }

                    }
                        contador_Semana++;
                }
            }


        return contador_Dias;
    }
    public static String dia(int num){
        String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        return dias[num];
    }

    public static void main(String[] args) {

        int[][] citas = new int[4][7];
        String[][] dias_Usados = new String[4][7];
        String calidad="";
        int kilos_Extra;
        float litros;
        int dias_Necesitados;
        int kilos;


        Scanner sc = new Scanner(System.in);
        System.out.println("*************************************************************************");
        crear_calendario(citas,dias_Usados);
        for (int i = 0; i < citas.length; i++) {

            for (int j = 0; j < citas[0].length; j++) {
                System.out.printf("%8d", citas[i][j]);

            }
            System.out.println();
        }
        System.out.println("*************************************************************************");
        System.out.println("Introduce el valor a Sumar a los posibles 1000 kilos que la almazara puede procesar");
        kilos_Extra=sc.nextInt();
        System.out.println("*************************************************************************");
        System.out.println("*************************************************************************");
            rellenar_kilos_dia(kilos_Extra, citas);
            for (int i = 0; i < citas.length; i++) {
                for (int j = 0; j < citas[0].length; j++) {
                    System.out.printf("%8d", citas[i][j]);

                }
                System.out.println();
            }
        System.out.println("*************************************************************************");
        System.out.println("Introduce los kilos que quieres llevar a la almazara");
        kilos=sc.nextInt();
        System.out.println("Introduce la calidad: (Suprema/Buena/Regular/Mala)");
        calidad=sc.next();
        litros=LitrosAceite(calidad,kilos);
        System.out.print("Para la calidad "+calidad+" los litros de aceite que corresponden son: ");
        System.out.printf("%.0f%n",litros);
            dias_Necesitados=dias_para_hacer_aceite(kilos,citas,dias_Usados);
        System.out.println("Los dias para realizar aceite son los siguientes:\n"+dias_Necesitados);
        System.out.println("*************************************************************************");
        System.out.println();

        for (int i = 0; i < citas.length; i++) {
            System.out.println();
            for (int j = 0; j < citas[0].length; j++) {
                System.out.printf("%20s",dias_Usados[i][j]);

            }
        }
        System.out.println();
        System.out.println("*************************************************************************");
    }
}