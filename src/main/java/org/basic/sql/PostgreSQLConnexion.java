package org.basic.sql;

import java.sql.*;
import java.util.Date;

public class PostgreSQLConnexion {
    public static void main(String[] args) {
        long timeNow = new Date().getTime();
        String url = "jdbc:postgresql://127.0.0.1:5432/my_app"; // Replace with your database URL
        String username = "admin"; // Replace with your username
        String password = "admin"; // Replace with your password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
//            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            String sql = "SELECT * FROM categorie";
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("reference");

                System.out.println("ID: " + id + ", reference: " + name);
            }
            System.out.println("Took " + (new Date().getTime() - timeNow) + " msec to complete");
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            // IMPORTANT !!!
            // Close the resources
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


