package classwork.class4;

import java.security.SecureRandom;
import java.math.BigInteger;

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
    }

    public Employee(String name, String surname, String birthday, String date_work) {
        SecureRandom random = new SecureRandom();
        this.name = new BigInteger(130, random).toString(32);
        this.surname = new BigInteger(130, random).toString(32);
        this.birthday = birthday;
        this.date_work = date_work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", date_work='" + date_work + '\'' +
                '}';
    }
}
