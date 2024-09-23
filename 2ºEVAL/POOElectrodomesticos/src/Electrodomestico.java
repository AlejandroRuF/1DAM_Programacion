public class Electrodomestico {

    protected double precio;
    protected final double PRECIO_DEFAULT = 100;
    protected String color;
    protected static final String COLOR_DEFAULT = "Blanco";
    protected char consumoE;
    protected static final char CONSUMOE_DEFAULT = 'F';
    protected int peso;
    protected final int PESO_DEFAULT = 5;



    public Electrodomestico(){
        this.color = COLOR_DEFAULT;
        this.consumoE = CONSUMOE_DEFAULT;
        this.peso = PESO_DEFAULT;
        this.precio = PRECIO_DEFAULT;
        precioFinal();
    }


    public Electrodomestico(double precio, String color, char consumoE, int peso) {

        if (comprobarConsumoEnergetico(consumoE)) {
            this.consumoE = consumoE;

        } else {

            this.consumoE = CONSUMOE_DEFAULT;

        }
        if (comprobarColor(color)) {

            this.color = color;

        } else {

            this.color = COLOR_DEFAULT;

        }
        this.precio = precio;
        this.peso = peso;
        precioFinal();
    }

    public Electrodomestico(double precio, int peso) {
        this(precio, COLOR_DEFAULT, CONSUMOE_DEFAULT, peso);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    private boolean comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return true;
        } else {
            return false;
        }
    }

    public char getConsumoE() {
        return consumoE;
    }

    private boolean comprobarConsumoEnergetico(char consumo) {
        String consumoE = consumo + "";
        if (consumoE.equalsIgnoreCase("A") || consumoE.equalsIgnoreCase("B") || consumoE.equalsIgnoreCase("C") || consumoE.equalsIgnoreCase("D") || consumoE.equalsIgnoreCase("E") || consumoE.equalsIgnoreCase("F")) {
            return true;
        } else {
            return false;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPRECIO_DEFAULT() {
        return PRECIO_DEFAULT;
    }

    public String getCOLOR_DEFAULT() {
        return COLOR_DEFAULT;
    }

    public char getCONSUMOE_DEFAULT() {
        return CONSUMOE_DEFAULT;
    }

    public int getPESO_DEFAULT() {
        return PESO_DEFAULT;
    }

    public void precioFinal() {

        if (this.consumoE == 'A') {

            this.precio += 100;

        } else if (this.consumoE == 'B') {

            this.precio += 80;

        } else if (this.consumoE == 'C') {

            this.precio += 60;

        } else if (this.consumoE == 'D') {

            this.precio += 50;
        } else if (this.consumoE == 'E') {

            this.precio += 30;
        } else if (this.consumoE == 'F') {

            this.precio += 10;

        }

        if (this.peso >= 0 && this.peso <= 19){

            this.precio += 10;

        }else if (this.peso >= 20 && this.peso <= 49){

            this.precio += 50;

        }else if (this.peso >= 50 && this.peso <= 79){

            this.precio += 80;

        }else if (this.peso >= 80){

            this.precio += 100;

        }
    }
}
