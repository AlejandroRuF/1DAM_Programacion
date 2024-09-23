import javax.swing.*;

public class Coche {

    private String marca;
    private String modelo;
    private int anyo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {

    }

    public void setAnyo(String anyo) throws Exception {

    }

    public Coche (String marca, String modelo, int anyo){

        setAnyo(anyo);
        setMarca(marca);
        setModelo(modelo);

    }

    public Coche (String marca, String modelo, String anyo) throws Exception {

        setAnyo(anyo);
        setMarca(marca);
        setModelo(modelo);

    }

    public String mostrar(){

        return ("Marca :  "+getMarca()+
        "\nModelo :  "+getModelo()+
                "\nAño:  "+getAnyo());
    }

    public void claxon(){

        JOptionPane.showMessageDialog(null,"Piiiii Piiii","Claxon",JOptionPane.WARNING_MESSAGE);
        System.out.println("Piiii Piiii");

    }


}
