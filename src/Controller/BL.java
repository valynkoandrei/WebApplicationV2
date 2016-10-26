package Controller;

import DAO.JDBCClient;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Андрей on 25.10.2016.
 */
public class BL {
 public static ArrayList<Clients> clientsArrayList;
    public JDBCClient client;
    public BL() throws SQLException {
        client = new JDBCClient();
        clientsArrayList= new ArrayList<>();
        ArrayList<Integer> idForTable= client.getIdFromTable();
        ArrayList<String> nameForTable= client.getNameFromTable();
        ArrayList<String> surnameForTable= client.getSurnameFromTable();
        ArrayList<String> phoneForTable= client.getPhoneFromTable();

        for(int i=0; i < nameForTable.size(); i++)
        clientsArrayList.add(new Clients(idForTable.get(i) ,nameForTable.get(i),surnameForTable.get(i),phoneForTable.get(i)));
    }

    public ArrayList<Clients> getClientsArrayList(){
        return clientsArrayList;
    }

    public void updateArrayList(int id, String name, String surname, String phone){
        try {
            client.updateFromTable(id, name, surname, phone);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addRecord( String name, String surname, String phone){
        try {
            client.addFromTable(name,surname, phone);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(int id){
        try {
            client.deleteFromTable(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
