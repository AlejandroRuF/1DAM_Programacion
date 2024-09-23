package Act3;

public class Calefaccion extends ElementoDomotico{

    private double tempDeseada;

    public Calefaccion() {
        this.tempDeseada = 22;
        this.nombre = "Calefaccion";
        this.estado_Actual = true;
    }

    public double getTempDeseada() {
        return tempDeseada;
    }

    public void setTempDeseada(double tempDeseada) {
        this.tempDeseada = tempDeseada;
    }

    @Override
    void interruptor() {
            this.estado_Actual = !this.estado_Actual;
    }

    @Override
    String estado() {
        if(this.estado_Actual){
            return "Encendido";
        }else {
            return "Apagado";
        }
    }

    @Override
    public String toString() {
        return "Calefaccion{" +
                "tempDeseada=" + tempDeseada +
                ", estado_Actual=" + estado() +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
