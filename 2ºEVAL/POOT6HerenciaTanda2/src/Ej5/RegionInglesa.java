package Ej5;

public class RegionInglesa extends Region{


    public RegionInglesa(String nombreRegion) {
        super(nombreRegion);
    }

    @Override
    public String formatear(int dia, int mes, int anyo) {
        return mes+"/"+dia+"/"+anyo;
    }

}
