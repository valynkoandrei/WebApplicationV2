package Controller;

import DAO.JDBCClient;
import model.Clients;

import java.util.ArrayList;

public class BL {
    private static ArrayList<Clients> clientsArrayList;
    private JDBCClient client;

    public BL() {

        client = new JDBCClient();
        clientsArrayList = new ArrayList<>();

        ArrayList<Integer> idForTable = client.getIdFromTable();
        ArrayList<String> nameForTable = client.getNameFromTable();
        ArrayList<String> surnameForTable = client.getSurnameFromTable();
        ArrayList<String> phoneForTable = client.getPhoneFromTable();

        for (int i = 0; i < nameForTable.size(); i++)
            clientsArrayList.add(new Clients(idForTable.get(i), nameForTable.get(i), surnameForTable.get(i), phoneForTable.get(i)));
    }

    public ArrayList<Clients> getClientsArrayList() {
        return clientsArrayList;
    }

    public void updateRecord(int id, String name, String surname, String phone) {
        client.updateRecordFromTable(id, name, surname, phone);
    }

    public void addRecord(String name, String surname, String phone) {
        client.addRecordFromTable(name, surname, phone);
    }

    public void deleteRecord(int id) {
        client.deleteRecordFromTable(id);
    }

}
