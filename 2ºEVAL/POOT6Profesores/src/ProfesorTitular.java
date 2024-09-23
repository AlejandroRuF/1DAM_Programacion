import java.util.Calendar;
import java.util.GregorianCalendar;


public class ProfesorTitular extends Profesor{
    private Calendar comienzoTitularidad;

    public ProfesorTitular(String nombre, String apellidos, int edad) {
        this(nombre, apellidos, edad,"Desconocido");
    }

    public ProfesorTitular(String nombre, String apellidos, int edad, String id_profesor) {
        super(nombre, apellidos, edad, id_profesor);
        //this.comienzoTitularidad = GregorianCalendar.getInstance();
        setComienzoTitularidad(GregorianCalendar.getInstance());
    }


    public Calendar getComienzoTitularidad() {
        return comienzoTitularidad;
    }

    public String getComienzoTitularidadString(){
        return getComienzoTitularidad().getTime().toString();
    }

    public void setComienzoTitularidad(Calendar comienzoTitularidad) {
        this.comienzoTitularidad = comienzoTitularidad;
    }

    @Override
    public void  mostrarDatos(){

        super.mostrarDatos();
        System.out.println("Fecha titularidad --> "+this.getComienzoTitularidadString()+"\n");

    }

}
