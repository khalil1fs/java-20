package org.basic.sql;

import java.sql.*;
import java.util.Date;

public class SQLConnexion {
    public static void main(String[] args) {
        long timeNow = new Date().getTime();
        String url = "jdbc:mysql://localhost:3306/test5"; // Replace with your database URL
        String username = "admin"; // Replace with your username
        String password = "admin"; // Replace with your password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            String sql = "SELECT * FROM color";
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                boolean deleted = resultSet.getBoolean("deleted");

                System.out.println("ID: " + id + ", Name: " + name + " " + (deleted ? " is " : " not ") + "deleted");
            }
            System.out.println("Took " + (new Date().getTime() - timeNow) + " msec to complete");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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


