package Act2;

import java.util.ArrayList;
import java.util.Arrays;

public class Receta {

    protected String nombre;
    protected String categoria;
    protected final static ArrayList<String> CATEGORIAS = new ArrayList<String>(Arrays.asList("pasta","carnes","arroces","pescado","sopas","verduras"));
    protected int calorias;

    public Receta(String nombre, String categoria, int calorias) throws Exception {
        this.nombre = "";
        setNombre(nombre);
        setCategoria(categoria);
        this.calorias = 0;
        setCalorias(calorias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws Exception {
        if (CATEGORIAS.contains(categoria.toLowerCase())){

            this.categoria = categoria.toLowerCase();

        }else{

            throw new Exception("La categoria indicada no pertenece a las permitidas");

        }
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
