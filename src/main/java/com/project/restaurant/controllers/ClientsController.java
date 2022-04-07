package com.project.restaurant.controllers;

import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.Client;

import java.sql.*;
import java.util.ArrayList;

public class ClientsController {
    DBConnection dbConnection;

    public ClientsController() {
        this.dbConnection = new DBConnection();
    }

    public ArrayList<Client> getClients() {
        String query =  "SELECT * FROM CLIENTES";

        ArrayList<Client> clients = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                clients.add(new Client(
                        response.getInt("ID"),
                        response.getString("Nombre"),
                        response.getString("Telefono"),
                        response.getString("Direccion")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return clients;
    }
    public void addClient(Client client) {
        String query = "begin MOD_.crear_cliente(?, ?, ?); end;";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, client.getName());
            statement.setString(2, client.getPhone());
            statement.setString(3, client.getAddress());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void removeClient(Client client) {
        String query = "begin MOD_.eliminar_cliente(?); end;";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, client.getId());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
