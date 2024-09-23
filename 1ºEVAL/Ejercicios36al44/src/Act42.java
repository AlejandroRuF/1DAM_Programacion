import java.util.InputMismatchException;
import java.util.Scanner;

        public class Act42 {
            public static void main(String[] args) {

                int[] numeros = new int[7];
                int[] ganadores=new int[7];
                int reintegro;
                int numeroactual;
                int bien=0;
                int numeroganador;
                int coincide=0;


                Scanner sc=new Scanner(System.in);
                for (int i=0;i<numeros.length-1;i++) {
                    do {
                        System.out.println("Introduce el numero " + (i + 1) + " de la primitiva maximo 49 y minimo 1");
                        numeroactual = sc.nextInt();

                        if ((numeroactual > 49 || numeroactual==0) && i!=0) {

                            System.out.println("Los numeros deben ser menores a 50 y mayores a 0");

                            bien++;
                            i--;

                        }
                        for (int j = 0; j < numeros.length-1; j++) {

                            if (numeroactual==numeros[j] && i!=0 && numeroactual!=0 && bien==0){

                                System.out.println("No pueden haber 2 numeros iguales");
                                i--;
                                bien++;

                            }

                        }
                        if (bien==0) {

                            numeros[i] = numeroactual;
                        }else{

                            bien=0;

                        }

                    }while (numeros[i]>=49&& i==0);
                }
                do {
                    System.out.println("introduce el numero del reintegro");
                    reintegro=sc.nextInt();
                    if (reintegro<10 && reintegro>0){

                        numeros[6]=reintegro;

                    }else {

                        System.out.println("El numero del reintegro debe estar entre 1 y 9");

                    }
                }while (reintegro>10 || reintegro<=0);

                bien=0;

                for (int i=0;i<ganadores.length;i++) {
                    do {
                        numeroganador = (int)(Math.random()*49+1);

                        for (int j = 0; j < ganadores.length; j++) {

                            if ((numeroganador==ganadores[j] && i!=0) || numeroganador==0){

                                i--;
                                bien++;

                            }

                        }
                        if (bien==0) {

                            ganadores[i] = numeroganador;
                        }else{

                            bien=0;

                        }

                    }while (numeros[i]>=49&& i==0);

                }
                reintegro=(int)(Math.random()*9+1);
                ganadores[6]=reintegro;
                System.out.println("Los numeros ganadores son");
                for (int i=0; i<ganadores.length;i++){

                    if (i!=ganadores.length-1){
                    System.out.printf(ganadores[i]+"/");
                    }else{

                        System.out.println(ganadores[i]);

                    }

                }

                for (int i=0;i<ganadores.length;i++){
                    for (int j=0;j<ganadores.length;j++){

                        if(ganadores[i]==numeros[j]){

                            System.out.println(ganadores[i]);
                            coincide++;

                        }

                    }

                }
                if (coincide!=0) {
                    System.out.println("Los numeros anteriores coinciden con los ganadores tienes " + coincide + " numeros que coinciden");
                }else {

                    System.out.println("Lo siento ningun numero coincide");

                }

                if(numeros[6]==ganadores[6]){

                    System.out.println("El reintegro es "+ganadores[6]+" felicidades tu reintegro coincide");

                }else{

                    System.out.println("El reintegro es "+ganadores[6]+" tu reintegro no coincide");

                }

            }
        }
