package com.project.restaurant.controllers;


import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.Recipe;

import java.sql.*;
import java.util.ArrayList;

public class MenuController {
    DBConnection dbConnection;

    public MenuController() {
        this.dbConnection = new DBConnection();
    }

    public ArrayList<Recipe> getAll() {
        String query =  "SELECT * FROM PLATILLOS";

        ArrayList<Recipe> all = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                all.add(new Recipe(
                        response.getInt("ID"),
                        response.getString("Nombre"),
                        response.getDouble("precio"),
                        response.getString("Detalle")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return all;
    }

    public ArrayList<Recipe> getMains() {
        String query =  "SELECT NOMBRE, DETALLE, PRECIO FROM PLATILLOS WHERE TIPO_PLATILLO_ID = 1";

        ArrayList<Recipe> mains = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                mains.add(new Recipe(
                        response.getString("Nombre"),
                        response.getDouble("precio"),
                        response.getString("Detalle")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return mains;
    }

    public ArrayList<Recipe> getDesserts() {
        String query =  "SELECT NOMBRE, PRECIO FROM PLATILLOS WHERE TIPO_PLATILLO_ID = 3";

        ArrayList<Recipe> desserts = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                desserts.add(new Recipe(
                        response.getString("Nombre"),
                        response.getDouble("precio")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return desserts;
    }

    public ArrayList<Recipe> getDrinks() {
        String query =  "SELECT NOMBRE, PRECIO FROM PLATILLOS WHERE TIPO_PLATILLO_ID = 4";

        ArrayList<Recipe> drinks = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                drinks.add(new Recipe(
                        response.getString("Nombre"),
                        response.getDouble("precio")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return drinks;
    }

    public ArrayList<Recipe> getStacks() {
        String query =  "SELECT NOMBRE, PRECIO FROM PLATILLOS WHERE TIPO_PLATILLO_ID = 5";

        ArrayList<Recipe> snacks = new ArrayList<>();

        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection();

            Statement statement = connection.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                snacks.add(new Recipe(
                        response.getString("Nombre"),
                        response.getDouble("precio")
                ));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return snacks;
    }

}
