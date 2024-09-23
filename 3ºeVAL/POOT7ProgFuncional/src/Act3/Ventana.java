package Act3;

public class Ventana extends ElementoDomotico implements Bloqueable {

    public boolean bloqueado = false;

    public Ventana() {
        this.bloqueado = false;
        this.nombre = "Ventana";
        this.estado_Actual = true;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    void interruptor() {
        if (!this.bloqueado) {
            this.estado_Actual = !this.estado_Actual;
        }

    }

    @Override
    String estado() {
        if (this.estado_Actual) {
            return "Subida";
        } else {
            return "Bajada";
        }
    }



    @Override
    public void bloquear() {
        this.bloqueado = true;
    }

    @Override
    public void desbloquear() {
        this.bloqueado = false;
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "bloqueado=" + bloqueado +
                ", estado_Actual=" + estado() +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
