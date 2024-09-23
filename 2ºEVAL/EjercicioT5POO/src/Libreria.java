import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Libreria {

    private String codigo;
    private String titulo;

    private String autor = "Indeterminado";

    private int num_Paginas;

    private static int num_libros = 0;

    public String get_codigo(){

        return this.codigo;

    }

    public Libreria(String codigo, String titulo) throws Exception {

        set_codigo(codigo);
        set_Titulo(titulo);
        num_libros++;

    }

    public Libreria(String codigo, String titulo, String autor) throws Exception {

        set_codigo(codigo);
        set_Titulo(titulo);
        set_Autor(autor);
        num_libros++;

    }

    public Libreria(String codigo, String titulo, String autor, int paginas) throws Exception {

        set_codigo(codigo);
        set_Titulo(titulo);
        set_Autor(autor);
        set_NumPaginas(paginas);
        num_libros++;

    }

    public void set_codigo(String codigo) throws Exception {

        Pattern pCode = Pattern.compile("[0-9A-Za-z]{5}");
        Matcher comprueba_Code = pCode.matcher(codigo);

        if (comprueba_Code.matches()){

            this.codigo = codigo;

        }else{
            System.out.println(codigo);
            throw new Exception("El codigo debe ser un dato alfanumerico de 5 cifras");

        }


    }

    public String get_Titulo(){

        return this.titulo;

    }

    public void set_Titulo(String titulo) throws Exception {

        Pattern pTitulo = Pattern.compile("[^/*\\-+]");
        Matcher cTitulo = pTitulo.matcher(titulo);

        if (cTitulo.find()){

            this.titulo = titulo;

        }else {

            throw new Exception ("No se permiten los caracteres '-*/+=' en el titulo");

        }

    }

    public String get_Autor(){

        return this.autor;

    }

    public void set_Autor(String autor){

        this.autor = autor;

    }

    public int getNum_Paginas(){

        return this.num_Paginas;

    }

    public void set_NumPaginas(int numPaginas){

        this.num_Paginas = numPaginas;

    }

    public static int getNum_libros(){

        return num_libros;

    }

    public void mostrar(){

        System.out.println("El libro "+get_Titulo()+" tiene el codigo "+get_codigo()+" el autor es "+get_Autor());

    }

}
