import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection conn = null;

    private static final String driver = "com.mysql.cj.jdbc.Driver";

    private static final String user = "alex";

    private  static final String pass = "asd123456";

    private static final String url = "jdbc:mysql://192.168.59.235:3306/parques";

    private ConexionBD() {
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static Connection getConnection(){

        if (conn == null){

            new ConexionBD();

        }

        return conn;
    }

    public static void closeConnection(){

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();        }

    }

}
