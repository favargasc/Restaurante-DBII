package com.project.restaurant.controllers;

import com.project.restaurant.config.DBConnection;
import com.project.restaurant.models.Login;
import com.project.restaurant.models.Provider;
import oracle.jdbc.OracleType;

import java.sql.*;
import java.util.ArrayList;

public class LoginController {
    DBConnection dbConnection;

    public LoginController() {
        this.dbConnection = new DBConnection();
    }

    public Integer checkLogin(Login login) {

        String query =  "{ ? = call CONSULTA_PCKG.LOGIN(?, ?) }";

        try {
            Connection connection = dbConnection.getConnection();

            CallableStatement statement = connection.prepareCall(query);

            statement.registerOutParameter(1, Types.INTEGER);
            statement.setString(2, login.getUserName());
            statement.setString(3, login.getPassword());
            statement.executeUpdate();

            Integer value = statement.getInt(1);

            connection.close();

            return value;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }
}
