import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Rectangulo {

    private double x1=0;
    private double x2=0;
    private double y1=0;
    private double y2=0;
    private static final double PI= 3.1416;
    private String nombre, nombre_Figura;
    private static int num_Rectangulos =0;

    private String marcaSet;

    private double comprueba(String dig) {

        Pattern digitos = Pattern.compile("^[0-9]*[.]?[0-9]{0,2}$");
        Matcher digDecim = digitos.matcher(dig);
        if (digDecim.matches()) {

            return Double.parseDouble(dig);

        } else {
            switch (marcaSet) {

                case "x1":
                    return dame_X1();

                case "x2":
                    return dame_X2();

                case "y1":
                    return dame_Y1();

                case "y2":
                    return dame_Y2();

                default:
                    return 0;
            }
        }
    }

    public double dame_X1(){
       return x1;
    }

    public double dame_X2(){
        return x2;
    }
    public double dame_Y1(){
        return y1;
    }

    public double dame_Y2(){
        return y2;
    }

    public void set_X1(String num){

        marcaSet="x1";
        x1=comprueba(num);
    }
    public void set_X2(String num){
        marcaSet="x2";
        x2=comprueba(num);
    }
    public void set_Y1(String num){
        marcaSet="y1";
        y1=comprueba(num);
    }
    public void set_Y2(String num){
        marcaSet="y2";
        y2=comprueba(num);
    }
    public int get_NumRectangulos(){
        return num_Rectangulos;
    }


    public String get_nombre(){
        return nombre;
    }
    public String get_Nombre_Figura(){
        return nombre_Figura;
    }
    public void set_nombre(String nombre){
        this.nombre=nombre;
    }

    public double area(){
        return (x1*y1);
    }
    public double superficie(){
        return (x1+x2+y1+y2);
    }

    Rectangulo(double x1,double x2, double y1, double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        Rectangulo.num_Rectangulos++;

    }

}
