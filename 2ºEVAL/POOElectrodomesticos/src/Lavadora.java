import java.util.ArrayList;
import java.util.Arrays;

public class Lavadora extends Electrodomestico implements Alexa{

    private int carga;
    private static final int CARGA_DEFAULT = 5;
    private boolean inteligente;
    private static final boolean INTELIGENTE_DEFAULT = false;
    private String programa;
    private static final String PROGRAMA_DEFAULT= "Economico";

    private static final ArrayList<String> programas = new ArrayList<String>(
            Arrays.asList("Económico","Lana","Algodón",
                    "Sintéticos","Ropa Oscura","Rápido","Sport"));


    public Lavadora(double precio, String color, char consumoE, int peso, int carga, boolean inteligente, String programa) {
        super(precio,color,consumoE,peso);
        this.carga = carga;
        this.inteligente = inteligente;
        this.programa = programa;
        precioFinal();
    }

    public Lavadora( int carga, boolean inteligente, String programa) {

       super();
       this.carga = carga;
       this.inteligente = inteligente;
       this.programa = programa;
       precioFinal();

    }
    public Lavadora(){

        this.carga = CARGA_DEFAULT;
        this.peso =  PESO_DEFAULT;
        this.consumoE = CONSUMOE_DEFAULT;
        this.precio = PRECIO_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.inteligente = INTELIGENTE_DEFAULT;
        this.programa= PROGRAMA_DEFAULT;
        precioFinal();

    }

    public Lavadora(double precio, int peso) {
        super(precio, peso);
        this.inteligente = INTELIGENTE_DEFAULT;
        this.programa = PROGRAMA_DEFAULT;
        this.carga = CARGA_DEFAULT;
        this.consumoE = getCONSUMOE_DEFAULT();
        precioFinal();

    }



    public int getCarga() {
        return carga;
    }


    public boolean isInteligente() {
        return inteligente;
    }


    public String getPrograma() {
        return programa;
    }

    @Override
    public void precioFinal() {

        super.precioFinal();

        if (this.carga > 30){

            this.precio += 50;

        }
        if (this.inteligente){

            this.precio += 25;

        }

    }


    @Override
    public void dimeAlexa() {

        if (this.inteligente){

            for (int i = 0; i < this.programas.size(); i++) {

                System.out.println(this.programas.get(i));

            }

        }else {

            System.out.println("Esta Lavadora no es inteligente");

        }

    }
}



