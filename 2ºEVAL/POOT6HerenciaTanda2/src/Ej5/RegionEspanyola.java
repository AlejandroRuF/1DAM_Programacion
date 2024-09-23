package Ej5;

public class RegionEspanyola extends Region{


    public RegionEspanyola(String nombreRegion) {
        super(nombreRegion);
    }

    @Override
    public String formatear(int dia, int mes, int anyo) {
        return dia+"/"+mes+"/"+anyo;
    }
}
