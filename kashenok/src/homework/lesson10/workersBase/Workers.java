package homework.lesson10.workersBase;


import java.util.Random;

public class Workers {
    private String name;
    private String surname;
    public Workers() {

    }

    public Workers(String name, String surname) {
    }
Random rand = new Random();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
