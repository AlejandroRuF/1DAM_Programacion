public class Vehiculo {

    private int numBastidor;
    private String Modelo;
    private String marca;
    private String color;
    private float precio;


    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {

        return "Num Bastidor: " + getNumBastidor() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nColor: " + getColor() + "\nPrecio: " + getPrecio();
    }


    public Vehiculo(int numBastidor, String modelo, String marca, String color, float precio) {
        setNumBastidor(numBastidor);
        setModelo(modelo);
        setMarca(marca);
        setColor(color);
        setPrecio(precio);

    }
}