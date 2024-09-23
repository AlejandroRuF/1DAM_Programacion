public class Coche2aMano extends Coche{

    private int kms;

    public Coche2aMano(int numBastidor, String modelo, String marca, String color, float precio, boolean revisiones[], String matricula, int kms) {
        super(numBastidor, modelo, marca, color, precio, revisiones, matricula);

        setKms(kms);

    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    @Override
    public String toString(){

        return super.toString()+"\nKm: "+getKms();
    }

    //REDEFINIR toSTRING

}
