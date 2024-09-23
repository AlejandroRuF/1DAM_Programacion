package Ej5;

abstract class Region implements IFecha {

    protected String nombreRegion;

    public Region(String nombreRegion) {

        setNombreRegion(nombreRegion);

    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }


}
