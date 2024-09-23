public class Concursante {


    private String nombre_Completo;
    private String nombre_Artistico;
    private String domicilio;
    private String anyo_Nacimiento;

    public String getNombre_Completo() {
        return nombre_Completo;
    }

    public void setNombre_Completo(Nombre nombre_Completo) {
        String nom= nombre_Completo.getNombre()+" "+ nombre_Completo.getPrimerApellido()+" "+ nombre_Completo.getSegundoApellido();
        this.nombre_Completo = nom;
    }

    public String getNombre_Artistico() {
        return nombre_Artistico;
    }

    public void setNombre_Artistico(String nombre_Artistico) {
        this.nombre_Artistico = nombre_Artistico;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        String dom = domicilio.getCalle()+" "+domicilio.getNumero()+" "+domicilio.getPiso()+" "+domicilio.getPuerta()+" "+domicilio.getCodigo_postal()+" "+domicilio.getPoblacion();
        this.domicilio = dom;
    }

    public String getAnyo_Nacimiento() {
        return anyo_Nacimiento;
    }

    public void setAnyo_Nacimiento(Fecha anyo_Nacimiento) {
        String fecha = anyo_Nacimiento.getDia()+"/"+anyo_Nacimiento.getMes()+"/"+anyo_Nacimiento.getAnyo();
        this.anyo_Nacimiento = fecha;
    }

    public String mostrar(){

        return ("Nombre: "+getNombre_Completo()+"\nConocido como "+getNombre_Artistico()+"\nVive en : "+getDomicilio()+"\nNacio el : "+getAnyo_Nacimiento());

    }



    public Concursante(Nombre nombre_Completo, String nombre_Artistico, Domicilio domicilio, Fecha anyo_Nacimiento) {
        this.nombre_Artistico = nombre_Artistico;
        setAnyo_Nacimiento(anyo_Nacimiento);
        setDomicilio(domicilio);
        setNombre_Completo(nombre_Completo);

    }




}
