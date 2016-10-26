package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Андрей on 24.10.2016.
 */
public class JDBCClient {

    private final String URL = "jdbc:mysql://localhost:3306/test";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    private Connection connection;

    public JDBCClient() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Integer> getIdFromTable() throws SQLException {
        ArrayList<Integer> names= new ArrayList<Integer>();
        String query = "SELECT id FROM users";
        ResultSet resultSet= connection.createStatement().executeQuery(query);
        while (resultSet.next()){
            names.add(resultSet.getInt("id"));
        }
        return names;
    }

    public ArrayList<String> getNameFromTable() throws SQLException {
        ArrayList<String> names= new ArrayList<String>();
        String query = "SELECT name FROM users";
        ResultSet resultSet= connection.createStatement().executeQuery(query);
        while (resultSet.next()){
                names.add(resultSet.getString("name"));
        }
    return names;
    }

    public ArrayList<String> getSurnameFromTable() throws SQLException {
        ArrayList<String> surnames= new ArrayList<String>();
        String query = "SELECT surname FROM users";
        ResultSet resultSet= connection.createStatement().executeQuery(query);
        while (resultSet.next()){
            surnames.add(resultSet.getString("surname"));
        }
        return surnames;
    }

    public ArrayList<String> getPhoneFromTable() throws SQLException {
        ArrayList<String> phones= new ArrayList<String>();
        String query = "SELECT phone FROM users";
        ResultSet resultSet= connection.createStatement().executeQuery(query);
        while (resultSet.next()){
            phones.add(resultSet.getString("phone"));
        }
        return phones;
    }

    public void updateFromTable(int id , String name, String surname, String phone) throws SQLException {
        String query = "Update users set name="+"'"+name+"',"+" surname="+"'"+surname+"',"+" phone="+"'"+phone+"'"+" where id="+"'"+id+"'";
        connection.createStatement().executeUpdate(query);

    }

    public void addFromTable(String name, String surname, String phone) throws SQLException {
        String query = "INSERT into users (name, surname, phone) VALUES("+"'"+name+"'"+","+"'"+surname+"'"+","+"'"+phone+"'"+")";
        connection.createStatement().executeUpdate(query);

    }

    public void deleteFromTable(int id) throws SQLException {
        String query = "DELETE FROM users WHERE id='"+id+"'";
        connection.createStatement().executeUpdate(query);

    }
}
