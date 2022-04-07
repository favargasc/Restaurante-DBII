package com.project.restaurant.controllers;

import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.MeasurementUnits;
import com.project.restaurant.models.Pay;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MethodController {
    DBConnection dbConnection;

    public MethodController() {
        this.dbConnection = new DBConnection();
    }

    public ArrayList<Pay> getMethods() {
        String query =  "SELECT * FROM METODOPAGO";

        ArrayList<Pay> methods = new ArrayList<>();

        try {
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                methods.add(new Pay (
                        response.getInt("ID"),
                        response.getString("Nombre")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return methods;
    }
}
