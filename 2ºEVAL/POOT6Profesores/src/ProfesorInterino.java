import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProfesorInterino extends Profesor{


    private Calendar comienzaoInterinidad;

    public ProfesorInterino(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.comienzaoInterinidad = GregorianCalendar.getInstance();
    }

    public ProfesorInterino(String nombre, String apellidos, int edad, String id_profesor) {
        super(nombre, apellidos, edad, id_profesor);
        this.comienzaoInterinidad = GregorianCalendar.getInstance();
    }

    public Calendar getComienzaoInterinidad() {
        return comienzaoInterinidad;
    }
    public String getComienzoInterinidadString(){
        return getComienzaoInterinidad().getTime().toString();
    }

    public void setComienzaoInterinidad(Calendar comienzaoInterinidad) {
        this.comienzaoInterinidad = comienzaoInterinidad;
    }

    @Override
    public void mostrarDatos(){

        super.mostrarDatos();
        System.out.println("Fecha interino -->"+ getComienzoInterinidadString()+"\n");

    }
}
