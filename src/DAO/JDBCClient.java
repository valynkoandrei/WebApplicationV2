package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class JDBCClient {


    private Connection connection;

    public JDBCClient() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final String URL = "jdbc:mysql://localhost:3306/test";
            final String USERNAME = "root";
            final String PASSWORD = "root";
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Integer> getIdFromTable() {
        ArrayList<Integer> names = new ArrayList<>();
        String query = "SELECT id FROM users";
        ResultSet resultSet;
        try {
            resultSet = connection.createStatement().executeQuery(query);
            while (resultSet.next())
                names.add(resultSet.getInt("id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }

    public ArrayList<String> getNameFromTable() {
        ArrayList<String> names = new ArrayList<>();
        String query = "SELECT name FROM users";
        ResultSet resultSet;
        try {
            resultSet = connection.createStatement().executeQuery(query);
            while (resultSet.next())
                names.add(resultSet.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }

    public ArrayList<String> getSurnameFromTable() {
        ArrayList<String> surnames = new ArrayList<>();
        String query = "SELECT surname FROM users";
        ResultSet resultSet;
        try {
            resultSet = connection.createStatement().executeQuery(query);
            while (resultSet.next())
                surnames.add(resultSet.getString("surname"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return surnames;
    }

    public ArrayList<String> getPhoneFromTable() {
        ArrayList<String> phones = new ArrayList<>();
        String query = "SELECT phone FROM users";
        ResultSet resultSet;
        try {
            resultSet = connection.createStatement().executeQuery(query);
            while (resultSet.next())
                phones.add(resultSet.getString("phone"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phones;
    }

    public void updateFromTable(int id, String name, String surname, String phone) {
        String query = "Update users set name=" + "'" + name + "'," + " surname=" + "'" + surname + "'," + " phone=" + "'" + phone + "'" + " where id=" + "'" + id + "'";
        try {
            connection.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addFromTable(String name, String surname, String phone) {
        String query = "INSERT into users (name, surname, phone) VALUES(" + "'" + name + "'" + "," + "'" + surname + "'" + "," + "'" + phone + "'" + ")";
        try {
            connection.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteFromTable(int id) {
        String query = "DELETE FROM users WHERE id='" + id + "'";
        try {
            connection.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
