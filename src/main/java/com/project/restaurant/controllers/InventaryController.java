package com.project.restaurant.controllers;

import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.InInventory;
import com.project.restaurant.models.OutInventory;

import java.sql.*;
import java.util.ArrayList;

public class InventaryController {
    DBConnection dbConnection;

    public InventaryController() {
        this.dbConnection = new DBConnection();
    }

    public ArrayList<OutInventory> getInventory() {
        String query =  "SELECT i.\"Id\" as Id, i.NOMBRE AS Nombre, p.NOMBRE AS Proveedor, u.NOMBRE AS Unidad, i.CANTIDAD AS Cantidad FROM INVENTARIO i " +
                        "INNER JOIN PROVEEDORES p ON p.ID = i.\"Id\" " +
                        "INNER JOIN UNIDADESMEDIDAS u on i.UNIDAD_ID = u.ID";

        ArrayList<OutInventory> inventory = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                inventory.add(new OutInventory(
                        response.getInt("Id"),
                        response.getString("Nombre"),
                        response.getString("Proveedor"),
                        response.getInt("Cantidad"),
                        response.getString("Unidad")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return inventory;
    }

    public void addInventory(InInventory inventory) {
        String query = "insert into INVENTARIO (NOMBRE, PROVEEDOR_ID, UNIDAD_ID, CANTIDAD) VALUES (?, ?, ?, ?)";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, inventory.getName());
            statement.setInt(2, inventory.getProviderId());
            statement.setInt(3, inventory.getUnitId());
            statement.setInt(4, inventory.getAmount());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void removeClient(OutInventory inventory) {
        String query = "DELETE FROM INVENTARIO WHERE  \"Id\" = ?";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, inventory.getId());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
