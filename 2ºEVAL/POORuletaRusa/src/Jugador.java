public class Jugador {

    public int id;
    public static int numJugs = 0;
    public String nombre;
    public boolean vivo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        numJugs++;
        this.id = numJugs;
        this.vivo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

   public void disparar(Revolver r){
        boolean disparo = r.disparar();

        if (disparo){

            this.vivo = false;
            System.out.println(getNombre()+" ha muerto");

        }else {

            System.out.println(getNombre()+" tiene suerte por esta vez");

        }

   }
}
