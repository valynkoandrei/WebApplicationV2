package model;


public class Clients {
    private int id;
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


}
