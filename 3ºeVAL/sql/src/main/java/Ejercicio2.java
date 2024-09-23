import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2 {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "alex";
        String pass = "asd123456";
        String url = "jdbc:mysql://192.168.59.235:3306/comida";

        Connection con = null;
        Statement sentencia = null;

        try{

            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pass);


            String sql =
                    "CREATE TABLE IF NOT EXISTS Recetas (\n" +
                            "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                            "    Nombre VARCHAR(100),\n" +
                            "    Calorias INT\n" +
                            ") AUTO_INCREMENT = 1";


            System.out.println(sql);
            sentencia = con.createStatement();
            sentencia.executeUpdate("DROP TABLE IF EXISTS IngredientesRecetas");
            sentencia.executeUpdate("DROP TABLE IF EXISTS Recetas");
            int filas = sentencia.executeUpdate(sql);
            System.out.println("Filas afectadas "+filas);

            sql = "CREATE TABLE IF NOT EXISTS IngredientesRecetas (\n" +
                    "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                    "    Receta_id INT,\n" +
                    "    Ingrediente VARCHAR(100),\n" +
                    "    FOREIGN KEY (Receta_id) REFERENCES Recetas(id) ON DELETE CASCADE\n" +
                    ");\n";

            System.out.println(sql);
             filas = sentencia.executeUpdate(sql);
            System.out.println("Filas afectadas "+filas);

            try {
                sentencia.executeUpdate("DELETE FROM Recetas");
            }catch (Exception e){
                sentencia.executeUpdate("DELETE FROM IngredientesRecetas");
                sentencia.executeUpdate("DELETE FROM Recetas");
            }

            sql = "INSERT INTO Recetas (Nombre, Calorias) VALUES\n" +
                    "('Arroz con Pollo', 450),\n" +
                    "('Lasaña de Carne', 600),\n" +
                    "('Sopa de Verduras', 180),\n" +
                    "('Filete de Salmón', 350),\n" +
                    "('Hamburguesa con Queso', 550),\n" +
                    "('Tacos de Carne Asada', 420),\n" +
                    "('Enchiladas de Pollo', 380),\n" +
                    "('Pizza Margarita', 650),\n" +
                    "('Pasta Primavera', 400),\n" +
                    "('Ceviche de Camarón', 250);\n";

            System.out.println(sql);
            sentencia.executeUpdate(sql);
            System.out.println("Filas afectadas "+filas);

            sentencia.executeUpdate("DELETE FROM IngredientesRecetas");

            sql = "INSERT INTO IngredientesRecetas (Receta_id, Ingrediente) VALUES\n" +
                    "(1, 'Manzana'),\n" +
                    "(1, 'Azúcar'),\n" +
                    "(1, 'Masa para tarta'),\n" +
                    "(2, 'Lechuga'),\n" +
                    "(2, 'Pollo'),\n" +
                    "(2, 'Crutones'),\n" +
                    "(3, 'Tomate'),\n" +
                    "(3, 'Cebolla'),\n" +
                    "(3, 'Caldo de pollo');\n";

            System.out.println(sql);
            sentencia.executeUpdate(sql);
            System.out.println("Filas afectadas "+filas);




        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }catch (SQLException e) {
            e.printStackTrace();
        }{
            try {
                sentencia.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
