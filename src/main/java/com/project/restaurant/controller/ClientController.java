package com.project.restaurant.controller;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.project.restaurant.models.Clientes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClientController {

    // Queries
    private static final String getQuery = "SELECT * FROM clientes;";
    private static final String findQuery = "SELECT clienteId, nombre, telefono FROM clientes WHERE clienteId = (?);";
    private static final String updateQuery = "";
    private static final String deleteQuery = "";

    // Obtiene todos los clientes registrados en la base de datos
    @GetMapping
    public String getAllClientes() {

        List<Clientes> clientes = new ArrayList<>();
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin@localhost:1521:xe","oracle","oracle");

            if (con != null) {
                System.out.println("Connected to database");
            } else {
                System.out.println("Failed to make connection");
            }

            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(getQuery);
            clientes = resultSetToList(resultSet, clientes);

            printClientesRS(clientes);
            con.close();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    // Obtiene un cliente de la base de datos por medio del id
    @GetMapping("/{id}")
    public Optional<Clientes> findById(Integer id) {

        try {

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin@localhost:1521:xe","oracle","oracle");

            if (con != null) {
                System.out.println("Connected to database");
            } else {
                System.out.println("Failed to make connection");
            }

            PreparedStatement stmt = con.prepareStatement(findQuery);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                return Optional.of(resultSetToClientes(resultSet));
            }

            con.close();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }


    public Optional<Clientes> update(Clientes cliente) {
        return Optional.empty();
    }

    // Elimina un cliente de la base de datos por medio del id
    public void delete(Integer id) {
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin@localhost:1521:xe","oracle","oracle");

            if (con != null) {
                System.out.println("Connected to database");
            } else {
                System.out.println("Failed to make connection");
            }

            PreparedStatement stmt = con.prepareStatement(deleteQuery);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            con.close();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    // Función para convertir el resultSet a una instancia de la clase Clientes de Java
    protected Clientes resultSetToClientes(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("clienteId");
        String nombre = resultSet.getString("nombre");
        String telefono = resultSet.getString("telefono");
        // Falta direcciones

        return new Clientes(id, nombre, telefono);
    }

    // Función para convertir una lista de objetos provenientes de la base de datos a instancias
    // de clase cliente de Java
    protected List<Clientes> resultSetToList(ResultSet resultSet, List<Clientes> clientes) throws SQLException {
        if (resultSet != null) {
            while (resultSet.next()) {
                clientes.add(resultSetToClientes(resultSet));
            }
        }
        return clientes;
    }

    // Imprime la lista de clientes
    private void printClientesRS(List<Clientes> clientes) {
        for (Clientes c : clientes) {
            System.out.println("Id: " + c.getClienteId()
                + ", nombre: " + c.getNombre()
                + ", telefono: " + c.getTelefono());
        }
    }
}
