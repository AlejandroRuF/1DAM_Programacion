import java.util.ArrayList;
import java.util.Arrays;

public class Coche extends Vehiculo{

    private String matricula;
    private boolean[] revisiones = new boolean[5];

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean[] getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(boolean[] revisiones) {


        for (int i = 0; i < this.revisiones.length; i++) {

            this.revisiones[i]=revisiones[i];

        }
    }



    public Coche(int numBastidor, String modelo, String marca, String color, float precio, boolean revisiones[], String matricula) {
        super(numBastidor, modelo, marca, color, precio);

        setMatricula(matricula);
        setRevisiones(revisiones);
    }

    public void revisiones(int numRev) throws Exception {

        if (getRevisiones().length <= numRev){

            getRevisiones()[numRev]=true;

        }else {

            throw new Exception("El maximo de revisiones que existe es 5");
        }

    }

    //public static void mostrarKms(ArrayList<Coche> coche)


    public void revisar(boolean rev[]) throws Exception {

        if (rev.length == this.revisiones.length){

            for (int i = 0; i < this.revisiones.length; i++) {

                this.revisiones[i]=rev[i];

            }

        }else{

            throw new Exception("Las dos listas no coinciden en su longitud");

        }


    }

    public String recorrer(){
        String conc="";
        for (int i = 0; i < getRevisiones().length; i++) {

            conc += "\n     "+(i+1)+"-"+String.valueOf(getRevisiones()[i]);

        }
        return conc;

    }

    //COMO SE REDEFINE EL toSTRING?????
    @Override
    public String toString(){

        return super.toString()+"\nMatricula: "+getMatricula()+ "\nRevisiones: "+recorrer()+"\nResultado revisiones: "+revision();

    }

    public String revision(){

        boolean ok= true;
        for (int i = 0; i < this.getRevisiones().length; i++) {

            if (!this.getRevisiones()[i]){

                ok = false;

            }

        }
        return (ok)?"Pasa la revision":"No ha pasado todas las revisiones";
    }



}
