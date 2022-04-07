package com.project.restaurant.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static final String uri = "jdbc:oracle:thin:@LAPTOP-154T7AHU:1521:grp04db";


    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(uri, "FABIAN", "2664");

            if (connection != null) {
                System.out.println("Coneccion establecida");
            } else {
                System.out.println("Error en la coneccion");
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return connection;
    }
}
