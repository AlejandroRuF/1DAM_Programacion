import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void anyadirCoches(ArrayList<Vehiculo> vehiculos, BufferedReader bfreader) throws IOException {

        try {
            bfreader.readLine();
            while (bfreader.ready()) {
                String[] split = bfreader.readLine().split(",");
                String depositoString = JOptionPane.showInputDialog(null, "Introduce la capacidad del depósito de 1 a 100 litros para el coche: \n" + split[2] + " " + split[3]);
                int deposito = Integer.parseInt(depositoString);
                vehiculos.add(new Vehiculo(split[0], Integer.parseInt(split[1]), split[2], split[3], deposito));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bfreader != null) {
                bfreader.close();
            }
        }
    }

    public static void escribirObjectOutputStream(ArrayList<Vehiculo> vehiculos) throws IOException {

        if (!new File("coches_deposito.csv").exists()) {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coches_deposito.csv"));

            for (Vehiculo coche : vehiculos) {
                oos.writeObject(coche);
            }
        }else{
            MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream("coches_deposito.csv", true));

            for (Vehiculo coche : vehiculos) {
                oos.writeObject(coche);
            }
        }
    }

    public static void leerObjectInputStream() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("coches_deposito.csv"));

        try {
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (EOFException ignored){
        }
    }

    public static void main(String[] args) {

        //LEO CON BUFFEREDREADER COCHES.CSV Y METO LOS COCHES EN UN ARRAYLIST
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        BufferedReader bfreader;
        try {
            bfreader = new BufferedReader(new FileReader("coches.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            anyadirCoches(vehiculos, bfreader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //ESCRIBO CON OBJECTOUTPUTSTREAM COCHES.CSV SI NO EXISTE EL ARCHIVO, SI EXISTE UTILIZO MIOBJECTOUTPUTSTREAM PARA NO PONER CABECERA

        try {
            escribirObjectOutputStream(vehiculos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //LEO Y MUESTRO POR PANTALLA LOS COCHES ESCRITOS EN EL FICHERO COCHES_DEPOSITO.CSV

        try {
            leerObjectInputStream();
            System.out.println("********************************************************");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        JOptionPane.showMessageDialog(null, "Fichero COCHES.CSV añadido a COCHES_DEPOSITO.CSV\nProcedemos a añadir el fichero COCHES2.CSV", "Mensaje", JOptionPane.INFORMATION_MESSAGE);


        //LEO CON BUFFEREDREADER COCHES2.CSV Y METO LOS COCHES EN UN ARRAYLIST

        ArrayList<Vehiculo> vehiculos2 = new ArrayList<>();
        BufferedReader bfreader2;
        try {
            bfreader2 = new BufferedReader(new FileReader("coches2.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            anyadirCoches(vehiculos2, bfreader2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //ESCRIBO CON OBJECTOUTPUTSTREAM COCHES2.CSV SI NO EXISTE EL ARCHIVO, SI EXISTE UTILIZO MIOBJECTOUTPUTSTREAM PARA NO PONER CABECERA

        try {
            escribirObjectOutputStream(vehiculos2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //LEO Y MUESTRO POR PANTALLA LOS COCHES ESCRITOS EN EL FICHERO COCHES_DEPOSITO.CSV

        try {
            leerObjectInputStream();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("***** FICHEROS COCHES.CSV Y COCHES2.CSV AÑADIDOS A COCHES_DEPOSITO.CSV *****");
    }
}