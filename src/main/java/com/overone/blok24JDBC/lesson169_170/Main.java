package com.overone.blok24JDBC.lesson169_170;

import java.sql.*;

public class Main {
    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static final String connectionString = "jdbc:mysql://localhost:3306/animals";
    private static final String login = "root";
    private static final String password = "root";

    private static Connection getDBConnection() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println("Can't get class. No driver found");
            e.printStackTrace();

        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, login, password);
        } catch (SQLException e) {
            System.out.println("Can't get connection. Incorrect URL");
            e.printStackTrace();
            return connection;
        }


        return connection;
    }

    public static void alter() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String createAlter = "ALTER TABLE pets ADD COLUMN lives_in VARCHAR(50) NOT NULL AFTER pet_owner_status";
        String createAlter1 = "ALTER TABLE pets ADD COLUMN lives_in_test VARCHAR(50) NOT NULL AFTER lives_in";
        String createAlter2 = "ALTER TABLE pets ADD COLUMN lives_in_test2 VARCHAR(50) NOT NULL AFTER lives_in_test";
        try {

            connection = getDBConnection();
            statement = connection.createStatement();
            statement.executeUpdate(createAlter);
            statement.executeUpdate(createAlter1);
            statement.executeUpdate(createAlter2);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if ((statement != null)) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }


    public static void select() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String selectSQL = "SELECT  type_animal FROM pets WHERE age_pets < '8'";

        try {

            connection = getDBConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                String typeAnimal = rs.getString("type_animal");
                String namePets = rs.getString("type_animal");

                System.out.println("Животные которым менее 8 лет " + typeAnimal + " " + namePets);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if ((statement != null)) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }

    public static void delete() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String deleteSQL = "DELETE  FROM pets WHERE color_pets = 'brown'";

        try {

            connection = getDBConnection();
            statement = connection.createStatement();
            statement.execute(deleteSQL);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if ((statement != null)) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }

    public static void main(String[] args) {

        try {

            delete();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}