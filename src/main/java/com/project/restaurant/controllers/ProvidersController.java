package com.project.restaurant.controllers;

import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.Client;
import com.project.restaurant.models.Provider;

import java.sql.*;
import java.util.ArrayList;

public class ProvidersController {
    DBConnection dbConnection;

    public ProvidersController() {
       this.dbConnection = new DBConnection();
    }

    public ArrayList<Provider> getProviders() {
        String query =  "SELECT * FROM Proveedores";

        ArrayList<Provider> providers = new ArrayList<>();

        try {
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                providers.add(new Provider (
                        response.getInt("ID"),
                        response.getString("Nombre")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return providers;
    }

    public void addProvider(Provider provider) {
        String query = "insert into PROVEEDORES (Nombre) VALUES (?)";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, provider.getName());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void removeProvider(Provider provider) {
        String query = "DELETE FROM PROVEEDORES WHERE ID = ?";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, provider.getId());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
