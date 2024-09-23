import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {

    private int num_DNI;
    private String nIF;

    public DNI (int num_DNI) throws Exception {

        establecer(num_DNI);

    }

    public DNI (String nIF) throws Exception {

        establecer(nIF);

    }

    public DNI(){}

    public int get_NumDNI(){

        return num_DNI;

    }
    public String get_NIF(){

        return nIF;
    }

    public void establecer(int dni) throws Exception {

        if(comprueba_DNI(dni)){
        this.num_DNI=dni;
        }

    }

    public void establecer(String NIF) throws Exception {

        if(validarNIF(NIF)){
            this.nIF=NIF;
        }else {
            throw new Exception("No has introducido los datos del NIF correctamente");
        }

    }


    private boolean comprueba_DNI(int dni) throws Exception {
        boolean dni_correcto=false;
        Pattern c_NIF =Pattern.compile("^[0-9]{8}");
        Matcher num = c_NIF.matcher(String.valueOf(dni));

        if (num.matches()){

            return true;
        }else {
            throw new Exception("No has introducido los datos del DNI correctamente");
        }

    }

    private String get_Nif(){

        return (String.valueOf(num_DNI)+(calcularLetraNIF(num_DNI)+""));
    }

    private static char extraerLetraNIF (String nif){

        return nif.charAt(9);
    }

    private static char calcularLetraNIF (int dni){
        char[] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letra[(dni)%23];
    }
    private boolean validarNIF (String nif) {
        boolean letra_correcta = false;
        boolean correcto = false;
        try {

            Pattern c_NIF = Pattern.compile("^[0-9]{8}[a-zA-Z]$");
            Matcher num = c_NIF.matcher(nif);
            correcto = num.matches();
            String nif_sinLetra = String.valueOf(extraerNumeroNIF(nif));
            if (calcularLetraNIF(Integer.parseInt(nif_sinLetra)) == nif.charAt(8)) {
                letra_correcta = true;
            }
        } catch (Exception e) {
            letra_correcta = false;
        }

        if (correcto && letra_correcta) {

            return true;
        } else {
            return false;
        }
    }
        private static int extraerNumeroNIF (String nif){

            return Integer.parseInt(nif.substring(0,8));
        }

}

