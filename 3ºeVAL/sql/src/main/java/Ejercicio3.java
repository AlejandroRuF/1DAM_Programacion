import java.sql.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "alex";
        String pass = "asd123456";
        String url = "jdbc:mysql://192.168.59.235:3306/comida";
        Connection conn = null;
        Statement sentencia = null;
        ResultSet result = null;


        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            sentencia = conn.createStatement();
            result = sentencia.executeQuery("SELECT * FROM Recetas");
            while (result.next()) {
                System.out.println(result.getInt(1) + " - " +
                        result.getString(2) + " - " + result.getString(3));
            }

            String sql = "UPDATE Recetas SET Nombre = 'Pollo con Arroz' WHERE id = 1;";
            int filas = sentencia.executeUpdate(sql);
            System.out.println("Numero de filas afectadas: "+filas);

            result = sentencia.executeQuery("SELECT * FROM Recetas");
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
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
