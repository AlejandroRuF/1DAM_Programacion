package Act6;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {


        List<Vehiculo> coches = new ArrayList<Vehiculo>();
        List<Vehiculo> coches2 = new ArrayList<Vehiculo>();
        BufferedReader lector = null;
        String linea;
        boolean correcto;
        int deposito = 0;
        try{
            lector = new BufferedReader(new FileReader("coches.csv"));
            while ((linea = lector.readLine()) != null){

                if (!linea.equalsIgnoreCase("Matricula;Potencia;Marca;Modelo") ) {
                    String[] vector = linea.split(";");
                    do {
                        correcto = false;
                        try {
                            deposito = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del deposito para el coche con los siguientes datos " + vector[0] + " " + vector[1] + " " + vector[2] + " " + vector[3]));
                            correcto = true;
                        }catch (Exception e ) {
                            System.err.println(e.getMessage());
                            correcto = false;
                        }
                    }while(!correcto);
                    coches.add(new Vehiculo(vector[0], vector[1], vector[2], vector[3], deposito));
                }


            }
            lector.close();

            lector = new BufferedReader(new FileReader("coches2.csv"));

            while ((linea = lector.readLine()) != null){
                if (!linea.equalsIgnoreCase("Matricula;Potencia;Marca;Modelo") ) {
                    String[] vector = linea.split(";");
                    deposito = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del deposito para el coche con los siguientes datos "+vector[0] + " " + vector[1] + " " + vector[2] + " " + vector[3]));
                    coches2.add(new Vehiculo(vector[0], vector[1], vector[2], vector[3], deposito));
                }


            }

        }catch (Exception e){
            System.err.println(e.getMessage());

        }finally {
            try {
                if (lector != null){

                    lector.close();
                }
            }catch (IOException e){
                System.err.println(e.getMessage());
            }

        }


        ObjectOutputStream escribir = null;

        try {

            if (!new File("binario.dat").exists()) {

                escribir = new ObjectOutputStream(new FileOutputStream("binario.dat"));


            }else{

                escribir = new MyObjectOutputStream(new FileOutputStream("binario.dat", true));

            }
            for (Vehiculo coche : coches) {
                 escribir.writeObject(coche);
             }


        } catch (IOException e){

            System.err.println(e.getMessage());


        }finally {

            try {

                if (escribir != null){
                escribir.close();
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

        try {

            if (!new File("binario.dat").exists()) {

                escribir = new ObjectOutputStream(new FileOutputStream("binario.dat"));


            }else{

                escribir = new MyObjectOutputStream(new FileOutputStream("binario.dat", true));

            }
            for (Vehiculo coche : coches2) {
                escribir.writeObject(coche);
            }


        } catch (IOException e){

            System.err.println(e.getMessage());


        }finally {

            try {

                if (escribir != null){
                    escribir.close();
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

        ObjectInputStream leeObjetos = null;
        Object objeto;
        List<Vehiculo> coches_leidos = new ArrayList<Vehiculo>();

        try{

            leeObjetos = new ObjectInputStream(new FileInputStream("binario.dat"));


            while ((objeto = leeObjetos.readObject()) != null){//creo que lee mas de lo que debe pero no se como arreglarlo
                if (objeto instanceof Vehiculo){
                    Vehiculo carro = (Vehiculo) objeto;
                    System.out.println(carro.toString());
                    coches_leidos.add(carro);
                }
            }


        } catch (IOException e){
            System.err.println("IOException "+e.getMessage()+ " ni idea de porque sale no lo he podido arreglar");


        }catch (ClassNotFoundException e){
            System.err.println("ClassNotFoundException "+e.getMessage());

        } finally{
            if (leeObjetos != null){
                try {
                    leeObjetos.close();
                }catch (IOException e){
                    System.err.println(e.getMessage());
                }
            }
        }

        BufferedWriter escribe_csv = null;
        try{
            if(!new File("coches_deposito.csv").exists()) {
                escribe_csv = new BufferedWriter(new FileWriter("coches_deposito.csv"));
            }else {
                escribe_csv = new BufferedWriter(new FileWriter("coches_deposito.csv",true));
            }
            escribe_csv.write("matricula;potencia;marca;modelo;deposito\n");

            for (Vehiculo coche : coches_leidos){
                escribe_csv.write(coche.toString()+"\n");
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }finally {
            if (escribe_csv != null){
                try {
                    escribe_csv.close();
                }catch (IOException e){
                    System.err.println(e.getMessage());
                }
            }
        }


    }
}
