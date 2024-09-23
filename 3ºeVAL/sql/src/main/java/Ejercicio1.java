
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {
    public static void main(String[] args) {

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://192.168.59.235:3306/comida", "alex", "asd123456");
            sentencia = conexion.createStatement();
            result = sentencia.executeQuery("SELECT * FROM Recetas");
            while (result.next()) {
                System.out.println(result.getInt(1) + " - " +
                        result.getString(2) + " - " + result.getString(3));
            }
            result.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                result.close();
                sentencia.close();
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

