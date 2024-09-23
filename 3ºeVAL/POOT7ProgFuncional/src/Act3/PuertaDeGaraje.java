package Act3;

public class PuertaDeGaraje extends ElementoDomotico implements Bloqueable{

    public boolean bloqueado = false;

    public boolean isBloqueado() {
        return bloqueado;
    }

    public PuertaDeGaraje() {
        this.bloqueado = false;
        this.nombre = "Puerta de garaje";
        this.estado_Actual = true;
    }

    @Override
    void interruptor() {
        if (!this.bloqueado) {
            this.estado_Actual = !this.estado_Actual;
        }
    }

    @Override
    String estado() {
        if(this.estado_Actual){
            return "Abierto";
        }else {
            return "Cerrado";
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
        return "PuertaDeGaraje{" +
                "bloqueado=" + bloqueado +
                ", estado_Actual=" + estado() +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
