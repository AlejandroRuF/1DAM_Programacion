import java.util.ArrayList;
import java.util.Arrays;

public class Television extends Electrodomestico implements Alexa {

    private int resolucion;
    private static final int RESOLUCION_DEFAULT = 32;
    private boolean smartTV;
    private static final boolean SMARTTV_DEFAULT = false;
    private String canal;
    private static final String CANAL_DEFAULT = "La 1 HD";
    private static final ArrayList<String> canales = new ArrayList<String>(
            Arrays.asList("La 1 HD","La 2 HD","TD HD",
                    "Antena 3 HD","Telecinco HD","Netflix","HBO",
                    "Amazon Prime"));

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.smartTV = SMARTTV_DEFAULT;
        this.canal = CANAL_DEFAULT;
        precioFinal();
    }

    public Television(int resolucion, boolean smart, String canal ) {
        super();
        this.resolucion = resolucion;
        this.smartTV = smart;
        this.canal = canal;
        precioFinal();
    }

    public Television(double precio, int peso) {
        super(precio, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.smartTV = SMARTTV_DEFAULT;
        this.canal = CANAL_DEFAULT;
        precioFinal();
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public String getCanal() {
        return canal;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (this.resolucion > 40){

            this.precio += (this.precio*0.30);

        }
        if (this.smartTV){

            this.precio += 50;

        }

    }

    @Override
    public void dimeAlexa() {

        if (this.smartTV){

            for (int i = 0; i < this.canales.size(); i++) {

                System.out.println(this.canales.get(i));

            }

        }else {

            System.out.println("Esta Televisión no tiene SmartTV");

        }

    }
}
