import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hora {

    private int hora;
    private int minutos;

    private int contador;
    public int get_Hora(){
        return this.hora;
    }

    public int get_minutos(){

        return this.minutos;
    }

    public void adelantar(int minutos){
        minutos=this.minutos+minutos;
        this.minutos=0;

        if (minutos>59){

            set_hora(1);
            adelantar(minutos-60);



        }else {

            this.minutos=minutos;

        }

    }
    public void atrasar(int minutos){

        if (this.contador==0){
        minutos = this.minutos - minutos;
        this.minutos=0;
        }

        if (minutos<0){

            contador++;
            set_hora(-1);
            atrasar(minutos+60);



        }else {

            this.minutos=minutos;
            contador=0;
        }

    }

    public void set_hora(int hora){
        hora=this.hora+hora;
        this.hora=0;

        if ((hora)>23) {

            set_hora(hora - 24);

        } else if (hora<0) {

            set_hora(hora+24);

        }else{

            this.hora=hora;

        }

    }

    public void comprueba_hora(int hora) throws Exception {

        if (hora>23){

            throw new Exception("Debes introducir un formato de hora correcto(Numero entero menor a 24)");

        }else{

            this.hora=hora;

        }

    }
    public void comprueba_minutos(int minutos) throws Exception {

        if (minutos>59){

            throw new Exception("Debes introducir un formato de minutos correcto(Numero entero menor a 60)");

        }else {

            this.minutos=minutos;

        }

    }

    public boolean comprobar_formato(String hreloj) throws Exception {

        Pattern fhora = Pattern.compile("^[0-9]{1,2}:[0-9]{1,2}$");
        Matcher chora = fhora.matcher(hreloj);

        if (chora.matches()){

            return true;

        }else {
            throw new Exception("El formato debe ser HH:MM");
        }

    }
    public Hora(String hora) throws Exception{

        if(comprobar_formato(hora)){

            String[] horymin = hora.split(":");
            comprueba_hora(Integer.parseInt(horymin[0]));
            comprueba_minutos(Integer.parseInt(horymin[1]));

        }

    }

    public String devolver_hora(){

        if (this.hora<10) {

            if (this.minutos < 10) {

                return "0" + this.hora + ":" + "0" + this.minutos;

            } else {

                return "0" + this.hora + ":" + this.minutos;

            }
        }else {

            if (this.minutos < 10) {

                return this.hora + ":" + "0" + this.minutos;

            } else {

                return this.hora + ":" + this.minutos;

            }

            }
    }

    public String convertir(){
        int hora;
        int minutos;
        if(this.hora>12) {

            hora = this.hora - 12;

            if (this.minutos < 10) {

                return hora + ":" +"0"+ this.minutos + " P.M.";

            } else {

                return hora + ":" + this.minutos + " P.M.";

            }

        } else if (this.hora==0) {

            hora = 0;

            if (this.minutos < 10) {

                return hora + ":" +"0"+ this.minutos + " P.M.";

            } else {

                return hora + ":" + this.minutos + " P.M.";

            }

        }

        else {

            hora = this.hora;
            if (this.minutos < 10) {

                return hora + ":" +"0"+ this.minutos + " A.M.";

            } else {

                return hora + ":" + this.minutos + " A.M.";

            }

        }
    }

    public void ponerHora(String hora) throws Exception {

        if(comprobar_formato(hora)){

            String[] horymin = hora.split(":");
            comprueba_hora(Integer.parseInt(horymin[0]));
            comprueba_minutos(Integer.parseInt(horymin[1]));

        }

    }
}


