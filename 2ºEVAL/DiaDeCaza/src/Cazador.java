public class Cazador implements Comportamiento{

      private String nombre;
      private int edad;
      private String escopeta;
    protected final static String[] ACCION = {"Caminar","Esperar","Hablar","Comer","Beber","Conducir","Disparar" };

    public Cazador(String nombre, int edad, String escopeta) {
        setNombre(nombre);
        setEdad(edad);
        setEscopeta(escopeta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEscopeta() {
        return escopeta;
    }

    public void setEscopeta(String escopeta) {
        this.escopeta = escopeta;
    }

    @Override
    public String Accion() {
        int eleccion = (int) (Math.random()*7);

        return ACCION[eleccion];
    }

    @Override
    public String toString(){

        return ("El cazador "+getNombre()+" tiene "+getEdad()+" años y lleva la escopeta "+getEscopeta());

    }


}
