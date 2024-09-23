import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println(fecha);

        Calendar formato_Fecha = Calendar.getInstance();
        System.out.println("getTime" +
                " ---> "+formato_Fecha.getTime());
        formato_Fecha.set(2019,11,1,15,59,00);

        System.out.println("set ---> "+formato_Fecha.getTime());
        fecha = formato_Fecha.getTime();
        System.out.println("getTime ---> "+fecha);

        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss EEEE, dd MMMM yyyy");

        System.out.println(formato.format(fecha));

    }
}