import javax.swing.*;

public class Act36 {

    public static void main(String[] args) {

        double radio=0;
        double resultado;
        int opcion=0;

        do {

            opcion= Integer.parseInt(JOptionPane.showInputDialog("Elige una Opcion:\n1 : Calcular el Area de un circulo" +
                    "\n2 : Calcular el volumen de una esfera\n3 : Salir"));

            if (opcion==1 || opcion==2) {
                radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
            }
            if (opcion==1) {
                resultado = (Math.PI * (Math.pow(radio, 2)));
                JOptionPane.showMessageDialog(null,"El resultado es "+ String.valueOf(resultado),"AREA",JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcion==2) {
                resultado = (4 * (Math.PI) * (Math.pow(radio, 2)) / 3);
                JOptionPane.showMessageDialog(null,"El resultado es "+ String.valueOf(resultado),"VOLUMEN",JOptionPane.INFORMATION_MESSAGE);
            }

        }while (opcion!=3);
    }

}
