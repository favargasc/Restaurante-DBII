package com.project.restaurant.controllers;

import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.InInventory;
import com.project.restaurant.models.InOrder;
import com.project.restaurant.models.OutInventory;
import com.project.restaurant.models.OutOrder;

import java.sql.*;
import java.util.ArrayList;

public class OrderController {
    DBConnection dbConnection;

    public OrderController() {
        this.dbConnection = new DBConnection();
    }

    public ArrayList<OutOrder> getOrders() {
        String query =  "SELECT o.ID, FECHA AS F, CANTIDAD AS C, C.NOMBRE AS  CN, M.NOMBRE AS MN, P.NOMBRE AS PN FROM ORDERS o " +
                        "INNER JOIN CLIENTES C on C.ID = O.CLIENTE_ID " +
                        "INNER JOIN METODOPAGO M on m.ID = o.PAGO_ID " +
                        "INNER JOIN PLATILLOS P on o.PLATILLO_ID = P.ID";

        ArrayList<OutOrder> orders = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                orders.add(new OutOrder (
                        response.getInt("ID"),
                        response.getString("CN"),
                        response.getString("PN"),
                        response.getString("MN"),
                        response.getString("F"),
                        response.getInt("C")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return orders;
    }

    public void addOrder(InOrder order) {
        String query = "insert into ORDERS (FECHA, CANTIDAD, PLATILLO_ID, PAGO_ID, CLIENTE_ID) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, order.getDate());
            statement.setInt(2, order.getAmount());
            statement.setInt(3, order.getMealId());
            statement.setInt(4, order.getPayMethodId());
            statement.setInt(5, order.getClientId());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void removeOrder(OutOrder order) {
        String query = "DELETE FROM ORDERS WHERE ID = ?";

        try {
            Connection connection = dbConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, order.getId());

            statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
