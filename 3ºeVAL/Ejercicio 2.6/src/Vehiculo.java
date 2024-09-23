import java.io.Serializable;

public class Vehiculo implements Serializable {

    private String matricula;
    private int potencia;
    private String marca;
    private String modelo;
    private int tamanyoDeposito;

    public Vehiculo(String matricula, int potencia, String marca, String modelo, int tamanyoDeposito) {
        setMatricula(matricula);
        setPotencia(potencia);
        setMarca(marca);
        setModelo(modelo);
        setTamanyoDeposito(tamanyoDeposito);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

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

    public int getTamanyoDeposito(){
        return tamanyoDeposito;
    }

    public void setTamanyoDeposito(int tamanyoDeposito){
        if (tamanyoDeposito <= 0 || tamanyoDeposito > 100)  {
            throw new RuntimeException("El tamaño del deposito debe ser de 1 a 100 litros.");
        }
        this.tamanyoDeposito = tamanyoDeposito;
    }

    public String toString() {
        return "Matricula: " + matricula + ", Potencia: " + potencia + ", Marca: " + marca + ", Modelo: " + modelo + ", Tamaño del deposito: " + tamanyoDeposito;
    }

}
