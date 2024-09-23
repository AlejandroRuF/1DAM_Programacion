package Act6;

import java.io.Serializable;

public class Vehiculo implements Serializable {

    String matricula;
    String marca;
    String modelo;
    String potencia;
    int deposito;

    public Vehiculo(String matricula,String potencia, String marca, String modelo,  int deposito) {
        setMatricula(matricula);
        setMarca(marca);
        setModelo(modelo);
        setPotencia(potencia);
        setDeposito(deposito);
    }

    @Override
    public String toString() {
        return getMatricula()+";"+getPotencia()+";"+getMarca()+";"+getModelo()+";"+getDeposito();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
