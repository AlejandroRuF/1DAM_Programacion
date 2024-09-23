import java.sql.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "alex";
        String pass = "asd123456";
        String url = "jdbc:mysql://192.168.59.235:3306/comida";

        Connection con = null;
        Statement sentencia = null;
        ResultSet result = null;

        try{

            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pass);
            sentencia = con.createStatement();
            result = sentencia.executeQuery("select * from Recetas");
            while (result.next()) {
                System.out.println(result.getInt(1) + " - " +
                        result.getString(2) + " - " + result.getString(3));
            }

            String sql = "Delete from IngredientesRecetas WHERE Receta_id = 2";
            int filas = sentencia.executeUpdate(sql);
            System.out.println("Numero de filas afectadas: "+ filas);

            sql = "Delete from Recetas WHERE id = 2";
            filas = sentencia.executeUpdate(sql);
            System.out.println("Numero de filas afectadas: "+ filas);


            result = sentencia.executeQuery("select * from Recetas");
            while (result.next()) {
                System.out.println(result.getInt(1) + " - " +
                        result.getString(2) + " - " + result.getString(3));
            }



        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }finally {
            try {
                result.close();
                sentencia.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
