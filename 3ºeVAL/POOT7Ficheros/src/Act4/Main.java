package Act4;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        boolean isnumero = true;
        String numero;
        String ruta;
        ArrayList<String> generaNum = new ArrayList<String>();
        int aleatorio;

            do {

                ruta = JOptionPane.showInputDialog("Introduce el nombre para generar el archivo de texto recuerda que debe finalizar por '.txt'");

            }while (!ruta.matches(".*\\.txt$"));
        boolean salir;
        do {
            salir = false;
            do {

                isnumero = true;
                numero = (JOptionPane.showInputDialog("Introduce el numero de numeros aleatorios que se generaran (Solo numeros enteros) escribe s para salir"));
                if (numero.equalsIgnoreCase("s")){
                    salir = true;
                }else {
                    try {
                        Integer.parseInt(numero);
                        if (Integer.parseInt(numero) <= 0){
                            throw new Exception("El numero debe ser positivo");
                        }

                    } catch (Exception e) {
                        isnumero = false;
                        JOptionPane.showMessageDialog(null,"Introduce un numero positivo valido","ERROR",JOptionPane.WARNING_MESSAGE);

                    }
                    for (int i = 0; i < Integer.parseInt(numero); i++) {

                        aleatorio = (int) (Math.random()*100);
                        generaNum.add(String.valueOf(aleatorio));

                    }
                }
            }while (!isnumero);

        }while(!salir);

        try {

            FileOutputStream ficheroA_Escribir = new FileOutputStream(ruta,true);
            DataOutputStream escribir = new DataOutputStream(ficheroA_Escribir);

            for (int i = 0; i < generaNum.size(); i++) {

                escribir.writeUTF(generaNum.get(i));



            }
            escribir.flush();
            escribir.close();
            ficheroA_Escribir.close();
        }catch (Exception e){

            JOptionPane.showMessageDialog(null,e,"ERROR",JOptionPane.WARNING_MESSAGE);

        }

        String data = "";
        try {

            FileInputStream fichero_leer = new FileInputStream(ruta);
            DataInputStream leer = new DataInputStream(fichero_leer);

            while (leer.available() > 0){

                System.out.println(leer.readUTF());

            }
            leer.close();
            fichero_leer.close();

        }catch (Exception e2){
            System.out.println(e2);
            JOptionPane.showMessageDialog(null,e2,"ERROR",JOptionPane.WARNING_MESSAGE);
        }

    }

}
