package com.example.trileros.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection conn = null;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "alex";
    private static final String PASS = "asd123456";
    private static final String URL = "jdbc:mysql://192.168.1.159:3306/trileros";

    private ConexionBD(){

        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection(){

        if(conn == null){

            new ConexionBD();

        }

        return conn;
    }


    public static void closeConnection(){

        try {
            if (conn != null){

                conn.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

}
