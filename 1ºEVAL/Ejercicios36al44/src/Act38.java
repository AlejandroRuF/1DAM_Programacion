import javax.swing.*;

public class Act38 {

    public static void main(String[] args) {

        double radio=0;
        double resultado;
        double base=0;
        double altura=0;
        double perimetro=0;
        int opcion;

        do {

            opcion= Integer.parseInt(JOptionPane.showInputDialog("Elige una Opcion:\n1 : Calcular el Area y perimetro de un circulo" +
                    "\n2 : Calcular el Area y perimetro de un rectangulo" +
                    "\n3 : Calcular el Area y perimetro de un cuadrado" +
                    "\n4 : Calcular el Area y perimetro de un rombo" +
                    "\n5 : Calcular el Area y perimetro de un triangulo\n6 : Salir"));

            if (opcion==1) {
                radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
            }

            if (opcion!=6&&opcion!=1){

                base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
                perimetro=(base*2)+(altura*2);

            }

            if (opcion==1) {
                resultado = (Math.PI * (Math.pow(radio, 2)));
                perimetro=2*Math.PI*radio;
                JOptionPane.showMessageDialog(null,"El area es "+ String.valueOf(resultado),"AREA",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"El perimetro es "+ String.valueOf(perimetro),"PERIMETRO",JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcion==2) {
                resultado = base*altura;
                JOptionPane.showMessageDialog(null,"El area es "+ String.valueOf(resultado),"AREA",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"El perimetro es "+ String.valueOf(perimetro),"PERIMETRO",JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcion==3) {
                resultado =base*altura;
                JOptionPane.showMessageDialog(null,"El area es "+ String.valueOf(resultado),"AREA",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"El perimetro es "+ String.valueOf(perimetro),"PERIMETRO",JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcion==4) {
                resultado =base*altura;
                JOptionPane.showMessageDialog(null,"El area es "+ String.valueOf(resultado),"AREA",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"El perimetro es "+ String.valueOf(perimetro),"PERIMETRO",JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcion==5) {
                resultado =(base*altura)/2;
                JOptionPane.showMessageDialog(null,"El area es "+ String.valueOf(resultado),"AREA",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"El perimetro es "+ String.valueOf(perimetro),"PERIMETRO",JOptionPane.INFORMATION_MESSAGE);
            }


        }while (opcion!=6);
    }

}
