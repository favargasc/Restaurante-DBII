package com.project.restaurant.controllers;

import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.MeasurementUnits;
import com.project.restaurant.models.Provider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MeasurementUnitsController {
    DBConnection dbConnection;

    public MeasurementUnitsController() {
        this.dbConnection = new DBConnection();
    }

    public ArrayList<MeasurementUnits> getMeasureUnits() {
        String query =  "SELECT * FROM UNIDADESMEDIDAS";

        ArrayList<MeasurementUnits> measurementUnits = new ArrayList<>();

        try {
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                measurementUnits.add(new MeasurementUnits (
                        response.getInt("ID"),
                        response.getString("Nombre")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return measurementUnits;
    }
}
