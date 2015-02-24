package classwork.class4;

import java.util.Date;
import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private String birthday;
    private String date_work;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getDate_work() {
        return date_work;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setDate_work(String date_work) {
        this.date_work = date_work;
    }

    public Employee() {
        Random rnd = new Random();
        this.name =  NameGenerator.generateName();
        this.surname = NameGenerator.generateSurname();
        this.birthday = "02.06.1980";
        this.date_work = "02.02.2015";
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", date_work='" + date_work;
    }
}
