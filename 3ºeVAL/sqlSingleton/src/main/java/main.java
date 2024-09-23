import java.sql.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Connection conn = ConexionBD.getConnection();


        if (conn != null) {
            System.out.println("Conexion exitosa "+conn);

        }else {
            System.err.println("No se puede conectar con la base de datos "+conn);
        }

        Statement sentencia = null;
        String sql;
        ResultSet result = null;

        try{

            sentencia = conn.createStatement();
            sentencia.executeUpdate("DROP TABLE IF EXISTS parque;");
            sentencia.executeUpdate("DROP TABLE IF EXISTS ciudad;");

            sql = "CREATE TABLE IF NOT EXISTS ciudad (\n" +
                    "\n" +
                    "id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,\n" +
                    "\n" +
                    "nombre CHAR(60) NOT NULL,\n" +
                    "\n" +
                    "PRIMARY KEY (id)\n" +
                    "\n" +
                    ");";

            int filas = sentencia.executeUpdate(sql);
            System.out.println(sql);
            System.out.println("Filas modificadas: "+filas);

            sql = "CREATE TABLE IF NOT EXISTS parque (\n" +
                    "\n" +
                    "id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,\n" +
                    "\n" +
                    "nombre CHAR(60) NOT NULL,\n" +
                    "\n" +
                    "extension DOUBLE,\n" +
                    "\n" +
                    "idCiudad SMALLINT UNSIGNED NOT NULL,\n" +
                    "\n" +
                    "PRIMARY KEY (id)\n," +
                    "FOREIGN KEY (idCiudad) REFERENCES ciudad(id)\n);";

            filas = sentencia.executeUpdate(sql);
            System.out.println(sql);
            System.out.println("Filas modificadas: "+filas);

            sql = "INSERT INTO ciudad (nombre) VALUES\n" +
                    "('Ciudad A'),\n" +
                    "('Ciudad B'),\n" +
                    "('Ciudad C'),\n" +
                    "('Ciudad D'),\n" +
                    "('Ciudad E'),\n" +
                    "('Ciudad F'),\n" +
                    "('Ciudad G'),\n" +
                    "('Ciudad H'),\n" +
                    "('Ciudad I'),\n" +
                    "('Ciudad J');\n";


            filas = sentencia.executeUpdate(sql);
            System.out.println(sql);
            System.out.println("Filas modificadas: "+filas);

            sql = "INSERT INTO parque (nombre, extension, idCiudad) VALUES\n" +
                    "('Parque 1', 10.5, 1),\n" +
                    "('Parque 2', 15.2, 2),\n" +
                    "('Parque 3', 8.7, 3),\n" +
                    "('Parque 4', 12.3, 4),\n" +
                    "('Parque 5', 9.8, 5),\n" +
                    "('Parque 6', 11.1, 6),\n" +
                    "('Parque 7', 14.6, 7),\n" +
                    "('Parque 8', 7.5, 8),\n" +
                    "('Parque 9', 10.9, 9),\n" +
                    "('Parque 10', 6.4, 10);\n";


            filas = sentencia.executeUpdate(sql);
            System.out.println(sql);
            System.out.println("Filas modificadas: "+filas);


            result = sentencia.executeQuery("SELECT nombre FROM parque where idCiudad = (SELECT id FROM ciudad WHERE nombre = 'Ciudad A')");
            while (result.next()){
                System.out.println(result.getString(1));
            }

            sql = "INSERT INTO ciudad (nombre) VALUES ('Ciudad X')\n)";

            System.out.println("Inserta el nombre de uno de los siguientes parques para modificar sus datos");

            String formato = "%-5s %-20s %-10s %-20s\n";

            System.out.printf(formato, "ID", "Nombre Parque", "Extension", "Nombre Ciudad");
            System.out.println("----------------------------------------------------------------");

            result = sentencia.executeQuery("SELECT p.id, p.nombre, p.extension, c.nombre as nombre_ciudad \n" +
                    "FROM parque p\n" +
                    "JOIN ciudad c ON p.idCiudad = c.id;");
            while (result.next()) {
                System.out.printf(formato, result.getInt(1), result.getString(2), result.getDouble(3), result.getString(4));
            }

            Scanner sc = new Scanner(System.in);

            System.out.println("Escribe el nombre del parque que desees modificar");

            String nomParque = sc.nextLine();

            sql = "SELECT p.id, p.nombre, p.extension, c.nombre as nombre_ciudad " +
                    "FROM parque p " +
                    "JOIN ciudad c ON p.idCiudad = c.id " +
                    "WHERE LOWER(p.nombre) = LOWER(?)";

            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nomParque);

            result = stat.executeQuery();

            while (result.next()) {
                System.out.printf(formato, result.getInt(1), result.getString(2), result.getDouble(3), result.getString(4));
            }

            System.out.println("Introduce el nombre nuevo para el parque");
            String nomParqueNuevo = sc.nextLine();
            System.out.println("Introduce el nombre de la ciudad");

            sql = "SELECT nombre " +
                    "FROM ciudad";

            result = sentencia.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getString(1));
            }

            String nomCiudad = sc.nextLine();
            sql = "SELECT id " +
                    "FROM ciudad WHERE LOWER(nombre) = LOWER('" + nomCiudad + "')";

            result = sentencia.executeQuery(sql);

            int idCiudade = 0;
            while (result.next()) {
                idCiudade = result.getInt(1);
            }
            System.out.println(idCiudade);

            System.out.println("Introduce la nueva extension del parque");
            double extension = sc.nextDouble();

            sql = "UPDATE parque p\n" +
                    "JOIN ciudad c ON p.idCiudad = c.id\n" +
                    "SET p.nombre = '"+nomParqueNuevo+"', p.idCiudad = '"+idCiudade+"', p.extension = '"+extension+"'\n" +
                    "WHERE p.nombre = '"+nomParque+"';";

            sentencia.executeUpdate(sql);

            sql = "SELECT p.id, p.nombre, p.extension, c.nombre as nombre_ciudad " +
                    "FROM parque p " +
                    "JOIN ciudad c ON p.idCiudad = c.id;";

            result = stat.executeQuery(sql);

            while (result.next()) {
                System.out.printf(formato, result.getInt(1), result.getString(2), result.getDouble(3), result.getString(4));
            }

            System.out.println("Escribe la cadena del parque que desees buscar");

            sc.nextLine();
            nomParque = sc.nextLine();
            nomParque = "%"+nomParque+"%";

            sql = "SELECT p.id, p.nombre, p.extension, c.nombre as nombre_ciudad " +
                    "FROM parque p " +
                    "JOIN ciudad c ON p.idCiudad = c.id " +
                    "WHERE LOWER(p.nombre) LIKE LOWER(?);";

            stat = conn.prepareStatement(sql);
            stat.setString(1,nomParque);

            result = stat.executeQuery();

            while (result.next()) {
                System.out.printf(formato, result.getInt(1), result.getString(2), result.getDouble(3), result.getString(4));
            }

            System.out.println("Selecciona una ciudad para saber cuantos parques tiene");
            nomCiudad = sc.nextLine();


            sql = "SELECT COUNT(*) AS num_parques\n" +
                    "FROM parque p\n" +
                    "JOIN ciudad c ON p.idCiudad = c.id\n" +
                    "WHERE LOWER(c.nombre) = LOWER(?);";

            stat = conn.prepareStatement(sql);
            stat.setString(1,nomCiudad);

            result = stat.executeQuery();

            while (result.next()) {
                System.out.println(nomCiudad+" tiene "+result.getInt(1)+" parques");
            }

            System.out.println("Selecciona una ciudad para borrar todos sus parques");
            nomCiudad = sc.nextLine();

            sql= "DELETE FROM parque\n" +
                    "WHERE idCiudad IN (\n" +
                    "    SELECT id\n" +
                    "    FROM ciudad\n" +
                    "    WHERE LOWER(nombre) = LOWER(?)\n" +
                    ");";

            stat = conn.prepareStatement(sql);
            stat.setString(1,nomCiudad);

            stat.executeUpdate();


            sql = "SELECT p.id, p.nombre, p.extension, c.nombre as nombre_ciudad " +
                    "FROM parque p " +
                    "JOIN ciudad c ON p.idCiudad = c.id;";

            result = stat.executeQuery(sql);

            while (result.next()) {
                System.out.printf(formato, result.getInt(1), result.getString(2), result.getDouble(3), result.getString(4));
            }

            System.out.println("Introduce una extension y buscaremos las ciudades con parques con una extension mayor a la indicada");
            extension = sc.nextDouble();

            sql = "SELECT DISTINCT c.nombre\n" +
                    "FROM ciudad c\n" +
                    "JOIN parque p ON c.id = p.idCiudad\n" +
                    "WHERE p.extension > ?;";

            stat = conn.prepareStatement(sql);
            stat.setDouble(1,extension);

            result = stat.executeQuery();

            while (result.next()) {
                System.out.println(result.getString(1));
            }

            sentencia.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConexionBD.closeConnection();
        }

    }

}
