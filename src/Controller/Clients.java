package Controller;

/**
 * Created by Андрей on 21.10.2016.
 */
public class Clients {
    int id;
    private String name;
    private String surname;
    private String phone;

    public Clients(int id,String name, String surname, String phone) {
        this.id=id;
        this.name = name;
        this.surname=surname;
        this.phone=phone;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
